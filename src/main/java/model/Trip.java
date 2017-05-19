package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The model class that defines a trip.
 * Has two constructors for two cases, recurrent trip or non-recurrent trip.
 * @author Sunguin Peng
 */
public class Trip {
    private String name;
    private Route route;
    private int direction;
    private boolean recurrent;
    private List<Boolean> days;
    private LocalDate expiryDate;
    private Vehicle vehicle;

    /**
     * The constructor for a non-recurrent trip.
     * @param name  The name of the trip
     * @param route The route the trip will use
     * @param direction To university = 0, From university = 1
     * @param vehicle The vehicle to be used for the trip
     */
    public Trip(String name, Route route, int direction, LocalDate expiryDate, Vehicle vehicle) {
        this.name = name;
        this.route = route;
        this.direction = direction;
        this.recurrent = false;
        this.expiryDate = expiryDate;
        this.vehicle = vehicle;
    }

    /**
     * The constructor for a recurrent trip.
     * @param name  The name of the trip
     * @param route The route the trip will use
     * @param direction To university = 0, From university = 1
     * @param days  The days the trip will be active on (as a list of booleans)
     * @param expiryDate    When this trip will no longer be in effect
     * @param vehicle The vehicle to be used for the trip
     */
    public Trip(String name, Route route, int direction, List<Boolean> days, LocalDate expiryDate, Vehicle vehicle) {
        this.name = name;
        List<StopPoint> tempRouteSP = new ArrayList<>();
        for(int i = 0; i < route.getRouteStops().size(); i++) {
            tempRouteSP.add(route.getRouteStops().get(i).copy());
        }
        this.route = new Route(new String(route.getName()), tempRouteSP);
        this.direction = direction;
        this.recurrent = true;
        this.days = days;
        this.expiryDate = expiryDate;
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isRecurrent() {
        return recurrent;
    }

    public void setRecurrent(boolean recurrent) {
        this.recurrent = recurrent;
    }

    public List<Boolean> getDays() {
        return days;
    }

    public void setDays(List<Boolean> days) {
        this.days = days;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
