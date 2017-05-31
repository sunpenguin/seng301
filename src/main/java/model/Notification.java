package model;

import java.time.LocalDate;

/**
 * The class for checking notifications.
 */
public class Notification {

    Account account;

    public Notification(Account account) {
        this.account = account;
    }

    public void checkNotifications() {
        checkLicence();
        checkWOF();
        checkRegistration();
    }

    private void checkLicence() {
        if (account.getType().equals("Driver")) {
            LocalDate expiry = account.getLicence().getExpiry();
            LocalDate now = LocalDate.now();

            if (account.getLicence().isExpired()) {
                notificationCreator("LicenceExpired");
            } else if (now.plusWeeks(1).isAfter(expiry)) {
                notificationCreator("Licence1Week");
            } else if (now.plusWeeks(2).isAfter(expiry)) {
                notificationCreator("Licence2Week");
            } else if (now.plusMonths(1).isAfter(expiry)) {
                notificationCreator("Licence1Month");
            }
        }
    }

    private void checkWOF() {

    }

    private void checkRegistration() {

    }

    private void notificationCreator(String type) {

    }
}
