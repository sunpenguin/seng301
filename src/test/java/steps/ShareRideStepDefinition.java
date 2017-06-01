package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Ride;
import model.Route;
import model.StopPoint;
import model.Vehicle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Cucumber tests for sharing a ride.
 */
public class ShareRideStepDefinition {
    StopPoint sp1;
    StopPoint sp2;
    Route route;
    Vehicle car;
    Ride ride;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private void createRide() {
        sp1 = new StopPoint("Street Name", "Suburb 1");
        sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route("Test Route", new ArrayList<>(Arrays.asList(sp1, sp2)));

        sp1 = new StopPoint("Street Name", "Suburb 1");
        sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route("Test Route", new ArrayList<>(Arrays.asList(sp1, sp2)));
//        (String type, String model, String colour, String licencePlate, int year, int seats)
        car = new Vehicle("Car", "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse("12/12/2017"), LocalDate.parse("12/12/2017"));

//        (String name, Route route, int direction, LocalDate date, Vehicle vehicle, int availableSeats, String driverID)
        ride = new Ride("Test Ride", route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 30, "jax12");
    }

    @When("^I have created a ride$")
    public void iHaveCreatedARide() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createRide();
    }

    @Then("^I can share my ride$")
    public void iCanShareMyRide() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createRide();
        ride.shareRide();
    }
}
