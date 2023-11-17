Feature: Validate DropDown functionality

  Background: Launching App
    Given browser is open and navigate to the Base URL

  Scenario: TC-101 DropDown functionality should work as expected.
    Given user navigate to the Practice page
    When user click on the dropdown icon
    Then user can select option one
    Then user can select option two
    Then user can select option three


