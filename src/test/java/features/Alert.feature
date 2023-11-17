Feature: Alert feature
  Background: The Login page should be open
    Given browser is open and navigate to the Base URL

  Scenario: TC-104 Validate the Alert function is working as expected.
#    Given user navigate to the Practice page
    When user click on Try it
    Then Alert box is present
    Then  user should be able to click on OK
#    When user navigate inside the iframe
#    Then user should be able to click on practice page
#    Then user can click on alert inside the iframe

