Feature: Add Vehicle
Scenario: Add a Car
    Given that I am a "driver"
    When I add "car"
    Then the "car" should be added to the "account"