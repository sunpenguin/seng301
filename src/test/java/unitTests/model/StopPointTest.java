package unitTests.model;

import model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Unit tests for StopPoint
 */
public class StopPointTest {
    Account driver;
    GeneralData generalData;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Before
    public void setUp() {
        createDriver();
        generalData = new GeneralData();
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
    public void createStopPointType1() {
        String street = "1 Address Street";
        String suburb = "Suburb 1";
        StopPoint stopPoint = new StopPoint(street, suburb);
        generalData.addStopPoint(street + suburb, stopPoint);

        Assert.assertEquals(1, generalData.getStopPoints().size());
    }

    @Test
    public void createStopPointType2() {
        String street = "1 Address Street";
        String suburb = "Suburb 1";
        String time ="12:34";
        StopPoint stopPoint = new StopPoint(street, suburb, time);
        generalData.addStopPoint(street + suburb, stopPoint);

        Assert.assertEquals(1, generalData.getStopPoints().size());
        Assert.assertEquals(LocalTime.parse(time), generalData.getStopPoints().get(street + suburb).getTime());
    }
}
