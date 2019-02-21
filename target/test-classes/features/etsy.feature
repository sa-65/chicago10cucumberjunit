@etsy
Feature: Etsy search functionality

  Scenario Outline: Testing any product search
    Given user on the etsy home page
    When user search for "<anything>"
    Then user see should see "<anything>" in the title>

    Examples: searching for any product
      | anything |
      | pc       |
      | watch    |
      | pencil   |