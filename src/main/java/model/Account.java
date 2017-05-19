package model;

import java.util.HashMap;
import java.util.Map;

/**
 * The model that is the current user's account.
 * @author Sunguin Peng
 */
public class Account {
    private String name;
    private String type;
    private Map<String, Vehicle> vehicles;
    private Map<String, Trip> trips;
    private Map<String, Ride> rides;
    private Map<String, StopPoint> stopPointsSearched;

    /**
     * The constructor for an account.
     * Currently only requires a name.
     * @param name the username for the account
     */
    public Account(String name) {
        this.name = name;
        type = "driver";
        vehicles = new HashMap<>();
        trips = new HashMap<>();
        rides = new HashMap<>();

        generateFalseAccount();  // For easier testing
    }

    /**
     * Method to put false data into the HashMaps.
     * This method should only be called in the constructor once.
     */
    public void generateFalseAccount() {
        Vehicle car1 = new Vehicle("Car", "Honda Civic", "Pink", "XD0303", 1951, 3);
        Vehicle car2 = new Vehicle("Car", "VoltsWagon Beetle", "Red", "G00DC4R", 2016, 2);

        addVehicle("Honda", car1);
        addVehicle("Beetle", car2);
    }

    public void addVehicle(String name, Vehicle vehicle) {
        vehicles.put(name, vehicle);
    }

    public void addTrip(String name, Trip trip) {
        trips.put(name, trip);
    }

    public Map<String, Trip> getTrips() {
        return trips;
    }

    public void setType(String type) {
        if (type == "driver" || type == "passenger")
            this.type = type;
    }

    public Map<String, Vehicle> getVehicles() {
        return vehicles;
    }

    public Map<String, Ride> getRides() {
        return rides;
    }

    public void setRides(Map<String, Ride> rides) {
        this.rides = rides;
    }
}
