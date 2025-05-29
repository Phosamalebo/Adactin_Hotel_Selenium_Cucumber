Feature: Book hotel

  Scenario: Validate user is able to book a hotel
    Given User navigate to the book hotel page
    When User fills in the book a hotel form
    Then User should be able to book for a hotel