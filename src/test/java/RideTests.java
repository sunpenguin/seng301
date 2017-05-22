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
public class RideTests {
    private Ride testRide1;
    private Ride testRide2;
    private Route route1;
    private Route route2;
    private StopPoint sp1;
    private StopPoint sp2;
    private Vehicle car;

    @Before
    public void setUp() {
        car = new Vehicle("Car", "VoltsWagon Beetle", "Red", "G00DC4R", 2016, 2);
        sp1 = new StopPoint(1, "Address", "Suburb");
        sp2 = new StopPoint(2, "Random Address", "Random Suburb");
        List<StopPoint> stopPoints= Arrays.asList(sp1, sp2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        route1 = new Route("route1", stopPoints);
        route2 = new Route("route2", stopPoints);
        testRide1 = new Ride("Test Ride 1", route1, 0,
                LocalDate.parse("15/12/2020", formatter), car, 2, "user420");
        testRide2 = new Ride("Test Ride 2", route2, 1,
                LocalDate.parse("15/01/2001", formatter), car, 2, "user420");
    }

    @Test
    public void testAvailableSeats() {
        //Testing generic case
        testRide1.setAvailableSeats(1);
        Assert.assertEquals(1, testRide1.getAvailableSeats());

        // Testing inappropriate number os available seats.
        testRide1.setAvailableSeats(3);
        Assert.assertEquals(1, testRide1.getAvailableSeats());

        // Testing base case
        testRide1.setAvailableSeats(0);
        Assert.assertEquals(0, testRide1.getAvailableSeats());
        Assert.assertTrue(testRide1.isFull());
    }

    @Test
    public void testAddPassenger() {
        testRide1.setAvailableSeats(1);
        testRide1.addPassenger();
        Assert.assertTrue(testRide1.isFull());
        Assert.assertEquals(0, testRide1.getAvailableSeats());

        // Should not change
        testRide1.addPassenger();
        Assert.assertTrue(testRide1.isFull());
        Assert.assertEquals(0, testRide1.getAvailableSeats());
    }
}
