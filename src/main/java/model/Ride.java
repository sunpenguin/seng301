package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The model class that stores ride information.
 * @author Sunguin Peng
 */
public class Ride {
    private String name;
    private int availableSeats;
    private boolean full;
    private boolean shared;
    private Route route;
    private int direction;
    private LocalDate date;
    private Vehicle vehicle;
    private String driverID;
    private List<String> passengers;

    /**
     * The constructor for a proper ride after finding out the true meaning of the story.
     */
    public Ride(String name, Route route, int direction, LocalDate date, Vehicle vehicle, int availableSeats, String driverID) {
        this.name = name;
        this.route = route;
        this.direction = direction;
        this.date = date;
        this.vehicle = vehicle;
        this.availableSeats = availableSeats;
        this.driverID = driverID;
        passengers = new ArrayList();
    }

    /**
     * The method to add passengers. The boolean for full becomes true when there are no more available seats.
     */
    public void addPassenger(Account account) {
        if (!full) {
            passengers.add(account.getUniversityID());
            availableSeats -= 1;
            if (availableSeats == 0) {
                full = true;
                shared = false;
            }
        }
    }


    /**
     * Checks the number of seats are within range of the vehicle specified before setting the number
     * @param availableSeats    the number of available seats
     */
    public void setAvailableSeats(int availableSeats) {
        if (availableSeats <= vehicle.getSeats() && availableSeats > 0) {
            this.availableSeats = availableSeats;
            full = false;
        }  else if (availableSeats == 0) {
            this.availableSeats = 0;
            full = true;
            shared = false;
        }
    }

    /**
     * Currently, it will set the ride back to shared regardless of the ride creator.
     *
     * @param account
     */
    public void removePassenger(Account account) {
        if (passengers.contains(account.getUniversityID())) {
            passengers.remove(account.getUniversityID());
            full = false;
            availableSeats += 1;
        }
    }

    /**
     * To be called when the driver wants to cancel a ride they have created.
     */
    public void cancelRide() {
        availableSeats += passengers.size();
        passengers = new ArrayList<>();
        shared = false;
        full = false;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean isFull() {
        return full;
    }

    public void shareRide() {
        shared = true;
    }

    public String getName() {
        return name;
    }

    public boolean isShared() {
        return shared;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}
