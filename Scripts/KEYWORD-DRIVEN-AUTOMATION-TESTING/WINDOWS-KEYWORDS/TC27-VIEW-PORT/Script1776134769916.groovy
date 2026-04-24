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

WebUI.openBrowser('https://www.mindmajix.com')

WebUI.maximizeWindow()

WebUI.setViewPortSize(600, 800)

WebUI.delay(2)

WebUI.getViewportHeight()

WebUI.getViewportWidth()

WebUI.setViewPortSize(500, 600)

WebUI.delay(2)

WebUI.setViewPortSize(900, 600)

WebUI.delay(2)

WebUI.getViewportLeftPosition()

WebUI.getViewportTopPosition()

WebUI.setViewPortSize(300, 400)

WebUI.verifyElementVisibleInViewport(findTestObject('MINDMAJIX-OR/LOGIN-HOME-PAGE'), 4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setViewPortSize(700, 700)

WebUI.verifyElementInViewport(findTestObject('MINDMAJIX-OR/LOGIN-HOME-PAGE'), 4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

