package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Account;
import model.Licence;
import model.Vehicle;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Cucumber Test for adding vehicles
 */
public class AddVehicleStepDefinition {
    Account account;
    Vehicle car;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private void createCar(String carName) {
        car = new Vehicle(carName, "Newest", "Blue", "XD101XD", 2017, 3,
                1, LocalDate.parse("12/12/2020"), LocalDate.parse("12/12/2020"));
    }

    @Given("^that I am a \"([^\"]*)\"$")
    public void thatIAmA(String driver) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createDriver();
    }

    @When("^I add a car \"([^\"]*)\"$")
    public void iAddACar(String carType) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createDriver();
        createCar(carType);
        account.addVehicle(carType, car);
    }

    @Then("^the \"([^\"]*)\" should be added to my account$")
    public void theShouldBeAddedToMyAccount(String carType) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createDriver();
        createCar(carType);
        account.addVehicle(carType, car);

        Assert.assertTrue(account.getVehicles().containsKey(carType));
        Assert.assertTrue(account.getVehicles().containsValue(car));
    }

    @When("^I want to add a car \"([^\"]*)\"$")
    public void iWantToAddACar(String carType) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createCar(carType);
    }

    @Then("^I can add them all to my account$")
    public void iCanAddThemAllToMyAccount() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createDriver();

        createCar("Beetle");
        account.addVehicle("Beetle", car);

        createCar("Porsche");
        account.addVehicle("Porsche", car);

        Assert.assertEquals(2, account.getVehicles().size());
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
