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

    /**
     * The constructor only requires an address
     * @param address
     */
    public StopPoint(String address)  {
        this.address = address;
    }

    /**
     * The proper constructor after developing a search mechanism
     * @param street The name of the street
     * @param suburb The suburb of the street
     */
    public StopPoint(String street, String suburb) {
        // TODO: Change address to be called street
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
        // TODO: Change address to be called street
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

    // --new--
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
