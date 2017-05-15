package model;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    private Date expiryDate;
    private Vehicle vehicle;
//    private DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
    private int stopTimes;

    /**
     * The constructor for a non-recurrent trip.
     * @param name  The name of the trip
     * @param route The route the trip will use
     * @param direction To university = 0, From university = 1
     * @param vehicle The vehicle to be used for the trip
     * @param stopTimes How long the driver will stop at the stop points on the route
     */
    public Trip(String name, Route route, int direction, Vehicle vehicle, int stopTimes) {
        this.name = name;
        this.route = route;
        this.direction = direction;
        this.recurrent = false;
        this.vehicle = vehicle;
        this.stopTimes = stopTimes;

//        for (StopPoint sp : this.route.getRouteStops()) {
//            sp.setPassTime(stopTimes);
//        }
    }

    /**
     * The constructor for a recurrent trip.
     * @param name  The name of the trip
     * @param route The route the trip will use
     * @param direction To university = 0, From university = 1
     * @param days  The days the trip will be active on (as a list of booleans)
     * @param expiryDate    When this trip will no longer be in effect
     * @param vehicle The vehicle to be used for the trip
     * @param stopTimes How long the driver will stop at the stop points on the route
     */
    public Trip(String name, Route route, int direction, List<Boolean> days, String expiryDate, Vehicle vehicle, int stopTimes) {
        this.name = name;
        List<StopPoint> tempRouteSP = new ArrayList<>();
        for(int i = 0; i < route.getRouteStops().size(); i++) {
            tempRouteSP.add(route.getRouteStops().get(i).copy());
        }
        this.route = new Route(new String(route.getName()), tempRouteSP);
        this.direction = direction;
        this.recurrent = true;
        this.days = days;
        this.expiryDate = df.parse(expiryDate, new ParsePosition(0));
        this.vehicle = vehicle;
        this.stopTimes = stopTimes;

//        for (StopPoint sp : this.route.getRouteStops()) {
//            sp.setPassTime(stopTimes);
//        }
    }

    /**
     * The expiry date parameter takes in a string and then converts it to a Date object
     * @param expiryDate    The expiry date of the trip in format DD/MM/YYYY as a string
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = df.parse(expiryDate, new ParsePosition(0));
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

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public SimpleDateFormat getDf() {
        return df;
    }

    public void setDf(SimpleDateFormat df) {
        this.df = df;
    }

    public int getStopTimes() {
        return stopTimes;
    }

    public void setStopTimes(int stopTimes) {
        this.stopTimes = stopTimes;
    }
}
