package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Account;
import model.GeneralData;
import model.Licence;
import model.StopPoint;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static core.Main.save;

/**
 * Cucumber tests for storing data
 */
public class StoreDataStepDefinition {

    private Account account;
    private StopPoint sp1;
    private GeneralData generalData;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @When("^I want to save my account \"([^\"]*)\"$")
    public void iWantToSaveMyAccount(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createDriver(name);
        createGeneralData();
        generalData.addAccount(account);
    }

    @Then("^I close the application$")
    public void iCloseTheApplication() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createGeneralData();
        // BEWARE, THIS WILL WIPE THE .JSON FILE WHEN RUN WITH THE NEXT LINE UNCOMMENTED.
//        save(generalData);
    }

    @When("^I want to save the stop point \"([^\"]*)\"$")
    public void iWantToSaveTheStopPoint(String stopPointName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createGeneralData();
        createStopPoint(stopPointName);
        generalData.addStopPoint(stopPointName, sp1);
    }

    private void createStopPoint(String name) {
        sp1 = new StopPoint(name, "Suburb");
    }

    private void createGeneralData() {
        generalData = new GeneralData();
    }


    private void createDriver(String name) {
//        (String universityID, String password, String email,
//                String vehicleName, String address, Integer homeNumber, Integer mobileNumber, Licence licence)
        account = new Account(name, "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L,
                new Licence("Full for over 2 years", "YXF87231",
                        LocalDate.parse("12/12/2015", formatter),
                        LocalDate.parse("12/12/2020", formatter)));
    }
}
