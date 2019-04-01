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

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/h3_Order Management (13) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/a_View  Edit Abandoned Orders (3) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_GET STARTED_search (1)'), '388')

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/button_Go (3)'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/a_Export Orders (1)'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/a_Export as CSV file (.csv) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Regenerate order number_updateOrder'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/select_Select Status'), 'AWAITING_FULFILLMENT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/select_Select Status'), 'PARTIALLY_SHIPPED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/select_Select Status'), 'ORDER_DECLINED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/select_Select Status'), 'PAYMENT_RECEIVED', true)

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/button_Update Selected'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/div_  orders updated successfully.'))

WebUI.delay(10)

WebUI.closeBrowser()

