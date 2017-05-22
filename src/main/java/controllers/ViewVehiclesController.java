package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Account;
import model.Vehicle;
import utils.Session;

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

    private Account account;

    public void load() {
        account = Session.getInstance().getCurrentAccount();
        setUpTable();
    }

    private void setUpTable() {
        typeColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("Type"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("Model"));
        colourColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("Colour"));
        licencePlateColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("LicencePlate"));
        yearMadeColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, Integer>("Year"));
        seatsColumn.setCellValueFactory(new PropertyValueFactory<Vehicle, Integer>("Seats"));
        vehiclesTable.setItems(FXCollections.observableArrayList(account.getVehicles().values()));
    }

    @FXML
    private void addVehicle() {
        createPopUpStage("addVehicle.fxml", 1000, 800);
        vehiclesTable.setItems(FXCollections.observableArrayList(account.getVehicles().values()));
    }
}

