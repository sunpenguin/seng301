package controllers;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.util.Callback;
import model.*;
import utils.Session;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The controller class for viewing rides created by the user.
 */
public class ViewMyRidesController extends Controller {

    @FXML private TableView ridesTable;
    @FXML private TableColumn nameColumn;
    @FXML private TableColumn directionColumn;
    @FXML private TableColumn routeColumn;
    @FXML private TableColumn dateColumn;
    @FXML private TableColumn vehicleColumn;

    private Account account;
    private GeneralData generalData;
    private List<Ride> myRides;

    public void load() {
        account = Session.getInstance().getCurrentAccount();
        generalData = getParent().getGeneralData();

        myRides = new ArrayList<>();
        List<Ride> allRides = new ArrayList<>();

        for (List<Ride> rides : generalData.getRides().values()) {
            allRides.addAll(rides);
        }

        for (Ride ride : allRides) {
            if (ride.isShared() && ride.getPassengers().contains(account.getUniversityID())) {
                myRides.add(ride);
            }
        }

        if (myRides.size() > 0) {
            setUpRidesTable();
        }
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
                    direction += stopPoint.getAddress() + ", " + stopPoint.getSuburb() + "\n";
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

        ridesTable.setItems(FXCollections.observableArrayList(myRides));

        ridesTable.setRowFactory(ride -> new TableRow<Ride>() {
            @Override
            public void updateItem(Ride item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null) {
                    setStyle("");
                } else if (item.getDate().isBefore(LocalDate.now().plusDays(1))) {
                    setStyle("-fx-background-color: green;");
                } else if (!item.isShared()) {
                    setStyle("-fx-background-color: indianred;");
                }
            }
        });
    }

    /**
     * Listeners from another scene. Change first!
     */
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
                    ridesTable.setRowFactory(r -> new TableRow<Ride>() {
                        @Override
                        public void updateItem(Ride item, boolean empty) {
                            super.updateItem(item, empty) ;
                            if (item == null) {
                                setStyle("");
                            } else if (item.isShared()) {
                                setStyle("-fx-background-color: green;");
                            } else {
                                setStyle("-fx-background-color: indianred;");
                            }
                        }
                    });
                }
            }
        });
    }
}
