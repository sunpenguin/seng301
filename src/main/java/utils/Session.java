package utils;

import java.time.LocalTime;

/**
 * Session file to move content around controllers.
 * Also remembers user activity for the session.
 */
public class Session {

    private LocalTime time;

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
}
