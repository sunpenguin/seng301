package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.GeneralData;
import utils.Session;

import java.io.IOException;
import java.util.Optional;

import static core.Main.save;

/**
 * The main controller class that manages the top menu.
 *
 * @author Sunguin Peng
 */
public class MainController extends Controller {

    @FXML private MenuBar menuBar;
    @FXML private Menu driverMenu;
    @FXML private MenuItem vehicleMenuItem;

    private boolean menuToggle = true;
    private GeneralData generalData;

    /**
     * Initial loader from the abstract class
     */
    public void load() {
        generalData = getParent().getGeneralData();
    }

    public void toggleMenuDisable() {
        menuToggle = !menuToggle;
        menuBar.setDisable(menuToggle);
    }

    public void setPassengerSettings(Boolean toPassenger) {
        driverMenu.setDisable(toPassenger);
    }

    @FXML
    private void openAccount() {
        replaceSceneContent(SceneType.VIEW_ACCOUNT_DETAILS);
    }

    @FXML
    private void openMyBookedRides() {
        replaceSceneContent(SceneType.VIEW_MY_RIDES);
    }

    @FXML
    private void logOut() throws IOException{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log Out Confirmation");
        alert.setHeaderText("You are about log out.");
        alert.setContentText("Are you sure you want to log out?");
        Optional<ButtonType> action = alert.showAndWait();
        if (action.get() == ButtonType.OK) {
            Session.reset();
            getParent().toggleMenuDisable();
            replaceSceneContent(SceneType.LOG_IN_SCREEN);
            save(generalData);
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
