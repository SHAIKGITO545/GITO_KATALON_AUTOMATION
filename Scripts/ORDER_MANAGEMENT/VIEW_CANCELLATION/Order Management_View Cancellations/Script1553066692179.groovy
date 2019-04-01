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

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/h3_Order Management (9) (2)'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/a_View  Edit All Orders (6) (2)'))

WebUI.scrollToPosition(300, 300)

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/input_Print Invoice_updateOrder (1)'))

WebUI.selectOptionByValue(findTestObject('Page_Gito.Me Digital Transformation Platform/select_Payment Received (1)'), 'REFUND_PROCESSED', true)

WebUI.selectOptionByValue(findTestObject('Page_Gito.Me Digital Transformation Platform/select_Payment Received (1)'), 'CANCELLED', true)

WebUI.selectOptionByValue(findTestObject('Page_Gito.Me Digital Transformation Platform/select_Payment Received (1)'), 'CART_INPROGRESS', true)

WebUI.selectOptionByValue(findTestObject('Page_Gito.Me Digital Transformation Platform/select_Payment Received (1)'), 'CANCELLED', true)

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/input_NZD_btn btn-primary btn-sm (1)'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/Order updated successfully.Mail has been sent successfully (1)'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/h3_Order Management (10)'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/a_View Cancellations (1)'))

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/a_482-0152c775-fcac-46a7-a8c1-d8feb9a58d8b'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('Page_Gito.Me Digital Transformation Platform/a_Print Invoice'))

WebUI.navigateToUrl('http://admin.erda.gitodemos.com/manage/invoice/482')

WebUI.scrollToPosition(400, 400)

WebUI.delay(10)

WebUI.closeBrowser()

