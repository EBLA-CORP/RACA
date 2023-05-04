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

def tomorrow_Date = date +1

def day = date[Calendar.DAY_OF_MONTH]

def tomorrow = tomorrow_Date[Calendar.DAY_OF_MONTH]

GlobalVariable.CalendarDay = String.valueOf(day)

GlobalVariable.TomorrowDay = String.valueOf(tomorrow)


WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول موظف جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

'خدمة اعتماد جهة شريكة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'طلب اعتماد جهة شريكة')

WebUI.delay(2)

'الدخول للخدمة'
WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'))

WebUI.delay(5)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__requestType'), 'جديد')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__requestType'), Keys.chord(Keys.ENTER))

'تصنيف الجهة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__requestClassification'), GlobalVariable.Request_Classification)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__requestClassification'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

'الاسم بالعربية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__arName'), 'جهة شريكة كاتالون')

'الانجليزية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__enName'), 'Katalon Partner')

'الدولة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__country'), 'قطر')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__country'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

'الولاية/المقاطعه'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__address'), 'الدوحة')

'مدينة / قرية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__city'), 'الدوحة')

'نوع المقر الرئيسي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__headQuarterType'), 'رئيسى')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__headQuarterType'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

'الحي/ الشارع/ المبنى'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__region'), 'الدوحة الجديدة')

'تاريخ التأسيس'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/div__establishmentDate'))

WebUI.delay(1)

WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/td_CalendarDay'))

'احداثيات خط الطول / احداثيات دائرة العرض'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/button__locationMap'))

WebUI.delay(10)

'إضافة موقع على الخريطة'
WebUI.rightClick(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/MapNavigator'))

WebUI.delay(3)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_addMark'))

WebUI.delay(3)

'حفظ الموقع المضاف على الخريطة'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_saveLocation'))

WebUI.delay(2)

'رقم التلفون '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__phone'), '00974')

'رقم الفاكس'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__fax'), '00974')

'الموقع الإلكتروني'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__website'), 'www.kat.kat')

'بريد الكتروني'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__email'), 'kat@kat.kat')

'صندوق بريد '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__postalCode'), '100100')

'وسائل التواصل الاجتماعي 1'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__firstSocialMedia'), 'kat@kat.kat')

'الشروحات الخاصة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/textarea__description'), 'شروحات خاصة')

WebUI.delay(1)

'تبويب بيانات الحسابات البنكية'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/a_Bank Details TAB'))

WebUI.delay(1)

'إضافة بيانات حسابات بنكية'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/i__Add bank details (plus-box)'))

WebUI.delay(1)

'اسم البنك'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__bankName'), 'اتش اس بي سي')

'رقم الحساب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__accountNumber'), '12345678')

'IBAN '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__iBan'), '12345678')

'Swift Code'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__swiftCode'), '12345678')

'الدولة '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__country (1)'), 'قطر')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__country (1)'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

'العملة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__currency'), GlobalVariable.Currency)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__currency'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

'اسم الجهة بالبنك'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__partnerName'), 'جهة بنك')

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(1)

'تبويب الأهداف ومجالات العمل'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/a_Goals TAB'))

WebUI.delay(1)

'إضافة هدف'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/i__Add goal (plus-box)'))

WebUI.delay(1)

'الهدف'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__goal'), 'هدف')

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(1)

'إضافة مجال'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/i__Add domain (plus-box)'))

WebUI.delay(1)

'المجال'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__domain'), 'إنسانى')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__domain'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

'تصنيف UNOCHA الرئيسي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__mainUNOCHACategory'), GlobalVariable.OCHA_Main)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__mainUNOCHACategory'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(1)

'إضافة بيانات الفئات المستهدفة'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/i__Add target group (plus-box)'))

WebUI.delay(1)

'الخدمات'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__services'), 'خدمة')

'الفئات المستخدمة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/textarea__targetedGroup'), 'فئات مستهدفة')

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(1)

'إضافة مناطق العمل'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/i__Add work area (plus-box)'))

WebUI.delay(1)

'الدولة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__country (2)'), 'قطر')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__country (2)'), Keys.chord(Keys.ENTER))

'المنطقة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__region (1)'), 'الدوحة')

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(1)

'تبويب بيانات مجلس الإدارة'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/a_Management councils TAB'))

WebUI.delay(1)

'إضافة بيانات مجلس الإدارة'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/i__Add council details (plus-box)'))

WebUI.delay(1)

'الاسم بالعربية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__arabicName'), 'مجلس إدارة')

'الإسم بالانجليزي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__englishName'), 'Management Council')

'رقم التلفون'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__phone (1)'), '00974')

'بريد الكتروني'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__email (1)'), 'kat@kat.kat')

'الجنسية '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__nationality'), 'قطري')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__nationality'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

'المسمي الوظيفي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__jobTitle'), 'مدير مجلس الإدارة')

'رقم جواز السفر'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__passportNumber'), 'N1234567890')

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(1)

'تبويب بيانات الإدارة التنفيذية'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/a_Management executives TAB'))

WebUI.delay(1)

'إضافة بيانات الإدارة التنفيذية'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/i__Add executives details (plus-box)'))

WebUI.delay(1)

'الاسم بالعربية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__arabicName'), 'إدارة تنفيذية')

'الإسم بالانجليزي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__englishName'), 'Executive Management ')

'رقم التلفون'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__phone (1)'), '00974')

'بريد الكتروني'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__email (1)'), 'kat@kat.kat')

'الجنسية '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__nationality'), 'قطري')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Partner Approval/input__nationality'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

'المسمي الوظيفي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__jobTitle'), 'مدير الإدارة التنفيذية')

'رقم جواز السفر'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__passportNumber'), 'N1234554321')

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(1)

'تبويب بيانات ضابط الاتصال'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/a_Contact officer TAB'))

WebUI.delay(1)

'إضافة بيانات ضابط الاتصال'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/i__Add contact officer details (plus-box)'))

WebUI.delay(1)

'الاسم بالعربية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__arabicName (1)'), 'ضابط اتصال')

'الإسم بالانجليزي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__englishName (1)'), 'Contact Officer')

'رقم التلفون'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__phone (2)'), '00974')

'بريد الكتروني'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__email (2)'), 'kat@kat.kat')

'رقم جواز السفر'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/input__passportNumber (1)'), 'N1122334455')

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(1)

'تبويب مبررات طلب الموافقة'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/a_Approval reasons TAB'))

WebUI.delay(1)

'إضافة مبررات طلب الموافقة'
WebUI.click(findTestObject('Organization Emploee_Home Page/Partner Approval/i__Add approval reason (plus-box)'))

WebUI.delay(1)

'المشاريع المقترح تنفيذها '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/textarea__projects'), 'مشروع أوتوماشن')

'نتائج البحث الاحترازي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/textarea__research'), 'لا مخاطر')

'افادة الزيارة الميدانية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Partner Approval/textarea__fieldVisit'), 'مطابق للمواصفات')

WebUI.delay(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(2)

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

