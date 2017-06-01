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
import utils.Session;

import java.time.LocalDate;

/**
 * Controller class for editing account information
 */
public class EditAccountDetailsController extends Controller {

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
    @FXML private Button confirmChangesButton;

    private Account account;
    private Licence licenceToAdd;
    private GeneralData generalData;
    private String content;
    private boolean passwordMatch;

    public void load() {
        account = Session.getInstance().getCurrentAccount();
        generalData = getParent().getGeneralData();
        confirmChangesButton.setDisable(true);
        // Load ComboBox
        licenceTypeCheckBox.setItems(FXCollections.observableArrayList(
                "Restricted",
                "Full for less than 2 Years",
                "Full for more than 2 Years"));
        setListeners();
        loadUserData();
    }

    private void loadUserData() {
        universityIDText.setText(account.getUniversityID());
        emailText.setText(account.getEmail());
        nameText.setText(account.getName());
        addressText.setText(account.getAddress());
        homeNumberText.setText(account.getHomeNumber().toString());
        mobileNumberText.setText(account.getMobileNumber().toString());
        passwordText.setText(account.getPassword());
        confirmPasswordText.setText(account.getPassword());
        if (account.getType().equals("Driver")) {
            licenceTypeCheckBox.getSelectionModel().select(account.getLicence().getType());
            licenceNumberText.setText(account.getLicence().getNumber());
            licenceIssueDate.setValue(account.getLicence().getIssue());
            licenceExpiryDate.setValue(account.getLicence().getExpiry());
        }
    }

    /**
     * Sets the listeners for the class.
     * This class contains listeners to check password fields.
     */
    private void setListeners() {
        passwordText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (confirmPasswordText.getText().equals(newValue)) {
                setPasswordCheckText(Color.GREEN, "Password is OK.");
                confirmChangesButton.setDisable(false);
            } else {
                setPasswordCheckText(Color.RED, "Passwords do not match.");
                confirmChangesButton.setDisable(true);
            }
        });

        confirmPasswordText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (passwordText.getText().equals(newValue)) {
                setPasswordCheckText(Color.GREEN, "Password is OK.");
                confirmChangesButton.setDisable(false);
            } else {
                setPasswordCheckText(Color.RED, "Passwords do not match.");
                confirmChangesButton.setDisable(true);
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

    @FXML
    private void confirmChanges() {
        if (validateText()) {
            if (validateLicence() && account.getType().equals("Passenger")) {
                licenceToAdd = new Licence(licenceTypeCheckBox.getValue().toString(),
                        licenceNumberText.getText(),
                        licenceIssueDate.getValue(),
                        licenceExpiryDate.getValue());
                account.upgrade(licenceToAdd);
                checkNonDriverDetails();
                content = "You have upgraded your account to a driver account with the User ID: " + universityIDText.getText() +
                        "\nYou will now be taken back to your account details.";
            } else if (account.getType().equals("Driver")) {
                checkNonDriverDetails();
                checkLicenceDetails();
                content = "You have successfully edited the driver account with the User ID: " + universityIDText.getText() +
                        "\nYou will now be taken back to your account details.";
            } else {
                checkNonDriverDetails();
                content = "You have successfully edited the passenger account with the User ID: " + universityIDText.getText() +
                        "\nYou will now be taken back to your account details.";
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Account Editing Successful");
            alert.setHeaderText("You have edited your account!");
            alert.setContentText(content);
            alert.showAndWait();
            generalData.addAccount(account);
            replaceSceneContent(SceneType.VIEW_ACCOUNT_DETAILS);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Account Editing Error");
            alert.setHeaderText("There was an error editing your account!");
            alert.setContentText(content);
            alert.showAndWait();
        }
    }

    private void checkNonDriverDetails() {
        checkPassword();
        checkEmail();
        checkName();
        checkAddress();
        checkHomeNumber();
        checkMobileNumber();
    }

    private void checkEmail() {
        if (!account.getEmail().equals(emailText.getText())) {
            account.setEmail(emailText.getText());
        }
    }

    private void checkPassword() {
        if (passwordMatch && !account.getPassword().equals(passwordText.getText())) {
            account.setPassword(passwordText.getText());
        }
    }

    private void checkName() {
        if (!account.getName().equals(nameText.getText())) {
            account.setName(nameText.getText());
        }
    }

    private void checkAddress() {
        if (!account.getAddress().equals(addressText.getText())) {
            account.setAddress(addressText.getText());
        }
    }

    private void checkHomeNumber() {
        if (Checkers.isNumeric(homeNumberText.getText()) &&
                !account.getHomeNumber().equals(Integer.parseInt(homeNumberText.getText()))) {
            account.setHomeNumber(Integer.parseInt(homeNumberText.getText()));
        }
    }

    private void checkMobileNumber() {
        if (Checkers.isNumeric(mobileNumberText.getText()) &&
                !account.getMobileNumber().equals(Integer.parseInt(mobileNumberText.getText()))) {
            account.setMobileNumber(Long.parseLong(mobileNumberText.getText()));
        }
    }

    private void checkLicenceDetails() {
        checkLicenceType();
        checkLicenceNumber();
        checkLicenceIssueDate();
        checkLicenceExpiryDate();
    }

    private void checkLicenceType() {
        if (!account.getLicence().getType().equals(licenceTypeCheckBox.getValue().toString())) {
            account.getLicence().setType(licenceTypeCheckBox.getValue().toString());
        }
    }

    private void checkLicenceNumber() {
        if (!account.getLicence().getNumber().equals(licenceNumberText.getText())) {
            account.getLicence().setNumber(licenceNumberText.getText());
        }
    }

    private void checkLicenceIssueDate() {
        if (!account.getLicence().getIssue().equals(licenceIssueDate.getValue())) {
            account.getLicence().setIssue(licenceIssueDate.getValue());
        }
    }

    private void checkLicenceExpiryDate() {
        if (!account.getLicence().getExpiry().equals(licenceExpiryDate.getValue())) {
            account.getLicence().setExpiry(licenceExpiryDate.getValue());
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
    private void goBackAccount() {
        replaceSceneContent(SceneType.VIEW_ACCOUNT_DETAILS);
    }
}
