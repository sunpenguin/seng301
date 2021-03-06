package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.*;
import utils.Session;

import java.text.DecimalFormat;
import java.util.Optional;

/**
 * The controller class for viewing details on a single ride.
 */
public class ViewSingleRideDetailsController extends Controller {

    @FXML private Text nameText;
    @FXML private Text licenceText;
    @FXML private Text carModelText;
    @FXML private Text carColourText;
    @FXML private Text carYearText;
    @FXML private Text carSeatsText;
    @FXML private Text routeText;
    @FXML private Text stopsText;
    @FXML private Button bookRideButton;

    private GeneralData generalData;
    private Account driverAccount;
    private DecimalFormat format = new DecimalFormat("#.00");

    public void load() {
        generalData = getParent().getGeneralData();
        Ride rideToDisplay = Session.getInstance().getRide();
        driverAccount = generalData.getAccountMap().get(rideToDisplay.getDriverID());

        nameText.setText(driverAccount.getName());
        licenceText.setText(driverAccount.getLicence().getNumber());
        carModelText.setText(rideToDisplay.getVehicle().getModel());
        carColourText.setText(rideToDisplay.getVehicle().getColour());
        Integer year = rideToDisplay.getVehicle().getYear();
        carYearText.setText(year.toString());
        Integer seats = rideToDisplay.getVehicle().getSeats();
        carSeatsText.setText(seats.toString());

        String direction = "The course for this route is as below:\n";
        for (StopPoint stopPoint : rideToDisplay.getRoute().getRouteStops()) {
            direction += stopPoint.getAddress() + ", $" + format.format(stopPoint.getCost()) + "\n";
        }
        routeText.setText(direction);
        Integer stops = rideToDisplay.getRoute().getRouteStops().size();
        stopsText.setText(stops.toString());
    }

    @FXML
    private void bookRide() {
        Ride ride = Session.getInstance().getRide();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Ride Passenger Confirmation");
        alert.setHeaderText("You are about to become a passenger for this ride.");
        alert.setContentText("Ride on: " + ride.getDate().toString() + " with " +
                        ride.getAvailableSeats() + " seats.");
        Optional<ButtonType> action = alert.showAndWait();
        if (action.get() == ButtonType.OK && !driverAccount.getUniversityID().equals(Session.getInstance().getCurrentAccount().getUniversityID())) {
            Session.getInstance().getRide().addPassenger(Session.getInstance().getCurrentAccount());
        } else if (action.get().equals(ButtonType.CANCEL) || action.get().equals(ButtonType.CLOSE)) {

        } else {
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Ride Passenger Error");
            error.setHeaderText("Ride Booking Error");
            error.setContentText("You cannot book your own ride!");
            error.showAndWait();
        }

        Stage stage = (Stage) bookRideButton.getScene().getWindow();
        stage.close();
    }

}
