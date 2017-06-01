package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Account;
import model.Licence;
import model.Notification;
import model.Vehicle;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Cucumber tests for notifications
 */
public class NotificationsStepDefinition {

    Account account;
    Licence licence;
    Vehicle car;

    Notification notification;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Given("^that my licence expiry date is \"([^\"]*)\" on licence number \"([^\"]*)\"$")
    public void thatMyLicenceExpiryDateIsOnLicenceNumber(String expiry, String licenceNumber) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createLicence(licenceNumber, expiry);
        licence.checkExpiry();
    }

    @When("^I log in to my account with licence \"([^\"]*)\"$")
    public void iLogInToMyAccountWithLicence(String licenceNumber) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createPassenger();
        if (licence.getNumber().equals(licenceNumber)) {
            account.upgrade(licence);
        }
    }

    @Then("^I get a notification with the message \"([^\"]*)\"$")
    public void iGetANotificationWithTheMessage(String message) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        notification = new Notification(account);
        String result = notification.checkNotifications();
        Assert.assertTrue(result.contains(message));
    }

    @Given("^I have a vehicle \"([^\"]*)\" with WOF expiry on \"([^\"]*)\"$")
    public void iHaveAVehicleWithWOFExpiryOn(String vehicleName, String expiry) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createPassenger();
        createLicence("RANDOM", "12/12/2019");
        account.upgrade(licence);
        createVehicleWOF(vehicleName, expiry);
        account.addVehicle(vehicleName, car);
    }

    @When("^I log in to my account with vehicle \"([^\"]*)\"$")
    public void iLogInToMyAccountWithVehicle(String vehicleName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(account.getVehicles().containsKey(vehicleName));
    }

    @Then("^I get the notification message \"([^\"]*)\"$")
    public void iGetTheNotificationMessage(String message) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        notification = new Notification(account);
        String result = notification.checkNotifications();
        Assert.assertTrue(result.contains(message));
    }

    @Given("^I have a vehicle \"([^\"]*)\" with registration expiry on \"([^\"]*)\"$")
    public void iHaveAVehicleWithRegistrationExpriyOn(String vehicleName, String expiry) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createPassenger();
        createLicence("RANDOM", "12/12/2019");
        account.upgrade(licence);
        createVehicleReg(vehicleName, expiry);
        account.addVehicle(vehicleName, car);
    }

    private void createPassenger() {
//        (String universityID, String password, String email, String vehicleName, String address, Integer homeNumber, Integer mobileNumber)
        account = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
    }

    private void createLicence(String number, String expiry) {
        licence = new Licence("Full for over two years", number,
                LocalDate.parse("12/12/2012", formatter), LocalDate.parse(expiry, formatter));
    }

    private void createVehicleWOF(String vehicleName, String expiry) {
        car = new Vehicle(vehicleName, "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse(expiry, formatter), LocalDate.parse("12/12/2017", formatter));
    }

    private void createVehicleReg(String vehicleName, String expiry) {
        car = new Vehicle(vehicleName, "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse(expiry, formatter));
    }
}
