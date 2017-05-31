Feature: Add Route
  Scenario: Add a Route 2 Stop Points
    Given that I am a using a "driver" account
    When I have a StopPoint called "122B Walker Road"
    And I have a StopPoint called "2 Head Lane"
    Then I can create a route called "Route"

  Scenario: Add a Route 1 Stop Point
    Given that I am a using a "driver" account
    When I have a StopPoint called "76 Jackson Street"
    Then I can create a route called "Route"

  Scenario: Add a Route no Stop Points
    Given that I am a using a "driver" account
    When I have no stop points
    Then I can create a route called "Route" with no stop points