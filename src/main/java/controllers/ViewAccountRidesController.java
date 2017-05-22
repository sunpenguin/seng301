package controllers;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.util.Callback;
import model.*;
import utils.Session;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The controller class for viewing rides created by the user.
 */
public class ViewAccountRidesController extends Controller {

    @FXML private TableView ridesTable;
    @FXML private TableColumn nameColumn;
    @FXML private TableColumn directionColumn;
    @FXML private TableColumn routeColumn;
    @FXML private TableColumn dateColumn;
    @FXML private TableColumn vehicleColumn;

    private Account account;
    private GeneralData generalData;

    public void load() {
        account = Session.getInstance().getCurrentAccount();
        generalData = getParent().getGeneralData();

        if (generalData.getRides().containsKey(account.getUniversityID()) && generalData.getRides().get(account.getUniversityID()).size() > 0){
            setUpRidesTable();
        } else {//if (generalData.getRides().containsKey(account.getId()) && generalData.getRides().get(account.getId()).size() <= 0) {
            generalData.getRides().put(account.getUniversityID(), new ArrayList<>());
        }
        setListeners();
    }

    private void setUpRidesTable() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Ride, String>("Name"));

        directionColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Ride, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures param) {
                Ride ride = (Ride) param.getValue();
                Property direction;
                if (ride.getDirection() == 0) {
                    direction = new SimpleStringProperty("To University");
                } else {
                    direction = new SimpleStringProperty("From University");
                }
                return direction;
            }
        });

        routeColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Ride, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures param) {
                Ride ride = (Ride) param.getValue();
                List<StopPoint> stopPoints = ride.getRoute().getRouteStops();
                String direction = "The course for this route is as below:\n";
                for (StopPoint stopPoint : stopPoints) {
                    direction += stopPoint.getNumber() + " " + stopPoint.getAddress() + ", " + stopPoint.getSuburb() + "\n";
                }
                return new SimpleStringProperty(direction);
            }
        });


        dateColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Ride, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures param) {
                Ride ride = (Ride) param.getValue();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                String day = ride.getDate().getDayOfWeek().toString();
                day = day.substring(0, 3);

                String result = ride.getDate().format(formatter) + "\n(" + day + ")";
                return new SimpleStringProperty(result);
            }
        });
        vehicleColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Ride, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures param) {
                Ride ride = (Ride) param.getValue();
                Vehicle vehicle = ride.getVehicle();

                String result = "The vehicle used for this ride is a:\n" +
                        vehicle.getType() + ", " + vehicle.getModel() + " (" + vehicle.getLicencePlate() + ")\n" +
                        "The number of seats available are: " + ride.getAvailableSeats();
                return new SimpleStringProperty(result);
            }
        });

        ridesTable.setItems(FXCollections.observableArrayList(generalData.getRides().get(account.getUniversityID())));
    }

    private void setListeners() {
        ridesTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                Ride ride = (Ride) newSelection;
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Ride Share Confirmation");
                alert.setHeaderText("You are about to share this ride.");
                alert.setContentText("Ride on: " + ride.getDate().toString() + " with " +
                        ride.getAvailableSeats() + " seats.");
                Optional<ButtonType> action = alert.showAndWait();
                if (ride.isShared() && action.get() == ButtonType.OK) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setTitle("Ride Share Confirmation");
                    errorAlert.setHeaderText("You have already shared this ride!");
                    errorAlert.showAndWait();
                } else if (ride.getAvailableSeats() == 0 && action.get() == ButtonType.OK) {
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setTitle("Ride Share Confirmation");
                    errorAlert.setHeaderText("You have already shared this ride and it is full!");
                    errorAlert.showAndWait();
                } else if (action.isPresent() && action.get() == ButtonType.OK) {
                    ride.shareRide();
                }
            }
        });
    }

    @FXML
    private void openRideCreator() {
        createPopUpStage("addRoutes.fxml", 1000, 800);
        setUpRidesTable();
    }
}
