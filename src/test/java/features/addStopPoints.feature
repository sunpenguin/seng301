Feature: Stop Points
  Scenario: Add a Stop Point
    Given that I am a "driver"
    When I add "76 Happy Lane" as a stop point
    Then the stop point with address "76 Happy Lane" is created

  Scenario: Add a Stop Point already available
    Given that I am a "driver"
    When I add "76 Happy Lane" as a stop point
    And "76 Happy Lane" is already in the data
    Then the stop point with address "76 Happy Lane" is not added again