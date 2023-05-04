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

'تسجيل دخول موظف جمعية'
WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول موظف جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

'خدمة تحويل أموال الأفراد إلى الخارج'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'تحويل أموال الأفراد إلى الخارج')

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_requestType'), 
    'إلغاء')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_requestType'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

'إدخال رقم الرخصة السابق'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__oldLicenseFullSerial'), 
    GlobalVariable.LicenseNumber)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__oldLicenseFullSerial'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

'حفظ الطلب'
WebUI.verifyElementClickable(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/button_Save'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/button_Save'))

WebUI.delay(2)

'التأكد من حفظ الطلب'
WebUI.verifyTextPresent('تم أضافة الطلب بنجاح', false, FailureHandling.OPTIONAL)

'إغلاق نافذة منبثقة إخطار حفظ الطلب'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/button_Close Success Popup'))

'حفظ رقم الطلب وإعطاؤه لمتغير'
GlobalVariable.RequestNumber = WebUI.getText(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/span_Request Number'))

'إرسال الطلب'
WebUI.verifyElementClickable(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/button_Send (Launch)'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/button_Send (Launch)'))

WebUI.delay(5)

'التأكد من إرسال الطلب'
WebUI.verifyElementNotClickable(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/button_Send (Launch)'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Organization Manager_Home Page/i__Home'))

WebUI.click(findTestObject('Organization Manager_Home Page/span_Services Search'))

WebUI.selectOptionByLabel(findTestObject('Organization Manager_Home Page/Services Search/select_Services List'), 'تحويل أموال الأفراد إلى الخارج', 
    false)

WebUI.setText(findTestObject('Organization Manager_Home Page/Services Search/input__Serial number'), GlobalVariable.RequestNumber)

WebUI.click(findTestObject('Organization Manager_Home Page/Services Search/button_Search'))

WebUI.delay(5)

WebUI.rightClick(findTestObject('Licensing Manager/User Inbox/Request Number'))

WebUI.click(findTestObject('Organization Manager_Home Page/Services Search/span_Logs'))

WebUI.delay(5)

GlobalVariable.RemittanceUser = WebUI.getText(findTestObject('Organization Manager_Home Page/Services Search/td_ItemLocation'))

WebUI.delay(2)

WebUI.closeBrowser()

