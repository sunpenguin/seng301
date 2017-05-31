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
    StopPoint sp3;
    StopPointsSearcher searcher;

    String addressToSearch;
    String suburbToSearch;

    private void setAccount() {
        account = new Account("User", 2);
    }

    private void setSearcher() {
        sp1 = new StopPoint("Street Name", "Suburb 1");
        sp2 = new StopPoint("15 Steed Road", "Lincoln");
        sp3 = new StopPoint("Rose Street", "Halswell");

        searcher = new StopPointsSearcher(new ArrayList<>(Arrays.asList(sp1, sp2, sp3)));
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

        Assert.assertEquals(1, searcher.getSearchStopPoints().size());
    }

    @When("^I want to find the stop point with the address \"([^\"]*)\"$")
    public void iWantToFindTheStopPointWithTheAddress(String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        addressToSearch = address;
    }

    @Then("^I type \"([^\"]*)\" in and search by address$")
    public void iTypeInAndSearchByAddress(String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setSearcher();
        addressToSearch = address;
        searcher.searchByStreetName(addressToSearch);

        Assert.assertEquals(1, searcher.getSearchStopPoints().size());
    }

    @When("^I want to find the stop point with the suburb \"([^\"]*)\"$")
    public void iWantToFindTheStopPointWithTheSuburb(String suburb) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        suburbToSearch = suburb;
    }

    @Then("^I type \"([^\"]*)\" in and search by suburb$")
    public void iTypeInAndSearchBySuburb(String suburb) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setSearcher();
        suburbToSearch = suburb;
        searcher.searchBySuburbName(suburbToSearch);

        Assert.assertEquals(1, searcher.getSearchStopPoints().size());
    }
}
