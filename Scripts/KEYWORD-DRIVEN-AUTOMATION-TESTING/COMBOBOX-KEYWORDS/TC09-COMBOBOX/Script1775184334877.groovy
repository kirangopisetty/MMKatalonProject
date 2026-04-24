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

WebUI.openBrowser('https://blazedemo.com/')

countSource = WebUI.getNumberOfTotalOption(findTestObject('BLAZEDEMO-OR/SOURCE'))

countDestination = WebUI.getNumberOfTotalOption(findTestObject('BLAZEDEMO-OR/DESTINATION'))

WebUI.getNumberOfSelectedOption(findTestObject('BLAZEDEMO-OR/SOURCE'))

WebUI.getNumberOfSelectedOption(findTestObject('BLAZEDEMO-OR/DESTINATION'))

WebUI.verifyOptionNotSelectedByIndex(findTestObject('BLAZEDEMO-OR/SOURCE'), 1, 4)

WebUI.verifyOptionNotSelectedByLabel(findTestObject('BLAZEDEMO-OR/DESTINATION'), 'Rome', false, 4)

WebUI.verifyOptionNotSelectedByValue(findTestObject('BLAZEDEMO-OR/SOURCE'), 'Philadelphia', false, 4)

if (countSource == 7) {
    println('# of options in source dropdown test case=PASSED')
} else {
    println('# of options in source dropdown test case=FAILED')

    WebUI.closeBrowser()
}

if (countDestination == 7) {
    println('# of options in destination dropdown test case=PASSED')
} else {
    println('# of options in destination dropdown test case=FAILED')

    WebUI.closeBrowser()
}

sourceOptions = WebUI.verifyOptionsPresent(findTestObject('BLAZEDEMO-OR/SOURCE'), ['São Paolo', 'Mexico City', 'San Diego'
        , 'Portland', 'Boston', 'Philadelphia', 'Paris'])

destinationOptions = WebUI.verifyOptionsPresent(findTestObject('BLAZEDEMO-OR/DESTINATION'), ['Buenos Aires', 'Rome', 'London'
        , 'Berlin', 'New York', 'Dublin', 'Cairo'])

if (sourceOptions == true) {
    println('list of options in source dropdown test case=PASSED')
} else {
    println('list of options in source dropdown test case=FAILED')

    WebUI.closeBrowser()
}

if (destinationOptions == true) {
    println('list of options in destination dropdown test case=PASSED')
} else {
    println('list of options in destination dropdown test case=FAILED')

    WebUI.closeBrowser()
}

WebUI.verifyOptionPresentByLabel(findTestObject('BLAZEDEMO-OR/SOURCE'), 'Mexico City', false, 4)

WebUI.selectOptionByIndex(findTestObject('BLAZEDEMO-OR/SOURCE'), 5)

WebUI.verifyOptionSelectedByIndex(findTestObject('BLAZEDEMO-OR/SOURCE'), 5, 0, FailureHandling.OPTIONAL)

WebUI.verifyOptionPresentByValue(findTestObject('BLAZEDEMO-OR/DESTINATION'), 'Rome', false, 4)

WebUI.selectOptionByLabel(findTestObject('BLAZEDEMO-OR/DESTINATION'), 'Rome', false)

WebUI.verifyOptionSelectedByLabel(findTestObject('BLAZEDEMO-OR/DESTINATION'), 'Rome', false, 4)

WebUI.delay(4, FailureHandling.OPTIONAL)

WebUI.verifyOptionPresentByValue(findTestObject('BLAZEDEMO-OR/DESTINATION'), 'London', false, 4)

WebUI.selectOptionByValue(findTestObject('BLAZEDEMO-OR/DESTINATION'), 'London', false)

WebUI.verifyOptionSelectedByValue(findTestObject('BLAZEDEMO-OR/DESTINATION'), 'London', false, 4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyOptionNotPresentByLabel(findTestObject('BLAZEDEMO-OR/SOURCE'), 'Hyderabad', false, 4)

WebUI.verifyOptionNotPresentByValue(findTestObject('BLAZEDEMO-OR/DESTINATION'), 'Bengaluru', false, 4)

