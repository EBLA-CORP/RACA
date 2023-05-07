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

def tomorrow_Date = date + 1

def day = date[Calendar.DAY_OF_MONTH]

def tomorrow = tomorrow_Date[Calendar.DAY_OF_MONTH]

GlobalVariable.CalendarDay = String.valueOf(day)

GlobalVariable.TomorrowDay = String.valueOf(tomorrow)

Random rnd = new Random()

randomNumber = (0 + rnd.nextInt(9999))

GlobalVariable.RandomNumber = String.valueOf(randomNumber)

WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول موظف جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

'خدمة اعتماد نهائي لمكتب خارجي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'طلب اعتماد نهائي لمكتب خارجي')

WebUI.delay(2)

'الدخول للخدمة'
WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'))

WebUI.delay(5)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__requestType'), 'جديد')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/External Office Approval/input__requestType'), Keys.chord(
        Keys.ENTER))

' اسم المكتب الخارجي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__externalOfficeName'), 'مكتب كاتالون' + 
    GlobalVariable.RandomNumber)

'الدولة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__country'), 'قطر')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/External Office Approval/input__country'), Keys.chord(Keys.ENTER))

'المنطقة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__region'), 'الريان')

'تاريخ التأسيس'
WebUI.click(findTestObject('Organization Emploee_Home Page/External Office Approval/div__establishmentDate'))

WebUI.delay(1)

WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/td_CalendarDay'))

'نوع المكتب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__headQuarterType'), 'وطني')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/External Office Approval/input__headQuarterType'), Keys.chord(
        Keys.ENTER))

'مدة الترخيص'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__licenseDurationType'), 'مؤقته')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/External Office Approval/input__licenseDurationType'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__licenseDuration'), '1')

WebUI.delay(1)

'الشروحات الخاصة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/textarea__description'), 'شروحات خاصة')

WebUI.delay(1)

'تبويب بيانات الحسابات البنكية'
WebUI.click(findTestObject('Organization Emploee_Home Page/External Office Approval/a_Bank details TAB'))

WebUI.delay(1)

'إضافة بيانات الحسابات البنكية'
WebUI.click(findTestObject('Organization Emploee_Home Page/External Office Approval/i__Add bank details (plus-box)'))

WebUI.delay(1)

'اسم البنك'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__bankName'), 'اتش اس بي سي')

'رقم الحساب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__accountNumber'), '87654321')

'IBAN'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__iBan'), '87654321')

'Swift Code'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__swiftCode'), '87654321')

'الدولة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__country (1)'), 'قطر')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/External Office Approval/input__country (1)'), Keys.chord(
        Keys.ENTER))

'العملة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__currency'), GlobalVariable.Currency)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/External Office Approval/input__currency'), Keys.chord(Keys.ENTER))

'فئة البنك'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__category'), 'رئيسى')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/External Office Approval/input__category'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(1)

'تبويب بيانات مديري المكتب والمخولين بالتوقيع'
WebUI.click(findTestObject('Organization Emploee_Home Page/External Office Approval/a_Authorized Signatories TAB'))

WebUI.delay(1)

'إضافة مديري المكتب والمخولين بالتوقيع'
WebUI.click(findTestObject('Organization Emploee_Home Page/External Office Approval/i__Add authorized Signatory details (plus-box)'))

WebUI.delay(1)

'الاسم بالعربية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__arabicName'), 'مخول بالتوقيع')

'الإسم بالانجليزي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__englishName'), 'Authorized Signatory')

'رقم التلفون'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__phone'), '00974')

'بريد الكتروني'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__email'), 'auth@auth.auth')

'الجنسية '
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__nationality'), 'قطري')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/External Office Approval/input__nationality'), Keys.chord(
        Keys.ENTER))

'المسمى الوظيفي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__jobTitle'), 'مخول بالتوقيع لمكتب خارجي')

'رقم جواز السفر'
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__passportNumber'), 'N77447744')

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(1)

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

WebUI.closeBrowser()

