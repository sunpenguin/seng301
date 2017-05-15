package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.GeneralData;
import model.StopPoint;
import utils.StopPointsSearcher;

/**
 * Created by sungu on 24/04/2017.
 */
public class SearchStopPointsController extends Controller {
    @FXML
    private TableView stopPointsTable;
    @FXML
    private TableColumn streetNumberColumn;
    @FXML
    private TableColumn streetNameColumn;
    @FXML
    private TableColumn streetSuburbColumn;
    @FXML
    private TextField searchField;
    @FXML
    private ComboBox searchByComboBox;

    private GeneralData generalData;
    private StopPointsSearcher stopPointsSearcher;

    public void load() {
        generalData = getParent().getGeneralData();
        stopPointsSearcher = new StopPointsSearcher(generalData.getStopPoints().values());

        streetNumberColumn.setCellValueFactory(new PropertyValueFactory<StopPoint, Integer>("Number"));
        streetNameColumn.setCellValueFactory(new PropertyValueFactory<StopPoint, String>("Address"));
        streetSuburbColumn.setCellValueFactory(new PropertyValueFactory<StopPoint, String>("Suburb"));

        stopPointsTable.setItems(FXCollections.observableArrayList(generalData.getStopPoints().values()));

//        setListener();

        searchByComboBox.setItems(FXCollections.observableArrayList("Street Name", "Suburb Name"));
        searchByComboBox.getSelectionModel().selectFirst();
    }

    private void setListener() {
//        stopPointsTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
//            if (newSelection != null) {
//                createPopUpStage("", 800, 800);
//            }
//        });
    }

    public void searchStopPoints() {
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
                    break;
                case "Suburb Name":
                    stopPointsSearcher.searchBySuburbName(searchField.getText());
                    stopPointsTable.setItems(
                            FXCollections.observableArrayList(stopPointsSearcher.getSearchStopPoints()));
                    break;
                default:
                    break;
            }
        }
    }
}
