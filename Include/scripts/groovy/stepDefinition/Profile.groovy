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

class Profile {

	@Given("User access the website and redirect to homepage")
	public void user_access_the_website_and_redirect_to_homepage() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Pages/User Login (Seller)'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click icon profile")
	public void user_click_icon_profile() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User Click Icon Profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click label nama profile")
	public void user_click_label_nama_profile() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User Click label nama'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User successfully enters the account info page")
	public void user_successfully_enters_the_account_info_page() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User successfully enters the account info page'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	//#PR002

	@Given("User access the website")
	public void user_access_the_website() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Pages/User Login (Seller)'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click profile button")
	public void user_click_profile_button() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User Click Icon Profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click nama profile")
	public void user_click_nama_profile() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User Click label nama'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click label name profile")
	public void user_click_label_name_profile() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User click label nama'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User fill the Nama field")
	public void user_fill_the_Nama_field() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User update data name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User fill the Kota field")
	public void user_fill_the_Kota_field() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User update data kota'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User fill the Alamat field")
	public void user_fill_the_Alamat_field() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User update data address'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User fill the No Handphone field")
	public void user_fill_the_No_Handphone_field() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User update no handphone'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User save the updated data")
	public void user_save_the_updated_data() {
		WebUI.callTestCase(findTestCase('Profile/Step Definition/User save the updated data'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)

	}

}
