package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Account;
import model.StopPoint;
import org.junit.Assert;
import utils.StopPointsSearcher;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Cucumber tests for searching stop points.
 */
public class SearchStopPointsStepDefinition {
    Account account;
    StopPoint sp1;
    StopPoint sp2;
    StopPointsSearcher searcher;

    private void setAccount() {
        account = new Account("User", 2);
    }

    private void setSearcher() {
        sp1 = new StopPoint("Street Name", "Suburb 1");
        sp2 = new StopPoint("15 Steed Road", "Lincoln");

        searcher = new StopPointsSearcher(new ArrayList<>(Arrays.asList(sp1, sp2)));
    }

    @Given("^I am a \"([^\"]*)\"$")
    public void iAmA(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setAccount();
    }

    @When("^I want to search stop points$")
    public void iWantToSearchStopPoints() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setSearcher();
    }

    @Then("^I type in the criteria and search stop points$")
    public void iTypeInTheCriteriaAndSearchStopPoints() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setSearcher();
        searcher.searchBySuburbName("in");
        Assert.assertEquals(searcher.getSearchStopPoints().size(), 1);
    }
}
