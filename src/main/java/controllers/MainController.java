package controllers;


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

    public void openHome() {
        replaceSceneContent("home.fxml");
    }

    public void openAccount() {
        replaceSceneContent("viewAccountDetails.fxml");
    }

    public void openViewVehicles() {
        replaceSceneContent("viewVehicles.fxml");
    }

    public void openMyRides() {
        replaceSceneContent("viewAccountRides.fxml");
    }

    public void openStopPoints() {
        replaceSceneContent("viewStopPoints.fxml");
    }

    public void openRoutes() {
        replaceSceneContent("viewRoutes.fxml");
    }

    public void killMe() {
        System.out.println("HA! You think I would die? Hell no! Enjoy this you sucker!");
    }
}
