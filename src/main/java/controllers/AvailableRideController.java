package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import model.Account;
import model.GeneralData;
import model.StopPoint;
import utils.Session;

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
    }

    private void setUpTable() {
        StopPoint currentSP = Session.getInstance().getStopPoint();

    }

}
