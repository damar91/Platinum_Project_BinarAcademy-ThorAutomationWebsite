package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.security.PublicKey

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



class Register {
	@Given("User already on the Register page")
	public void user_already_on_the_register_page() {
		//WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Open Secondhand Store Website'), [:], FailureHandling.STOP_ON_FAILURE)
		//WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User click button Masuk on homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		//WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Open Register Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input correct Name")
	public void user_input_correct_name() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Input Field Name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input correct Email")
	public void user_input_correct_email() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Input Field Email'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input correct Password")
	public void user_input_correct_password() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Input Field Password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click button Daftar")
	public void user_click_daftar() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Click Button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User success register")
	public void user_success_register() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Sucessfully Registered'), [:],FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)
		
	}

	//8 digit
	@Given("User on Register page")
	public void user_on_register_page() {
		//WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Open Secondhand Store Website'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User click button Masuk on homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Open Register Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input field Name")
	public void user_input_field_name() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Input Field Name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Email")
	public void user_input_email() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Input Field Email (8 Digits Case)'),[:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input minimum 8 digit password")
	public void user_input_minimum_8_digit_password() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Input Field Password (8 Digits Case)'),[:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User push button Daftar")
	public void user_push_button_daftar() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Click Button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User successful register")
	public void user_successful_register() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Sucessfully Registered'), [:],
		FailureHandling.STOP_ON_FAILURE)
	}


	//registered
	@Given("User open the Register page")
	public void user_open_the_register_page() {
		//WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Open Secondhand Store Website'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Login/Step Definition/User click button Masuk on homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Open Register Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Name")
	public void user_input_name() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Input Field Name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input registered Email with correct format")
	public void user_input_registered_email_with_correct_format() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Input Field Email (Registered Email Case)'),
				[:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input field Password")
	public void user_input_field_password() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Input Field Password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click on button Daftar")
	public void user_click_on_button_daftar() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Click Button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Email has already been taken prompt showed up")
	public void email_has_already_been_taken_prompt_showed_up() {
		WebUI.callTestCase(findTestCase('Authentication/Register/Step Definition/User Register - Email Taken Alert'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}