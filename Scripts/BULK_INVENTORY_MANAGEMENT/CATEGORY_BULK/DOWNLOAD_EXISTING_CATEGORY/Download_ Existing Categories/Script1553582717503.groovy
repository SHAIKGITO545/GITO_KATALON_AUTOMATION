import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('ReUsableTestSteps/ERP_LOGINSTEPS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(300, 300)

WebUI.click(findTestObject('Object Repository/BULK_INVONTORY_WEB_OBJECTS/Page_Gito.Me Digital Transformation Platform/h3_Bulk Inventory'))

WebUI.click(findTestObject('Object Repository/BULK_INVONTORY_WEB_OBJECTS/Page_Gito.Me Digital Transformation Platform/span_Category Bulk_pull-right fa fa-angle-down'))

WebUI.click(findTestObject('Object Repository/BULK_INVONTORY_WEB_OBJECTS/Page_Gito.Me Digital Transformation Platform/a_Download Existing Categories'))

WebUI.click(findTestObject('Object Repository/BULK_INVONTORY_WEB_OBJECTS/Page_Gito.Me Digital Transformation Platform/button_Download Existing Category'))

KeywordLogger log=new KeywordLogger()

log.logInfo("Dwonloaded Existing Categoru Successfully")

WebUI.delay(7)