package controllers;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.util.Callback;
import model.*;
import utils.Session;

import java.time.format.DateTimeFormatter;

public class AvailableRideController extends Controller {

    @FXML private TableView ridesTable;
    @FXML private TableColumn stopTimeColumn;
    @FXML private TableColumn daysColumn;
    @FXML private TableColumn directionColumn;
    @FXML private Text titleText;

    private GeneralData generalData;
    private Account account;

    public void load() {
        generalData = getParent().getGeneralData();
        account = getParent().getUserAccount();
        titleText.setText("Available Rides For Selected Stop Point: "
                + Session.getInstance().getStopPoint().getNumber() + " "
                + Session.getInstance().getStopPoint().getAddress() + ", "
                + Session.getInstance().getStopPoint().getSuburb());
        setRidesTable();
    }

    private void setRidesTable() {
        StopPoint currentSP = Session.getInstance().getStopPoint();
//        nameColumn.setCellValueFactory(new PropertyValueFactory<Ride, String>("Name"));

        directionColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Ride, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures param) {
                Ride ride = (Ride) param.getValue();
                Trip trip = ride.getTrip();
                Property direction;
                if (trip.getDirection() == 0) {
                    direction = new SimpleStringProperty("To University");
                } else {
                    direction = new SimpleStringProperty("From University");
                }
                return direction;
            }
        });

        daysColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Ride, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures param) {
                Ride ride = (Ride) param.getValue();
                Trip trip = ride.getTrip();
                Property days;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                String result = new String();
                if (trip.isRecurrent() == true) {
                    result += "The days the ride is available:\n";
                    for (int i = 0; i < trip.getDays().size(); i++) {
                        if (trip.getDays().get(i) == true) {
                            switch (i) {
                                case 0:
                                    result += "Monday ";
                                    break;
                                case 1:
                                    result += "Tuesday ";
                                    break;
                                case 2:
                                    result += "Wednesday ";
                                    break;
                                case 3:
                                    result += "Thursday ";
                                    break;
                                case 4:
                                    result += "Friday ";
                                    break;
                                case 5:
                                    result += "Saturday ";
                                    break;
                                case 6:
                                    result += "Sunday";
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    result += ".\nThis trip expires on " + trip.getExpiryDate().format(formatter) + ".";
                } else {
                    result = "This is a single trip!" +
                            "\nThis trip expires on " + trip.getExpiryDate().format(formatter) + ",";
                }
                return new SimpleStringProperty(result);
            }
        });
    }

}
