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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.disellco.cloud/')

WebUI.click(findTestObject('Object Repository/editBillingAddress/Page_DiSellco Cloud/button_Login'))

WebUI.switchToWindowTitle('Sign up or sign in')

WebUI.setText(findTestObject('editBillingAddress/Page_Sign up or sign in/email'), 
    'customer28sept@yopmail.com')

WebUI.setEncryptedText(findTestObject('editBillingAddress/Page_Sign up or sign in/password'), 
    'LP4mHXqRT1Ck252+zifvwg==')

WebUI.click(findTestObject('Object Repository/editBillingAddress/Page_Sign up or sign in/button_Sign in'))

WebUI.switchToWindowTitle('DiSellco Cloud')

WebUI.click(findTestObject('editBillingAddress/Page_DiSellco Cloud/editbutton'))

WebUI.setText(findTestObject('Object Repository/editBillingAddress/Page_DiSellco Cloud/input_Title_inputgroup'), 'qa')

WebUI.click(findTestObject('editBillingAddress/Page_DiSellco Cloud/dropdown'))

WebUI.click(findTestObject('Object Repository/editBillingAddress/Page_DiSellco Cloud/li_Fam'))

WebUI.click(findTestObject('Object Repository/editBillingAddress/Page_DiSellco Cloud/span_Update'))

