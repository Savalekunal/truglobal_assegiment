
Feature: Amazon User Registration and Product Purchase

  
  Scenario: Register a new user on Amazon and purchase an iPhone
    Given User is on the Amazon.in homepage
    When User registers on Amazon with valid details
    And User searches for "iPhone"
    And User selects the first iPhone from the list
    And User goes to the product details page
    And User selects and stores the price in a variable
    And User adds the iPhone to the cart
    Then User verifies the iPhone is added to the cart successfully
  
