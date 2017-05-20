package model;

import java.util.HashMap;
import java.util.Map;

/**
 * The model that is the current user's account.
 * @author Sunguin Peng
 */
public class Account {
    private String name;
    private Integer id;
    private String type;
    private Map<String, Vehicle> vehicles;
    private String licenceNumber;

    /**
     * The constructor for an account.
     * Currently only requires a name.
     * @param name the username for the account
     */
    public Account(String name, Integer id) {
        this.name = name;
        this.id = id;
        type = "Passenger";
        vehicles = new HashMap<>();
        licenceNumber = "No Licence Number";

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

    public void setType(String type) {
        if (type == "Driver" || type == "Passenger")
            this.type = type;
    }

    public void upgrade(String licenceNumber) {
        type = "Driver";
        this.licenceNumber = licenceNumber;
    }

    public Map<String, Vehicle> getVehicles() {
        return vehicles;
    }

    public Integer getId() {
        return id;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
