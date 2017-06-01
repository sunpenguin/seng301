package unitTests.model;

import model.Account;
import model.Licence;
import model.Notification;
import model.Vehicle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Unit tests for notification class
 */
public class NotificationTest {

    private Account account;
    private Vehicle car;
    private Licence licence;

    private Notification notification;
    private String licenceExpireText = "Your licence has expired. Please renew your licence as soon as possible!";
    private String wofExpireText = "Your WOF for one of your vehicles has expired. Please renew your WOF as soon as possible!";
    private String regExpireText = "Your registration for one of your vehicles has expired. Please renew your registration as soon as possible!";

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Before
    public void setUp() {
        createAccount();
        createLicence();
        account.upgrade(licence);
        createVehicle();
        account.addVehicle(car.getType(), car);

        notification = new Notification(account);
    }

    private void createVehicle() {
        car = new Vehicle("Jet Car", "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse("12/12/2016", formatter), LocalDate.parse("12/12/2016", formatter));
    }

    private void createAccount() {
        account = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
    }

    private void createLicence() {
        licence = new Licence("Full for over 2 years", "YXF87231",
                LocalDate.parse("12/12/2015", formatter),
                LocalDate.parse("12/12/2016", formatter));
    }

    @Test
    public void testNotificationsLicence1Month() {
        String test = "Your licence will expire within 1 month. Remember to renew your licence soon.";
        account.getLicence().setExpiry(LocalDate.now().plusWeeks(3));
        account.getLicence().checkExpiry();
        String result = notification.checkNotifications();
        Assert.assertTrue(result.contains(test));
    }

    @Test
    public void testNotificationsLicence2Weeks() {
        String test = "Your licence will expire within 2 weeks. Remember to renew your licence soon.";
        account.getLicence().setExpiry(LocalDate.now().plusDays(12));
        account.getLicence().checkExpiry();
        String result = notification.checkNotifications();
        Assert.assertTrue(result.contains(test));
    }

    @Test
    public void testNotificationsLicence1Week() {
        String test = "Your licence will expire within 1 week. Remember to renew your licence soon.";
        account.getLicence().setExpiry(LocalDate.now().plusDays(5));
        account.getLicence().checkExpiry();
        String result = notification.checkNotifications();
        Assert.assertTrue(result.contains(test));
    }

    @Test
    public void testNotificationsLicence() {
        String result =  notification.checkNotifications();
        Assert.assertTrue(result.contains(licenceExpireText));
    }

    @Test
    public void testNotificationWOF1Month() {
        String test = "Your WOF for one of your vehicles will expire within 1 month. Remember to renew your WOF soon.";
        account.getVehicles().get("Jet Car").setExpiryWOF(LocalDate.now().plusWeeks(3));
        String result = notification.checkNotifications();

        Assert.assertTrue(result.contains(test));
    }

    @Test
    public void testNotificationWOF2Weeks() {
        String test = "Your WOF for one of your vehicles will expire within 2 weeks. Remember to renew your WOF soon.";
        account.getVehicles().get("Jet Car").setExpiryWOF(LocalDate.now().plusDays(12));
        String result = notification.checkNotifications();

        Assert.assertTrue(result.contains(test));
    }

    @Test
    public void testNotificationWOF1Week() {
        String test = "Your WOF for one of your vehicles will expire within 1 week. Remember to renew your WOF soon.";
        account.getVehicles().get("Jet Car").setExpiryWOF(LocalDate.now().plusDays(5));
        String result = notification.checkNotifications();

        Assert.assertTrue(result.contains(test));
    }

    @Test
    public void testNotificationsWOF() {
        String result =  notification.checkNotifications();
        Assert.assertTrue(result.contains(wofExpireText));
    }

    @Test
    public void testNotificationRegistration1Month() {
        String test = "Your registration for one of your vehicles will expire within 1 month. Remember to renew your registration soon.";
        account.getVehicles().get("Jet Car").setExpiryRegistration(LocalDate.now().plusWeeks(3));
        String result = notification.checkNotifications();

        Assert.assertTrue(result.contains(test));
    }

    @Test
    public void testNotificationRegistration2Weeks() {
        String test = "Your registration for one of your vehicles will expire within 2 weeks. Remember to renew your registration soon.";
        account.getVehicles().get("Jet Car").setExpiryRegistration(LocalDate.now().plusDays(12));
        String result = notification.checkNotifications();

        Assert.assertTrue(result.contains(test));
    }

    @Test
    public void testNotificationRegistration1Week() {
        String test = "Your registration for one of your vehicles will expire within 1 week. Remember to renew your registration soon.";
        account.getVehicles().get("Jet Car").setExpiryRegistration(LocalDate.now().plusDays(5));
        String result = notification.checkNotifications();

        Assert.assertTrue(result.contains(test));
    }

    @Test
    public void testNotificationsRegistration() {
        String result =  notification.checkNotifications();
        Assert.assertTrue(result.contains(regExpireText));
    }

    @Test
    public void testRideCancel() {
        String message = "A ride has been cancelled.";
        notification.setRideCancel(message);

        String result = notification.checkNotifications();

        Assert.assertTrue(result.contains(message));
    }

    @Test
    public void testUnbookRide() {
        String message = "A ride has been unbooked.";
        notification.setUnbookRide(message);

        String result = notification.checkNotifications();

        Assert.assertTrue(result.contains(message));
    }

    @Test
    public void testBothCancelAndUnbook() {
        String cancel = "A ride has been cancelled.";
        String unbook = "A ride has been unbooked.";
        notification.setRideCancel(cancel);
        notification.setUnbookRide(unbook);

        String result = notification.checkNotifications();

        Assert.assertTrue(result.contains(cancel));
        Assert.assertTrue(result.contains(unbook));
    }
}
