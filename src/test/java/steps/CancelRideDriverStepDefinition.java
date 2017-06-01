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
 * Cuucumber tests for a driver cancelling a ride
 */
public class CancelRideDriverStepDefinition {

    Account passenger1;
    Account passenger2;
    Account driver;

    Route route;
    Vehicle car;
    Ride ride;

    GeneralData generalData;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Given("^I have a passenger \"([^\"]*)\" in my ride \"([^\"]*)\"$")
    public void iHaveAPassengerInMyRide(String passengerName, String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        generalData = new GeneralData();
        createDriver();
        createVehicle();
        driver.addVehicle(car.getType(), car);
        createPassenger1(passengerName);
        generalData.addAccount(driver);
        generalData.addAccount(passenger1);
        createRoute();
        createRide(rideName);
        generalData.getRides().put(driver.getUniversityID(), new ArrayList<>(Arrays.asList(ride)));
        ride.addPassenger(passenger1);
        generalData.getNotifications().put(passenger1.getUniversityID(), new Notification(passenger1));
    }

    @When("^I cancel my ride \"([^\"]*)\"$")
    public void iCancelMyRide(String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        for (List<Ride> rideList : generalData.getRides().values()) {
            for (Ride r : rideList) {
                if (r.getName().equals(rideName)) {
                    r.cancelRide();
                }
            }
        }
    }

    @Then("^passenger \"([^\"]*)\" will be notified$")
    public void passengerWillBeNotified(String passengerName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        generalData.getNotifications().get(passengerName).setRideCancel("Ride has been cancelled, tyre blew.");
        Notification n = generalData.getNotifications().get(passengerName);
        String result = n.checkNotifications();

        Assert.assertTrue(result.contains("Ride has been cancelled, tyre blew."));
    }

    @Given("^I have two passengers \"([^\"]*)\" and \"([^\"]*)\" in my ride \"([^\"]*)\"$")
    public void iHaveTwoPassengersAndInMyRide(String passenger1Name, String passenger2Name, String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        generalData = new GeneralData();
        createDriver();
        createVehicle();
        driver.addVehicle(car.getType(), car);
        createPassenger1(passenger1Name);
        createPassenger2(passenger2Name);
        generalData.addAccount(driver);
        generalData.addAccount(passenger1);
        generalData.addAccount(passenger2);
        createRoute();
        createRide(rideName);
        generalData.getRides().put(driver.getUniversityID(), new ArrayList<>(Arrays.asList(ride)));
        ride.addPassenger(passenger1);
        ride.addPassenger(passenger2);
        generalData.getNotifications().put(passenger1.getUniversityID(), new Notification(passenger1));
        generalData.getNotifications().put(passenger2.getUniversityID(), new Notification(passenger2));
    }

    @Given("^\"([^\"]*)\" is full$")
    public void isFull(String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        for (List<Ride> rideList : generalData.getRides().values()) {
            for (Ride r : rideList) {
                if (r.getName().equals(rideName) && !r.isFull()) {
                    r.setFull(true);
                }
            }
        }
    }

    @Then("^passengers \"([^\"]*)\" and \"([^\"]*)\" will be notified$")
    public void passengersAndWillBeNotified(String passenger1Name, String passenger2Name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        generalData.getNotifications().get(passenger1Name).setRideCancel("Ride has been cancelled, tyre blew.");
        Notification n = generalData.getNotifications().get(passenger1Name);
        String result = n.checkNotifications();
        Assert.assertTrue(result.contains("Ride has been cancelled, tyre blew."));

        generalData.getNotifications().get(passenger2Name).setRideCancel("Ride has been cancelled, tyre blew.");
        Notification n1 = generalData.getNotifications().get(passenger2Name);
        String result1 = n1.checkNotifications();
        Assert.assertTrue(result1.contains("Ride has been cancelled, tyre blew."));
    }

    private void createPassenger1(String name) {
//        (String universityID, String password, String email, String vehicleName, String address, Integer homeNumber, Integer mobileNumber)
        passenger1 = new Account(name, "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
    }

    private void createPassenger2(String name) {
//        (String universityID, String password, String email, String vehicleName, String address, Integer homeNumber, Integer mobileNumber)
        passenger2 = new Account(name, "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
    }

    private void createDriver() {
//        (String universityID, String password, String email,
//                String vehicleName, String address, Integer homeNumber, Integer mobileNumber, Licence licence)
        driver = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L,
                new Licence("Full for over 2 years", "YXF87231",
                        LocalDate.parse("12/12/2015", formatter),
                        LocalDate.parse("12/12/2020", formatter)));
    }

    private void createRoute() {
        StopPoint sp1 = new StopPoint("Street Name", "Suburb 1");
        StopPoint sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route("Route", new ArrayList<>(Arrays.asList(sp1, sp2)));
    }

    private void createVehicle() {
        car = new Vehicle("Jet Car", "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse("12/12/2017", formatter));
    }

    private void createRide(String rideName) {
        ride = new Ride(rideName, route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 2, "jax12");
    }
}
