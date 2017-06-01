Feature: Cancel a Ride as a Driver
  Scenario: Cancel a Ride with Passengers
    Given I have a passenger "pass12" in my ride "Ride"
    When I cancel my ride "Ride"
    Then passenger "pass12" will be notified

  Scenario: Cancel a Full Ride
    Given I have two passengers "pass12" and "pass13" in my ride "Ride"
    And "Ride" is full
    When I cancel my ride "Ride"
    Then passengers "pass12" and "pass13" will be notified
