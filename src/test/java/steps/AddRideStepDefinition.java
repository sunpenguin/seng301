package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Ride;
import model.Route;
import model.StopPoint;
import model.Vehicle;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Cucumber tests for creating a ride.
 */
public class AddRideStepDefinition {
    StopPoint sp1;
    StopPoint sp2;
    Route route;
    Vehicle car;
    Ride ride;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @When("^I have a route$")
    public void iHaveARoute() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sp1 = new StopPoint("Street Name", "Suburb 1");
        sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route("Test Route", new ArrayList<>(Arrays.asList(sp1, sp2)));
    }

    @Then("^I can create a ride$")
    public void iCanCreateARide() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sp1 = new StopPoint("Street Name", "Suburb 1");
        sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route("Test Route", new ArrayList<>(Arrays.asList(sp1, sp2)));
//        (String type, String model, String colour, String licencePlate, int year, int seats)
        car = new Vehicle("Car", "G6", "Red", "ABC123", 1881, 50);

//        (String name, Route route, int direction, LocalDate date, Vehicle vehicle, int availableSeats, String driverID)
        ride = new Ride("Test Ride", route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 30, "jax12");
    }

    @Then("^I can create multiple rides$")
    public void iCanCreateMultipleRides() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sp1 = new StopPoint("Street Name", "Suburb 1");
        sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route("Test Route", new ArrayList<>(Arrays.asList(sp1, sp2)));
//        (String type, String model, String colour, String licencePlate, int year, int seats)
        car = new Vehicle("Car", "G6", "Red", "ABC123", 1881, 50);

        List<Ride> multipleRides = new ArrayList<>();

        LocalDate start = LocalDate.parse("15/12/2017", formatter);
        LocalDate end = LocalDate.parse("21/12/2017", formatter);

        List<Boolean> days = new ArrayList(Arrays.asList(true, true, true, true, true, true, true));

        while (start.isBefore(end.plusDays(1))) {
            if (days.get(start.getDayOfWeek().getValue() - 1)) {
                ride = new Ride("Test Ride", route, 0, LocalDate.parse("15/12/2020", formatter),
                        car, 30, "jax12");
                multipleRides.add(ride);
            }
            start = start.plusDays(1);
        }
        Assert.assertEquals(multipleRides.size(), 7);
    }
}

