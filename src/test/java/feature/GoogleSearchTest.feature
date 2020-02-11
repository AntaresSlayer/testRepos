Feature: as a user i want to search something in google

  Scenario: i'm searching something

    Given user is on a google home page
    When he enters 'what is testNG'
    And presses search button
    And opens first link on result page
    Then he is on required page
    | Title | TestNG - Welcome |