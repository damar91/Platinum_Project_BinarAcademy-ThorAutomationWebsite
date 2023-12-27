

@Offering @Smoke
Feature: Offering
  As a Buyer, I want to process my product offering
  As a Seller, I want to process the bid product

  @OFB001
  Scenario: OFB001 - Buyer failed Create Offering without Login
    Given Buyer access the website and redirect to homepage
    When Buyer searches for the desired product
    And Buyer click on desired product
    And Buyer click on button Saya Tertarik
    And Buyer input Harga Tawar
    And Buyer click button Kirim
    Then Warning pop up message showed up and redirect to Login page

  @OFB002
  Scenario: OFB002 - Buyer success Create Offering
    Given Buyer has logged in to the buyer's account
    When Buyer searches for the desired product
    And Buyer click on desired product
    And Buyer click on button Saya Tertarik
    And Buyer input Harga Tawar
    And Buyer click button Kirim
    Then Saya tertarik dan ingin nego button has changed into Menunggu respon penjual and button is disable

  @OFS001
  Scenario: OFS001 - Seller get notification Product Offering
    Given Buyer create offer and Logout
    When User Login as Seller
    And Seller click redflag notification
    Then Seller click notification offer product
    
  @OFS007
  Scenario: OFS007 - Seller See the List of their Products that have been Offered by Buyer
    Given Buyer create offer and user Logout
    When Login as Seller
    And Seller view Daftar Jual
    And Seller click tab Diminati
    Then Seller verify that bid product is already in tab Diminati

  @OFS002
  Scenario: OFS002 - Seller declined Product Offering from Buyer
    Given Buyer create offer and user Logout
    When Login as Seller
    And Seller click redflag notification
    And Seller click notification offer product
    Then Seller click button Decline offering

  @OFS003
  Scenario: OFS003 - Seller accept Product Offering from Buyer
    Given Buyer success create offer and user Logout
    When User Login as Seller
    And Seller click redflag notification
    And Seller click notification offer product
    Then Seller click button Accept offering

  @OFS004
  Scenario: OFS004 - Seller contact Buyer via WA
    Given Buyer create offer and user Logout
    When Login as Seller
    And Seller accept Product Offer 
    And Seller click button Call buyer via WA
    Then Seller verify open page WA
  
  @OFS005
  Scenario: OFS005 - Seller update status Product Cancel Sold
    Given Buyer create offer and user Logout
    When Login as Seller
    And Seller accept Product Offer
    And Seller click status Cancel Sold
    And Seller click button Kirim status produk
    Then Seller verify product Cancel Sold

  @OFS006
  Scenario: OFS006 - Seller update status Product Sold
    Given Buyer success offering product Thor
    When User Login as Seller
    And Seller accept Product Offering 
    And Seller click status Success Sold Product
    And Seller click button Kirim status produk
    Then Seller verify product Success Sold
    
  @OFS008
  Scenario: OFS008 - Seller see the list of their product that have been Sold
    Given Buyer success offering and seller has been update status Sold
    When Login as Seller
    And Seller view Daftar Jual 
    And Seller click tab Terjual
    Then Seller verify that product Sold is already in Tab Terjual
