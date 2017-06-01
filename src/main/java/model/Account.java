package model;

import java.util.HashMap;
import java.util.Map;

/**
 * The model that is the current user's account.
 * @author Sunguin Peng
 */
public class Account {
    private String universityID;
    private String password;
    private String email;
    private String name;
    private String address;
    private Integer homeNumber;
    private Long mobileNumber;
    private Licence licence;
    private Map<String, Vehicle> vehicles;
    private String type;


    /**
     * The updated constructor for an account. This will be used from backlog 2 onwards.
     * This is for a driver type account.
     */
    public Account(String universityID, String password, String email,
                   String name, String address, Integer homeNumber, Long mobileNumber, Licence licence) {
        this.universityID = universityID;
        this.password = password;
        this.email = email;
        this.name = name;
        this.address = address;
        this.homeNumber = homeNumber;
        this.mobileNumber = mobileNumber;
        this.licence = licence;
        vehicles = new HashMap<>();
        type = "Driver";
    }

    /**
     * The updated constructor for an account. This will be used from backlog 2 onwards.
     * This is for a passenger type account.
     */
    public Account(String universityID, String password, String email, String name, String address, Integer homeNumber, Long mobileNumber) {
        this.universityID = universityID;
        this.password = password;
        this.email = email;
        this.name = name;
        this.address = address;
        this.homeNumber = homeNumber;
        this.mobileNumber = mobileNumber;
        type = "Passenger";
    }

    public void addVehicle(String name, Vehicle vehicle) {
        vehicles.put(name, vehicle);
    }

    public void upgrade(Licence licence) {
        if (!type.equals("Driver")) {
            this.licence = licence;
            vehicles = new HashMap<>();
            type = "Driver";
        }
    }

    public Map<String, Vehicle> getVehicles() {
        return vehicles;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getUniversityID() {
        return universityID;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Integer getHomeNumber() {
        return homeNumber;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public Licence getLicence() {
        return licence;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHomeNumber(Integer homeNumber) {
        this.homeNumber = homeNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
