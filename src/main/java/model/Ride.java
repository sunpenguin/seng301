package model;

import java.time.LocalDate;

/**
 * The model class that stores ride information.
 * @author Sunguin Peng
 */
public class Ride {
    private String name;
    private Trip trip;
    private int availableSeats;
    private boolean full;
    private boolean shared;

    private Route route;
    private int direction;
    private LocalDate date;
    private Vehicle vehicle;

    /**
     * The constructor for a proper ride after finding out the true meaning of the story.
     */
    public Ride(String name, Route route, int direction, LocalDate date, Vehicle vehicle, int availableSeats) {
        this.name = name;
        this.route = route;
        this.direction = direction;
        this.date = date;
        this.vehicle = vehicle;
        this.availableSeats = availableSeats;
    }

    /**
     * The constructor for a ride when seat numbers are specified
     * @param trip  The trip used in the ride
     * @param availableSeats    The number of seats available for the ride
     */
    public Ride(String name, Trip trip, int availableSeats) {
        this.name = name;
        this.trip = trip;
        this.availableSeats = availableSeats;
        shared = true;
    }

    /**
     * The default constructor for a ride when seat numbers are not specified
     * @param trip  The trip used in the ride
     */
    public Ride(String name, Trip trip) {
        this.name = name;
        this.trip = trip;
        availableSeats = 0;
        full = true;
        shared = true;
    }

    /**
     * The method to add passengers. The boolean for full becomes true when there are no more available seats.
     */
    public void addPassenger() {
        if (!full) {
            availableSeats -= 1;
            if (availableSeats == 0)
                full = true;
        }
    }

    /**
     * Checks the number of seats are within range of the vehicle specified before setting the number
     * @param availableSeats    the number of available seats
     */
    public void setAvailableSeats(int availableSeats) {
        if (availableSeats <= trip.getVehicle().getSeats() && availableSeats > 0) {
            this.availableSeats = availableSeats;
            full = false;
        }  else if (availableSeats == 0) {
            this.availableSeats = 0;
            full = true;
            shared = false;
        }
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

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public Trip getTrip() {
        return trip;
    }
}
