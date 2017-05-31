package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import model.Account;
import model.GeneralData;
import model.Licence;
import utils.Checkers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    @FXML private Text passwordCheckText;
    @FXML private TextField licenceNumberText;
    @FXML private DatePicker licenceIssueDate;
    @FXML private DatePicker licenceExpiryDate;
    @FXML private ComboBox licenceTypeCheckBox;
    @FXML private Button registerAccountButton;

    private Account accountToAdd;
    private Licence licenceToAdd;
    private GeneralData generalData;
    private String content;
    private boolean passwordMatch;

    public void load() {
        generalData = getParent().getGeneralData();
        registerAccountButton.setDisable(true);
        // Load ComboBox
        licenceTypeCheckBox.setItems(FXCollections.observableArrayList(
                "Restricted",
                "Full for less than 2 Years",
                "Full for more than 2 Years"));
        setListeners();
    }

    /**
     * Sets the listeners for the class.
     * This class contains listeners to check password fields.
     */
    private void setListeners() {
        passwordText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (confirmPasswordText.getText().equals(newValue)) {
                setPasswordCheckText(Color.GREEN, "Password is OK.");
                registerAccountButton.setDisable(false);
            } else {
                setPasswordCheckText(Color.RED, "Passwords do not match.");
                registerAccountButton.setDisable(true);
            }
        });

        confirmPasswordText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (passwordText.getText().equals(newValue)) {
                setPasswordCheckText(Color.GREEN, "Password is OK.");
                registerAccountButton.setDisable(false);
            } else {
                setPasswordCheckText(Color.RED, "Passwords do not match.");
                registerAccountButton.setDisable(true);
            }
        });
    }

    private void setPasswordCheckText(Color colour, String message) {
        passwordCheckText.setFill(colour);
        passwordCheckText.setText(message);

        if (colour.equals(Color.RED)) {
            passwordMatch = false;
        } else if (colour.equals(Color.GREEN)) {
            passwordMatch = true;
        }
    }

    /**
     * Creates a new account and adds it to GeneralData.
     *
     */
    @FXML
    private void registerAccount() {
        if (validateText()) {
            if (validateLicence()) {
                // Create Driver
                licenceToAdd = new Licence(licenceTypeCheckBox.getValue().toString(),
                        licenceNumberText.getText(),
                        licenceIssueDate.getValue(),
                        licenceExpiryDate.getValue());
                accountToAdd = new Account(universityIDText.getText(),
                        passwordText.getText(),
                        emailText.getText(),
                        nameText.getText(),
                        addressText.getText(),
                        Integer.parseInt(homeNumberText.getText()),
                        Long.parseLong(mobileNumberText.getText()),
                        licenceToAdd);
                content = "You have created a driver account with the User ID: " + universityIDText.getText() +
                        "\nYou will now be taken back to the log in screen.";
            } else {
                // Create Passenger with message stating licence may be incorrect?
                accountToAdd = new Account(universityIDText.getText(),
                        passwordText.getText(),
                        emailText.getText(),
                        nameText.getText(),
                        addressText.getText(),
                        Integer.parseInt(homeNumberText.getText()),
                        Long.parseLong(mobileNumberText.getText()));
                content = "You have created a passenger account with the User ID: " + universityIDText.getText() +
                        ".\nIf this is incorrect and you had licence details, you can add it in later." +
                        "\nYou will now be taken back to the log in screen.";
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Account Creation Successful");
            alert.setHeaderText("You have created a new account!");
            alert.setContentText(content);
            alert.showAndWait();
            generalData.addAccount(accountToAdd);
            replaceSceneContent(SceneType.LOG_IN_SCREEN);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Account Creation Error");
            alert.setHeaderText("There was an error creating your account!");
            alert.setContentText(content);
            alert.showAndWait();
        }
    }

    /**
     * Checks that the text that requires integers and emails are correct for creating an account.
     *
     * @return a boolean stating whether or not the text is valid for creating an account.
     */
    private boolean validateText() {
        String email = emailText.getText();
        if ((email.matches(".*@uclive.ac.nz$") || email.matches(".*@canterbury.ac.nz$"))
                && Checkers.isNumeric(homeNumberText.getText())
                && Checkers.isNumeric(mobileNumberText.getText())) {
            return true;
        } else if (universityIDText.getText().isEmpty()) {
            content = "You must fill in your University ID since this will be your username.";
        } else {
            content = "Your email must end in @uclive.ac.nz or @canterbury.ac.nz." +
                    "\nAlso your home and mobile numbers must be numbers.";
        }
        return false;
    }

    /**
     * Checks that the text are existing and correct for creating a licence.
     *
     * @return a boolean stating whether or not the text is valid for creating a licence.
     */
    private boolean validateLicence() {
        LocalDate dateTomorrow = LocalDate.now().plusDays(1);
        if (!licenceTypeCheckBox.getSelectionModel().isEmpty()
                && !licenceNumberText.getText().isEmpty()
                && licenceIssueDate.getValue().isBefore(dateTomorrow)
                && licenceExpiryDate.getValue().isAfter(dateTomorrow)) {
            return true;
        }
        return false;
    }

    @FXML
    private void goBackLogIn() {
        replaceSceneContent(SceneType.LOG_IN_SCREEN);
    }

}
