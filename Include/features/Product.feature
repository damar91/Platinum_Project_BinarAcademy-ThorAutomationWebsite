@Product @Smoke
Feature: Product
  As a User, I want to search product

  @SP001
  Scenario: SP001 - User Search for Available Product
    Given User enter the secondhand page
    When User clicks the search field
    And User input product name
    Then User click enter and successfully viewed the product

  @SP002
  Scenario: SP002 - User search product by category
    Given User is already on Homepage
    When User selects category
    Then User can see a list of all products according to the selected category

  @SP003
  Scenario: SP003 - User see detail of product
    Given User successfully logged into the homepage
    When User clicks search button
    And User input produk name
    And User enter search
    Then User click the image of product and see detail information about the product
