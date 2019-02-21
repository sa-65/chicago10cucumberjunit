@wiki
Feature: As a user I should be able to see Steve Jobs when i make search on Wikipedia

  Scenario: Wikipedia search test
    Given User is on the wikipedia home page
    When User enters Steve Jobs to search bar nd clicks enter
    Then User should see first header is displaying Steve Jobs