Feature: Searching Stop Points
  Scenario: Search Stop Points
    Given I am a "user"
    When I want to search stop points
    Then I type in the criteria and search stop points

  Scenario:
    Given I am a "user"
    When I want to find the stop point with the address "Rose"
    Then I type "Rose" in and search by address

  Scenario:
    Given I am a "user"
    When I want to find the stop point with the suburb "Halswell"
    Then I type "Halswell" in and search by suburb

  Scenario:
    Given I want to search for stop point "Steed"
    When I search with "Steed" as the address
    Then the results will be displayed
    And a map of the location will be shown