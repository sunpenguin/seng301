package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Vehicle;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Cucumber tests for editing a vehicle
 */
public class EditVehicleStepDefinition {

    Vehicle car;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Given("^I have a vehicle \"([^\"]*)\" with (\\d+) performance$")
    public void iHaveAVehicleWithPerformance(String carName, int performance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createVehiclePerformance(carName, performance);
    }

    @When("^I edit the performance from (\\d+) to (\\d+)$")
    public void iEditThePerformanceFromTo(int oldPerformance, int newPerformance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(oldPerformance, car.getPerformance());
        car.setPerformance(newPerformance);
    }

    @Then("^the vehicle \"([^\"]*)\" will have a performance of (\\d+)$")
    public void theVehicleWillHaveAPerformanceOf(String carName, int performance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(carName, car.getType());
        Assert.assertEquals(performance, car.getPerformance());
    }

    @Given("^I have a vehicle \"([^\"]*)\" with (\\d+) seat$")
    public void iHaveAVehicleWithSeat(String carName, int seats) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createVehicleSeat(carName, seats);
    }

    @When("^I edit the seats from (\\d+) to (\\d+)$")
    public void iEditTheSeatsFromTo(int oldSeats, int newSeats) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(oldSeats, car.getSeats());
        car.setSeats(newSeats);
    }

    @Then("^the vehicle \"([^\"]*)\" will have (\\d+) seats$")
    public void theVehicleWillHaveSeats(String carName, int seats) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(carName, car.getType());
        Assert.assertEquals(seats, car.getSeats());
    }

    @Given("^I have a vehicle \"([^\"]*)\" with registration expiry \"([^\"]*)\"$")
    public void iHaveAVehicleWithRegistrationExpiry(String carName, String reg) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createVehicleRegistration(carName, reg);
    }

    @When("^I edit the expiry date from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void iEditTheExpiryDateFromTo(String oldReg, String newReg) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(oldReg, car.getExpiryRegistration().format(formatter));
        car.setExpiryRegistration(LocalDate.parse(newReg, formatter));
    }

    @Then("^the vehicle \"([^\"]*)\" will have a registration expiry of \"([^\"]*)\"$")
    public void theVehicleWillHaveARegistrationExpiryOf(String carName, String reg) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(carName, car.getType());
        Assert.assertEquals(reg, car.getExpiryRegistration().format(formatter));
    }

    private void createVehicleRegistration(String name, String date) {
        car = new Vehicle(name, "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse(date, formatter));
    }

    private void createVehicleSeat(String name, int seats) {
        car = new Vehicle(name, "G6", "Red", "ABC123", 1881, seats, 10,
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse("12/12/2017", formatter));
    }

    private void createVehiclePerformance(String name, int performance) {
        car = new Vehicle(name, "G6", "Red", "ABC123", 1881, 50, performance,
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse("12/12/2017", formatter));
    }


}
