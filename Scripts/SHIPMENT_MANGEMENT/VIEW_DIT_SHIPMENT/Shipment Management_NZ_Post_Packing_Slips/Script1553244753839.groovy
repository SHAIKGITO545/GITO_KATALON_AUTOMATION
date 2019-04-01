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

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/h3_Shipment Management'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/a_View  Edit Shipments'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/i_Reset_fa fa-plus'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/button_Fri Mar 22 2019 943 PM_btn dropdown-toggle'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/a_NZ Post Packing Slip'))

WebUI.delay(8)

WebUI.closeBrowser()

