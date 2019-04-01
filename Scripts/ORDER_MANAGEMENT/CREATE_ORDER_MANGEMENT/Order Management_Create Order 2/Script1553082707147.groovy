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

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/h3_Order Management (5) (1)'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/a_Create Order  Sales Bill (1) (1)'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/i_Out Of Stock_fa fa-plus'))

WebUI.setText(findTestObject('Page_Gito.Me Digital Transformation Platform/input_NZD_form-control'), '3')

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/button_NZD_btn btn-primary'))

WebUI.scrollToPosition(600, 600)

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/a_User Details (Mandatory) (2)'))

WebUI.setText(findTestObject('Page_Gito.Me Digital Transformation Platform/input_Email_search_email'), 'shaik@gito.me')

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/input_Phone_btn'))

WebUI.setText(findTestObject('Page_Gito.Me Digital Transformation Platform/input_Last name_userLastName'), 'irfan')

WebUI.scrollToPosition(300, 300)

WebUI.setText(findTestObject('Page_Gito.Me Digital Transformation Platform/textarea_Special instructions_flexValue109'), 'pack the product with care')

WebUI.selectOptionByIndex(findTestObject('Page_Gito.Me Digital Transformation Platform/select_Choose Address'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(100, 100)

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/input_Zip  Postal Code_btn btn-block btn-success'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/div_    Well done    Order Successfully Placed'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/h3_Order Management'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/a_View  Edit All Orders'))

