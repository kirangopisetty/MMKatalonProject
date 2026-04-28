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

WebUI.selectOptionByLabel(findTestObject('CURA-OR/DROPDOWN'), varFacility, false)

WebUI.verifyElementNotChecked(findTestObject('CURA-OR/CHECKBOX'), 2)

WebUI.check(findTestObject('CURA-OR/CHECKBOX'))

WebUI.click(findTestObject('CURA-OR/MEDICAID'))

WebUI.setText(findTestObject('CURA-OR/VISIT-DATE'), varVisitDate)

WebUI.setText(findTestObject('CURA-OR/COMMENT'), varComment)

WebUI.takeScreenshot('/Users/Kiran/Downloads/beforeAppt.jpg')

WebUI.click(findTestObject('CURA-OR/BOOK-APPT-BUTTON'))

WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.takeScreenshot('/Users/Kiran/Downloads/apptBooked.jpg')

