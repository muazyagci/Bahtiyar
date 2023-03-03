@login
Feature: Login to Amazon account with given information's

  Scenario: Login
    Given user is on the Dashboard
    And  user clicks to account button
    And  user clicks to identify button
    And  user types the given email account
    And  user types the given password
    Then user should see Muaz on dashboard
