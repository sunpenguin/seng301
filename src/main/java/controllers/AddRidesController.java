package controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.*;
import utils.Copy;
import utils.Session;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The controller class for the FXML file "addRoutes.fxml".
 *
 * @author Sunguin Peng
 * @see controllers.Controller
 */
public class AddRidesController extends Controller {

    @FXML private TextField nameBox;
    @FXML private ComboBox vehicleComboBox;
    @FXML private ComboBox routeComboBox;
    @FXML private TableView stopPointTable;
    @FXML private TableColumn stopPointNameList;
    @FXML private TableColumn stopPointTimeList;
    @FXML private ComboBox directionComboBox;
    @FXML private CheckBox recurrentBox;
    @FXML private CheckBox mondayBox;
    @FXML private CheckBox tuesdayBox;
    @FXML private CheckBox wednesdayBox;
    @FXML private CheckBox thursdayBox;
    @FXML private CheckBox fridayBox;
    @FXML private CheckBox saturdayBox;
    @FXML private CheckBox sundayBox;
    @FXML private DatePicker startDateText;
    @FXML private DatePicker expiryDateText;
    @FXML private TextField passengersText;
    @FXML private Button createRideButton;

    private GeneralData generalData;
    private Account account;

    private List<Boolean> days;
    private List<CheckBox> dayCheckBox;

    private Route routeCopy;
    private List<StopPoint> stopPoints;

    /**
     * The method to load files from the abstract class.
     * This method loads the general data and sets up the combo boxes.
     * A listener is also added so that the list is updated when a different route is selected.
     * @see controllers.Controller
     */
    public void load() {
        generalData = getParent().getGeneralData();
        account = getParent().getUserAccount();

        routeComboBox.setItems(FXCollections.observableArrayList(generalData.getRoutes().keySet()));
        directionComboBox.setItems(FXCollections.observableArrayList("To University", "From University"));
        directionComboBox.getSelectionModel().selectFirst();
        vehicleComboBox.setItems(FXCollections.observableArrayList(account.getVehicles().keySet()));

        setListeners();
    }

    private void setListeners() {
        // When the value from the ComboBox changes, the list displays the selected route's stop points.
        routeComboBox.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue ov, String oldValue, String newValue) {
                stopPointNameList.setCellValueFactory(new PropertyValueFactory<StopPoint, String>("Address"));
                stopPointTimeList.setCellValueFactory(new PropertyValueFactory<StopPoint, Integer>("Time"));
                routeCopy = Copy.copy(generalData.getRoutes().get(newValue));
                stopPoints = Copy.copy(routeCopy.getRouteStops());
                stopPointTable.setItems(FXCollections.observableArrayList(stopPoints));
            }
        });

        stopPointTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                createPopUpStage("timeSetterRide.fxml", 300, 200);
                StopPoint sp = (StopPoint) newSelection;
                sp.setTime(Session.getInstance().getTime());
                stopPointTable.refresh();
            }
        });
    }


    /**
     * This method takes in all the parameters entered in the form "addRoutes.fxml" and creates a new trip.
     * This trip is added into the user account.
     * @see Account
     */
    public void addTrip() {
        if (nameBox.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Trip Error");
            alert.setHeaderText("You need to name your trip!");
            alert.showAndWait();
        } else if (vehicleComboBox.getSelectionModel().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Trip Error");
            alert.setHeaderText("You need to select a vehicle for your trip!");
            alert.showAndWait();
        } else if (startDateText.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Trip Error");
            alert.setHeaderText("You need to specify the date of the trip!");
            alert.showAndWait();
        } else {
            if (recurrentBox.isSelected()) {
                allDaysCheck();
            }
            createNewRides();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Trip Creation");
            alert.setHeaderText("Your trip has been successfully created!");
            alert.setContentText("You will now be taken to your new trip details!");
            alert.showAndWait();

            Stage stage = (Stage) createRideButton.getScene().getWindow();
            stage.close();
        }
    }

    private void createNewRides() {
        int direction;
        if (directionComboBox.getValue() == "To University") direction = 0;
        else direction = 1;

        List<Ride> rides;
        if (generalData.getRides().containsKey(account.getId())) {
            rides = generalData.getRides().get(account.getId());
        } else {
            rides = new ArrayList<>();
        }

        Ride rideToAdd;
        if (!recurrentBox.isSelected()) {
            rideToAdd = new Ride(nameBox.getText(),
                             new Route(routeCopy.getName(), stopPoints),
                             direction,
                             startDateText.getValue(),
                             account.getVehicles().get(vehicleComboBox.getValue()),
                             Integer.parseInt(passengersText.getText()));
            rides.add(rideToAdd);
        } else {
            LocalDate date = startDateText.getValue();
            while (date.isBefore(expiryDateText.getValue().plusDays(1))) {
                if (days.get(date.getDayOfWeek().getValue() - 1)) {
                    rideToAdd = new Ride(nameBox.getText(),
                            new Route(routeCopy.getName(), stopPoints),
                            direction,
                            date,
                            account.getVehicles().get(vehicleComboBox.getValue()),
                            Integer.parseInt(passengersText.getText()));
                    rides.add(rideToAdd);
                }
                date = date.plusDays(1);
            }
        }
        generalData.getRides().put(account.getId(), rides);
    }

    /**
     * Creates a List that stores checks the "day" check boxes.
     * Uses the information from the check boxes to create a new List storing this information.
     */
    private void allDaysCheck() {
        days = new ArrayList();

        dayCheckBox = new ArrayList();
        dayCheckBox.add(mondayBox);
        dayCheckBox.add(tuesdayBox);
        dayCheckBox.add(wednesdayBox);
        dayCheckBox.add(thursdayBox);
        dayCheckBox.add(fridayBox);
        dayCheckBox.add(saturdayBox);
        dayCheckBox.add(sundayBox);

        for (CheckBox checkBox : dayCheckBox) {
            if (checkBox.isSelected()) days.add(true);
            else days.add(false);
        }
    }
}