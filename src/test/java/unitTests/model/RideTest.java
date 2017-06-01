package unitTests.model;

import model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * Unit Tests for the class Ride
 * @author Sunguin Peng
 */
public class RideTest {
    Account driver;
    private Ride testRide1;
    private Ride testRide2;
    private Route route1;
    private Route route2;
    private StopPoint sp1;
    private StopPoint sp2;
    private Vehicle car;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Before
    public void setUp() {
        createDriver();
        car = new Vehicle("Car", "VoltsWagon Beetle", "Red", "G00DC4R", 2016, 2, 10,
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse("12/12/2017", formatter));
        sp1 = new StopPoint("Address", "Suburb");
        sp2 = new StopPoint("Random Address", "Random Suburb");
        List<StopPoint> stopPoints= Arrays.asList(sp1, sp2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        route1 = new Route("route1", stopPoints);
        route2 = new Route("route2", stopPoints);
        testRide1 = new Ride("Test Ride 1", route1, 0,
                LocalDate.parse("15/12/2020", formatter), car, 2, "user420");
        testRide2 = new Ride("Test Ride 2", route2, 1,
                LocalDate.parse("15/01/2001", formatter), car, 2, "user420");
    }

    private void createDriver() {
//        (String universityID, String password, String email,
//                String name, String address, Integer homeNumber, Integer mobileNumber, Licence licence)
        driver = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L,
                new Licence("Full for over 2 years", "YXF87231",
                        LocalDate.parse("12/12/2015", formatter),
                        LocalDate.parse("12/12/2020", formatter)));
    }

    @Test
    public void testAvailableSeatsValid() {
        //Testing generic case
        testRide2.setAvailableSeats(1);
        Assert.assertEquals(1, testRide2.getAvailableSeats());
    }

    @Test
    public void testAvailableSeatsInvalid() {
        // Testing inappropriate number os available seats.
        testRide1.setAvailableSeats(3);
        Assert.assertEquals(2, testRide1.getAvailableSeats());
    }

    @Test
    public void testAvailableSeatsNone() {
        // Testing base case
        testRide2.setAvailableSeats(0);
        Assert.assertEquals(0, testRide2.getAvailableSeats());
        Assert.assertTrue(testRide2.isFull());
    }

    @Test
    public void testAddPassenger() {
        testRide1.setAvailableSeats(1);
        testRide1.addPassenger(driver);
        Assert.assertTrue(testRide1.isFull());
        Assert.assertEquals(0, testRide1.getAvailableSeats());
    }

    @Test
    public void testAddPassengerToFullRide() {
        // Should not change
        testRide2.setAvailableSeats(0);
        Assert.assertTrue(testRide2.isFull());

        testRide2.addPassenger(driver);
        Assert.assertTrue(testRide2.isFull());
        Assert.assertEquals(0, testRide2.getAvailableSeats());
    }

    @Test
    public void shareRide() {
        testRide1.setShared(true);

        Assert.assertTrue(testRide1.isShared());
    }
}
