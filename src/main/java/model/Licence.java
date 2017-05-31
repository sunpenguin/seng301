package model;

import java.time.LocalDate;

/**
 * The licence class for drivers.
 * Stores information about a driver licence.
 */
public class Licence {

    private String type;
    private String number;
    private LocalDate issue;
    private LocalDate expiry;

    private boolean expired;

    public Licence(String type, String number, LocalDate issue, LocalDate expiry) {
        this.type = type;
        this.number = number;
        this.issue = issue;
        this.expiry = expiry;

        expired = false;
        checkExpiry();
    }

    public void checkExpiry() {
        LocalDate now = LocalDate.now();
        if (expiry.isBefore(now)) {
            expired = true;
        }
    }

    public boolean isExpired() {
        return expired;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public LocalDate getIssue() {
        return issue;
    }

    public LocalDate getExpiry() {
        return expiry;
    }
}
