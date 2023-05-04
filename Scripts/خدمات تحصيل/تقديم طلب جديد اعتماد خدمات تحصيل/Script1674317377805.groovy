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

Random rnd = new Random()

randomNumber = (100000 + rnd.nextInt(999999))

WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول موظف جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

'خدمات التحصيل'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'طلب اعتماد خدمات تحصيل')

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'))

WebUI.delay(5)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input__requestType'), 
    'جديد')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input__requestType'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

'نوع خدمة التحصيل) تصنيف الطلب)'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input_requestClassification'), 
    GlobalVariable.CollectionServicesType)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input_requestClassification'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

'نوع الترخيص'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input_licenseType'), 
    'دائمة')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input_licenseType'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

'إضافة عنصر خدمة تحصيل'
WebUI.verifyElementClickable(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/i_addNewCollectionService(plus button)'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/i_addNewCollectionService(plus button)'))

WebUI.delay(2)

'تفاصيل الموقع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input__locationDetails'), 
    'تفاصيل')

WebUI.delay(2)

'المنطقة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input__plateZone'), 
    '1')

'الشارع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input__plateStreet'), 
    '1')

'المبنى'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input__plateBuildingNo'), 
    '1')

'الوحدة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input__plateUnit'), 
    '1')

WebUI.delay(2)

'رقم التعريف (عشوائي)'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input__identificationNumber'), 
    String.valueOf(randomNumber))

WebUI.delay(2)

'إضافة إحداثيات الموقع'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button__locationMap'))

WebUI.delay(10)

WebUI.rightClick(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/MapNavigator'))

WebUI.delay(3)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_addMark'))

WebUI.delay(3)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_saveLocation'))

WebUI.delay(2)

'"إضافة (اعتماد) "للعنصر المدخل بياناته'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_finalAddCollectionService'))

WebUI.delay(2)

'حفظ الطلب'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_save'))

WebUI.delay(3)

'التأكد من رسالة نجاح حفظ الطلب'
WebUI.verifyTextPresent('تم أضافة الطلب بنجاح', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_closeRequestSuccessAddMsg (popup)'))

'استخراج الرقم التسلسلي المولد للطلب وإعطاؤه لمتغير'
GlobalVariable.RequestNumber = WebUI.getText(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/span_requestSerialNumber'))

WebUI.delay(3)

'إضافة مرفقات العنصر'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/i_attachmentSymbol(for added collection service)'))

'المرفق الإجباري الأول'
WebUI.delay(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(3)

robot.keyPress(KeyEvent.VK_ESCAPE)

robot.keyRelease(KeyEvent.VK_ESCAPE)

WebUI.uploadFile(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input_file'), GlobalVariable.UploadFile)

WebUI.delay(3)

'المرفق الإجباري الثاني'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(3)

robot.keyPress(KeyEvent.VK_ESCAPE)

robot.keyRelease(KeyEvent.VK_ESCAPE)

WebUI.uploadFile(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input_file'), GlobalVariable.UploadFile)

WebUI.delay(3)

'المرفق الإجباري الثالث'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(3)

robot.keyPress(KeyEvent.VK_ESCAPE)

robot.keyRelease(KeyEvent.VK_ESCAPE)

WebUI.uploadFile(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input_file'), GlobalVariable.UploadFile)

WebUI.delay(3)

'المرفق الإجباري الرابع'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB))

WebUI.delay(2)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(3)

robot.keyPress(KeyEvent.VK_ESCAPE)

robot.keyRelease(KeyEvent.VK_ESCAPE)

WebUI.uploadFile(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input_file'), GlobalVariable.UploadFile)

WebUI.delay(3)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_CloseAttachmentsPage'))

WebUI.delay(2)

'إضافة المرفق الإجباري في تبويب المرفقات'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/a_AttachmentsTAB'))

WebUI.delay(5)

WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_MandatoryAttachment(TAB)'))

WebUI.delay(3)

robot.keyPress(KeyEvent.VK_ESCAPE)

robot.keyRelease(KeyEvent.VK_ESCAPE)

WebUI.uploadFile(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/input_NA_attachmentUploader'), 
    GlobalVariable.UploadFile)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_Launch (send request)'), 
    FailureHandling.OPTIONAL)

'إرسال الطلب'
WebUI.click(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_Launch (send request)'))

WebUI.delay(5)

WebUI.verifyElementNotClickable(findTestObject('Organization Emploee_Home Page/Collection Services/Collection Services/button_Launch (send request)'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.closeBrowser()

