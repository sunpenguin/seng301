package steps;

import cucumber.api.PendingException;
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
 * Cucumber test for seeing rides given a certain stop point
 */
public class SeeRidesGivenStopPointStepDefinition {
    Account account;
    GeneralData generalData;
    Route route;
    Vehicle car;
    Ride ride;
    StopPoint sp1;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @When("^I select a stop point$")
    public void iSelectAStopPoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        createStopPoint();
    }

    @Then("^I want to see the rides associated with the stop points$")
    public void iWantToSeeTheRidesAssociatedWithTheStopPoints() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createRide();
        setGeneralData();

        List<Ride> rides = new ArrayList<>();
        List<Ride> filteredRides = new ArrayList<>();

        for (List list: generalData.getRides().values()) {
            rides.addAll(list);
        }

        for (Ride ride : rides) {
            if (ride.isShared() && !ride.isFull()) {
                for (StopPoint sp : ride.getRoute().getRouteStops()) {
                    if (sp.getAddress().equals(sp1.getAddress())
                            || sp.getSuburb().equals(sp1.getAddress())) {
                        filteredRides.add(ride);
                    }
                }
            }
        }

        Assert.assertEquals(1, filteredRides.size());
    }

    private void setGeneralData() {
        createDriver();
        generalData = new GeneralData();
        generalData.getRides().put(account.getUniversityID(), new ArrayList<>(Arrays.asList(ride)));
    }

    private void createRide() {
        createRoutePreset();
        createVehicle();
        ride = new Ride("Ride", route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 30, "jax12");
        ride.setShared(true);
    }

    private void createVehicle() {
        car = new Vehicle("car", "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse("12/12/2017"), LocalDate.parse("12/12/2017"));
    }

    private void createRoutePreset() {
        sp1 = new StopPoint("Street Name", "Suburb 1");
        StopPoint sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route("Route", new ArrayList<>(Arrays.asList(sp1, sp2)));
    }

    private void createStopPoint() {
        sp1 = new StopPoint("Street Name", "Suburb 1");
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
}
