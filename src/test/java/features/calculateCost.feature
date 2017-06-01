Feature: Calculate Cost for Rides
  Scenario: Calculate Cost
    Given I have a vehicle "car" with performance "6"
    And I want to go from stop point "SP1" to university
    When I create a ride using "SP1" with 4 distance
    Then the cost of the ride from the stop point "SP1" will be $"2.40"