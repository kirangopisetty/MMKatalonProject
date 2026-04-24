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

WebUI.verifyEqual(5, 5)

WebUI.verifyNotEqual(5, 8)

WebUI.verifyGreaterThan(10, 4)

WebUI.verifyGreaterThanOrEqual(11, 1)

WebUI.verifyLessThan(5, 9)

WebUI.verifyLessThanOrEqual(4, 9)

WebUI.delay(2)

WebUI.verifyEqual(5, 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyNotEqual(5, 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyGreaterThan(10, 14, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyGreaterThanOrEqual(11, 12, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyLessThan(5, 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyLessThanOrEqual(4, 2, FailureHandling.CONTINUE_ON_FAILURE)

