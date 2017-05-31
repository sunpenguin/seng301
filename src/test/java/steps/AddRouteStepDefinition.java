package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Account;
import model.Licence;
import model.Route;
import model.StopPoint;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Cucumber Test for adding routes
 */
public class AddRouteStepDefinition {
    Account account;

    String sp1Name;
    StopPoint sp1;
    StopPoint sp2;

    List<StopPoint> stopPointList;

    Route route;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Given("^that I am a using a \"([^\"]*)\" account$")
    public void thatIAmAUsingAAccount(String accountType) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (accountType.equals("driver")) {
            createDriver();
        } else {
            createPassenger();
        }
    }

    @When("^I have a StopPoint called \"([^\"]*)\"$")
    public void iHaveAStopPointCalled(String stopPointName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sp1Name = stopPointName;
        createStopPoint(stopPointName);
    }

    @Then("^I can create a route called \"([^\"]*)\"$")
    public void iCanCreateARouteCalled(String routeName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        createStopPoint(sp1Name);
        createStopPoint2();
        createRoute(routeName);
    }

    @When("^I have no stop points$")
    public void iHaveNoStopPoints() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        stopPointList = new ArrayList<>();
    }

    @Then("^I can create a route called \"([^\"]*)\" with no stop points$")
    public void iCanCreateARouteCalledWithNoStopPoints(String routeName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        stopPointList = new ArrayList<>();
        route = new Route(routeName, stopPointList);
    }

    private void createRoute(String routeName) {
        route = new Route(routeName, new ArrayList<>(Arrays.asList(sp1, sp2)));
    }

    private void createStopPoint(String name) {
        sp1 = new StopPoint(name, "Suburb");
    }

    private void createStopPoint2() {
        sp2 = new StopPoint("15 Private Lane", "Hamsun");
    }

    private void createDriver() {
//        (String universityID, String password, String email,
//                String name, String address, Integer homeNumber, Integer mobileNumber, Licence licence)
        account = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L,
                new Licence("Full for over 2 years", "YXF87231",
                        LocalDate.parse("12/12/2015", formatter),
                        LocalDate.parse("12/12/2020", formatter)));
    }

    private void createPassenger() {
//        (String universityID, String password, String email, String name, String address, Integer homeNumber, Integer mobileNumber)
        account = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
    }

}
