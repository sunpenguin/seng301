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
 * Cucumber tests for viewing booked rides
 */
public class ViewBookedRidesStepDefinition {
    Account account;
    Route route;
    Ride ride;
    Vehicle car;

    List<Ride> myRides;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Given("^I have booked the ride \"([^\"]*)\" on my account \"([^\"]*)\"$")
    public void iHaveBookedTheRideOnMyAccount(String rideName, String accountName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createPassenger(accountName);
        createRide(rideName);
        ride.addPassenger(account);
        myRides = new ArrayList<>();

        Assert.assertEquals(1, ride.getPassengers().size());
    }

    @When("^I view my booked rides in my account \"([^\"]*)\"$")
    public void iViewMyBookedRidesInMyAccount(String accountName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        myRides.add(ride);
        Assert.assertEquals(accountName, ride.getPassengers().get(0));
    }

    @Then("^I should see the ride \"([^\"]*)\"$")
    public void iShouldSeeTheRide(String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(1, myRides.size());
        Assert.assertEquals(rideName, myRides.get(0).getName());
    }

    @Given("^I have shared the ride \"([^\"]*)\" on my account \"([^\"]*)\"$")
    public void iHaveSharedTheRideOnMyAccount(String rideName, String accountName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createDriver(accountName);
        createRide(rideName);
        ride.shareRide();
        myRides = new ArrayList<>();

        Assert.assertTrue(ride.isShared());
    }

    @When("^I view my shared rides in my account \"([^\"]*)\"$")
    public void iViewMySharedRidesInMyAccount(String accountName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        myRides.add(ride);
        Assert.assertEquals(1, myRides.size());
    }

    private void createRide(String rideName) {
        createRoute();
        createVehicle();
        ride = new Ride(rideName, route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 30, "jax12");
    }

    private void createDriver(String name) {
        account = new Account(name, "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L,
                new Licence("Full for over 2 years", "YXF87231",
                        LocalDate.parse("12/12/2015", formatter),
                        LocalDate.parse("12/12/2020", formatter)));
    }

    private void createPassenger(String name) {
        account = new Account(name, "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
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
}
