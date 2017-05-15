Feature: Stop Points
  Scenario: Add a Stop Point
    Given that I am a "driver"
    When I add "76 Happy Lane" as a stop point
    Then the stop point with address "76 Happy Lane" is created