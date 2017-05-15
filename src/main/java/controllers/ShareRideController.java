package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Account;
import model.GeneralData;
import model.Ride;

/**
 * The controller class xD
 */
public class ShareRideController extends Controller {
    @FXML
    private TextField nameText;
    @FXML
    private TextField passengerNumberText;
    @FXML
    private ComboBox tripComboBox;

    private GeneralData generalData;
    private Account account;

    public void load() {
        this.generalData = getParent().getGeneralData();
        this.account = getParent().getUserAccount();

        tripComboBox.setItems(FXCollections.observableArrayList(account.getTrips().keySet()));
        tripComboBox.getSelectionModel().select(0);
    }

    public void shareRide() {
        if (nameText.getText() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Share Ride Error");
            alert.setHeaderText("You need to name your ride!");
            alert.showAndWait();
        } else if (passengerNumberText.getText() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Share Ride Error");
            alert.setHeaderText("You need to specify the number of passengers!");
            alert.showAndWait();
        } else {
            Ride newRide = new Ride(account.getTrips().get(tripComboBox.getSelectionModel().getSelectedItem()),
                    Integer.parseInt(passengerNumberText.getText()));
            generalData.getRides().put(nameText.getText(), newRide);

        }
    }
}
