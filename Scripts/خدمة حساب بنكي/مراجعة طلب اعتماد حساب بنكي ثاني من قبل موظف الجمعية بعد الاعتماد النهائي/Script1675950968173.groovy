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

'الدخول لبريد المجموعة'
WebUI.click(findTestObject('Organization Manager_Home Page/span_team inbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Licensing Manager/User Inbox/Request Number'))

WebUI.delay(5)

'مطالبة للطلب'
WebUI.click(findTestObject('Organization Manager_Home Page/Team Inbox/button_Claim'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/span_Status field'), 
    'اعتماد نهائي', FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('رخصة', false, FailureHandling.OPTIONAL)

WebUI.verifyTextPresent(GlobalVariable.RequestNumber, false, FailureHandling.OPTIONAL)

'استخراج رقم الترخيص وإعطاؤه لمتغير'
GlobalVariable.LicenseNumber2 = WebUI.getText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/span_license number field'))

'فتح الرخصة'
WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/a_Show license'))

WebUI.delay(5)

WebUI.verifyTextPresent(GlobalVariable.LicenseNumber2, false, FailureHandling.OPTIONAL)

WebUI.verifyTextPresent(GlobalVariable.BankName, false, FailureHandling.OPTIONAL)

WebUI.verifyTextPresent(GlobalVariable.Currency, false, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/button_Complete'))

'اكتمال'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/textarea__comment'), 
    'مغلق')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(5)

WebUI.verifyTextNotPresent(GlobalVariable.RequestNumber, false, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

