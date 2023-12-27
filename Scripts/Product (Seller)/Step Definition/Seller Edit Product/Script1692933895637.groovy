import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyElementPresent(findTestObject('Seller_Feature/btnEditProduct'), 3)

WebUI.click(findTestObject('Seller_Feature/btnEditProduct'))

WebUI.verifyElementPresent(findTestObject('Seller_Feature/btnTerbitkan'), 3)

WebUI.setText(findTestObject('Seller_Feature/productnameField'), 'New edit')

WebUI.setText(findTestObject('Seller_Feature/productpriceField'), '10000')

WebUI.selectOptionByValue(findTestObject('Seller_Feature/productID'), '1', false)

WebUI.setText(findTestObject('Seller_Feature/productdescriptionField'), 'Setelah di edit')

WebUI.scrollToElement(findTestObject('Seller_Feature/btnTerbitkan'), 3)

WebUI.uploadFile(findTestObject('Seller_Feature/productPicture'), 'D:\\One Drive\\OneDrive - PT. Hadji Kalla Holding\\2023 - HK Holding\\QA Bootcamp BINAR\\Automation_Web_SecondHand_THOR\\File Upload\\Group 1119.png')

