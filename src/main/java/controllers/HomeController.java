package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * The controller class for the FXML file "home.fxml", the home page that appears when the app is first launched.
 * @author Sunguin Peng
 * @see controllers.Controller
 */
public class HomeController extends Controller {

    @FXML private TextField usercodeText;
    @FXML private PasswordField passwordText;

    public void load() {
    }

    @FXML
    private void logIn()  throws IOException {
        getParent().toggleMenuDisable();
    }

    @FXML
    private void createAccount() {

    }
}
