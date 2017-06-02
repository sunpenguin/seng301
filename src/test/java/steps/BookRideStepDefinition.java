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

/**
 * Cucumber test for booking a ride
 */
public class BookRideStepDefinition {
    Account driver;
    Account passenger;
    Route route;
    Vehicle car;
    Ride ride;
    GeneralData generalData = new GeneralData();
    String rideName;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @When("^I want to book a ride called \"([^\"]*)\"$")
    public void iWantToBookARideCalled(String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createRide(rideName);
    }

    @Then("^I assign myself to the ride called \"([^\"]*)\"$")
    public void iAssignMyselfToTheRideCalled(String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createDriver();
        createPassenger();
        createRide(rideName);
        generalData.getRides().put(driver.getUniversityID(), new ArrayList<>(Arrays.asList(ride)));
        Ride rideToBook = generalData.getRides().get(driver.getUniversityID()).get(0);
        rideToBook.shareRide();

        rideToBook.addPassenger(passenger);
    }

    @Given("^that I want to book ride \"([^\"]*)\" with (\\d+) person$")
    public void thatIWantToBookRideWithPerson(String rideName, int size) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        for (int i = 0; i < size; i++) {
            createPassenger();
        }
        this.rideName = rideName;
    }

    @Given("^\"([^\"]*)\" was created by me$")
    public void wasCreatedByMe(String uniID) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createRide2(rideName, uniID);
        ride.addPassenger(passenger);
        driver = new Account(uniID, "password", uniID+"@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L,
                new Licence("Full for over 2 years", "YXF87231",
                        LocalDate.parse("12/12/2015", formatter),
                        LocalDate.parse("12/12/2020", formatter)));

        generalData.getRides().put(driver.getUniversityID(), new ArrayList<>(Arrays.asList(ride)));
        Ride rideToBook = generalData.getRides().get(driver.getUniversityID()).get(0);
        rideToBook.shareRide();
    }

    @When("^I try to book \"([^\"]*)\"$")
    public void iTryToBook(String rideName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Ride rideToBook = generalData.getRides().get(driver.getUniversityID()).get(0);
        Assert.assertEquals(rideName, rideToBook.getName());
        if (!driver.getUniversityID().equals(rideToBook.getDriverID())) {
            rideToBook.addPassenger(driver);
        }

    }

    @Then("^\"([^\"]*)\" will still only be booked by (\\d+) person$")
    public void willStillOnlyBeBookedByPerson(String rideName, int size) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Ride rideToBook = generalData.getRides().get(driver.getUniversityID()).get(0);
        Assert.assertEquals(rideName, rideToBook.getName());
        Assert.assertEquals(size, rideToBook.getPassengers().size());
    }

    private void createRide(String rideName) {
        createRoute();
        createVehicle();
        ride = new Ride(rideName, route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 2, "jax12");
    }

    private void createRide2(String rideName, String driverID) {
        createRoute();
        createVehicle();
        ride = new Ride(rideName, route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 2, driverID);
    }

    private void createRoute() {
        StopPoint sp1 = new StopPoint("Street Name", "Suburb 1");
        StopPoint sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route("Route", new ArrayList<>(Arrays.asList(sp1, sp2)));
    }


    private void createVehicle() {
        car = new Vehicle("car", "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse("12/12/2017", formatter));
    }

    private void createPassenger() {
//        (String universityID, String password, String email, String vehicleName, String address, Integer homeNumber, Integer mobileNumber)
        passenger = new Account("driver", "password", "driver@uclive.ac.nz",
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
}
