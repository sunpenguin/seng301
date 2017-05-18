package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import model.Account;
import model.GeneralData;
import model.Ride;
import model.Trip;

/**
 * The controller class for viewing rides created by the user.
 */
public class viewAccountRidesController extends Controller {

    @FXML private TableView ridesTable;
    @FXML private TableColumn nameColumn;
    @FXML private TableColumn directionColumn;
    @FXML private TableColumn daysColumn;
    @FXML private TableColumn sharedColumn;

    private Account account;
    private GeneralData generalData;

    public void load() {
        account = getParent().getUserAccount();
        generalData = getParent().getGeneralData();
        setRidesTable();
    }

    private void setRidesTable() {
        account.getRides();
        nameColumn.setCellValueFactory(new PropertyValueFactory<Ride, String>("Name"));
        directionColumn.setCellValueFactory(new PropertyValueFactory<Trip, String>("Direction"));
//        daysColumn.setCellValueFactory(new PropertyValueFactory<Trip, String>("Name"));
        sharedColumn.setCellValueFactory(new PropertyValueFactory<Ride, Boolean>("Share"));
    }
}
