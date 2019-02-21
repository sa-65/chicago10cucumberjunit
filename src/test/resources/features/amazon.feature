@amz
Feature: As a user I should be able to see headphone results when
  I enter headphone keyword to the search button

  Background:
  Given User is on the amazon homepage

  Scenario: Amazon search test
    When User enters headphones keyword
    And User clicks to amazon search button
    Then User should see headphones in results

  Scenario: Amazon search test2
    When User enters headphones keyword
    And User clicks to amazon search button
    Then User should see headphones in results

  Scenario: Amazon search test3
    When User enters headphones keyword
    And User clicks to amazon search button
    Then User should see headphones in results

