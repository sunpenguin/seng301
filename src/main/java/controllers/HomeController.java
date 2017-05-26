package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Account;
import model.GeneralData;
import utils.Session;

/**
 * The controller class for the FXML file "home.fxml", the home page that appears when the app is first launched.
 * @author Sunguin Peng
 * @see controllers.Controller
 */
public class HomeController extends Controller {

    @FXML private TextField usercodeText;
    @FXML private PasswordField passwordText;

    private GeneralData generalData;

    public void load() {
        generalData = getParent().getGeneralData();
    }

    @FXML
    private void logIn() {
        if (generalData.getAccountMap().containsKey(usercodeText.getText())) {
            Account accountToCheck = generalData.getAccountMap().get(usercodeText.getText());
            if (accountToCheck.getPassword().equals(passwordText.getText())) {
                getParent().toggleMenuDisable();
                Session.getInstance().setCurrentAccount(accountToCheck);
                replaceSceneContent(SceneType.VIEW_VEHICLES);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Log In Error");
                alert.setHeaderText("There was an error logging in.");
                alert.setContentText("Please check both your user ID and password.");
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Account Error");
            alert.setHeaderText("There was an error retrieving your account.");
            alert.setContentText("Please create an account before logging in.");
            alert.showAndWait();
        }
    }

    @FXML
    private void createAccount() {
        replaceSceneContent(SceneType.ADD_ACCOUNT);
    }
}
