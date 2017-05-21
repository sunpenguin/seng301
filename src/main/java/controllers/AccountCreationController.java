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

    private boolean validatedText;
    private boolean validatedLicence;

    public void load() {
        validatedText = false;
        validatedLicence = false;
    }

    @FXML
    private void registerAccount() {
        if (validateText()) {
            if (validatedLicence) {
                // Create Driver
            } else {
                // Create Passenger with message stating licence may be incorrect?
            }

        }
        // Step 2: checks licence fields if any
        // Step 3: create account and go back to log in screen
    }

    private boolean validateText() {
        String email = emailText.getText();
        if (email.matches(".*@uclive.ac.nz$") || email.matches(".*@canterbury.ac.nz$")) {
            validatedText = true;
        }
        return validatedText;
    }

    private boolean validateLicence() {
        return validatedLicence;
    }

}
