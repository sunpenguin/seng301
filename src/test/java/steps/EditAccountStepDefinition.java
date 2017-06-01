package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Account;
import model.Licence;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Cucumber tests for editing an account
 */
public class EditAccountStepDefinition {

    Licence licence;
    Account driver;
    Account passenger;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Given("^I have a licence with expiry \"([^\"]*)\"$")
    public void iHaveALicenceWithExpiry(String expiry) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLicence(expiry);
    }

    @Given("^it is linked to the account \"([^\"]*)\"$")
    public void itIsLinkedToTheAccount(String accountName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createDriver(accountName);
        driver.upgrade(licence);
    }

    @When("^I update expiry to \"([^\"]*)\"$")
    public void iUpdateExpiryTo(String expiry) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.getLicence().setExpiry(LocalDate.parse(expiry, formatter));
    }

    @Then("^account \"([^\"]*)\" will have a licence with expiry date \"([^\"]*)\"$")
    public void accountWillHaveALicenceWithExpiryDate(String accountName, String expiry) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(accountName, driver.getUniversityID());
        Assert.assertEquals(LocalDate.parse(expiry, formatter), driver.getLicence().getExpiry());
    }

    @Given("^I have an account \"([^\"]*)\" with address \"([^\"]*)\"$")
    public void iHaveAnAccountWithAddress(String accountName, String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createPassenger(accountName, address);
    }

    @When("^I update address to \"([^\"]*)\"$")
    public void iUpdateAddressTo(String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        passenger.setAddress(address);
    }

    @Then("^account \"([^\"]*)\" will have an address of \"([^\"]*)\"$")
    public void accountWillHaveAnAddressOf(String accountName, String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(accountName, passenger.getUniversityID());
        Assert.assertEquals(address, passenger.getAddress());
    }

    private void createPassenger(String accountName, String address) {
        passenger = new Account(accountName, "password", "driver@uclive.ac.nz",
                "Dan", address, 1234567, 64278182123L);
    }

    private void createDriver(String accountName) {
        driver = new Account(accountName, "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
    }

    private void createLicence(String expiry) {
        licence = new Licence("Full for over 2 years", "YXF87231",
                            LocalDate.parse("12/12/2015", formatter),
                            LocalDate.parse(expiry, formatter));
    }
}
