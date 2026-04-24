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

WebUI.maximizeWindow()

bgcolor = WebUI.getCSSValue(findTestObject('BLAZEDEMO-OR/EMAIL'), 'background-color')

println(bgcolor)

varFontWeight = WebUI.getCSSValue(findTestObject('BLAZEDEMO-OR/EMAIL'), 'font-weight')

if (varFontWeight == '400') {
    println('Font-weight check passed')
} else {
    println('Font-weight check failed')

    WebUI.closeBrowser()
}

varFontSize = WebUI.getCSSValue(findTestObject('BLAZEDEMO-OR/EMAIL'), 'font-size')

if (varFontSize == '14px') {
    println('Font-size check passed')
} else {
    println('Font-size check failed')

    WebUI.closeBrowser()
}

WebUI.getElementHeight(findTestObject('BLAZEDEMO-OR/PASSWORD'))

WebUI.getElementLeftPosition(findTestObject('BLAZEDEMO-OR/PASSWORD'))

WebUI.getElementWidth(findTestObject('BLAZEDEMO-OR/PASSWORD'))

WebUI.getCSSValue(findTestObject('BLAZEDEMO-OR/PASSWORD'), 'height')

WebUI.getCSSValue(findTestObject('BLAZEDEMO-OR/PASSWORD'), 'width')

