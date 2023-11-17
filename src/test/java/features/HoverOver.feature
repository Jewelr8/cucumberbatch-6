Feature: Validate DropDown functionality

  Background: Launching App
    Given browser is open and navigate to the Base URL

  Scenario: TC-101 DropDown functionality should work as expected.
    When user hover the mouse over the option
    Then user can select option one using Actions class
    Then user can select option two using Actions class
