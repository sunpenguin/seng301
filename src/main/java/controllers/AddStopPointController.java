package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import model.GeneralData;
import model.StopPoint;
import utils.Checkers;


/**
 * The controller class for adding stop points to GeneralData.
 * Also has a map to go with it
 *
 * @author Sunguin Peng
 * @see controllers.Controller
 */
public class AddStopPointController extends Controller {
    @FXML private TextField streetText;
    @FXML private TextField suburbText;
    @FXML private Button addStopPointButton;
    @FXML private WebView map;
    @FXML private Text distanceText;
    @FXML private TextArea instructionsTextArea;

    private GeneralData generalData;
    private WebEngine engine;
    private String mapLocation = getClass().getClassLoader().getResource(SceneType.MAP.getFilePath()).toExternalForm();

    /**
     * The method to load files from the abstract class.
     * This method loads the general data.
     * @see controllers.Controller
     */
    public void load() {
        generalData = getParent().getGeneralData();
        engine = map.getEngine();
        engine.load(mapLocation);
        engine.setJavaScriptEnabled(true);

        setInformation();
    }

    private void setInformation() {
        String information = "Step 1: Wait for Maps to load.\nStep 2: Enter fields.\nStep 3: Show Point on Map\n" +
                "Step 4: Calculate Distance\nStep 5: Create Stop Point";
        instructionsTextArea.setText(information);
    }

    /**
     * This method takes in all the parameters entered in the form "addStopPoint.fxml" and creates a new stop point.
     * This stop point is added into GeneralData.
     * @see GeneralData
     */
    @FXML
    private void addStopPoint() {
         try {
            StopPoint stopPointToAdd = new StopPoint(streetText.getText(), suburbText.getText());
            calculateDistance();
            stopPointToAdd.setDistance(Double.parseDouble(distanceText.getText())/1000);
            generalData.addStopPoint(streetText.getText() + suburbText.getText(), stopPointToAdd);

            Stage stage = (Stage) addStopPointButton.getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Stop Point Error");
            alert.setHeaderText("There was an error!");
            alert.setContentText("Please check the steps and try again!");
            alert.showAndWait();
        }
    }

    /**
     * Using the street text and suburb text, it will query the geocodes from Google and try to find the best match.
     */
    @FXML
    private void showPoint() {
        if (!streetText.getText().isEmpty()) {
            String query = "geocodeAddress('" + streetText.getText() + " " + suburbText.getText() + "');";
            engine.executeScript(query);
        }
    }

    /**
     * Uses Google Maps to calculate the distance between the most recent marker placed and the university
     */
    @FXML
    private void calculateDistance() {
        String query = "calculateDistance();";
        String distance = String.valueOf((engine.executeScript(query)));
        distanceText.setText(distance);
    }
}
