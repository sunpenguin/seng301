package utils;

/**
 * Created by sungu on 24/04/2017.
 */
public class Checkers {
    /**
     * Checks if a string value is numeric
     * @param stringToCheck The string to check
     * @return Boolean value whether the string is numeric or not
     */
    public static boolean isNumeric(String stringToCheck)
    {
        for (Character c : stringToCheck.toCharArray())
        {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
