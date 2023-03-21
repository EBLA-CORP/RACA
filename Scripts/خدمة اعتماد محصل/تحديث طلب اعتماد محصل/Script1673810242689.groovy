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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

Robot robot = new Robot()

WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول موظف جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

'خدمات التحصيل'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'إعتماد محصل')

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'))

WebUI.delay(5)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/input_RequestType'), 
    'تحديث')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/input_RequestType'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/input_RequestType'), 
    Keys.chord(Keys.TAB))

WebUI.delay(2)

'نوع الترخيص'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/input_LicenseType'), 
    'دائمة')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/input_LicenseType'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/input_LicenseType'), 
    Keys.chord(Keys.TAB))

WebUI.delay(2)

'إضافة محصل'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/i__plus-box (add collector)'))

WebUI.delay(2)

'رقم الرخصة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/input__oldLicenseFullSerial'), 
    GlobalVariable.LicenseNumber)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/input__oldLicenseFullSerial'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

'إضافة المحصل'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/button_addCollector'))

WebUI.verifyElementClickable(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/button_Save'), 
    FailureHandling.OPTIONAL)

'حفظ الطلب'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'التأكد من حفظ الطلب'
WebUI.verifyTextPresent('تم أضافة الطلب بنجاح', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/button_Close (success save, new serial popup)'))

'حفظ رقم الطلب وإعطاؤه لمتغير'
GlobalVariable.RequestNumber = WebUI.getText(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/span_SerialNumber'))

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/a_AttachmentsTAB'))

'إرفاق ملف'
WebUI.waitForElementVisible(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/button_uploadMandatoryAttchment(link test)'), 
    3)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/button_uploadMandatoryAttchment(link test)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

robot.keyPress(KeyEvent.VK_ESCAPE)

robot.keyRelease(KeyEvent.VK_ESCAPE)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/input_NA_attachmentUploader'), 
    GlobalVariable.UploadFile)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/button_Launch (send request)'), 
    FailureHandling.OPTIONAL)

'إرسال الطلب'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/button_Launch (send request)'))

WebUI.delay(5)

WebUI.verifyElementNotClickable(findTestObject('Organization Emploee_Home Page/Collection Services/Collector Approval/button_Launch (send request)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.closeBrowser()

