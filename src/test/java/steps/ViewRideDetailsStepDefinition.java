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
 * Cucumber test for viewing ride details
 */
public class ViewRideDetailsStepDefinition {
    Route route;
    Vehicle car;
    Ride ride;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @When("^I choose a ride$")
    public void iChooseARide() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createRide();
    }

    @Then("^I want to see the details of the ride$")
    public void iWantToSeeTheDetailsOfTheRide() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createRide();
        // Cannot test properly but ride has getter methods
        ride.getName();
        ride.getDriverID();
    }

    private void createRide() {
        createRoutePreset();
        createVehicle();
        ride = new Ride("Ride", route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 30, "jax12");
    }

    private void createVehicle() {
        car = new Vehicle("car", "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse("12/12/2017", formatter));
    }

    private void createRoutePreset() {
        StopPoint sp1 = new StopPoint("Street Name", "Suburb 1");
        StopPoint sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route("Route", new ArrayList<>(Arrays.asList(sp1, sp2)));
    }
}
