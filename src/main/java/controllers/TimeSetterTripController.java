package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.GeneralData;


/**
 * Created by sungu on 15/05/2017.
 */
public class TimeSetterTripController extends Controller {

    @FXML private TextField timeText;
    @FXML private Button confirmButton;

    private GeneralData generalData;

    public void load() {
        generalData = getParent().getGeneralData();
    }

    public void setTime() {
        if (timeText.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Time Set Error");
            alert.setHeaderText("You need to enter a time in the format HH:MM.");
            alert.setContentText("H is an hour number, M is a minute number.");
            alert.showAndWait();
        } else {
            //Closes the popup.
            Stage stage = (Stage) confirmButton.getScene().getWindow();
            stage.close();
        }
    }
}
