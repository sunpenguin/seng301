package unitTests.model;

import model.Account;
import model.GeneralData;
import model.Licence;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Unit tests for creating accounts
 */
public class AccountTest {
    Account driver;
    Account passenger;
    Licence driverLicence;
    GeneralData generalData;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Before
    public void setUp() {
        setDriverLicence();
        generalData = new GeneralData();
    }

    private void setDriverLicence() {
        driverLicence = new Licence("Full for over 2 years", "YXF87231",
                LocalDate.parse("12/12/2015", formatter),
                LocalDate.parse("12/12/2020", formatter));
    }

    private void setAlternateLicence() {
        driverLicence = new Licence("Full for under 2 years", "ANOTHER1",
                LocalDate.parse("11/11/2014", formatter),
                LocalDate.parse("02/02/2021", formatter));
    }

    @Test
    public void createDriver() {
        driver = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L, driverLicence);
        generalData.getAccountMap().put(driver.getUniversityID(), driver);

        Assert.assertEquals(1, generalData.getAccountMap().values().size());
        Assert.assertEquals("driver@uclive.ac.nz", generalData.getAccountMap().get("driver").getEmail());
    }

    @Test
    public void createPassenger() {
        passenger = new Account("passenger", "password", "passenger@uclive.ac.nz",
                "Daniella", "40 Howard Street", 1234567, 64278182123L, driverLicence);
        generalData.getAccountMap().put(passenger.getUniversityID(), passenger);

        Assert.assertEquals(1, generalData.getAccountMap().values().size());
        Assert.assertEquals("passenger@uclive.ac.nz", generalData.getAccountMap().get("passenger").getEmail());
    }

    @Test
    public void createMultipleAccounts() {
        driver = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L, driverLicence);
        generalData.getAccountMap().put(driver.getUniversityID(), driver);

        passenger = new Account("passenger", "password", "passenger@uclive.ac.nz",
                "Daniella", "40 Howard Street", 1234567, 64278182123L, driverLicence);
        generalData.getAccountMap().put(passenger.getUniversityID(), passenger);

        Assert.assertEquals(2, generalData.getAccountMap().values().size());
    }

    @Test
    public void upgradePassengerToDriver() {
        passenger = new Account("passenger", "password", "passenger@uclive.ac.nz",
                "Daniella", "40 Howard Street", 1234567, 64278182123L, driverLicence);

        passenger.upgrade(driverLicence);

        Assert.assertEquals("Driver", passenger.getType());
    }

    @Test
    public void upgradeDriverToDriver() {
        driver = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L, driverLicence);

        setAlternateLicence();
        driver.upgrade(driverLicence);

        Assert.assertEquals("Driver", driver.getType());
        Assert.assertEquals("YXF87231", driver.getLicence().getNumber());
    }
}
