@sellerProduct
Feature: Product

	@PDS003
  Scenario: Seller can't adding their product without logging in
    Given Seller go to the homepage website
    When Seller click Sell button
    And "You need to sign in or sign up before continuing" Warning pop up message showed up
    Then Redirect to login page

  @PDS001
  Scenario: Seller can add product
    Given Seller logged in to their seller account
    When Seller click Sell Button
    And Seller input the Nama produk
    And Seller input the Harga produk
    And Seller choose Kategori produk
    And Seller input Deskripsi produk
    And Seller upload appropriate product image
    And Seller clicks the Terbitkan button
    Then Redirect to product detail page
    
  @PDS002
  Scenario: Seller can preview product before adding
    Given Seller logged in to their seller account
    When Seller click Sell Button
    And Seller input the Nama produk
    And Seller input the Harga produk
    And Seller choose Kategori produk
    And Seller input Deskripsi produk
    And Seller upload appropriate product image
    And Seller click the Preview button
    Then Redirect to product detail page

  @PDS004
  Scenario: Seller can edit data of their product
    Given Seller logged in to their seller account
    When Seller go to list page
    And Seller click the product that want to change
    And Seller modified the product details
    And Seller saves the changes by click the Terbitkan button
    Then Redirect to product detail page with data updated

  @PDS005
  Scenario: Seller can delete their product
    Given Seller logged in to their seller account
    When Seller go to list page
    And Seller click the product that want to delete
    And Seller click the Delete button
    Then Redirect to Daftar Jual Saya page

  @PDS006
  Scenario: Seller want to see list products
    Given Seller logged in to their seller account
    When Seller go to list page
    Then Seller direct to Daftar Jual Saya page
