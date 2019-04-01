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

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/h3_Shipment Management (2)'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/a_Setup Logistics Account'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/a_ECOM'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Username_ecom_user_name'), 'SHAIK KALESHA')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Password_ecom_password'), 'IRFAN@786')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Password_nudgespot_update_button'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/div_    Well done    Ecom Settings Updated Successfully'))

