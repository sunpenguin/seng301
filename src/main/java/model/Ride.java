package model;

/**
 * The model class that stores ride information.
 * @author Sunguin Peng
 */
public class Ride {
    private String name;
    private Trip trip;
    private int availableSeats;
    private boolean full;
    private boolean share;

    /**
     * The constructor for a ride when seat numbers are specified
     * @param trip  The trip used in the ride
     * @param availableSeats    The number of seats available for the ride
     */
    public Ride(String name, Trip trip, int availableSeats, boolean share) {
        this.name = name;
        this.trip = trip;
        setAvailableSeats(availableSeats);
        this.share = share;
    }

    /**
     * The default constructor for a ride when seat numbers are not specified
     * @param trip  The trip used in the ride
     */
    public Ride(String name, Trip trip, boolean share) {
        this.name = name;
        this.trip = trip;
        availableSeats = 0;
        full = true;
        this.share = share;
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
            share = false;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean isFull() {
        return full;
    }

    public void shareRide() {
        share = true;
    }

    public String getName() {
        return name;
    }

    public boolean isShare() {
        return share;
    }
}
