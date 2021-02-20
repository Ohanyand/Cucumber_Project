Feature: test login
  Scenario: check login is successful  in valid data

    Given user is in login page
    When user enters a valid data
    And clicks on login button
    Then user is navigated into home page




