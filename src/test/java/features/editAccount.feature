Feature: Edit Account Details
  Scenario: Edit Licence Details
    Given I have a licence with expiry "12/12/2016"
    And it is linked to the account "ari54"
    When I update expiry to "12/12/2026"
    Then account "ari54" will have a licence with expiry date "12/12/2026"

  Scenario: Edit Account Details
    Given I have an account "war10" with address "18 Old Lane"
    When I update address to "29 New Street"
    Then account "war10" will have an address of "29 New Street"