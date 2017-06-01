Feature:
  Scenario: Log in with an account
    Given that I have an account with username "skj32" and password "23jks"
    When I enter "skj32" and "23jks" to the log in screen
    Then I will get my account details email "skj32@uclive.ac.nz"

  Scenario: Log in without an account
    Given I have the username "klj12"
    When I enter "klj32" and "klj32" to the log in screen
    Then I will fail to log in

  Scenario: Wrong Password
    Given that I have an account with username "skj32" and password "23jks"
    When I enter "skj32" and "23jsk" to the log in screen
    Then I will fail to log in