package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Account;
import model.GeneralData;
import model.StopPoint;
import model.Trip;


/**
 * Created by sungu on 19/04/2017.
 */
public class ShowTripsController extends Controller {

    @FXML private ComboBox tripsComboBox;
    @FXML private TextField nameBox;
    @FXML private TextField vehicleBox;
    @FXML private TextField routeBox;
    @FXML private TableView stopPointTable;
    @FXML private TableColumn stopPointNameList;
    @FXML private TableColumn stopPointTimeList;
    @FXML private TextField directionBox;
    @FXML private TextField stopTimeText;
    @FXML private CheckBox recurrentBox;
    @FXML private CheckBox mondayBox;
    @FXML private CheckBox tuesdayBox;
    @FXML private CheckBox wednesdayBox;
    @FXML private CheckBox thursdayBox;
    @FXML private CheckBox fridayBox;
    @FXML private CheckBox saturdayBox;
    @FXML private CheckBox sundayBox;
    @FXML private TextField dateText;

    private GeneralData generalData;
    private Account account;

    private Trip currentTrip;

    public void load() {
        generalData = getParent().getGeneralData();
        account = getParent().getUserAccount();

        tripsComboBox.setItems(FXCollections.observableArrayList(account.getTrips().keySet()));

        setListeners();

        tripsComboBox.getSelectionModel().select(generalData.getCurrentTrip());
    }

    private void setListeners() {
        tripsComboBox.valueProperty().addListener((ov, oldValue, newValue) -> {
            String temporaryString;
            currentTrip = account.getTrips().get(newValue);
            nameBox.setText(currentTrip.getName());
            routeBox.setText(currentTrip.getRoute().getName());
            vehicleBox.setText(currentTrip.getVehicle().getLicensePlate());

            stopPointNameList.setCellValueFactory(new PropertyValueFactory<StopPoint, String>("Address"));
            stopPointTimeList.setCellValueFactory(new PropertyValueFactory<StopPoint, Integer>("Time"));
            stopPointTable.setItems(FXCollections.observableArrayList(currentTrip.getRoute().getRouteStops()));

            if (currentTrip.getDirection() == 0) { temporaryString = "To University"; }
            else { temporaryString = "From University"; }
            directionBox.setText(temporaryString);

            Integer tempInt = currentTrip.getStopTimes();
            stopTimeText.setText(tempInt.toString());

            if (currentTrip.isRecurrent()) {
                recurrentBox.setSelected(true);
                for (int i = 0; i < currentTrip.getDays().size(); i++) {
                    if (currentTrip.getDays().get(i) == true) {
                        switch (i) {
                            case 0:
                                mondayBox.setSelected(true);
                                break;
                            case 1:
                                tuesdayBox.setSelected(true);
                                break;
                            case 2:
                                wednesdayBox.setSelected(true);
                                break;
                            case 3:
                                thursdayBox.setSelected(true);
                                break;
                            case 4:
                                fridayBox.setSelected(true);
                                break;
                            case 5:
                                saturdayBox.setSelected(true);
                                break;
                            case 6:
                                sundayBox.setSelected(true);
                                break;
                            default:
                                break;
                        }
                    }
                }
                dateText.setText(currentTrip.getExpiryDate().toString());
            }
        });
    }

    public void saveChanges() {

    }
}
