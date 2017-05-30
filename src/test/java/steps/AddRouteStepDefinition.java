package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Route;
import model.StopPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Cucumber Test for adding routes
 */
public class AddRouteStepDefinition {
    StopPoint sp1;
    StopPoint sp2;
    Route route1;

    @When("^I have stop points$")
    public void iHaveStopPoints() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sp1 = new StopPoint("1 Test Street");
        sp2 = new StopPoint("9999 Jack Place");
    }

    @Then("^I should create a route$")
    public void iShouldCreateARoute() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<StopPoint> stopPoints = new ArrayList<>();
        stopPoints.add(sp1);
        stopPoints.add(sp2);
        route1 = new Route("Route", stopPoints);
    }

}
