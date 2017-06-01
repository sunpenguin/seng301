package model;

import java.time.LocalDate;

/**
 * The class for checking notifications.
 */
public class Notification {

    private Account account;

    private boolean rideCancel = false;
    private String cancelReason = "";

    private boolean unbookRide = false;
    private String unbookReason = "";

    public Notification(Account account) {
        this.account = account;
    }

    public String checkNotifications() {
        String result = "";
        result += rideChecks();
        result += checkLicence();
        result += checkWOF();
        result += checkRegistration();
        return result;
    }

    private String rideChecks() {
        String result = "Status of my rides:\n";
        Boolean none = true;
        if (rideCancel) {
            result += "One or more rides have been cancelled.\n";
            result += "The reason(s) being: " + cancelReason;
            rideCancel = false;
            cancelReason = "";
            none = false;
        }
        if (unbookRide) {
            result += "One or more passenger(s) un-booked your ride.\n";
            result += "The reason(s) being: " + unbookReason;
            unbookRide = false;
            unbookReason = "";
            none = false;
        }
        if (none) {
            result += "Nothing has been changed since your last log in.\n";
        }
        return result;
    }

    private String checkLicence() {
        String result = "\nStatus of my account:\n";
        if (account.getType().equals("Driver")) {
            LocalDate expiry = account.getLicence().getExpiry();
            LocalDate now = LocalDate.now();

            if (account.getLicence().isExpired()) {
                result = notificationCreator("LicenceExpired");
            } else if (now.plusWeeks(1).isAfter(expiry)) {
                result = notificationCreator("Licence1Week");
            } else if (now.plusWeeks(2).isAfter(expiry)) {
                result = notificationCreator("Licence2Week");
            } else if (now.plusMonths(1).isAfter(expiry)) {
                result = notificationCreator("Licence1Month");
            }
        }
        return result;
    }

    private String checkWOF() {
        String result = "";
        if (account.getType().equals("Driver")) {
            LocalDate now = LocalDate.now();
            LocalDate expiry;
            for (Vehicle vehicle: account.getVehicles().values()) {
                expiry = vehicle.getExpiryWOF();
                if (now.isAfter(expiry)) {
                    result = notificationCreator("WOFExpired");
                } else if (now.plusWeeks(1).isAfter(expiry)) {
                    result = notificationCreator("WOF1Week");
                } else if (now.plusWeeks(2).isAfter(expiry)) {
                    result = notificationCreator("WOF2Week");
                } else if (now.plusMonths(1).isAfter(expiry)) {
                    result = notificationCreator("WOF1Month");
                }
            }
        }
        return result;
    }

    private String checkRegistration() {
        String result = "";
        if (account.getType().equals("Driver")) {
            LocalDate now = LocalDate.now();
            LocalDate expiry;
            for (Vehicle vehicle: account.getVehicles().values()) {
                expiry = vehicle.getExpiryRegistration();
                if (now.isAfter(expiry)) {
                    result = notificationCreator("RegistrationExpired");
                } else if (now.plusWeeks(1).isAfter(expiry)) {
                    result = notificationCreator("Registration1Week");
                } else if (now.plusWeeks(2).isAfter(expiry)) {
                    result = notificationCreator("Registration2Week");
                } else if (now.plusMonths(1).isAfter(expiry)) {
                    result = notificationCreator("Registration1Month");
                }
            }
        }
        return result;
    }

    private String notificationCreator(String type) {
        String result = "";
        switch (type) {
            case "LicenceExpired":
                result = "Your licence has expired. Please renew your licence as soon as possible!\n";
                break;
            case "Licence1Week":
                result = "Your licence will expire within 1 week. Remember to renew your licence soon.\n";
                break;
            case "Licence2Week":
                result = "Your licence will expire within 2 weeks. Remember to renew your licence soon.\n";
                break;
            case "Licence1Month":
                result = "Your licence will expire within 1 month. Remember to renew your licence soon.\n";
                break;
            case "WOFExpired":
                result = "Your WOF for one of your vehicles has expired. Please renew your WOF as soon as possible!\n";
                break;
            case "WOF1Week":
                result = "Your WOF for one of your vehicles will expire within 1 week. Remember to renew your WOF soon.\n";
                break;
            case "WOF2Week":
                result = "Your WOF for one of your vehicles will expire within 2 weeks. Remember to renew your WOF soon.\n";
                break;
            case "WOF1Month":
                result = "Your WOF for one of your vehicles will expire within 1 month. Remember to renew your WOF soon.\n";
                break;
            case "RegistrationExpired":
                result = "Your registration for one of your vehicles has expired. Please renew your registration as soon as possible!\n";
                break;
            case "Registration1Week":
                result = "Your registration for one of your vehicles will expire within 1 week. Remember to renew your registration soon.\n";
                break;
            case "Registration2Week":
                result = "Your registration for one of your vehicles will expire within 2 weeks. Remember to renew your registration soon.\n";
                break;
            case "Registration1Month":
                result = "Your registration for one of your vehicles will expire within 1 month. Remember to renew your registration soon.\n";
                break;
            default:
                break;
        }
        return result;
    }

    public void updateAccount(Account account) {
        this.account = account;
    }

    public void setRideCancel(String cancelReason) {
        rideCancel = true;
        this.cancelReason += cancelReason + "\n";
    }

    public void setUnbookRide(String unbookReason) {
        this.unbookRide = true;
        this.unbookReason += unbookReason + "\n";
    }
}
