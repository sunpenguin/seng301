package unitTests.model;

import model.Licence;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Unit test for licence creation
 */
public class LicenceTest {
    Licence licence;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Before
    public void setUp() {
        createLicence();
    }

    private void createLicence() {
        licence = new Licence("Full for over 2 years", "ABC12345",
                LocalDate.parse("05/05/2014", formatter), LocalDate.parse("05/05/2019", formatter));
    }

    private void createExpiredLicence() {
        licence = new Licence("Full for over 2 years", "ABC12345",
                LocalDate.parse("05/05/2004", formatter), LocalDate.parse("05/05/2009", formatter));
    }

    @Test
    public void checkExpiryTest1() {
        Boolean actual = licence.isExpired();

        Assert.assertEquals(false, actual);
    }

    @Test
    public void checkExpiryTest2() {
        createExpiredLicence();
        Boolean actual = licence.isExpired();

        Assert.assertEquals(true, actual);
    }
}
