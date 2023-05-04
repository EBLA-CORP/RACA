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

'خدمة طلبات التوظيف'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'طلبات التوظيف')

WebUI.delay(2)

'الدخول للخدمة'
WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'تصنيف الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_requestCategory'), 'تصريح')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_requestCategory'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_requestType'), 'تحديث')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_requestType'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

'تأكيد إعادة النموذج'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/button_formResetAcceptance (yes button)'))

WebUI.delay(2)

'تبويب بيانات الموظف'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/a_Employee Data TAB'))

'إدخال رقم جواز السفر للموظف المطلوب إظهار بياناته'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input__passportNumber(update)'), GlobalVariable.Employee_ID)

'النقر عى زر عرض لإظهار بيانات الموظف'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/i__search (Employee passport or ID)'))

WebUI.delay(2)

'حفظ الطلب'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/button_Save'))

WebUI.delay(3)

'التأكد من حفظ الطلب'
WebUI.verifyTextPresent('تم أضافة الطلب بنجاح', false, FailureHandling.OPTIONAL)

'إغلاق نافذة منبثقة إخطار حفظ الطلب'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/button_closeSuccessPopup'))

'حفظ رقم الطلب وإعطاؤه لمتغير'
GlobalVariable.RequestNumber = WebUI.getText(findTestObject('Organization Emploee_Home Page/Employment/span_requestSerial'))

'إرسال الطلب'
WebUI.verifyElementClickable(findTestObject('Organization Emploee_Home Page/Employment/button_sendRequest (launch)'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/button_sendRequest (launch)'))

WebUI.delay(3)

'التأكد من إرسال الطلب'
WebUI.verifyElementNotClickable(findTestObject('Organization Emploee_Home Page/Employment/button_sendRequest (launch)'), 
    FailureHandling.OPTIONAL)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

