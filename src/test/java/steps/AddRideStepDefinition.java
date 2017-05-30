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
 * Cucumber tests for creating a ride.
 */
public class AddRideStepDefinition {
    Account account;
    Route route;
    Vehicle car;
    Ride ride;

    String routeName;
    String carName;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Given("^that I am using a \"([^\"]*)\" account$")
    public void thatIAmUsingAAccount(String accountType) throws Throwable {
        if (accountType.equals("driver")) {
            createDriver();
        } else {
            createPassenger();
        }
    }

    @When("^I have a route called \"([^\"]*)\"$")
    public void iHaveARouteCalled(String routeName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.routeName = routeName;
        createRoute(routeName);
    }

    @When("^a vehicle called \"([^\"]*)\"$")
    public void aVehicleCalled(String vehicleName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        carName = vehicleName;
        createVehicle(vehicleName);
    }

    @Then("^I can create a ride called \"([^\"]*)\"$")
    public void iCanCreateARideCalled(String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createRoute(routeName);
        createVehicle(carName);
        ride = new Ride(rideName, route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 30, "jax12");
    }

    @Then("^I can create multiple rides called \"([^\"]*)\"$")
    public void iCanCreateMultipleRidesCalled(String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<Ride> multipleRides = new ArrayList<>();

        LocalDate start = LocalDate.parse("15/12/2017", formatter);
        LocalDate end = LocalDate.parse("21/12/2017", formatter);

        List<Boolean> days = new ArrayList(Arrays.asList(true, true, true, true, true, true, true));

        while (start.isBefore(end.plusDays(1))) {
            if (days.get(start.getDayOfWeek().getValue() - 1)) {
                ride = new Ride(rideName, route, 0, LocalDate.parse("15/12/2020", formatter),
                        car, 30, "jax12");
                multipleRides.add(ride);
            }
            start = start.plusDays(1);
        }
        Assert.assertEquals(multipleRides.size(), 7);
    }

    private void createVehicle(String name) {
        car = new Vehicle(name, "G6", "Red", "ABC123", 1881, 50);
    }

    private void createRoute(String name) {
        StopPoint sp1 = new StopPoint("Street Name", "Suburb 1");
        StopPoint sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route(name, new ArrayList<>(Arrays.asList(sp1, sp2)));
    }

    private void createDriver() {
//        (String universityID, String password, String email,
//                String name, String address, Integer homeNumber, Integer mobileNumber, Licence licence)
        account = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L,
                new Licence("Full for over 2 years", "YXF87231",
                        LocalDate.parse("12/12/2015", formatter),
                        LocalDate.parse("12/12/2020", formatter)));
    }

    private void createPassenger() {
//        (String universityID, String password, String email, String name, String address, Integer homeNumber, Integer mobileNumber)
        account = new Account("driver", "password", "driver@uclive.ac.nz",
        "Dan", "20 Howard Street", 1234567, 64278182123L);
    }
}

