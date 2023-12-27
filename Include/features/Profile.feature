@Profile @Smoke
Feature: Profile
  As a User, I want to see product and search product

  @PR001
  Scenario: PR001 - User see profile information
    Given User access the website and redirect to homepage
    When User click icon profile
    And User click label nama profile
    Then User successfully enters the account info page

  @PR002
  Scenario: PR002 - User Edit profile information
    Given User access the website
    When User click profile button
    And User click nama profile
    And User fill the Nama field
    And User fill the Kota field
    And User fill the Alamat field
    And User fill the No Handphone field
    Then User save the updated data
