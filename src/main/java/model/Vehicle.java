package model;

/**
 * The model class that defines a vehicle
 * @author Sunguin Peng
 */
public class Vehicle {
    private String type;
    private String model;
    private String colour;
    private String licencePlate;
    private int year;
    private int seats;

    /**
     * The constructor for a vehicle after testing
     * @param type  The type of vehicle
     * @param model The model of vehicle
     * @param colour    The colour of the vehicle
     * @param licencePlate  The license plate of the vehicle
     * @param year  The year the vehicle was created
     * @param seats The number of passenger seats available in the car
     */
    public Vehicle(String type, String model, String colour, String licencePlate, int year, int seats) {
        this.type = type;
        this.model = model;
        this.colour = colour;
        this.licencePlate = licencePlate;
        this.year = year;
        this.seats = seats;
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

    public String getLicencePlate() {
        return licencePlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
