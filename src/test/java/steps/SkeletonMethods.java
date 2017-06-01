package steps;

import model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Methods I can use for cucumber tests
 */
public class SkeletonMethods {
    Account account;
    Route route;
    Vehicle car;

    StopPoint sp1;
    StopPoint sp2;

    String routeName;
    String carName;

    Ride ride;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private void createRide(String rideName) {
        ride = new Ride(rideName, route, 0, LocalDate.parse("15/12/2020", formatter),
                car, 30, "jax12");
    }

    private void createVehicle(String name) {
        car = new Vehicle(name, "G6", "Red", "ABC123", 1881, 50, 10,
                LocalDate.parse("12/12/2017", formatter), LocalDate.parse("12/12/2017", formatter));
    }

    private void createRoute2(String name) {
        StopPoint sp1 = new StopPoint("Street Name", "Suburb 1");
        StopPoint sp2 = new StopPoint("15 Steed Road", "Lincoln");
        route = new Route(name, new ArrayList<>(Arrays.asList(sp1, sp2)));
    }

    private void createDriver() {
//        (String universityID, String password, String email,
//                String vehicleName, String address, Integer homeNumber, Integer mobileNumber, Licence licence)
        account = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L,
                new Licence("Full for over 2 years", "YXF87231",
                        LocalDate.parse("12/12/2015", formatter),
                        LocalDate.parse("12/12/2020", formatter)));
    }

    private void createPassenger() {
//        (String universityID, String password, String email, String vehicleName, String address, Integer homeNumber, Integer mobileNumber)
        account = new Account("driver", "password", "driver@uclive.ac.nz",
                "Dan", "20 Howard Street", 1234567, 64278182123L);
    }

    private void createRoute(String routeName) {
        route = new Route(routeName, new ArrayList<>(Arrays.asList(sp1, sp2)));
    }

    private void createStopPoint(String name) {
        sp1 = new StopPoint(name, "Suburb");
    }

    private void createStopPoint2() {
        sp2 = new StopPoint("15 Private Lane", "Hamsun");
    }
}