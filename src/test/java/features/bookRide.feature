Feature: Book a Ride
  Scenario: Book a Ride as Passenger
    Given  that I am using a "passenger" account
    When I want to book a ride called "Ride"
    Then I assign myself to the ride called "Ride"

  Scenario: Book a Ride as Driver
    Given  that I am using a "driver" account
    When I want to book a ride called "Ride"
    Then I assign myself to the ride called "Ride"