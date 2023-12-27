package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Offering {
	@Given("Buyer access the website and redirect to homepage")
	public void buyer_access_the_website_and_redirect_to_homepage() {
		//WebUI.callTestCase(findTestCase('Offering/Step Definition/Buyer/User access the Secondhand website'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer searches for the desired product")
	public void buyer_searches_for_the_desired_product() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Buyer/User search product Thor'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Buyer click on desired product")
	public void buyer_click_on_desired_product() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Buyer/User click the Product Thor'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Buyer click on button Saya Tertarik")
	public void buyer_click_on_button_Saya_Tertarik() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Buyer/User click button Saya Tertarik'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Buyer input Harga Tawar")
	public void buyer_input_Harga_Tawar() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Buyer/User input Harga Tawar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Buyer click button Kirim")
	public void buyer_click_button_Kirim() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Buyer/User click button Kirim'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Warning pop up message showed up and redirect to Login page")
	public void warning_pop_up_message_showed_up_and_redirect_to_Login_page() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Buyer/User verify error message Need to Login'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.refresh()
	}

	@Given("Buyer has logged in to the buyer's account")
	public void buyer_has_logged_in_to_the_buyer_s_account() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Pages/User Login (Buyer)'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Saya tertarik dan ingin nego button has changed into Menunggu respon penjual and button is disable")
	public void saya_tertarik_dan_ingin_nego_button_has_changed_into_Menunggu_respon_penjual_and_button_is_disable() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Buyer/User verify success create offering'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Buyer create offer and Logout")
	public void Buyer_create_offer_and_Logout() {
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Buyer success create offering and user Logout")
	public void buyer_success_create_offering_and_user_Logout() {
		//User logout without close browser
		WebUI.verifyElementPresent(findTestObject('Page_User Login/buttonPerson'), 3)
		WebUI.click(findTestObject('Page_User Login/buttonPerson'))
		WebUI.verifyElementPresent(findTestObject('Page_User Logout/buttonKeluar'), 3)
		WebUI.click(findTestObject('Page_User Logout/buttonKeluar'))
		WebUI.verifyElementPresent(findTestObject('Page_User Login/buttonMasuk'), 3)

		WebUI.callTestCase(findTestCase('Offering/Pages/Buyer/OFB002 - Buyer success Create Offering'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User Login as Seller")
	public void user_Login_as_Seller() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Pages/User Login (Seller)'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click redflag notification")
	public void seller_click_redflag_notification() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click redflag notification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Seller click notification offer product")
	public void seller_click_notification_offer_product() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click notification offer product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Buyer create offer and user Logout")
	public void buyer_create_offer_and_user_Logout() {
	}

	@When("Login as Seller")
	public void Login_as_Seller() {
	}

	@And("Seller click redflag notif")
	public void seller_click_redflag_notif() {
	}

	@Then("Seller click notif offer product")
	public void seller_click_notif_offer_product() {
	}

	@Then("Seller click button Decline offering")
	public void seller_click_button_Decline_offering() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click button Decline offering'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Offering/Buyer/btn_Homepage'))
		//user logout
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Buyer success create offer and user Logout")
	public void buyer_success_create_offer_and_user_Logout() {
		WebUI.callTestCase(findTestCase('Offering/Pages/Buyer/OFB002 - Buyer success Create Offering'), [:], FailureHandling.STOP_ON_FAILURE)
		//User logout without close browser
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Seller click button Accept offering")
	public void seller_click_button_Accept_offering() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click button Accept Offering'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller accept Product Offering")
	public void seller_accept_Product_Offering() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click redflag notification'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click notification offer product'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click button Accept Offering'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Seller click button Call buyer via WA")
	public void seller_click_button_Call_buyer_via_WA() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click button Call Buyer by WA'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Seller verify open page WA")
	public void seller_verify_open_page_WA() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller verify open page WA'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Seller click status Cancel Sold")
	public void seller_click_status_Cancel_Sold() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click status Cancel Sold'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Seller click button Kirim status produk")
	public void seller_click_button_Kirim_status_produk() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click button Kirim Status Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Seller verify product Cancel Sold")
	public void seller_verify_product_Cancel_Sold() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller verify product cancel sold'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Seller click status Success Sold Product")
	public void seller_click_status_Success_Sold_Product() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller click status Success Sold Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Buyer success offering product Thor")
	public void buyer_success_offering_product_thor() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Buyer/User succes Offer ThorSold'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Seller verify product Success Sold")
	public void seller_verify_product_Success_Sold() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller verify product success sold'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller accept Product Offer")
	public void Seller_accept_Product_Offer() {
	}

	@Given("Buyer success offering and seller has been update status Sold")
	public void Buyer_success_offering_and_seller_has_been_update_status_sold() {
	}

	@And("Seller view Daftar Jual")
	public void Seller_view_Daftar_Jual() {
		WebUI.click(findTestObject('Offering/Buyer/btn_Homepage'))
		WebUI.callTestCase(findTestCase('Product (Seller)/Step Definition/Seller View Daftar Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Seller click tab Diminati")
	public void Seller_click_tab_Diminati() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller Click Tab Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Seller verify that bid product is already in tab Diminati")
	public void Seller_verify_that_bid_product_is_already_in_tab_Diminati() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller verify that bid product is already in Tab Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Seller click tab Terjual")
	public void Seller_click_tab_Terjual() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller Click Tab Terjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Seller verify that product Sold is already in Tab Terjual")
	public void Seller_verify_that_product_Sold_is_already_in_Tab_Terjual() {
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Seller/Seller verify that product sold is already in Tab Terjual'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Offering/Step Definition/Buyer/User search the unavailable Product'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}
}