package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Account;
import model.GeneralData;
import model.Ride;
import model.Vehicle;
import utils.Checkers;
import utils.Session;

import java.time.LocalDate;
import java.util.List;

/**
 * Controller class for editing vehicle details
 */
public class EditVehicleDetailsController extends Controller {

    @FXML private TextField typeText;
    @FXML private TextField modelText;
    @FXML private TextField colourText;
    @FXML private TextField lpText;
    @FXML private TextField yearText;
    @FXML private TextField seatsText;
    @FXML private TextField performanceText;
    @FXML private DatePicker expiryWOFText;
    @FXML private DatePicker expiryRegistrationText;

    private Account currentUser;
    private Vehicle vehicle;
    private GeneralData generalData;

    /**
     * The method to load files from the abstract class.
     * This method loads the general data.
     * @see controllers.Controller
     */
    public void load() {
        currentUser = Session.getInstance().getCurrentAccount();
        vehicle = Session.getInstance().getVehicle();

        loadVehicleDetails();
        generalData = getParent().getGeneralData();
    }

    // Fix session class
    private void loadVehicleDetails() {
        typeText.setText(vehicle.getType());
        modelText.setText(vehicle.getModel());
        colourText.setText(vehicle.getColour());
        lpText.setText(vehicle.getLicencePlate());
        yearText.setText(String.valueOf(vehicle.getYear()));
        seatsText.setText(String.valueOf(vehicle.getSeats()));
        performanceText.setText(String.valueOf(vehicle.getPerformance()));
        expiryWOFText.setValue(vehicle.getExpiryWOF());
        expiryRegistrationText.setValue(vehicle.getExpiryRegistration());
    }

    /**
     * This method takes in all the parameters entered in the form "addVehicleForm.fxml" and creates a new vehicle.
     * This vehicle is added into the user account.
     * @see Account
     */
    @FXML
    private void editVehicle() {
        try {
            checkVehicleEdits();
            updatePrices();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Edit Vehicle");
            alert.setHeaderText("Edit Vehicle Successful");
            alert.setContentText("Your vehicle has been successfully edited!");
            alert.showAndWait();

            replaceSceneContent(SceneType.VIEW_VEHICLES);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Edit Vehicle Error");
            alert.setHeaderText("There was an error Editing your vehicle.");
            alert.setContentText("Please check your fields and try again.");
            alert.showAndWait();
        }
    }

    private void updatePrices() {
        List<Ride> rides = generalData.getRides().get(currentUser.getUniversityID());
        for (Ride ride : rides) {
            if (ride.getVehicle().getLicencePlate().equals(vehicle.getLicencePlate())) {
                ride.updateCosts();
            }
        }
    }

    private void checkVehicleEdits() {
        checkSeats();
        checkPerformance();
        checkWOF();
        checkRegistration();
    }

    private void checkSeats() {
        if (Checkers.isNumeric(seatsText.getText()) && vehicle.getSeats() != Integer.parseInt(seatsText.getText())) {
            vehicle.setSeats(Integer.parseInt(seatsText.getText()));
        }
    }

    private void checkPerformance() {
        if (Checkers.isNumeric(performanceText.getText()) && vehicle.getPerformance() != Integer.parseInt(performanceText.getText())) {
            vehicle.setPerformance(Integer.parseInt(performanceText.getText()));
        }
    }

    private void checkWOF() {
        if (expiryWOFText.getValue().isAfter(LocalDate.now())) {
            vehicle.setExpiryWOF(expiryWOFText.getValue());
        }
    }

    private void checkRegistration() {
        if (expiryRegistrationText.getValue().isAfter(LocalDate.now())) {
            vehicle.setExpiryRegistration(expiryRegistrationText.getValue());
        }
    }
}
