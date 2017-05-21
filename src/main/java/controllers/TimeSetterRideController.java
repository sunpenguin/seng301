package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Session;


/**
 * Sets a time for a selected Stop Point for a Route during Trip creation.
 */
public class TimeSetterRideController extends Controller {

    @FXML private TextField timeText;
    @FXML private Button confirmButton;

    public void load() {
    }

    @FXML
    private void setTime() {
        if (timeText.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Time Set Error");
            alert.setHeaderText("You need to enter a time in the format HH:MM.");
            alert.setContentText("H is an hour number, M is a minute number.");
            alert.showAndWait();
        } else {
            Session.getInstance().setTime(timeText.getText());
            //Closes the popup.
            Stage stage = (Stage) confirmButton.getScene().getWindow();
            stage.close();
        }
    }
}
