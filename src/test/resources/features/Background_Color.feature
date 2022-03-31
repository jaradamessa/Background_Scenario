@Test-steps
Feature: techfios.com - Test page

  Scenario: Set SkyBlue Background button exists
    Given Set SkyBlue Background button exists
    When I click on the button
    Then The background color will change to sky blue

  Scenario: White Background Change
  Given Set SkyWhite Background button exists
  When I click on the Set White Background button
  Then the background color will change to white



