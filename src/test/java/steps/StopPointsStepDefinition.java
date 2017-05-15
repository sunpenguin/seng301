package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.StopPoint;
import org.junit.Assert;

/**
 * Created by sungu on 4/04/2017.
 */
public class StopPointsStepDefinition {
    StopPoint sp;

    @When("^I add \"([^\"]*)\" as a stop point$")
    public void iAddAsAStopPoint(String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sp = new StopPoint(address);
    }

    @Then("^the stop point with address \"([^\"]*)\" is created$")
    public void theStopPointWithAddressIsCreated(String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sp = new StopPoint(address);
        Assert.assertEquals(address, sp.getAddress());
    }
}
