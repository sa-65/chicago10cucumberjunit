@googleParameters
Feature: Google search functionality

  Scenario: Testing google search
    Given User is on the homepage of google
    Then User enters "flowers"
    Then User should see "flowers" in the title

  Scenario: Testing google search
    Given User is on the homepage of google
    Then User enters "car"
    Then User should see "car" in the title

  Scenario: Testing google search
    Given User is on the homepage of google
    Then User enters "truck"
    Then User should see "truck" in the title