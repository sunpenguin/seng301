package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Account;
import model.GeneralData;
import model.Ride;

/**
 * The controller class for creating a ride.
 */
public class CreateRideController extends Controller {
    @FXML private TextField nameText;
    @FXML private TextField passengerNumberText;
    @FXML private ComboBox tripComboBox;

    private GeneralData generalData;
    private Account account;

    public void load() {
        this.generalData = getParent().getGeneralData();
        this.account = getParent().getUserAccount();

        tripComboBox.setItems(FXCollections.observableArrayList(account.getTrips().keySet()));
        tripComboBox.getSelectionModel().select(0);
    }

    public void createRide() {
        if (nameText.getText() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ride Creation Error");
            alert.setHeaderText("You need to name your ride!");
            alert.showAndWait();
        } else if (passengerNumberText.getText() == null ||
                Integer.parseInt(passengerNumberText.getText()) >
                        account.getTrips().get(tripComboBox.getSelectionModel().getSelectedItem()).getVehicle().getSeats()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ride Creation Error");
            alert.setHeaderText("Your number of passengers must be a valid number!");
            alert.showAndWait();
        } else {
            //TODO check that name of the ride is unique
            Ride newRide = new Ride(nameText.getText(), account.getTrips().get(tripComboBox.getSelectionModel().getSelectedItem()),
                    Integer.parseInt(passengerNumberText.getText()));
            generalData.getRides().put(nameText.getText(), newRide);
            account.getRides().put(nameText.getText(), newRide);
        }
    }
}
