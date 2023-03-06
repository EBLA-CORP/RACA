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

//Call Test Case
'تسجيل دخول موظف جمعية'
WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول موظف جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

'خدمات التحصيل'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'جمع تبرعات')

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/mark_Fundraising'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/input__requestType'), 'جديد')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/input__requestType'), Keys.chord(
        Keys.TAB))

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/input__requestType'), Keys.chord(
        Keys.TAB))

WebUI.delay(2)

'نوع الترخيص'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/input__licenseDurationType'), 
    'دائمة')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/input__licenseDurationType'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/input__licenseDurationType'), 
    Keys.chord(Keys.TAB))

WebUI.delay(2)

'الاسم عربي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/input__arName'), 'عربي')

WebUI.delay(2)

'الاسم انجليزي'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/input__enName'), 'english')

WebUI.delay(2)

'مقدمة للقناة/الوسائط الجديدة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/textarea__about'), 'نص')

WebUI.delay(2)

'تقييم المخاطر للقناة / وسائل الإعلام الجديدة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/textarea__riskAssessment'), 
    'نص')

WebUI.delay(2)

'كيف تعمل القناة / الوسائط الجديدة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/textarea__workingMechanism'), 
    'نص')

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

WebUI.delay(3)

'التأكد من إرسال الطلب'
WebUI.verifyElementNotClickable(findTestObject('Organization Emploee_Home Page/Collection Services/Fundraising/button_Send (Launch)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.closeBrowser()

