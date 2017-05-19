package controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import model.*;

import java.util.List;

/**
 * The controller class for viewing routes.
 */
public class ViewRoutesController extends Controller {
    @FXML private TableView routesTable;
    @FXML private TableColumn routeNameColumn;
    @FXML private TableColumn routeStopPointsColumn;

    private GeneralData generalData;

    public void load() {
        generalData = getParent().getGeneralData();

        routeNameColumn.setCellValueFactory(new PropertyValueFactory<Route, String>("Name"));
        routeStopPointsColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Ride, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures param) {
                Route route = (Route) param.getValue();
                List<StopPoint> stopPoints = route.getRouteStops();
                String direction = "The course for this route is as below:\n";
                for (StopPoint stopPoint : stopPoints) {
                    direction += stopPoint.getNumber() + " " + stopPoint.getAddress() + ", " + stopPoint.getSuburb() + "\n";
                }
                return new SimpleStringProperty(direction);
            }
        });

        routesTable.setItems(FXCollections.observableArrayList(generalData.getRoutes().values()));
    }

    public void addRoute() {
        createPopUpStage("addRoute.fxml", 1000, 800);
        routesTable.setItems(FXCollections.observableArrayList(generalData.getRoutes().values()));
    }
}
