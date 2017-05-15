package controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Account;
import model.GeneralData;
import model.StopPoint;
import model.Trip;

import java.util.ArrayList;
import java.util.List;

/**
 * The controller class for the FXML file "addTrip.fxml".
 * @author Sunguin Peng
 * @see controllers.Controller
 */
public class AddTripController extends Controller {
    @FXML
    private TextField nameBox;
    @FXML
    private ComboBox vehicleComboBox;
    @FXML
    private ComboBox routeComboBox;
    @FXML
    private TableView stopPointTable;
    @FXML
    private TableColumn stopPointNameList;
    @FXML
    private TableColumn stopPointTimeList;
    @FXML
    private ComboBox directionComboBox;
    @FXML
    private TextField stopTimeText;
    @FXML
    private CheckBox recurrentBox;
    @FXML
    private CheckBox mondayBox;
    @FXML
    private CheckBox tuesdayBox;
    @FXML
    private CheckBox wednesdayBox;
    @FXML
    private CheckBox thursdayBox;
    @FXML
    private CheckBox fridayBox;
    @FXML
    private CheckBox saturdayBox;
    @FXML
    private CheckBox sundayBox;
    @FXML
    private TextField dateText;

    private GeneralData generalData;
    private Account account;

    private List<Boolean> days;
    private List<CheckBox> dayCheckBox;

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
                stopPointTable.setItems(FXCollections.observableArrayList(generalData.getRoutes().get(newValue).getRouteStops()));
            }
        });

        stopPointTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                createPopUpStage("timeSetterTrip.fxml", 300, 200);
            }
        });
    }

    public void setTime(TableColumn.CellEditEvent<?,?> event) {

//    public void onEditCommitSelectedProductTable(){
//        Object newValue = event.getNewValue();
//        // other data that might be helpful:
//        TablePosition<?,?> position = event.getTablePosition();
//        int row = position.getRow();
//        // etc ...
//    }
    }



    /**
     * This method takes in all the parameters entered in the form "addTrip.fxml" and creates a new trip.
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
        } else {
            int direction;
            if (directionComboBox.getValue() == "To University") direction = 0;
            else direction = 1;

            Trip newTrip;
            if (recurrentBox.isSelected()) {
                allDaysCheck();
                newTrip = new Trip(nameBox.getText(),
                        generalData.getRoutes().get(routeComboBox.getValue()),
                        direction,
                        days,
                        dateText.getText(),
                        account.getVehicles().get(vehicleComboBox.getValue()),
                        Integer.parseInt(stopTimeText.getText()));
            } else {
                newTrip = new Trip(nameBox.getText(),
                        generalData.getRoutes().get(routeComboBox.getValue()),
                        direction,
                        account.getVehicles().get(vehicleComboBox.getValue()),
                        Integer.parseInt(stopTimeText.getText()));
            }
            account.addTrip(nameBox.getText(), newTrip);
            generalData.setCurrentTrip(nameBox.getText());
            replaceSceneContent("showTrips.fxml");
//            showTripCreated("showTrips.fxml", nameBox.getText());
//            resetTrip();
        }
    }

    /**
     * Resets the information on the form.
     */
    private void resetTrip() {
        directionComboBox.setItems(FXCollections.observableArrayList("To University", "From University"));
        directionComboBox.getSelectionModel().selectFirst();
        vehicleComboBox.setItems(FXCollections.observableArrayList(account.getVehicles().keySet()));

        nameBox.clear();
        stopTimeText.clear();
        stopTimeText.setText("1");
        dateText.clear();
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
