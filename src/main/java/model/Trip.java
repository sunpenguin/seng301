package model;

import java.text.ParsePosition;
import java.time.LocalDate;
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
    private LocalDate expiryDate;
    private Vehicle vehicle;
//    private DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//    private SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
//    private int stopTimes;

    /**
     * The constructor for a non-recurrent trip.
     * @param name  The name of the trip
     * @param route The route the trip will use
     * @param direction To university = 0, From university = 1
     * @param vehicle The vehicle to be used for the trip
     */
    public Trip(String name, Route route, int direction, Vehicle vehicle) {
        this.name = name;
//        List<StopPoint> tempRouteSP = new ArrayList<>();
//        for(int i = 0; i < route.getRouteStops().size(); i++) {
//            tempRouteSP.add(route.getRouteStops().get(i).copy());
////            System.out.println(route.getRouteStops().get(i).getTime());
//        }
//        this.route = new Route(new String(route.getName()), tempRouteSP);
        this.route = route;
        this.direction = direction;
        this.recurrent = false;
        this.vehicle = vehicle;
//        this.stopTimes = stopTimes;

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
     */
    public Trip(String name, Route route, int direction, List<Boolean> days, LocalDate expiryDate, Vehicle vehicle) {
        this.name = name;
        List<StopPoint> tempRouteSP = new ArrayList<>();
        for(int i = 0; i < route.getRouteStops().size(); i++) {
            tempRouteSP.add(route.getRouteStops().get(i).copy());
        }
        this.route = new Route(new String(route.getName()), tempRouteSP);
//        this.route = route;
        this.direction = direction;
        this.recurrent = true;
        this.days = days;
//        this.expiryDate = df.parse(expiryDate, new ParsePosition(0));
        this.expiryDate = expiryDate;
        this.vehicle = vehicle;
//        this.stopTimes = stopTimes;

//        for (StopPoint sp : this.route.getRouteStops()) {
//            sp.setPassTime(stopTimes);
//        }
    }

    /**
     * The expiry date parameter takes in a string and then converts it to a Date object
     */
//    public void setExpiryDate(String expiryDate) {
//        this.expiryDate = df.parse(expiryDate, new ParsePosition(0));
//    }

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
