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

WebUI.openBrowser('https://blazedemo.com/login')

WebUI.verifyElementHasAttribute(findTestObject('BLAZEDEMO-OR/EMAIL'), 'id', 4)

WebUI.verifyElementAttributeValue(findTestObject('BLAZEDEMO-OR/EMAIL'), 'id', 'email', 4)

WebUI.setText(findTestObject('BLAZEDEMO-OR/EMAIL'), 'kiran@gmail.com')

WebUI.verifyElementClickable(findTestObject('BLAZEDEMO-OR/LOGIN'))

WebUI.verifyElementNotHasAttribute(findTestObject('BLAZEDEMO-OR/EMAIL'), 'xpath', 2)

WebUI.newTab('https://demo.automationtesting.in/Register.html')

WebUI.verifyElementPresent(findTestObject('AUTOMATION-DEMO-OR/FACEBOOK'), 2)

WebUI.verifyElementVisible(findTestObject('AUTOMATION-DEMO-OR/FACEBOOK'))

WebUI.verifyElementNotPresent(findTestObject('BLAZEDEMO-OR/CHECKBOX'), 2)

WebUI.verifyElementText(findTestObject('AUTOMATION-DEMO-OR/SUBMIT'), 'Submit')

WebUI.closeBrowser()

