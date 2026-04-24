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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.verifyTextPresent('Please login to make appointment', false)

WebUI.setText(findTestObject('CURA/UN'), 'John Doe')

WebUI.setEncryptedText(findTestObject('CURA/PWD'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.takeScreenshot('/Users/Kiran/Downloads/beforeLogin.jpg')

WebUI.click(findTestObject('CURA/LOGIN'))

WebUI.verifyTextNotPresent('Please login to make appointment', false)

WebUI.verifyTextPresent('Make Appointment', false)

varFacilityCount = WebUI.getNumberOfTotalOption(findTestObject('CURA/DROPDOWN'))

if (varFacilityCount == 3) {
    System.out.println('The Facility dropdown count is valid & the test case=PASSED')

    varFacilityName = WebUI.verifyOptionsPresent(findTestObject('CURA/DROPDOWN'), ['Hongkong CURA Healthcare Center', 'Tokyo CURA Healthcare Center'
            , 'Seoul CURA Healthcare Center'])

    if (varFacilityName == true) {
        System.out.println('The Facility dropdown values are valid & the test case=PASSED')
    } else {
        System.out.println('The Facility dropdown values are invalid & the test case=FAILED-terminating the browser session')

        WebUI.closeBrowser()
    }
} else {
    println('The Facility dropdown count is invalid & the test case=FAILED-terminating the browser session')

    WebUI.closeBrowser()
}

WebUI.selectOptionByLabel(findTestObject('CURA/DROPDOWN'), 'Seoul CURA Healthcare Center', false)

WebUI.verifyElementNotChecked(findTestObject('CURA/CHECKBOX'), 2)

WebUI.check(findTestObject('CURA/CHECKBOX'))

WebUI.click(findTestObject('CURA/MEDICAID'))

WebUI.setText(findTestObject('CURA/VISIT-DATE'), '30/04/2026')

WebUI.setText(findTestObject('CURA/COMMENT'), 'Fever')

WebUI.takeScreenshot('/Users/Kiran/Downloads/beforeAppt.jpg')

WebUI.click(findTestObject('CURA/BOOK-APPT-BUTTON'))

WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.takeScreenshot('/Users/Kiran/Downloads/apptBooked.jpg')

WebUI.click(findTestObject('CURA/MENU'))

WebUI.takeScreenshot('/Users/Kiran/Downloads/beforeLogout.jpg')

WebUI.click(findTestObject('CURA/LOGOUT'))

WebUI.verifyTextPresent('We Care About Your Health', false)

WebUI.takeScreenshot('/Users/Kiran/Downloads/afterLogout.jpg')

WebUI.deleteAllCookies()

WebUI.closeBrowser()

