package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import utils.Session;

/**
 * Controller class for reason pop-up
 */
public class RideReasonController extends Controller {

    @FXML private TextArea reasonArea;
    @FXML private Button confirmButton;

    @Override
    public void load() {
        reasonArea.setWrapText(true);
    }

    @FXML
    private void confirmReason() {
        if (reasonArea.getText() != null) {
            Session.getInstance().setReason(reasonArea.getText());

            Stage stage = (Stage) confirmButton.getScene().getWindow();
            stage.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Reason Error");
            alert.setHeaderText("Reason Entry Error");
            alert.setContentText("Please enter a valid reason for your action.");
            alert.showAndWait();
        }
    }
}
