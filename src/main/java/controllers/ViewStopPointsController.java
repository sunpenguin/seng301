package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import model.GeneralData;
import model.StopPoint;
import utils.Session;
import utils.StopPointsSearcher;

/**
 * The controller class for viewing stop points.
 */
public class ViewStopPointsController extends Controller {
    @FXML private TableView stopPointsTable;
    @FXML private TableColumn streetNameColumn;
    @FXML private TableColumn streetSuburbColumn;
    @FXML private TextField searchField;
    @FXML private ComboBox searchByComboBox;
    @FXML private Text distanceText;

    private GeneralData generalData;
    private StopPointsSearcher stopPointsSearcher;

    public void load() {
        generalData = getParent().getGeneralData();
        stopPointsSearcher = new StopPointsSearcher(generalData.getStopPoints().values());

        distanceText.setText("Select a Stop Point!");

        streetNameColumn.setCellValueFactory(new PropertyValueFactory<StopPoint, String>("Address"));
        streetSuburbColumn.setCellValueFactory(new PropertyValueFactory<StopPoint, String>("Suburb"));

        stopPointsTable.setItems(FXCollections.observableArrayList(generalData.getStopPoints().values()));

        setListener();

        searchByComboBox.setItems(FXCollections.observableArrayList("Street Name", "Suburb Name"));
        searchByComboBox.getSelectionModel().selectFirst();
    }

    private void setListener() {
        stopPointsTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
//                Session.getInstance().setStopPoint((StopPoint) newSelection);
//                createPopUpStage(SceneType.VIEW_AVAILABLE_RIDES, 1000, 800);
                StopPoint stopPoint = (StopPoint) newSelection;
                distanceText.setText(String.valueOf(stopPoint.getDistance()) + " L/100km");
            }
        });
    }

    @FXML
    private void openAvailableRides() {
        if (stopPointsTable.getSelectionModel().getSelectedItem() != null) {
            Session.getInstance().setStopPoint((StopPoint) stopPointsTable.getSelectionModel().getSelectedItem());
            createPopUpStage(SceneType.VIEW_AVAILABLE_RIDES, 1000, 750);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Selection Error");
            alert.setHeaderText("Stop Point Selection Error");
            alert.setContentText("Please select a Stop Point in the table and try again!");
            alert.showAndWait();
        }
    }

    @FXML
    private void searchStopPoints() {
        String searchType = searchByComboBox.getValue().toString();
        if (searchField.getText() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Search Error");
            alert.setHeaderText("You need to specify what you want to search!");
            alert.showAndWait();
        } else {
            stopPointsSearcher.resetSearchList();
            switch (searchType) {
                case "Street Name":
                    stopPointsSearcher.searchByStreetName(searchField.getText());
                    stopPointsTable.setItems(
                            FXCollections.observableArrayList(stopPointsSearcher.getSearchStopPoints()));
                    distanceText.setText("Select a Stop Point!");
                    break;
                case "Suburb Name":
                    stopPointsSearcher.searchBySuburbName(searchField.getText());
                    stopPointsTable.setItems(
                            FXCollections.observableArrayList(stopPointsSearcher.getSearchStopPoints()));
                    distanceText.setText("Select a Stop Point!");
                    break;
                default:
                    break;
            }
        }
    }

    @FXML
    private void addStopPoint() {
        createPopUpStage(SceneType.ADD_STOP_POINT, 1000, 750);
        stopPointsTable.setItems(FXCollections.observableArrayList(generalData.getStopPoints().values()));
        searchField.clear();
        stopPointsTable.getSelectionModel().clearSelection();
    }
}
