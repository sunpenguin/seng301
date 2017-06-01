Feature: Cancel a Booked Ride as a Passenger
  Scenario: Cancel a Booked Ride
    Given I have booked the ride "Hummus" by driver "Hansen"
    When I cancel my booking on "Hummus"
    And my reason is "I hurt my foot"
    Then the driver will receive the notification "I hurt my foot"