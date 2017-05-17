package controllers;


/**
 * The main controller class that manages the top menu.
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

    public void openAddVehicle() {
        replaceSceneContent("addVehicleForm.fxml");
    }

    public void openAddSP() {
        replaceSceneContent("addStopPoint.fxml");
    }

    public void openAddRoute() {
        replaceSceneContent("addRoute.fxml");
    }

    public void openAddTrip() {
        replaceSceneContent("addTrip.fxml");
    }

    public void openShareRide() {
        replaceSceneContent("createRide.fxml");
    }

    public void showTrips() {
        replaceSceneContent("showTrips.fxml");
    }

    public void openStopPoints() {
        replaceSceneContent("searchStopPoints.fxml");
    }

    public void openViewRides() {
        replaceSceneContent("availableRides.fxml");
    }

    public void killMe() {
        System.out.println("HA! You think I would die? Hell no! Enjoy this you sucker!");
    }
}
