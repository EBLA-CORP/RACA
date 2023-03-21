import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'تسجيل دخول مدير جمعية'
WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول مدير جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Organization Manager_Home Page/span_team inbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Licensing Manager/User Inbox/Request Number'))

WebUI.delay(5)

WebUI.click(findTestObject('Organization Manager_Home Page/Team Inbox/button_Claim'))

WebUI.delay(3)

WebUI.click(findTestObject('Organization Manager_Home Page/Team Inbox/button_Complete'))

WebUI.delay(2)

WebUI.setText(findTestObject('Licensing Manager/User Inbox/textarea__Complete comment'), 'اكتمال')

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(5)

WebUI.verifyTextNotPresent(GlobalVariable.RequestNumber, false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Organization Manager_Home Page/i__Home'))

WebUI.click(findTestObject('Organization Manager_Home Page/span_Services Search'))

WebUI.selectOptionByLabel(findTestObject('Organization Manager_Home Page/Services Search/select_Services List'), 'إعتماد محصل', 
    false)

WebUI.setText(findTestObject('Organization Manager_Home Page/Services Search/input__Serial number'), GlobalVariable.RequestNumber)

WebUI.click(findTestObject('Organization Manager_Home Page/Services Search/button_Search'))

WebUI.delay(5)

WebUI.rightClick(findTestObject('Licensing Manager/User Inbox/Request Number'))

WebUI.click(findTestObject('Organization Manager_Home Page/Services Search/span_Logs'))

WebUI.click(findTestObject('Organization Manager_Home Page/Services Search/a_Item (request) location'))

GlobalVariable.LicensingSpecialist1st = WebUI.getText(findTestObject('Organization Manager_Home Page/Services Search/td_Item (request) location text'))

WebUI.delay(2)

WebUI.closeBrowser()

