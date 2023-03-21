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
import java.text.SimpleDateFormat as SimpleDateFormat

def date = new Date()

def day = date[Calendar.DAY_OF_MONTH]

GlobalVariable.CalendarDay = String.valueOf(day)

'تسجيل دخول موظف جمعية'
WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول موظف جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

'خدمات التحصيل'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'إعتماد حساب بنك داخلي')

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_RequestType'), 
    'جديد')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_RequestType'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_RequestType'), 
    Keys.chord(Keys.TAB))

WebUI.delay(2)

'نوع العملية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_OperationType'), 
    'حساب جديد')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_OperationType'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_OperationType'), 
    Keys.chord(Keys.TAB))

WebUI.delay(2)

'نوع الحساب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_AccountType'), 
    'رئيسي')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_AccountType'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_AccountType'), 
    Keys.chord(Keys.TAB))

WebUI.delay(2)

'اسم البنك'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_BankName'), 
    GlobalVariable.BankName)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_BankName'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_BankName'), 
    Keys.chord(Keys.TAB))

WebUI.delay(2)

'العملة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_Currency'), 
    GlobalVariable.Currency)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_Currency'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_Currency'), 
    Keys.chord(Keys.TAB))

WebUI.delay(2)

'الهدف'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/textarea__purpose'), 
    'كاتالون')

WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/a_SpecialExplanations TAB'))

WebUI.delay(2)

'الشروحات الخاصة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/textarea__description (special explanations TAB)'), 
    'كاتالون')

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/button_Save'), 
    FailureHandling.OPTIONAL)

'حفظ'
WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/button_Save'))

WebUI.delay(3)

'التأكد من حفظ الطلب'
WebUI.verifyTextPresent('تم أضافة الطلب بنجاح', false, FailureHandling.OPTIONAL)

'إغلاق نافذة منبثقة إخطار حفظ الطلب'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/button_Close Success Popup'))

'حفظ رقم الطلب وإعطاؤه لمتغير'
GlobalVariable.RequestNumber = WebUI.getText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/span_Request Number'))

'إرسال الطلب'
WebUI.verifyElementClickable(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/button_Launch (send)'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/button_Launch (send)'))

WebUI.delay(5)

'التأكد من إرسال الطلب'
WebUI.verifyElementNotClickable(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/button_Launch (send)'), 
    FailureHandling.OPTIONAL)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

