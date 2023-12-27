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



class Logout {
	@Given("User already on home page")
	public void user_already_on_home_page() {
		//WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User Open Secondhand Store Website'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User click button Masuk on homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input email")
	public void user_input_email() {
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Input Field Email'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input password")
	public void user_input_password() {
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Input Field Password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User push button login")
	public void user_push_button_login() {
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click profile")
	public void user_click_profile() {
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click button keluar")
	public void user_click_button_keluar() {
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User successfully logout")
	public void user_successfully_logout() {
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}