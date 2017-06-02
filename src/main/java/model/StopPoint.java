package model;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * The model for a stop point
 * @author Sunguin Peng
 */
public class StopPoint implements Serializable {
    private String address;
    private String suburb;
    private LocalTime time;

    private double distance;
    private double cost;

    /**
     * The proper constructor after developing a search mechanism
     * @param street The name of the street
     * @param suburb The suburb of the street
     */
    public StopPoint(String street, String suburb) {
        address = street;
        this.suburb = suburb;
        time = LocalTime.parse("00:00");
    }

    /**
     * The constructor for when the user specifies a time.
     * Only used during the creation of a trip.
     * @param street The name of the street
     * @param suburb The suburb of the street
     * @param time The time of the pickup
     */
    public StopPoint(String street, String suburb, String time) {
        address = street;
        this.suburb = suburb;
        this.time = LocalTime.parse(time);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
