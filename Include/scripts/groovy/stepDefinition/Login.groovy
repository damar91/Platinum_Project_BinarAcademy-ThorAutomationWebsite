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



class Login {
	//Buyer
	@Given("Buyer already on home page")
	public void buyer_already_on_home_page() {
		//WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Open Secondhand Store Website'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User click button Masuk on homepage'), [:], FailureHandling.STOP_ON_FAILURE)

	}

	@And("Buyer input email")
	public void buyer_input_email() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Input Field Email (Buyer)'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Buyer input password")
	public void buyer_input_password() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Input Field Password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Buyer click button login")
	public void buyer_click_button_login() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Click Button Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Buyer succesful login")
	public void buyer_succesful_login() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Successfully Login'), [:], FailureHandling.STOP_ON_FAILURE)
		//user logout
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)

	}


	//Seller
	@Given("Seller already on home page")
	public void seller_already_on_home_page() {
		//WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Open Secondhand Store Website'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User click button Masuk on homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Seller input email")
	public void seller_input_email() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Input Field Email (Seller)'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Seller input password")
	public void seller_input_password() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Input Field Password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Seller click button login")
	public void seller_click_button_login() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Click Button Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Seller succesful login")
	public void seller_succesful_login() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Successfully Login'), [:], FailureHandling.STOP_ON_FAILURE)
		//user logout
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)

	}


	//incorrect credential
	@Given("User already on the Login page")
	public void user_already_on_the_login_page() {
		//WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Open Secondhand Store Website'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User click button Masuk on homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input incorrect email")
	public void user_input_incorrect_email() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Input Field Email (Incorrect Credential)'),
				[:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input incorrect password")
	public void user_input_incorrect_password() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Input Field Password (Incorrect Credential)'),
				[:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click button login")
	public void user_click_button_login() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Click Button Login (Incorrect Credential)'),
				[:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Invalid Cridential warning prompt showed up")
	public void invalid_cridential_warning_prompt_showed_up() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Login - Close Alert Notif'), [:], FailureHandling.STOP_ON_FAILURE)
	}

}