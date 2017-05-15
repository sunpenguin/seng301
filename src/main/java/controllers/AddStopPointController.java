package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.GeneralData;
import model.StopPoint;
import utils.Checkers;


/**
 * The controller class for the FXML file "addStopPoint.fxml".
 * @author Sunguin Peng
 * @see controllers.Controller
 */
public class AddStopPointController extends Controller {
    @FXML
    private TextField numberText;
    @FXML
    private TextField streetText;
    @FXML
    private TextField suburbText;

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
    public void addStopPoint() {
//        if (!addressText.getText().isEmpty()) {
//            generalData.addStopPoint(addressText.getText(), new StopPoint(
//                    addressText.getText()
//            ));
//            addressText.clear();
//        } else {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Add Stop Point Error");
//            alert.setHeaderText("There was an error adding your stop point.");
//            alert.showAndWait();
//        }
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
            clearFields();
        }
    }

    private void clearFields() {
        numberText.clear();
        streetText.clear();
        suburbText.clear();
    }
}
