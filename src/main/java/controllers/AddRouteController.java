package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.GeneralData;
import model.Route;
import model.StopPoint;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * The controller class for the FXML file "addRoute.fxml".
 * @author Sunguin Peng
 * @see controllers.Controller
 */
public class AddRouteController extends Controller {
    @FXML private TextField nameText;
    @FXML private ListView stopPointList;
    @FXML private ListView selectedStopPointList;
    @FXML private Button addRouteButton;

    private GeneralData generalData;
    private List<StopPoint> temporaryData; // The list that contains all the stop points
    private List<StopPoint> temporaryRoute; // The list to be used for the new route

    /**
     * The method to load files from the abstract class.
     * This method loads the general data, lists and sets up the lists.
     * @see controllers.Controller
     */
    public void load() {
        generalData = getParent().getGeneralData();
        temporaryData = new ArrayList<>(generalData.getStopPoints().values());
        temporaryRoute = new ArrayList<>();

        displayAddress(stopPointList, temporaryData);
        displayAddress(selectedStopPointList, temporaryRoute);
    }

    /**
     * This method will add a stop point to the new route being created.
     */
    @FXML
    private void addToSelected() {
        ObservableList<StopPoint> toMove = stopPointList.getSelectionModel().getSelectedItems();
        if (toMove != null && toMove.size() > 0) {
            temporaryData.remove(toMove.get(0));
            temporaryRoute.add(toMove.get(0));
        }

        // Update lists
        displayAddress(stopPointList, temporaryData);
        displayAddress(selectedStopPointList, temporaryRoute);
    }

    /**
     * This method will remove a stop point to the new route being created.
     */
    @FXML
    private void removeFromSelected() {
        ObservableList<StopPoint> toMove = selectedStopPointList.getSelectionModel().getSelectedItems();
        if (toMove != null && toMove.size() > 0) {
            temporaryRoute.remove(toMove.get(0));
            temporaryData.add(toMove.get(0));
        }

        // Update lists
        displayAddress(stopPointList, temporaryData);
        displayAddress(selectedStopPointList, temporaryRoute);
    }

    /**
     * This method takes in all the parameters entered in the form "addRoute.fxml" and creates a new route.
     * This route is added into GeneralData.
     * @see GeneralData
     */
    @FXML
    private void addRoute() {
        if (temporaryRoute.size() > 0 && !nameText.getText().isEmpty()) {

            generalData.getRoutes().put(nameText.getText(), new Route(nameText.getText(), temporaryRoute));
            nameText.clear();

            temporaryData = new ArrayList<>(generalData.getStopPoints().values());
            temporaryRoute = new ArrayList<>();

            displayAddress(stopPointList, temporaryData);
            displayAddress(selectedStopPointList, temporaryRoute);

            Stage stage = (Stage) addRouteButton.getScene().getWindow();
            stage.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Route Error");
            alert.setHeaderText("There was an error adding your route.");
            alert.showAndWait();
        }
    }

    /**
     * Sets up the lists that display the stop points to be used for the routes
     * @param listView  The list to be updated
     * @param listToDisplay The elements to be displayed on the list view
     */
    private void displayAddress(ListView listView, Collection listToDisplay) {
        listView.setItems(FXCollections.observableArrayList(listToDisplay));
        listView.setCellFactory(param -> new ListCell<StopPoint>() {
            @Override
            protected void updateItem(StopPoint stopPoint, boolean empty) {
                super.updateItem(stopPoint, empty);

                if (empty || stopPoint == null || stopPoint.getAddress() == null) {
                    setText(null);
                } else {
                    setText(stopPoint.getAddress());
                }
            }
        });
    }
}
