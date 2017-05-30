Feature: Add Ride
  Scenario: Add a Ride
    Given that I am using a "driver" account
    When I have a route called "Route 1"
    And a vehicle called "car"
    Then I can create a ride called "Ride 1"

  Scenario: Add Multiple Rides
    Given that I am using a "driver" account
    When I have a route called "Route 1"
    And a vehicle called "car"
    Then I can create multiple rides called "Ride 1"