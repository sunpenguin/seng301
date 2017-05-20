package model;

import java.util.*;

/**
 * The model class that holds all the information the user has done that is not account reliant.
 *
 * @author Sunguin Peng
 */
public class GeneralData {
    private Map<Integer, Account> accountMap;
    private Map<String, StopPoint> stopPoints;
    private Map<String, Route> routes;
    private Map<Integer, List<Ride>> rides;
    private String currentTrip;
    private Integer automaticID;

    public GeneralData() {
        accountMap = new HashMap<>();
        stopPoints = new HashMap<>();
        routes = new HashMap<>();
        rides = new HashMap<>();

//        automaticID = 0;

        generateFalseData();// For easier GUI testing
    }

    /**
     * Method to put false data into the HashMaps.
     * This method should only be called in the constructor once.
     */
    private void generateFalseData() {
        StopPoint stopPoint1 = new StopPoint(10, "Happy Lane", "Addington");
        StopPoint stopPoint2 = new StopPoint(420, "Lit Road", "Burnside");
        StopPoint stopPoint3 = new StopPoint(69, "Dank Parker", "Nebula");

        stopPoints.put("10Happy LaneAddington", stopPoint1);
        stopPoints.put("420Lit RoadBurnside", stopPoint2);
        stopPoints.put("69Dank ParkerNebula", stopPoint3);

        Route route1 = new Route("Route 1", new ArrayList<>(Arrays.asList(stopPoint1, stopPoint2, stopPoint3)));
        Route route2 = new Route("Route 2", new ArrayList<>(Arrays.asList(stopPoint3, stopPoint1)));

        routes.put("Route 1", route1);
        routes.put("Route 2", route2);
    }

    public void addAccount(Account account) {
//        automaticID += automaticID;
        accountMap.put(account.getId(), account);
    }

    public Map<Integer, Account> getAccountMap() {
        return accountMap;
    }

    public void addStopPoint(String name, StopPoint stopPoint) {
        stopPoints.put(name, stopPoint);
    }

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

    public Map<Integer, List<Ride>> getRides() {
        return rides;
    }
}
