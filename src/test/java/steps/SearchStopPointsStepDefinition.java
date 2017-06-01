package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Account;
import model.Licence;
import model.StopPoint;
import org.junit.Assert;
import utils.StopPointsSearcher;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private void setAccount() {
        createPassenger();
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

    @Given("^I want to search for stop point \"([^\"]*)\"$")
    public void iWantToSearchForStopPoint(String spName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setSearcher();
        Assert.assertTrue(sp2.getAddress().contains(spName));
    }

    @When("^I search with \"([^\"]*)\" as the address$")
    public void iSearchWithAsTheAddress(String spName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        addressToSearch = spName;
    }

    @Then("^the results will be displayed$")
    public void theResultsWillBeDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setSearcher();
        searcher.searchByStreetName(addressToSearch);
        Assert.assertEquals(1, searcher.getSearchStopPoints().size());
    }

    @Then("^a map of the location will be shown$")
    public void aMapOfTheLocationWillBeShown() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("15 Steed Road", searcher.getSearchStopPoints().get(0).getAddress());
    }

    private void createPassenger() {
//        (String universityID, String password, String email, String vehicleName, String address, Integer homeNumber, Integer mobileNumber)
        account = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
    }
}
