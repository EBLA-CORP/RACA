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

'خدمة تحويل أموال الأفراد إلى الخارج'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'تحويل أموال الأفراد إلى الخارج')

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_requestType'), 
    'جديد')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_requestType'), 
    Keys.chord(Keys.ENTER))

'نوع الجهة المحول إليها'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_transfereeType'), 
    'فرد')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_transfereeType'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

'بيانات مقدم الطلب (تبويب)'
WebUI.click(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/a_Requester info TAB'))

WebUI.delay(2)

'الاسم بالعربية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__arName'), 'عربي')

'الاسم بالانجليزي '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__enName'), 'Arabi')

'رقم التعريف'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__identificationNumber'), 
    '11411911411')

'بريد الكتروني'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__email'), 'katalon@kat.kat')

'رقم التلفون'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__phone'), '911')

'رقم الجوال'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__mobileNo'), '00974911')

'الجنسية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_nationality'), 
    'قطري')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_nationality'), 
    Keys.chord(Keys.ENTER))

'العنوان'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__address'), 'الدوحة')

WebUI.delay(2)

'الغرض من التحويل (تبويب)'
WebUI.click(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/a_Transfer purpose TAB'))

WebUI.delay(2)

'أضف غرض'
WebUI.click(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/i__add purpose icon (pluss icon)'))

WebUI.delay(2)

'أسم المشروع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__projectName'), 
    'مشروع كاتالون')

WebUI.delay(2)

'نوع المشروع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_projectType'), 
    'انشائية')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_projectType'), 
    Keys.chord(Keys.ENTER))

'مدة التنفيذ (بالأشهر)'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__projectImplementationPeriod'), 
    '12')

'الدولة المستفيدة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_beneficiaryCountry'), 
    'مصر')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_beneficiaryCountry'), 
    Keys.chord(Keys.ENTER))

'بلد التنفيذ'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_executionCountry'), 
    'مصر')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_executionCountry'), 
    Keys.chord(Keys.ENTER))

'التكلفة الاجمالية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__totalCost'), '1000')

'المجال'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_domain'), 'إنسانى')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_domain'), Keys.chord(
        Keys.ENTER))

'اوتشا'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_OCHA'), GlobalVariable.OCHA_Main)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_OCHA'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

'حفظ بيانات الغرض'
WebUI.click(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/button_save purpose'))

WebUI.delay(2)

'البيانات المالية للطلب (تبويب)'
WebUI.click(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/a_Financial transaction info TAB'))

WebUI.delay(2)

'قيمة التحويل بالريال القطري'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__qatariTransactionAmount'), 
    '1000')

'قيمة العملية بعملة التحويل'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__currencyTransferTransactionAmount'), 
    '8.5')

'العملة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_currency1'), 'جنيه مصرى', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_currency1'), Keys.chord(
        Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

'طريقة التحويل'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_transferMethod1'), 
    'بنك', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_transferMethod1'), 
    Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

'اسم جهة التحويل'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__transferringEntityName'), 
    'كاتالون')

'نوع التحويل'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_transferType1'), 
    'مرة واحدة', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_transferType1'), 
    Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

'طالب التحويل  IBAN رقم '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__transferFromIBAN'), 
    '11411911411')

'المحول له  IBAN رقم '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__transfereeIBAN'), 
    '11120111201')

'الدوالة المحول إليها'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_transfer-to-country1'), 
    'مصر', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_transfer-to-country1'), 
    Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'بيانات الشخص المستقبل (تبويب)'
WebUI.click(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/a_Transferee info TAB'))

WebUI.delay(2)

'الاسم باللغة المحلية كما ورد بجواز السفر'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__receiverNameLikePassport'), 
    'كاتالون')

'الاسم باللغة الانجليزية كما ورد بجواز السفر'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__receiverEnglishNameLikePassport'), 
    'katalon')

'المسمى الوظيفي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__receiverJobTitle'), 
    'موظف')

'الجنسية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_receiverNationality'), 
    'مصري', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input_receiverNationality'), 
    Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

'رقم الهوية الوطنية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__receiverIdentificationNumber'), 
    '11120111201')

'رقم جواز السفر'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__receiverPassportNumber'), 
    '11120111201')

'رقم التلفون'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Transferring Individuals Funds Abroad/input__receiverPhone1'), 
    '11120')

WebUI.delay(3)

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

