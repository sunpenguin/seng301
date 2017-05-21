package model;

import java.util.HashMap;
import java.util.Map;

/**
 * The model that is the current user's account.
 * @author Sunguin Peng
 */
public class Account {
    private Integer id;
    private String licenceNumber;

    private String universityID;
    private String password;
    private String email;
    private String name;
    private String address;
    private Integer homeNumber;
    private Integer mobileNumber;
    private Licence licence;
    private Map<String, Vehicle> vehicles;
    private String type;

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
     * The updated constructor for an account. This will be used from backlog 2 onwards.
     * This is for a driver type account.
     */
    public Account(String universityID, String password, String email,
                   String name, String address, Integer homeNumber, Integer mobileNumber, Licence licence) {
        this.universityID = universityID;
        this.password = password;
        this.email = email;
        this.name = name;
        this.address = address;
        this.homeNumber = homeNumber;
        this.mobileNumber = mobileNumber;
        this.licence = licence;
        type = "Driver";
    }

    /**
     * The updated constructor for an account. This will be used from backlog 2 onwards.
     * This is for a passenger type account.
     */
    public Account(String universityID, String email, String name, String address, Integer homeNumber, Integer mobileNumber) {
        this.universityID = universityID;
        this.email = email;
        this.name = name;
        this.address = address;
        this.homeNumber = homeNumber;
        this.mobileNumber = mobileNumber;
        type = "Passenger";
    }


    /**
     * Method to put false data into the HashMaps.
     * This method should only be called in the constructor once.
     */
    private void generateFalseAccount() {
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
