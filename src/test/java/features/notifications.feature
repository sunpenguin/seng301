Feature:
  Scenario: Driver Licence Expire
    Given that my licence expiry date is "12/12/2001" on licence number "ABC123"
    When I log in to my account with licence "ABC123"
    Then I get a notification with the message "Your licence has expired. Please renew your licence as soon as possible!"

  Scenario: WOF Expire
    Given I have a vehicle "Jeep" with WOF expiry on "11/11/2011"
    When I log in to my account with vehicle "Jeep"
    Then I get the notification message "Your WOF for one of your vehicles has expired. Please renew your WOF as soon as possible!"

  Scenario: Registration Expire
    Given I have a vehicle "Alpine" with registration expiry on "01/01/2016"
    When I log in to my account with vehicle "Alpine"
    Then I get the notification message "Your registration for one of your vehicles has expired. Please renew your registration as soon as possible!"