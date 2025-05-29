Feature: User Login Feature

  Scenario: Validate user is able to view after log in
    Given User is on the Adactin Hotel App login page
    When User logins with correct details
    Then User should be logged in