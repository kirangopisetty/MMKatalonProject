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
import org.openqa.selenium.Rectangle as Rectangle

WebUI.openBrowser('https://demo.automationtesting.in/Register.html')

WebUI.comment('Browser has opened and navigated to the URL')

WebUI.maximizeWindow()

WebUI.comment('Browser window maximized')

WebUI.takeScreenshot('/Users/Kiran/Downloads/ss1.jpg')

WebUI.takeFullPageScreenshot('/Users/Kiran/Downloads/ss2.jpg')

WebUI.takeElementScreenshot('/Users/Kiran/Downloads/ss3.jpg', findTestObject('AUTOMATION-DEMO-OR/FIRST-NAME'))

WebUI.takeAreaScreenshot('/Users/Kiran/Downloads/ss4.jpg', new Rectangle(50, 25, 100, 150))

WebUI.modifyObjectProperty(findTestObject('AUTOMATION-DEMO-OR/FIRST-NAME'), 'xpath', '//input[@placeholder=\'First Name\']', 
    '//@id=firstname', false)

WebUI.removeObjectProperty(findTestObject('AUTOMATION-DEMO-OR/FIRST-NAME'), 'xpath')

WebUI.closeBrowser()

