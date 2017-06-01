package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import model.Account;
import model.Licence;
import utils.Session;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * The controller class for viewing user account data.
 */
public class ViewAccountDetailsController extends Controller {
    @FXML private Text statusText;
    @FXML private Text nameText;
    @FXML private Text numberVehiclesText;
    @FXML private Button viewVehiclesButton;
    @FXML private Text emailText;
    @FXML private Text properNameText;
    @FXML private Text addressText;
    @FXML private Text homeText;
    @FXML private Text mobileText;

    @FXML private Text typeText;
    @FXML private Text numberText;
    @FXML private Text issueText;
    @FXML private Text expiryText;
    // Licence Text
    @FXML private ComboBox typeComboBox;
    @FXML private TextField licenceText;
    @FXML private DatePicker issueDate;
    @FXML private DatePicker expiryDate;
    @FXML private Button verifyLicenceButton;

    private Account account;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void load() {
        account =  Session.getInstance().getCurrentAccount();

        nameText.setText(account.getUniversityID());
        statusText.setText(account.getType());
        emailText.setText(account.getEmail());
        properNameText.setText(account.getName());
        addressText.setText(account.getAddress());

        typeComboBox.setItems(FXCollections.observableArrayList(
                "Restricted",
                "Full for less than 2 Years",
                "Full for more than 2 Years"));

        if (account.getHomeNumber() != null) homeText.setText(account.getHomeNumber().toString());
        if (account.getMobileNumber() != null) mobileText.setText(account.getMobileNumber().toString());

        if (account.getType().equals("Passenger")) {
            setPassengerText();
            getParent().setPassengerSettings(true);
            disableLicence(false);
        } else {
            setDriverText();
            getParent().setPassengerSettings(false);
            disableLicence(true);
        }
    }

    private void setDriverText() {
        Integer numberVehicles = 0;
        viewVehiclesButton.setDisable(true);
        if (account.getVehicles() != null) {
            numberVehicles = account.getVehicles().values().size();
            viewVehiclesButton.setDisable(false);
        }
        Licence licence = account.getLicence();
        typeText.setText(licence.getType());
        numberText.setText(licence.getNumber());
        issueText.setText(licence.getIssue().format(formatter));
        expiryText.setText(licence.getExpiry().format(formatter));
        numberVehiclesText.setText(numberVehicles.toString());
    }

    private void setPassengerText() {
        typeText.setText("N/A");
        numberText.setText("N/A");
        issueText.setText("N/A");
        expiryText.setText("N/A");
        numberVehiclesText.setText("N/A");
        viewVehiclesButton.setDisable(true);
    }

    private void disableLicence(Boolean passenger) {
        typeComboBox.setDisable(passenger);
        licenceText.setDisable(passenger);
        issueDate.setDisable(passenger);
        expiryDate.setDisable(passenger);
        verifyLicenceButton.setDisable(passenger);
    }

    @FXML
    private void goToVehicles() {
        replaceSceneContent(SceneType.VIEW_VEHICLES);
    }

    @FXML
    private void verifyLicence() {
        if (validateLicence()) {
            try {
                Licence licence = new Licence(typeComboBox.getValue().toString(),
                        licenceText.getText(), issueDate.getValue(), expiryDate.getValue());
                account.upgrade(licence);

                Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                successAlert.setTitle("Account Upgrade Success");
                successAlert.setHeaderText("Upgrade Successful!");
                successAlert.setContentText("Your account has been upgraded to a driver account!!");
                successAlert.showAndWait();

                statusText.setText(account.getType());
                setDriverText();
                disableLicence(true);
                getParent().setPassengerSettings(false);
            } catch (Exception e) {
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setTitle("Account Upgrade Failure");
                errorAlert.setHeaderText("The licence you want to add is invalid!");
                errorAlert.setContentText("Please re-enter your details and try again!");
                errorAlert.showAndWait();
            }
        } else {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Account Upgrade Failure");
            errorAlert.setHeaderText("The licence you want to add is invalid!");
            errorAlert.setContentText("Please fill in all the fields and try again!");
            errorAlert.showAndWait();
        }
    }

    @FXML
    private void editAccountDetails() {
        replaceSceneContent(SceneType.EDIT_ACCOUNT);
    }

    /**
     * Checks that the text are existing and correct for creating a licence.
     *
     * @return a boolean stating whether or not the text is valid for creating a licence.
     */
    private boolean validateLicence() {
        LocalDate dateTomorrow = LocalDate.now().plusDays(1);
        if (!typeComboBox.getSelectionModel().isEmpty()
                && !numberText.getText().isEmpty()
                && issueDate.getValue().isBefore(dateTomorrow)
                && expiryDate.getValue().isAfter(dateTomorrow)) {
            return true;
        }
        return false;
    }

}
