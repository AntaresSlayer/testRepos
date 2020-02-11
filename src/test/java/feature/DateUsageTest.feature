Feature:

  Scenario:
    Given user is on a home page
    When he presses on login button
    And he inputs his credentials and logs in
      | Login | epam |
      | Password | 1234 |
    And he moves to services dates tab
    And chooses the date '03/22/2228'
    And presses the submit button
    Then result area contains required date '03/22/2228'