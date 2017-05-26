package controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuBar;
import utils.Session;

import java.util.Optional;


/**
 * The main controller class that manages the top menu.
 *
 * @author Sunguin Peng
 */
public class MainController extends Controller {

    @FXML private MenuBar menuBar;

    private boolean menuToggle = true;

    /**
     * Initial loader from the abstract class
     */
    public void load() {
        //nothing to load
    }

    public void toggleMenuDisable() {
        menuToggle = !menuToggle;
        menuBar.setDisable(menuToggle);
    }

    @FXML
    private void openHome() {
//        replaceSceneContent("home.fxml");
    }

    @FXML
    private void openAccount() {
        replaceSceneContent(SceneType.VIEW_ACCOUNT_DETAILS);
    }

    @FXML
    private void logOut() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log Out Confirmation");
        alert.setHeaderText("You are about log out.");
        alert.setContentText("Are you sure you want to log out?");
        Optional<ButtonType> action = alert.showAndWait();
        if (action.get() == ButtonType.OK) {
            Session.reset();
            getParent().toggleMenuDisable();
            replaceSceneContent(SceneType.LOG_IN_SCREEN);
        }
    }

    @FXML
    private void openViewVehicles() {
        replaceSceneContent(SceneType.VIEW_VEHICLES);
    }

    @FXML
    private void openMyRides() {
        replaceSceneContent(SceneType.VIEW_ACCOUNT_RIDES);
    }

    @FXML
    private void openStopPoints() {
        replaceSceneContent(SceneType.VIEW_STOP_POINTS);
    }

    @FXML
    private void openRoutes() {
        replaceSceneContent(SceneType.VIEW_ROUTES);
    }

    @FXML
    private void killMe() {
        System.out.println("HA! You think I would die? Hell no! Enjoy this you sucker!");
    }
}
