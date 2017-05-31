package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.GeneralData;
import model.StopPoint;
import org.junit.Assert;

/**
 * Cucumber Test for adding stop points
 */
public class AddStopPointsStepDefinition {
    StopPoint sp;
    GeneralData generalData;

    @When("^I add \"([^\"]*)\" as a stop point$")
    public void iAddAsAStopPoint(String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createStopPoint(address);
    }

    @Then("^the stop point with address \"([^\"]*)\" is created$")
    public void theStopPointWithAddressIsCreated(String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createStopPoint(address);
        createGeneralData();
        generalData.addStopPoint(address + "Suburb 1", sp);

        Assert.assertEquals(address, generalData.getStopPoints().get(address + "Suburb 1").getAddress());
    }

    @When("^\"([^\"]*)\" is already in the data$")
    public void isAlreadyInTheData(String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createStopPoint(address);
        createGeneralData();
        generalData.addStopPoint(address + "Suburb 1", sp);

        Assert.assertEquals(address, generalData.getStopPoints().get(address + "Suburb 1").getAddress());
    }

    @Then("^the stop point with address \"([^\"]*)\" is not added again$")
    public void theStopPointWithAddressIsNotAddedAgain(String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createStopPoint(address);
        createGeneralData();
        generalData.addStopPoint(address + "Suburb 1", sp);

        // Add again but doesn't actually add it in
        generalData.addStopPoint(address + "Suburb 1", sp);

        Assert.assertEquals(1, generalData.getStopPoints().values().size());
        Assert.assertEquals(address, generalData.getStopPoints().get(address + "Suburb 1").getAddress());
    }

    private void createGeneralData() {
        generalData = new GeneralData();
    }

    private void createStopPoint(String address) {
        sp = new StopPoint(address, "Suburb 1");
    }
}
