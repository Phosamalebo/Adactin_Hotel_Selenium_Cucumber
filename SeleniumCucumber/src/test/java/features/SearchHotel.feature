Feature: Search for hotel

  Scenario: Validate user is able to search for a hotel
    Given User navigate to the search hotel page
    When User fills in required details
    Then User should be able to search for a hotel