package utils;

import model.Account;
import model.Ride;
import model.StopPoint;

import java.time.LocalTime;

/**
 * Session file to move content around controllers.
 * Also remembers user activity for the session.
 */
public class Session {

    private LocalTime time;
    private StopPoint stopPoint;
    private Ride ride;

    private Account currentAccount;

    private static Session instance = new Session();

    private Session() {
    }

    public static Session getInstance() {
        return instance;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = LocalTime.parse(time);
    }

    public StopPoint getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(StopPoint stopPoint) {
        this.stopPoint = stopPoint;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(Account currentAccount) {
        this.currentAccount = currentAccount;
    }
}
