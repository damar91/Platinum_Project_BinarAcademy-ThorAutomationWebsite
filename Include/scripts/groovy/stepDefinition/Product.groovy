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


class Product {

	//SP001

	@Given("User enter the secondhand page")
	public void user_enter_the_secondhand_page() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Pages/User Login (Seller)'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User clicks the search field")
	public void user_clicks_the_search_field() {
		WebUI.callTestCase(findTestCase("Product/Step Definition/User click Search Button"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input product name")
	public void user_input_product_name() {
		WebUI.callTestCase(findTestCase("Product/Step Definition/User input product name"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click enter and successfully viewed the product")
	public void user_click_enter_and_successfully_viewed_the_product() {
		WebUI.callTestCase(findTestCase("Product/Step Definition/User click Enter Search (Logo)"), [:], FailureHandling.STOP_ON_FAILURE)
		//user logout
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)
		
	}

	//SP002

	//@Given("User has successfully entered the homepage")
	//public void user_has_successfully_entered_the_homepage() {
	//WebUI.callTestCase(findTestCase('Authentication/Login/Pages/User Login (Seller)'), [:], FailureHandling.STOP_ON_FAILURE)
	//}

	//@When("User click search")
	//public void user_click_search() {
	//WebUI.callTestCase(findTestCase("Product/Step Definition/User click Search Button"), [:], FailureHandling.STOP_ON_FAILURE)
	//}

	//@And("User input product name -unavailable")
	//public void user_input_product_name_unavailable() {
	//WebUI.callTestCase(findTestCase("Product/Step Definition/User input product name - Unavailable"), [:], FailureHandling.STOP_ON_FAILURE)
	//}

	//@Then("search results do not display the desired product")
	//public void search_results_do_not_display_the_desired_product() {
	//WebUI.callTestCase(findTestCase("Product/Step Definition/Search results dont display the desired product"), [:], FailureHandling.STOP_ON_FAILURE)
	//}


	//SP003


	@Given("User is already on Homepage")
	public void user_is_already_on_Homepage() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Pages/User Login (Seller)'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User selects category")
	public void user_selects_category() {
		WebUI.callTestCase(findTestCase("Product/Step Definition/User search by all category"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can see a list of all products according to the selected category")
	public void user_can_see_a_list_of_all_products_according_to_the_selected_category() {
		WebUI.callTestCase(findTestCase("Product/Step Definition/User can see a list of all products according to the selected category"), [:], FailureHandling.STOP_ON_FAILURE)
		//user logout
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Profile'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Click Button Keluar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Authentication/Logout/Step Definition/User Logout - Successfully Logout'), [:], FailureHandling.STOP_ON_FAILURE)
		
	}


	//SP004


	@Given("User successfully logged into the homepage")
	public void user_successfully_logged_into_the_homepage() {
		WebUI.callTestCase(findTestCase('Authentication/Login/Pages/User Login (Seller)'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User clicks search button")
	public void user_clicks_search_button() {
		WebUI.callTestCase(findTestCase("Product/Step Definition/User click Search Button"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input produk name")
	public void user_input_produk_name() {
		WebUI.callTestCase(findTestCase("Product/Step Definition/User input product name"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User enter search")
	public void user_enter_search() {
		WebUI.callTestCase(findTestCase("Product/Step Definition/User click Enter Search (Logo)"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("User click the image of product and see detail information about the product")
	public void user_click_the_image_of_product_and_see_detail_information_about_the_product() {
		WebUI.callTestCase(findTestCase("Product/Step Definition/User click the image of Product"), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
