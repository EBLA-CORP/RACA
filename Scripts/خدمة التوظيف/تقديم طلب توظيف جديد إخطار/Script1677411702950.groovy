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

Random rnd = new Random()

randomNumber = (100000000000 + rnd.nextInt())

'حفظ الرقم العشوائي وإعطاؤه لمتغير (رقم الحساب الديناميكي)'
GlobalVariable.Employee_ID = String.valueOf(randomNumber)

'تسجيل دخول موظف جمعية'
WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول موظف جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

'خدمة طلبات التوظيف'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'طلبات التوظيف')

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'تبويب بيانات الموظف'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/a_Employee Data TAB'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'إضافة موظف'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/h1_addNewEmployee'))

WebUI.delay(3)

'نوع التعريف'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_ID Type'), 'جواز سفر')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_ID Type'), Keys.chord(Keys.ENTER))

'رقم التعريف'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input__passportNumber'), GlobalVariable.Employee_ID)

'تاريخ انتهاء صلاحية رقم التعريف'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/div__ExpIdPass'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/td_CalendarDay'))

'الاسم بالعربية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input__arabicName'), 'موظف كاتالون')

'الاسم بالانجليزية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input__englishName'), 'Katalon Employee')

'الجنسية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_Nationality'), 'قطري')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_Nationality'), Keys.chord(Keys.ENTER))

'الجنس'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_gender'), 'ذكر')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_gender'), Keys.chord(Keys.ENTER))

'رقم التلفون'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input__phone'), '0971')

WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input__jobNumber'), GlobalVariable.Employee_ID)

'المجموعة الوظيفية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_functionalGroup'), 'الوظائف القياديه')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_functionalGroup'), Keys.chord(Keys.ENTER))

'الإدارة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input__department'), 'إدارة كاتالون')

'المسمى الوظيفي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_jobTitle'), 'مدير')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_jobTitle'), Keys.chord(Keys.ENTER))

'نوع موقع العقد'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_contractLocationType'), 'داخلي')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_contractLocationType'), Keys.chord(Keys.ENTER))

'مكان التعاقد'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input__contractLocation'), 'قطر')

'نوع (مدة) العقد'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_contractPeriod'), 'دائم')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_contractPeriod'), Keys.chord(Keys.ENTER))

'نوع عقد العمل'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_employmentContractType'), 'عقد توظيف')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_employmentContractType'), Keys.chord(Keys.ENTER))

'حالة العقد'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Employment/input_contractStatus'), 'قيد العمل')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Employment/input_contractStatus'), Keys.chord(Keys.ENTER))

'تاريخ بدء العمل'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/div__workStartDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/td_CalendarDay'))

WebUI.delay(2)

'إضافة الموظف'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/button_submitEmployee'))

'حفظ الإضافة (ات)'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/button_SaveAddedEmployees'))

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

