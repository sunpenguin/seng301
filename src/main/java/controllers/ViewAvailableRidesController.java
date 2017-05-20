package controllers;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.text.Text;
import javafx.util.Callback;
import model.*;
import utils.Session;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * The controller class for viewing rides created by the user.
 */
public class ViewAvailableRidesController extends Controller {

    @FXML private Text titleText;
    @FXML private TableView ridesTable;
    @FXML private TableColumn nameColumn;
    @FXML private TableColumn directionColumn;
    @FXML private TableColumn routeColumn;
    @FXML private TableColumn dateColumn;
    @FXML private TableColumn vehicleColumn;
    @FXML private CheckBox toUniCheckBox;
    @FXML private CheckBox fromUniCheckBox;

    private GeneralData generalData;
    private StopPoint stopPoint;

    private List<Ride> rides;
    private List<Ride> filteredRides;

    public void load() {
        generalData = getParent().getGeneralData();
        stopPoint = Session.getInstance().getStopPoint();

        titleText.setText("All Rides with Stop Point: " +
                stopPoint.getNumber() + " " + stopPoint.getAddress() + ", " + stopPoint.getSuburb());
        setUpRidesTable();
    }

    private void setUpRidesTable() {
        rides = new ArrayList<>();
        filteredRides = new ArrayList<>();

        for (List list: generalData.getRides().values()) {
            rides.addAll(list);
        }

        for (Ride ride : rides) {
            if (ride.isShared()) {
                for (StopPoint sp : ride.getRoute().getRouteStops()) {
                    if (sp.getNumber().equals(stopPoint.getNumber()) ||
                            sp.getAddress().equals(stopPoint.getAddress()) ||
                            sp.getSuburb().equals(stopPoint.getAddress())) {
                        filteredRides.add(ride);
                    }
                }
            }
        }

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

        ridesTable.setItems(FXCollections.observableArrayList(filteredRides));
    }

//    private void setListeners() {
//        ridesTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
//            if (newSelection != null) {
//                Ride ride = (Ride) newSelection;
//                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//                alert.setTitle("Ride Share Confirmation");
//                alert.setHeaderText("You are about to share this ride.");
//                alert.setContentText("Ride on: " + ride.getDate().toString() + " with " +
//                        ride.getAvailableSeats() + " seats.");
//                Optional<ButtonType> action = alert.showAndWait();
//                if (ride.isShared() && action.get() == ButtonType.OK) {
//                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
//                    errorAlert.setTitle("Ride Share Confirmation");
//                    errorAlert.setHeaderText("You have already shared this ride!");
//                    errorAlert.showAndWait();
//                } else if (action.isPresent() && action.get() == ButtonType.OK) {
//                    ride.shareRide();
//                }
//            }
//        });
//    }

    public void toggleToUniFilter() {
        createFilteredRides();
    }

    public void toggleFromUniFilter() {
        createFilteredRides();
    }

    private void createFilteredRides() {
        List<Ride> filter = new ArrayList();
        if (toUniCheckBox.isSelected() && !fromUniCheckBox.isSelected()) {
            for (Ride ride : filteredRides) {
                if (ride.getDirection() == 1) {
                    filter.add(ride);
                }
            }
        } else if (!toUniCheckBox.isSelected() && fromUniCheckBox.isSelected()) {
            for (Ride ride : filteredRides) {
                if (ride.getDirection() == 0) {
                    filter.add(ride);
                }
            }
        } else if (!toUniCheckBox.isSelected() && !fromUniCheckBox.isSelected()) {
            for (Ride ride : filteredRides) {
                filter.add(ride);
            }
        }
        ridesTable.setItems(FXCollections.observableArrayList(filter));
    }

    public void setStopPoint(StopPoint stopPoint) {
        this.stopPoint = stopPoint;
    }
}