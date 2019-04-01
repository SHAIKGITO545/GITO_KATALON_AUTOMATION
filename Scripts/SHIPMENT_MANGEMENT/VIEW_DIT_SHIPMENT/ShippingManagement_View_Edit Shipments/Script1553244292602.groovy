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

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/h3_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/a_View  Edit Shipments'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/i_Reset_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/button_Thu Mar 21 2019 1240 AM_btn dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/a_Edit Shipment'))

WebUI.setText(findTestObject('Page_Gito.Me Digital Transformation Platform/input_Metallic Decorations_items87976'), '3')

WebUI.scrollToPosition(500, 500)

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Nice Name_addressfirst_name'), 'pracheeeeee')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Alpha Address_addressalpha_street'), 'pracheeeee')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Alpha Address_addressbeta_street'), 'Bangalore')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_City_addresscity'), 'willington mail center')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Zipcode_addresszipcode'), '5046')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_State_addressstate'), 'lower hutt')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Country_addresscountry'), 'New Zealand')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Phone Number_addressphone'), '0982989983')

WebUI.setText(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Email ID_addressemail'), 'prachee.behera@costprize.com')

WebUI.click(findTestObject('Object Repository/Page_Gito.Me Digital Transformation Platform/input_Shipment Status_shipment_update_button'))

WebUI.delay(6)

WebUI.closeBrowser()

