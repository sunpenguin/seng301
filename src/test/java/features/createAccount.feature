Feature:
  Scenario: Create a Passenger Account
    Given I want to use the application
    When I create an account with id "zx908"
    And have other details "zx908@uclive.ac.nz". "password", "name", "address", 1234567, 1234567
    Then I create a "Passenger" account

  Scenario: Create Driver Account
    Given I attend "UC"
    When I create an account with id "zx908"
    And have other details "zx908@uclive.ac.nz". "password", "name", "address", 1234567, 1234567
    And have a licence with details "type", "licence", issue "12/12/2013", expiry "12/12/2023"
    Then I create a "Driver" account