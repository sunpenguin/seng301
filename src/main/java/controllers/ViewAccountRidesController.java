package controllers;

import com.sun.javafx.binding.SelectBinding;
import javafx.beans.binding.Bindings;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.util.Callback;
import model.Account;
import model.GeneralData;
import model.Ride;
import model.Trip;

import java.time.format.DateTimeFormatter;

/**
 * The controller class for viewing rides created by the user.
 */
public class ViewAccountRidesController extends Controller {

    @FXML private TableView ridesTable;
    @FXML private TableColumn nameColumn;
    @FXML private TableColumn directionColumn;
    @FXML private TableColumn daysColumn;
    @FXML private TableColumn fullColumn;

    private Account account;
    private GeneralData generalData;

    public void load() {
        account = getParent().getUserAccount();
        generalData = getParent().getGeneralData();
        setRidesTable();
    }

    private void setRidesTable() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Ride, String>("Name"));

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
        fullColumn.setCellValueFactory(new PropertyValueFactory<Ride, Integer>("AvailableSeats"));

        ridesTable.setItems(FXCollections.observableArrayList(account.getRides().values()));
    }
}
