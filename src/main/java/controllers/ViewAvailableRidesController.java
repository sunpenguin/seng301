package controllers;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    @FXML private TableColumn dateColumn;
    @FXML private TableColumn timeColumn;
    @FXML private TableColumn directionColumn;
    @FXML private CheckBox toUniCheckBox;
    @FXML private CheckBox fromUniCheckBox;

    private GeneralData generalData;
    private StopPoint stopPoint;

    private List<Ride> rides;
    private List<Ride> filteredRides;

    public void load() {
        generalData = getParent().getGeneralData();
        stopPoint = Session.getInstance().getStopPoint();

        titleText.setText("All Rides with Stop Point: " + stopPoint.getAddress() + ", " + stopPoint.getSuburb());

        setUpRidesTable();
    }

    private void filterRides() {
        rides = new ArrayList<>();
        filteredRides = new ArrayList<>();

        for (List list: generalData.getRides().values()) {
            rides.addAll(list);
        }

        for (Ride ride : rides) {
            if (ride.isShared() && !ride.isFull()) {
                for (StopPoint sp : ride.getRoute().getRouteStops()) {
                    if (sp.getAddress().equals(stopPoint.getAddress())
                            || sp.getSuburb().equals(stopPoint.getAddress())) {
                        filteredRides.add(ride);
                    }
                }
            }
        }
    }

    private void setUpRidesTable() {
        filterRides();

        dateColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Ride, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures param) {
                Ride ride = (Ride) param.getValue();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                String result = ride.getDate().format(formatter) + " (" + ride.getDate().getDayOfWeek() + ")";
                return new SimpleStringProperty(result);
            }
        });

        timeColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Ride, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures param) {
                Ride ride = (Ride) param.getValue();
                String result = "00:00";
                for (StopPoint sp : ride.getRoute().getRouteStops()) {
                    if (sp.getAddress().equals(stopPoint.getAddress())
                            || sp.getSuburb().equals(stopPoint.getAddress())) {
                        result = sp.getTime().format(DateTimeFormatter.ofPattern("HH:mm"));
                        break;
                    }
                }
                return new SimpleStringProperty(result);
            }
        });

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

        ridesTable.setItems(FXCollections.observableArrayList(filteredRides));
    }

    @FXML
    private void viewRideDetails() {
        if (ridesTable.getSelectionModel().getSelectedItem() != null) {
            Session.getInstance().setRide((Ride) ridesTable.getSelectionModel().getSelectedItem());
            createPopUpStage(SceneType.VIEW_SINGLE_RIDE_DETAILS, 1000, 800);
            setUpRidesTable();
        }
    }

    private void setListeners() {
        ridesTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                Session.getInstance().setRide((Ride) newSelection);
                createPopUpStage(SceneType.VIEW_SINGLE_RIDE_DETAILS, 1000, 800);
            }
        });
    }

    @FXML
    private void toggleToUniFilter() {
        createFilteredRides();
    }

    @FXML
    private void toggleFromUniFilter() {
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
}
