package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Account;
import model.Vehicle;
import utils.Session;


/**
 * The controller class for the FXML file "addVehicleForm.fxml".
 * @author Sunguin Peng
 * @see controllers.Controller
 */
public class AddVehicleController extends Controller {
    @FXML
    private TextField typeText;
    @FXML
    private TextField modelText;
    @FXML
    private TextField colourText;
    @FXML
    private TextField lpText;
    @FXML
    private TextField yearText;
    @FXML
    private TextField seatsText;

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
                    Integer.parseInt(seatsText.getText())
            ));
            typeText.clear();
            modelText.clear();
            colourText.clear();;
            lpText.clear();
            yearText.clear();
            seatsText.clear();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Vehicle Error");
            alert.setHeaderText("There was an error adding your vehicle.");
            alert.showAndWait();
        }
    }
}
