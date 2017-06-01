package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Account;
import model.Vehicle;
import utils.Session;


/**
 * The controller class for the FXML file "addVehicleForm.fxml".
 * @author Sunguin Peng
 * @see controllers.Controller
 */
public class AddVehicleController extends Controller {
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

    /**
     * The method to load files from the abstract class.
     * This method loads the general data.
     * @see controllers.Controller
     */
    public void load() {
        currentUser = Session.getInstance().getCurrentAccount();
    }

    /**
     * This method takes in all the parameters entered in the form "addVehicleForm.fxml" and creates a new vehicle.
     * This vehicle is added into the user account.
     * @see Account
     */
    @FXML
    private void addVehicle() {
        try {
            currentUser.addVehicle(lpText.getText(), new Vehicle(
                    typeText.getText(),
                    modelText.getText(),
                    colourText.getText(),
                    lpText.getText(),
                    Integer.parseInt(yearText.getText()),
                    Integer.parseInt(seatsText.getText()),
                    Integer.parseInt(performanceText.getText()),
                    expiryWOFText.getValue(),
                    expiryRegistrationText.getValue()
            ));

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Add Vehicle");
            alert.setHeaderText("Add Vehicle Successful");
            alert.setContentText("Your vehicle has been added to your account!");
            alert.showAndWait();

            Stage stage = (Stage) typeText.getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Vehicle Error");
            alert.setHeaderText("There was an error adding your vehicle.");
            alert.setContentText("Please check your fields and try again.");
            alert.showAndWait();
        }
    }
}
