@Register @Smoke
Feature: Register
  User want to register

  @UR003
  Scenario: UR003 - User can't register to the website with the same email (registered email)
    Given User open the Register page
    When User input Name
    And User input registered Email with correct format
    And User input field Password
    And User click on button Daftar
    Then Email has already been taken prompt showed up

  @UR001
  Scenario: UR001 - User can register to the website
    Given User already on the Register page
    When User input correct Name
    And User input correct Email
    And User input correct Password
    And User click button Daftar
    Then User success register

  @UR002
  Scenario: UR002 - User can register to the website with the minimum 8 digit password
    Given User on Register page
    When User input field Name
    And User input Email
    And User input minimum 8 digit password
    And User push button Daftar
    Then User successful register
