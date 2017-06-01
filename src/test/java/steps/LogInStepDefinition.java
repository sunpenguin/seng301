package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Account;
import model.GeneralData;
import org.junit.Assert;
import utils.Session;

/**
 * Cucumber Tests for logging in to the system
 */
public class LogInStepDefinition {

    Account account;
    String userName = "";
    String password = "";
    GeneralData generalData;

    Account retrieveAccount;
    Boolean failLogIn = false;

    @Given("^that I have an account with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void thatIHaveAnAccountWithUsernameAndPassword(String userName, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.userName = userName;
        this.password = password;
        createAccount(userName, password);
        generateData();
        generalData.addAccount(account);
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" to the log in screen$")
    public void iEnterAndToTheLogInScreen(String userName, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (generalData.getAccountMap().containsKey(userName) && generalData.getAccountMap().get(userName).getPassword().equals(password)) {
            retrieveAccount = generalData.getAccountMap().get(userName);
        } else {
            failLogIn = true;
        }
    }

    @Then("^I will get my account details email \"([^\"]*)\"$")
    public void iWillGetMyAccountDetailsEmail(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualEmail = retrieveAccount.getEmail();

        Assert.assertEquals(email, actualEmail);
    }

    @Given("^I have the username \"([^\"]*)\"$")
    public void iHaveTheUsername(String userName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.userName = userName;
        generateData();
    }

    @Then("^I will fail to log in$")
    public void iWillFailToLogIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(failLogIn);
    }

    private void generateData() {
        generalData = new GeneralData();
    }

    private void createAccount(String userName, String password) {
//        (String universityID, String password, String email, String vehicleName, String address, Integer homeNumber, Integer mobileNumber)
        account = new Account(userName, password, userName + "@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
    }
}
