Feature: as a user i want to fill forms on epam site

  Scenario: i'm logging in and putting some information into the contact form

    Given user is on a home page
    When he presses on login button
    And he inputs his credentials and logs in
      | Login | epam |
      | Password | 1234 |
    And he presses on contact form button
    And he fills it with some data
      | Name | Auto |
      | Last Name | Tester |
      | Weather | Sun |
      | Description | Hello world |
    And he presses submit button
    Then result area has some information about user
      | Last Name | Tester |
      | Weather | Sun |
      | Description | Hello world |