package utils;

/**
 * A class that contains static methods for checking input
 */
public class Checkers {
    /**
     * Checks if a string value is numeric.
     *
     * @param stringToCheck The string to check.
     * @return Boolean value whether the string is numeric or not.
     */
    public static boolean isNumeric(String stringToCheck)
    {
        if (stringToCheck.equals("")) {
            return false;
        }
        for (Character c : stringToCheck.toCharArray())
        {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
