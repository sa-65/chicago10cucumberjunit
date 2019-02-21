@datatables2
Feature: As a user when I create a new employee I should be able to see the name in the table

  Scenario: Testing adding new employee to the table
    Given User is on the datatables homepage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter first name "JOE"
    And User should enter last name "WICK"
    And User should enter position "Retired"
    And User should enter office "London"
    And User should enter extension "123"
    And User should enter start date "2019-01-12"
    And User should enter salary "124000"
    Then User should clicks to create button
    And User enters first name "JOE"  to search box
    Then User should see first name "JOE" is inserted in the table