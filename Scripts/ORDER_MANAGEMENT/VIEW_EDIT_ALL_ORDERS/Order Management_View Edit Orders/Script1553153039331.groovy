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

WebUI.click(findTestObject('Object Repository/Page_GitoMe Digital Transformation Platform/h3_Order Management'))

WebUI.click(findTestObject('Object Repository/Page_GitoMe Digital Transformation Platform/a_View  Edit All Orders'))

WebUI.click(findTestObject('Object Repository/Page_GitoMe Digital Transformation Platform/input_Reset_updateOrder'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GitoMe Digital Transformation Platform/select_Shipped                                Completed'), 'COMPLETED', true)

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Page_GitoMe Digital Transformation Platform/input_NZD_btn btn-primary btn-sm'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GitoMe Digital Transformation Platform/select_Shipped                                Completed'), 'SHIPPED', true)

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Page_GitoMe Digital Transformation Platform/input_NZD_btn btn-primary btn-sm'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_GitoMe Digital Transformation Platform/input_Reset_updateOrder_1'))

WebUI.click(findTestObject('Object Repository/Page_GitoMe Digital Transformation Platform/a_463-4357e359-b9a6-4905-8067-7162dd4ca7cd'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('Object Repository/Page_GitoMe Digital Transformation Platform/div_Order Summary'))

WebUI.delay(10)

