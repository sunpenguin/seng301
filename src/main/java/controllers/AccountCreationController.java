package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * The controller class for creating accounts.
 */
public class AccountCreationController extends Controller {

    @FXML private TextField universityIDText;
    @FXML private TextField emailText;
    @FXML private TextField nameText;
    @FXML private TextField addressText;
    @FXML private TextField homeNumberText;
    @FXML private TextField mobileNumberText;
    @FXML private PasswordField passwordText;
    @FXML private PasswordField confirmPasswordText;
    @FXML private TextField licenceNumberText;
    @FXML private DatePicker licenceIssueDate;
    @FXML private DatePicker licenceExpiryDate;
    @FXML private ComboBox<?> licenceTypeCheckBox;

    public void load() {

    }

    @FXML
    private void registerAccount() {
        // Step 1: checks all fields are valid
        // Step 2: checks licence fields if any
        // Step 3: create account and go back to log in screen
    }

}
