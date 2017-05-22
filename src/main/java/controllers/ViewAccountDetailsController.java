package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Account;
import utils.Session;

/**
 * The controller class for viewing user account data.
 */
public class ViewAccountDetailsController extends Controller {
    @FXML private Text statusText;
    @FXML private Text nameText;
    @FXML private Text numberVehiclesText;
    @FXML private TextField licenceText;
    @FXML private Button viewVehiclesButton;
    @FXML private Button verifyLicenceButton;

    private Account account;

    public void load() {
        account =  Session.getInstance().getCurrentAccount();

        nameText.setText(account.getName());
        statusText.setText(account.getType());

        if (account.getType().equals("Passenger")) {
            numberVehiclesText.setText("N/A");
            viewVehiclesButton.setDisable(true);
        } else {
            Integer numberVehicles = account.getVehicles().values().size();
            numberVehiclesText.setText(numberVehicles.toString());
            viewVehiclesButton.setDisable(false);
        }
    }

    @FXML
    private void goToVehicles() {
        replaceSceneContent("viewVehicles.fxml");
    }

    @FXML
    private void verifyLicence() {
        // TODO check it is a valid licence (maybe own class?)
        if (!licenceText.getText().isEmpty()) {
            account.upgrade(licenceText.getText());
            statusText.setText(account.getType());
            Integer numberVehicles = account.getVehicles().values().size();
            numberVehiclesText.setText(numberVehicles.toString());
            viewVehiclesButton.setDisable(false);
        }
    }

}
