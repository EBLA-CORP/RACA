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

'خدمات التحصيل'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'إعتماد حساب بنك داخلي')

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_RequestType'), 
    'الغاء')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_RequestType'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input_RequestType'), 
    Keys.chord(Keys.TAB))

WebUI.delay(2)

'إدخال رقم الحساب المراد إلغاؤه'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input__bankAccountSearchCriteria'), 
    '203570005')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/input__bankAccountSearchCriteria'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/a_SpecialExplanations TAB'))

'الشروحات الخاصة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/textarea__description (special explanations TAB)'), 
    'كاتالون')

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Organization Emploee_Home Page/Projects Services/Internal Bank Account Approval/button_Save'), 
    FailureHandling.OPTIONAL)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
