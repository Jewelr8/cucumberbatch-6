Feature: Handling the windows.

  Background: TC-104 Validate the Alert function is working as expected.

    Given browser is open and navigate to the Base URL

    Scenario: TC-343 Validate that users handles multiple windows properly
#    Given User is in teh practice page
    When User click on the open window
    Then Validate that user can switch to the second window
    Then Validate that user can switch to the first window
