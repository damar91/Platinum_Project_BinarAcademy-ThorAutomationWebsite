package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class sellerProduct {

	@Given("Seller logged in to their seller account")
	public void seller_logged_in_to_their_seller_account() {
		WebUI.callTestCase(findTestCase('Product (Seller)/Pages/Seller success Login with valid data'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click Sell Button")
	public void seller_click_Sell_Button() {
		WebUI.click(findTestObject('Offering/Buyer/btn_Homepage'))
		WebUI.callTestCase(findTestCase('Product (Seller)/Step Definition/Seller Click Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller input the Nama produk")
	public void seller_input_the_Nama_produk() {
		WebUI.setText(findTestObject('Seller_Feature/productnameField'), 'Alufeed')
	}

	@When("Seller input the Harga produk")
	public void seller_input_the_Harga_produk() {

		WebUI.setText(findTestObject('Seller_Feature/productpriceField'), '16000')
	}

	@When("Seller choose Kategori produk")
	public void seller_choose_Kategori_produk() {

		WebUI.selectOptionByValue(findTestObject('Seller_Feature/productID'), '2', false)
	}

	@When("Seller input Deskripsi produk")
	public void seller_input_Deskripsi_produk() {

		WebUI.setText(findTestObject('Seller_Feature/productdescriptionField'), 'Solo')
	}

	@When("Seller upload appropriate product image")
	public void seller_upload_appropriate_product_image() {
		WebUI.scrollToElement(findTestObject('Seller_Feature/btnTerbitkan'), 3)
		WebUI.uploadFile(findTestObject('Seller_Feature/productPicture'), 'D:\\One Drive\\OneDrive - PT. Hadji Kalla Holding\\2023 - HK Holding\\QA Bootcamp BINAR\\Automation_Web_SecondHand_THOR\\File Upload\\alucard.jpg')
	}

	@When("Seller clicks the Terbitkan button")
	public void seller_clicks_the_Terbitkan_button() {

		WebUI.callTestCase(findTestCase('Product (Seller)/Step Definition/Seller Click Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Redirect to product detail page")
	public void redirect_to_product_detail_page() {

		WebUI.verifyElementPresent(findTestObject('Seller_Feature/btnEditProduct'), 3)

		//user logout
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)

	}



	@When("Seller click the Preview button")
	public void seller_click_the_Preview_button() {

		WebUI.click(findTestObject('Seller_Feature/btnPreviewProduct'))
	}


	@Given("Seller go to the homepage website")
	public void seller_go_to_the_homepage_website() {
		//WebUI.openBrowser('')
		//WebUI.maximizeWindow()
		//WebUI.navigateToUrl('https://secondhand.binaracademy.org/')
		WebUI.verifyElementPresent(findTestObject('Seller_Feature/btnJual'), 3)
	}

	@When("Seller click Sell button")
	public void seller_click_Sell_button() {

		WebUI.click(findTestObject('Seller_Feature/btnJual'))
	}

	@When("{string} Warning pop up message showed up")
	public void warning_pop_up_message_showed_up(String string) {

		WebUI.verifyElementPresent(findTestObject('Page_User Login/buttonLogin'), 10)

		WebUI.verifyElementText(findTestObject('Seller_Feature/beforeContinuing'), 'You need to sign in or sign up before continuing.')
	}

	@Then("Redirect to login page")
	public void redirect_to_login_page() {
		WebUI.verifyElementPresent(findTestObject('Page_User Login/buttonLogin'), 10)
		WebUI.back()
	}

	@When("Seller go to list page")
	public void seller_go_to_list_page() {

		WebUI.verifyElementPresent(findTestObject('Seller_Feature/btnList'), 5)

		WebUI.click(findTestObject('Seller_Feature/btnList'))
	}

	@When("Seller click the product that want to change")
	public void seller_click_the_product_that_want_to_change() {

		WebUI.verifyElementPresent(findTestObject('Seller_Feature/btnAllProducts'), 10)

		WebUI.scrollToElement(findTestObject('Seller_Feature/chooseProduct'), 10)

		WebUI.click(findTestObject('Seller_Feature/chooseProduct'))
	}

	@When("Seller modified the product details")
	public void seller_modified_the_product_details() {

		WebUI.callTestCase(findTestCase('Product (Seller)/Step Definition/Seller Edit Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller saves the changes by click the Terbitkan button")
	public void seller_saves_the_changes_by_click_the_Terbitkan_button() {

		WebUI.click(findTestObject('Seller_Feature/btnTerbitkan'))

		WebUI.verifyElementPresent(findTestObject('Seller_Feature/btnEditProduct'), 3)
	}

	@Then("Redirect to product detail page with data updated")
	public void redirect_to_product_detail_page_with_data_updated() {

		WebUI.verifyElementPresent(findTestObject('Seller_Feature/btnEditProduct'), 3)

		//user logout
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)

	}

	@When("Seller click the product that want to delete")
	public void seller_click_the_product_that_want_to_delete() {

		WebUI.callTestCase(findTestCase('Product (Seller)/Step Definition/Seller Choose Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click the Delete button")
	public void seller_click_the_Delete_button() {

		WebUI.callTestCase(findTestCase('Product (Seller)/Step Definition/Seller Detele Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Redirect to Daftar Jual Saya page")
	public void redirect_to_Daftar_Jual_Saya_page() {

		WebUI.verifyElementPresent(findTestObject('Seller_Feature/btnAllProducts'), 10)
		//user logout
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Seller direct to Daftar Jual Saya page")
	public void seller_direct_to_Daftar_Jual_Saya_page() {

		WebUI.verifyElementPresent(findTestObject('Seller_Feature/btnAllProducts'), 10)
	}
}
