Feature: View Booked Rides
  Scenario: Seeing Booked Rides as a Passenger
    Given I have booked the ride "Ride" on my account "lep10"
    When I view my booked rides in my account "lep10"
    Then I should see the ride "Ride"

  Scenario: Seeing Rides as a Driver
    Given I have shared the ride "Ride" on my account "pel92"
    When I view my shared rides in my account "pel92"
    Then I should see the ride "Ride"