Feature: Editing a Vehicle
  Scenario: Edit Performance
    Given I have a vehicle "car" with 15 performance
    When I edit the performance from 15 to 10
    Then the vehicle "car" will have a performance of 10

  Scenario: Edit Seats
    Given I have a vehicle "car" with 1 seat
    When I edit the seats from 1 to 10
    Then the vehicle "car" will have 10 seats

  Scenario: Edit Registration
    Given I have a vehicle "car" with registration expiry "12/12/2016"
    When I edit the expiry date from "12/12/2016" to "12/12/2019"
    Then the vehicle "car" will have a registration expiry of "12/12/2019"
