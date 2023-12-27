@Login @Smoke
Feature: Login (Login Buyer, Login Seller, Incorrect Credential)
  User want to login

  @LB001
  Scenario: LB001 - Buyer want to login using correct credential
    Given Buyer already on home page
    When Buyer input email
    And Buyer input password
    And Buyer click button login
    Then Buyer succesful login

  @LS001
  Scenario: LS001 - Seller want to login using correct credential
    Given Seller already on home page
    When Seller input email
    And Seller input password
    And Seller click button login
    Then Seller succesful login

  @IC001
  Scenario: IC001 - User can't login using incorrect credential
    Given User already on the Login page
    When User input incorrect email
    And User input incorrect password
    And User click button login
    Then Invalid Cridential warning prompt showed up
