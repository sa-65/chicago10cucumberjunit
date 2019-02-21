@youtube
Feature: As a user when I enter the funny cat videos to the
  youtube search box iI should be able to see related videos

  Background: User is on the homepage and is able to see search box and search button
    Given User is on the youtube homepage
    And User is able to see the search box
    And User is able to see the search button


  Scenario: Testing
    When User searches for FUNNY CAT VIDEOS
    Then User should see the results related funny cat videos


  Scenario: Testing
    When User searches for FUNNY DOG VIDEOS
    Then User should see the results related funny dog videos


  Scenario: Testing
    When User searches for FUNNY PET VIDEOS
    Then User should see the results related funny pet videos
