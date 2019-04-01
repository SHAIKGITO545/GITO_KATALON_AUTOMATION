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

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/h3_Shipment Management (3)'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/a_Setup Logistics Account (1)'))

WebUI.scrollToPosition(400, 400)

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/a_Edit (1)'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Country Code_aramex_AccountCountryCode'), '91')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Account Entity_aramex_AccountEntity'), 'BLR')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Account Number_aramex_AccountNumber'), '007801542207')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Account PIN_aramex_AccountPin'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_User Name_aramex_UserName'), 'shaik')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Password_aramex_Password'), 'irfan@786')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Shipper Company Name_aramex_Shipper_CompanyName'), 'WebRockz Automation Labs')

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Shipper Company Name_nudgespot_update_button'))

WebUI.delay(5)

