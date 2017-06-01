package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import model.Account;
import model.Vehicle;
import utils.Session;

import java.time.format.DateTimeFormatter;

/**
 * The controller class for viewing vehicles.
 */
public class ViewVehiclesController extends Controller {

    @FXML private TableView vehiclesTable;
    @FXML private TableColumn typeColumn;
    @FXML private TableColumn modelColumn;
    @FXML private TableColumn colourColumn;
    @FXML private TableColumn licencePlateColumn;
    @FXML private TableColumn yearMadeColumn;
    @FXML private TableColumn seatsColumn;
    @FXML private TableColumn performanceColumn;
    @FXML private Text expiryWOFText;
    @FXML private Text expiryRegistrationText;

    private Account account;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void load() {
        account = Session.getInstance().getCurrentAccount();
        setUpTable();
        setListeners();

        expiryWOFText.setText("Select a vehicle");
        expiryRegistrationText.setText("Select a vehicle");
    }

    private void setUpTable() {
        typeColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("Type"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("Model"));
        colourColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("Colour"));
        licencePlateColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("LicencePlate"));
        yearMadeColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, Integer>("Year"));
        seatsColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, Integer>("Seats"));
        performanceColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, Integer>("Performance"));
        vehiclesTable.setItems(FXCollections.observableArrayList(account.getVehicles().values()));
    }

    private void setListeners() {
        vehiclesTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
                if (newSelection != null) {
                    Vehicle vehicle = (Vehicle) newSelection;
                    expiryWOFText.setText(vehicle.getExpiryWOF().format(formatter));
                    expiryRegistrationText.setText(vehicle.getExpiryRegistration().format(formatter));
                }
        });
    }

    @FXML
    private void addVehicle() {
        createPopUpStage(SceneType.ADD_VEHICLE, 1000, 750);
        vehiclesTable.setItems(FXCollections.observableArrayList(account.getVehicles().values()));
    }

    @FXML
    private void editVehicle() {
        if (vehiclesTable.getSelectionModel().getSelectedItem() != null) {
            Session.getInstance().setVehicle((Vehicle) vehiclesTable.getSelectionModel().getSelectedItem());
            replaceSceneContent(SceneType.EDIT_VEHICLE);
            vehiclesTable.refresh();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Edit Vehicle Error");
            alert.setHeaderText("There was a problem opening you vehicle details.");
            alert.setContentText("Please select a vehicle from the table and try again.");
        }
    }
}

