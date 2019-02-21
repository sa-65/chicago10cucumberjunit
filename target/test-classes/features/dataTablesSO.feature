@datatables3
Feature: As a user when I create a new employee I should be able to see the name in the table

  Scenario Outline: Testing adding new employee to the table
    Given User is on the datatables homepage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter first name "<firstname>"
    And User should enter last name "<lastname>"
    And User should enter position "<position>"
    And User should enter office "<office>"
    And User should enter extension "<extension>"
    And User should enter start date "<date>"
    And User should enter salary "<salary>"
    Then User should clicks to create button
    And User enters first name "<firstname>"  to search box
    Then User should see first name "<firstname>" is inserted in the table

    Examples: Test data for datatables

      | firstname | lastname | position | office  | extension | date       | salary |
      | john      | doe      | retired  | london  | 314       | 2019-12-12 | 125000 |
      | joe       | wong     | working  | chicago | 312       | 2019-11-01 | 150000 |
      #| adam      | sandler  | actor    | cali    | 310       | 2019-10-02 | 250000 |
      #| jen       | sandler  | actor    | cali    | 310       | 2019-10-02 | 250000 |
      #| daughter  | sandler  | actor    | cali    | 310       | 2019-10-02 | 250000 |
