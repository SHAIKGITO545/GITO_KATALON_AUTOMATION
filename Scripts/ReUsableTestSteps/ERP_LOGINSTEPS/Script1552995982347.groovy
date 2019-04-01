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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://admin.erda.gitodemos.com/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/HOMEPAGE/Page_GitoMe Digital Transformation Platform/input_Email_email'), 
    'prachee.behera@costprize.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HOMEPAGE/Page_GitoMe Digital Transformation Platform/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/HOMEPAGE/Page_GitoMe Digital Transformation Platform/input_Remember Me_remember'))

WebUI.click(findTestObject('Object Repository/HOMEPAGE/Page_GitoMe Digital Transformation Platform/button_Submit'))

