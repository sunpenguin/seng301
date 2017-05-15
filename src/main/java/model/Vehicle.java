package model;

/**
 * The model class that defines a vehicle
 * @author Sunguin Peng
 */
public class Vehicle {
    private String type;
    private String model;
    private String colour;
    private String licensePlate;
    private int year;
    private int seats;

    /**
     * The constructor for a vehicle after testing
     * @param type  The type of vehicle
     * @param model The model of vehicle
     * @param colour    The colour of the vehicle
     * @param licensePlate  The license plate of the vehicle
     * @param year  The year the vehicle was created
     * @param seats The number of passenger seats available in the car
     */
    public Vehicle(String type, String model, String colour, String licensePlate, int year, int seats) {
        this.type = type;
        this.model = model;
        this.colour = colour;
        this.licensePlate = licensePlate;
        this.year = year;
        this.seats = seats;
    }

    /**
     * A constructor method created from referencing cucumber
     * @param type the type of vehicle
     */
    public Vehicle(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
