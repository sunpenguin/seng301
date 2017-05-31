Feature: Add Vehicle
  Scenario: Add a Car
    Given that I am a "driver"
    When I add a car "Lamborghini"
    Then the "car" should be added to my account

  Scenario:
    Given that I am a "driver"
    When I want to add a car "Beetle"
    And I want to add a car "Porsche"
    Then I can add them all to my account