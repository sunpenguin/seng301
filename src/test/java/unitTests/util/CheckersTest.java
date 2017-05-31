package unitTests.util;

import org.junit.Assert;
import org.junit.Test;
import utils.Checkers;

/**
 * Unit tests for the checkers
 */
public class CheckersTest {

    @Test
    public void testNumberCheckerNotNumber() {
        String stringToCheck = "NotANumber";

        Assert.assertFalse(Checkers.isNumeric(stringToCheck));
    }

    @Test
    public void testNumberCheckerNumber() {
        String stringToCheck = "1234";

        Assert.assertTrue(Checkers.isNumeric(stringToCheck));
    }

    @Test
    public void testNumberCheckerEmptyString() {
        String stringToCheck = "";

        Assert.assertFalse(Checkers.isNumeric(stringToCheck));
    }

    @Test
    public void testNumberCheckerAnyCharacter() {
        String stringToCheck = "`12das~@!#$";

        Assert.assertFalse(Checkers.isNumeric(stringToCheck));
    }
}
