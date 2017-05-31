package model;

import java.util.*;

/**
 * The model class that holds all the information the user has done that is not account reliant.
 *
 * @author Sunguin Peng
 */
public class GeneralData {
    private Map<String, Account> accountMap;
    private Map<String, StopPoint> stopPoints;
    private Map<String, Route> routes;
    private Map<String, List<Ride>> rides;
    private String currentTrip;

    public GeneralData() {
        accountMap = new HashMap<>();
        stopPoints = new HashMap<>();
        routes = new HashMap<>();
        rides = new HashMap<>();
    }

    public void addAccount(Account account) {
        accountMap.put(account.getUniversityID(), account);
    }

    public Map<String, Account> getAccountMap() {
        return accountMap;
    }

    public void addStopPoint(String name, StopPoint stopPoint) {
        if (!stopPoints.containsKey(name)) {
            stopPoints.put(name, stopPoint);
        }
    }

    /**
     * The key to each StopPoint is the address and suburb together.
     * e.g. StopPoint with address "Address" and suburb "Suburb"
     *      will have the key "AddressSuburb".
     *
     * @return the stop point map
     */
    public Map<String, StopPoint> getStopPoints() {
        return stopPoints;
    }

    public Map<String, Route> getRoutes() {
        return routes;
    }

    public String getCurrentTrip() {
        return currentTrip;
    }

    public void setCurrentTrip(String currentTrip) {
        this.currentTrip = currentTrip;
    }

    public Map<String, List<Ride>> getRides() {
        return rides;
    }
}
