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

WebUI.click(findTestObject('Page_GitoMe Digital Transformation Platform/h3_Order Management'))

WebUI.click(findTestObject('Page_GitoMe Digital Transformation Platform/a_Create Order  Sales Bill'))

WebUI.click(findTestObject('Page_GitoMe Digital Transformation Platform/i_Out Of Stock_fa fa-plus'))

WebUI.setText(findTestObject('Page_GitoMe Digital Transformation Platform/input_NZD_variant-87972'), '780')

WebUI.setText(findTestObject('Page_GitoMe Digital Transformation Platform/input_NZD_form-control'), '3')

WebUI.click(findTestObject('Page_GitoMe Digital Transformation Platform/button_NZD_btn btn-primary btn-sm create-order-add-to-cart'))

WebUI.scrollToPosition(300, 300)

WebUI.click(findTestObject('Page_GitoMe Digital Transformation Platform/a_User Details (Optional)'))

WebUI.setText(findTestObject('Page_GitoMe Digital Transformation Platform/input_First name_userFirstName'), 'shaik')

WebUI.rightClick(findTestObject('Page_GitoMe Digital Transformation Platform/input_Last name_userLastName'))

WebUI.setText(findTestObject('Page_GitoMe Digital Transformation Platform/input_Last name_userLastName'), 'shreyas')

WebUI.setText(findTestObject('Page_GitoMe Digital Transformation Platform/input_Email_userEmail'), 'shrey@gmail.com')

WebUI.setText(findTestObject('Page_GitoMe Digital Transformation Platform/input_Phone_userPhone'), '1212121218')

WebUI.setText(findTestObject('Page_GitoMe Digital Transformation Platform/textarea_Special instructions_flexValue109'), 'helooooooo')

WebUI.click(findTestObject('Page_GitoMe Digital Transformation Platform/input_Special instructions_btn btn-block btn-success'))

WebUI.click(findTestObject('Page_GitoMe Digital Transformation Platform/div_    Well done    Order Successfully Placed'))

WebUI.delay(10)

WebUI.closeBrowser()

