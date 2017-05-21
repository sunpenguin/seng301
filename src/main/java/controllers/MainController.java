package controllers;


import javafx.fxml.FXML;

/**
 * The main controller class that manages the top menu.
 *
 * @author Sunguin Peng
 */
public class MainController extends Controller {

    /**
     * Initial loader from the abstract class
     */
    public void load() {
        //nothing to load
    }

    @FXML
    private void openHome() {
        replaceSceneContent("home.fxml");
    }

    @FXML
    private void openAccount() {
        replaceSceneContent("viewAccountDetails.fxml");
    }

    @FXML
    private void openViewVehicles() {
        replaceSceneContent("viewVehicles.fxml");
    }

    @FXML
    private void openMyRides() {
        replaceSceneContent("viewAccountRides.fxml");
    }

    @FXML
    private void openStopPoints() {
        replaceSceneContent("viewStopPoints.fxml");
    }

    @FXML
    private void openRoutes() {
        replaceSceneContent("viewRoutes.fxml");
    }

    @FXML
    private void killMe() {
        System.out.println("HA! You think I would die? Hell no! Enjoy this you sucker!");
    }
}
