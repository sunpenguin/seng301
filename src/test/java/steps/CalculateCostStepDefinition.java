package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Ride;
import model.Route;
import model.StopPoint;
import model.Vehicle;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Cucumber test for calculating the cost of a stop point in a ride
 */
public class CalculateCostStepDefinition {

    Vehicle car;
    StopPoint stopPoint;
    Ride ride;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Given("^I have a vehicle \"([^\"]*)\" with performance \"([^\"]*)\"$")
    public void iHaveAVehicleWithPerformance(String vehicleName, String performance) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    createVehicle(vehicleName, performance);
}

    @Given("^I want to go from stop point \"([^\"]*)\" to university$")
    public void iWantToGoFromStopPointToUniversity(String stopPointName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createStopPoint(stopPointName);
    }

    @When("^I create a ride using \"([^\"]*)\" with (\\d+) distance$")
    public void iCreateARideUsingWithDistance(String stopPointName, int distance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createStopPoint(stopPointName);
        stopPoint.setDistance(distance);
        createRide();
        ride.updateCosts();
    }

    @Then("^the cost of the ride from the stop point \"([^\"]*)\" will be \\$\"([^\"]*)\"$")
    public void theCostOfTheRideFromTheStopPointWillBe$(String stopPoint, String result) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Double costToTest = 0.0;
        for (StopPoint sp : ride.getRoute().getRouteStops()) {
            if (sp.getAddress().equals(stopPoint)) {
                costToTest = sp.getCost();
            }
        }

        Assert.assertEquals(Double.parseDouble(result), costToTest, 0.01);
    }

    private void createVehicle(String name, String performance) {
        car = new Vehicle(name, "G6", "Red", "ABC123", 1881, 50, Integer.parseInt(performance),
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse("12/12/2017", formatter));
    }


    private void createStopPoint(String name) {
        stopPoint = new StopPoint(name, "Suburb");
    }

    private void createRide() {
        ride = new Ride("Ride", new Route("Route", new ArrayList<>(Arrays.asList(stopPoint))), 0,
                LocalDate.parse("15/12/2020", formatter), car, 30, "jax12");
    }
}
