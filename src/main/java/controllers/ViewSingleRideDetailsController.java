package controllers;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import model.*;
import utils.Session;

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

    private GeneralData generalData;
    private Account driverAccount;

    public void load() {
        generalData = getParent().getGeneralData();
        Ride rideToDisplay = Session.getInstance().getRide();
        driverAccount = generalData.getAccountMap().get(rideToDisplay.getDriverID());

        nameText.setText(driverAccount.getName());
        licenceText.setText(driverAccount.getLicenceNumber());
        carModelText.setText(rideToDisplay.getVehicle().getModel());
        carColourText.setText(rideToDisplay.getVehicle().getColour());
        Integer year = rideToDisplay.getVehicle().getYear();
        carYearText.setText(year.toString());
        Integer seats = rideToDisplay.getVehicle().getSeats();
        carSeatsText.setText(seats.toString());

        String direction = "The course for this route is as below:\n";
        for (StopPoint stopPoint : rideToDisplay.getRoute().getRouteStops()) {
            direction += stopPoint.getNumber() + " " + stopPoint.getAddress() + ", " + stopPoint.getSuburb() + "\n";
        }
        routeText.setText(direction);
        Integer stops = rideToDisplay.getRoute().getRouteStops().size();
        stopsText.setText(stops.toString());
    }

    public void bookRide() {
        Session.getInstance().getRide().addPassenger(Session.getInstance().getCurrentAccount());
    }

}
