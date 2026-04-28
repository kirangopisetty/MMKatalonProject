package com.kiran.keywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
class browserNewKeywords {

	@Keyword
	def browserInit() {
		// open a browser > add 2 new tabs > maximize browser window
		WebUI.openBrowser('');
		WebUI.newTab("")
		WebUI.newTab("")
		WebUI.maximizeWindow();
	}

	@Keyword
	def browserResize() {
		WebUI.openBrowser('');
		for (int i=400;i<500;i++) {
			for (int j=300;j<400;j++)
				WebUI.setViewPortSize(i, j);
		}
	}

	@Keyword
	def browserRefresh() {
		WebUI.deleteAllCookies();
		WebUI.refresh();
	}

	@Keyword
	def browserCleanup() {
		WebUI.deleteAllCookies();
		WebUI.closeBrowser();
	}

	@Keyword
	def simpleKeyword() {
		println("Welcome to custom keywords");
		System.out.println("This is so easy to create");
	}
}