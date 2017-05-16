package model;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * The model for a stop point
 * @author Sunguin Peng
 */
public class StopPoint implements Serializable {
    private Integer number;
    private String address;
    private String suburb;
    private LocalTime time;

    /**
     * The constructor only requires an address
     * @param address
     */
    public StopPoint(String address)  {
        this.address = address;
    }

    /**
     * The proper constructor after developing a search mechanism
     * @param number The street number
     * @param street The name of the street
     * @param suburb The suburb of the street
     */
    public StopPoint(Integer number, String street, String suburb) {
        // TODO: Change address to be called street
        this.number = number;
        address = street;
        this.suburb = suburb;
        time = LocalTime.parse("00:00");
    }

    /**
     * The constructor for when the user specifies a time.
     * Only used during the creation of a trip.
     * @param number The street number
     * @param street The name of the street
     * @param suburb The suburb of the street
     * @param time The time of the pickup
     */
    public StopPoint(Integer number, String street, String suburb, String time) {
        // TODO: Change address to be called street
        this.number = number;
        address = street;
        this.suburb = suburb;
        this.time = LocalTime.parse(time);
    }

    public StopPoint copy() {
        return new StopPoint(number, address, suburb, time.toString());
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    //    /**
//     * A test method to try make stop points more dynamic
//     * @return a copy of the stop point
//     */
//    public StopPoint copy() {
//        return new StopPoint(address);
//    }
}
