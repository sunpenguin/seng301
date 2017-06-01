package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.*;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Cucumber tests for cancelling a ride as a passenger
 */
public class CancelRidePassengerStepDefinition {

    GeneralData generalData;
    Account driver;
    Account passenger;
    Route route;
    Vehicle car;
    Ride ride;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Given("^I have booked the ride \"([^\"]*)\" by driver \"([^\"]*)\"$")
    public void iHaveBookedTheRideByDriver(String rideName, String driverName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        generalData = new GeneralData();
        createDriver(driverName);
        createVehicle();
        driver.addVehicle(car.getType(), car);
        createPassenger();
        generalData.addAccount(driver);
        generalData.addAccount(passenger);
        createRoute();
        createRide(rideName);
        generalData.getRides().put(driver.getUniversityID(), new ArrayList<>(Arrays.asList(ride)));
        ride.addPassenger(passenger);
        generalData.getNotifications().put(passenger.getUniversityID(), new Notification(passenger));
        generalData.getNotifications().put(driver.getUniversityID(), new Notification(driver));
    }

    @When("^I cancel my booking on \"([^\"]*)\"$")
    public void iCancelMyBookingOn(String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        for (List<Ride> rideList : generalData.getRides().values()) {
            for (Ride r : rideList) {
                if (r.getName().equals(rideName)) {
                    r.removePassenger(passenger);
                }
            }
        }
    }

    @When("^my reason is \"([^\"]*)\"$")
    public void myReasonIs(String reason) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        generalData.getNotifications().get(driver.getUniversityID()).setUnbookRide(reason);
    }

    @Then("^the driver will receive the notification \"([^\"]*)\"$")
    public void theDriverWillReceiveTheNotification(String reason) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Notification n = generalData.getNotifications().get(driver.getUniversityID());
        String result = n.checkNotifications();

        Assert.assertTrue(result.contains(reason));
    }

    private void createRide(String rideName) {
        ride = new Ride(rideName, route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 30, "jax12");
    }

    private void createRoute() {
        StopPoint sp1 = new StopPoint("Street Name", "Suburb 1");
        StopPoint sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route("Route", new ArrayList<>(Arrays.asList(sp1, sp2)));
    }

    private void createDriver(String name) {
//        (String universityID, String password, String email,
//                String vehicleName, String address, Integer homeNumber, Integer mobileNumber, Licence licence)
        driver = new Account(name, "password", name + "@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L,
                new Licence("Full for over 2 years", "YXF87231",
                        LocalDate.parse("12/12/2015", formatter),
                        LocalDate.parse("12/12/2020", formatter)));
    }

    private void createPassenger() {
//        (String universityID, String password, String email, String vehicleName, String address, Integer homeNumber, Integer mobileNumber)
        passenger = new Account("passenger", "password", "passenger@uclive.ac.nz",
                "Daniella", "20 Howard Street", 1234567, 64278182123L);
    }

    private void createVehicle() {
        car = new Vehicle("Jet Car", "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse("12/12/2017", formatter));
    }
}
