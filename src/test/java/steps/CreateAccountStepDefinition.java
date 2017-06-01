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
 * Cucumber tests for account creation
 */
public class CreateAccountStepDefinition {

    Account account;
    Licence licence;

    String uniID = "";

    Boolean attendUC;
    Boolean useApp;
    Boolean haveAccount;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Given("^I want to use the application$")
    public void iWantToUseTheApplication() throws Throwable {
       useApp = true;
       haveAccount = false;
    }

    @Given("^I attend \"([^\"]*)\"$")
    public void iAttend(String university) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (university.equals("UC")) {
            attendUC = true;
        }
    }

    @When("^I create an account with id \"([^\"]*)\"$")
    public void iCreateAnAccountWithId(String uniID) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.uniID = uniID;
    }

    @When("^have other details \"([^\"]*)\"\\. \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", (\\d+), (\\d+)$")
    public void haveOtherDetails(String email, String password, String name, String address, int home, int mobile) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        account = new Account(uniID, email, password, name, address, home, Long.valueOf(mobile));
    }

    @When("^have a licence with details \"([^\"]*)\", \"([^\"]*)\", issue \"([^\"]*)\", expiry \"([^\"]*)\"$")
    public void haveALicenceWithDetailsIssueExpiry(String type, String number, String issue, String expiry) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        licence = new Licence(type, number, LocalDate.parse(issue, formatter), LocalDate.parse(expiry, formatter));
    }

    @Then("^I create a \"([^\"]*)\" account$")
    public void iCreateAAccount(String type) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (type.equals("Driver")) {
            createDriver();
        } else if (type.equals("Passenger")) {
            createPassenger();
        }
    }


    private void createDriver() {
//        (String universityID, String password, String email,
//                String vehicleName, String address, Integer homeNumber, Integer mobileNumber, Licence licence)
        account = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L,
                new Licence("Full for over 2 years", "YXF87231",
                        LocalDate.parse("12/12/2015", formatter),
                        LocalDate.parse("12/12/2020", formatter)));
    }

    private void createPassenger() {
//        (String universityID, String password, String email, String vehicleName, String address, Integer homeNumber, Integer mobileNumber)
        account = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
    }
}
