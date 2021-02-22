Feature: amazon
  Scenario: get amazon products prices

    Given browser is open
    And we are in amazon page
    When enter a laptop in searchbox
    And press enter
    Then get all elements which price is less than 500




