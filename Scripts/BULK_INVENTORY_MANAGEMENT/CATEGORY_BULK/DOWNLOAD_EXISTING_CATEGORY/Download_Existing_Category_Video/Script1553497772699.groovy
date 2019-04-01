import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('ReUsableTestSteps/ERP_LOGINSTEPS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/BULK_INVONTORY_WEB_OBJECTS/Page_Gito.Me Digital Transformation Platform/div_Add Extensions_pull-right fa fa-angle-down (1)'))

WebUI.click(findTestObject('Object Repository/BULK_INVONTORY_WEB_OBJECTS/Page_Gito.Me Digital Transformation Platform/span_Category Bulk_pull-right fa fa-angle-down (1) (1)'))

WebUI.click(findTestObject('Object Repository/BULK_INVONTORY_WEB_OBJECTS/Page_Gito.Me Digital Transformation Platform/a_Download Existing Categories (2)'))

WebUI.click(findTestObject('Object Repository/BULK_INVONTORY_WEB_OBJECTS/Page_Gito.Me Digital Transformation Platform/a_Video tutorial'))

WebUI.switchToWindowUrl('http://s.demo.buckets.s3.amazonaws.com/erptutorials/Category.mp4')

WebUI.delay(10)

WebUI.switchToDefaultContent()

WebUI.delay(7)

