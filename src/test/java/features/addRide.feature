Feature: Add Ride
  Scenario: Add a Ride
    Given that I am a "driver"
    When I have a route
    Then I can create a ride

    Given that I am a "driver"
    When I have a route
    Then I can create multiple rides