@Logout @Smoke
Feature: Logout
  User want to logout

  @LG001
  Scenario: LG001 - User can log out of his account
    Given User already on home page
    When User input email
    And User input password
    And User push button login
    And User click profile
    And User click button keluar
    Then User successfully logout
