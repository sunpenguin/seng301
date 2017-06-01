Feature: Store data
  Scenario: Store my account
    Given that I am a "user"
    When I want to save my account "acc111"
    Then I close the application

  Scenario: Store Stop Points
    Given that I am a "driver"
    When I want to save the stop point "SP1"
    Then I close the application