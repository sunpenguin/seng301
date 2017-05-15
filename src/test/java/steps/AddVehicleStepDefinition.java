package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Account;
import model.Vehicle;
import org.junit.Assert;

/**
 * Created by sungu on 1/04/2017.
 */
public class AddVehicleStepDefinition {
    Account account = new Account("Test");
    Vehicle car;

    @Given("^that I am a \"([^\"]*)\"$")
    public void thatIAmA(String driver) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        account.setType(driver);
    }

    @When("^I add \"([^\"]*)\"$")
    public void iAdd(String carName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        car = new Vehicle(carName);
        account.addVehicle(carName, car);
    }

    @Then("^the \"([^\"]*)\" should be added to the \"([^\"]*)\"$")
    public void theShouldBeAddedToThe(String carName, String accountName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        car = new Vehicle(carName);
        account = new Account(accountName);
        account.addVehicle(carName, car);
        Assert.assertTrue(account.getVehicles().containsKey(carName));
        Assert.assertTrue(account.getVehicles().containsValue(car));
    }

}
