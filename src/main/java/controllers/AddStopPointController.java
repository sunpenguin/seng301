package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.GeneralData;
import model.StopPoint;
import utils.Checkers;


/**
 * The controller class for the FXML file "addStopPoint.fxml".
 * @author Sunguin Peng
 * @see controllers.Controller
 */
public class AddStopPointController extends Controller {
    @FXML private TextField numberText;
    @FXML private TextField streetText;
    @FXML private TextField suburbText;
    @FXML private Button addStopPointButton;

    private GeneralData generalData;

    /**
     * The method to load files from the abstract class.
     * This method loads the general data.
     * @see controllers.Controller
     */
    public void load() {
        generalData = getParent().getGeneralData();
    }

    /**
     * This method takes in all the parameters entered in the form "addStopPoint.fxml" and creates a new stop point.
     * This stop point is added into GeneralData.
     * @see GeneralData
     */
    @FXML
    private void addStopPoint() {
        if (numberText.getText() == null || !Checkers.isNumeric(numberText.getText())) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Stop Point Error");
            alert.setHeaderText("The number field must have the number of your street.");
            alert.showAndWait();
        } else if (streetText.getText() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Stop Point Error");
            alert.setHeaderText("The street field must have the name of the street for your stop point.");
            alert.showAndWait();
        } else if (suburbText.getText() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Stop Point Error");
            alert.setHeaderText("The suburb field must have the suburb of your chosen stop point.");
            alert.showAndWait();
        } else {
            generalData.addStopPoint(
                    numberText.getText() + streetText.getText() + suburbText.getText(),
                    new StopPoint(Integer.parseInt(numberText.getText()), streetText.getText(), suburbText.getText()));
            Stage stage = (Stage) addStopPointButton.getScene().getWindow();
            stage.close();
        }
    }
}
