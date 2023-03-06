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

WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول موظف جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Organization Emploee_Home Page/span_Team Inbox'))

WebUI.delay(2)

WebUI.rightClick(findTestObject('Organization Manager_Home Page/User Inbox/Request Number'))

WebUI.click(findTestObject('Organization Emploee_Home Page/Team Inbox/i__Claim symbol (right click)'))

WebUI.click(findTestObject('Organization Emploee_Home Page/Team Inbox/i__Refresh (reload)'))

WebUI.delay(3)

WebUI.verifyTextNotPresent(GlobalVariable.RequestNumber, false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Organization Emploee_Home Page/icon__Home (Arabic UI)'))

WebUI.delay(GlobalVariable.DelayTime3)

WebUI.click(findTestObject('Organization Emploee_Home Page/a_User Inbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/User Inbox/i__Refresh (reload)'))

WebUI.delay(2)

WebUI.click(findTestObject('Organization Manager_Home Page/User Inbox/Request Number'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Organization Emploee_Home Page/User Inbox/span_Status field'), 'اعتماد نهائي', FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('رخصة', false, FailureHandling.OPTIONAL)

WebUI.verifyTextPresent(GlobalVariable.RequestNumber, false, FailureHandling.OPTIONAL)

GlobalVariable.LicenseNumber = WebUI.getText(findTestObject('Organization Emploee_Home Page/User Inbox/span_License number field'))

WebUI.click(findTestObject('Organization Emploee_Home Page/User Inbox/a_Show license'))

WebUI.delay(5)

WebUI.verifyTextPresent(GlobalVariable.LicenseNumber, false, FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('تحديث', false, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Organization Emploee_Home Page/User Inbox/span_Complete'))

WebUI.setText(findTestObject('Organization Emploee_Home Page/User Inbox/textarea__Complete comment'), 'مغلق')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Organization Emploee_Home Page/User Inbox/i__Refresh (reload)'))

WebUI.delay(3)

WebUI.verifyTextNotPresent(GlobalVariable.RequestNumber, false, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

