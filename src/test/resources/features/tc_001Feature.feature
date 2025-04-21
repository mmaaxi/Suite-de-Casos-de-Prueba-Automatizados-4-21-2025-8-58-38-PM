Feature: Successful Login

  Scenario: Valid user is able to login with correct credentials
    Given the user is on the login page
    When the user enters correct username and password
    And clicks the login button
    Then the user should be redirected to the homepage