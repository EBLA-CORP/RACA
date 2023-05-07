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

WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول أخصائي تراخيص 3'), [:], FailureHandling.STOP_ON_FAILURE)

'بريد المستخدم'
WebUI.click(findTestObject('Organization Manager_Home Page/span_user inbox'))

WebUI.delay(3)

'الدخول للطلب'
WebUI.click(findTestObject('Licensing Specialist/User Inbox/Request Number (static for test)'))

WebUI.delay(5)

'الضغط على زر موافقة'
WebUI.click(findTestObject('Licensing Specialist/User Inbox/button_Accept'))

WebUI.delay(2)

'مدة الترخيص'
WebUI.setText(findTestObject('Licensing Specialist/User Inbox/input__licenseDuration (1)'), '1')

WebUI.delay(1)

'تاريخ بداية الرخصة'
WebUI.click(findTestObject('Licensing Specialist/User Inbox/div__licenseStartDate (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'اختيار تاريخ اليوم'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/td_CalendarDay'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'تاريخ المتابعة'
WebUI.click(findTestObject('Licensing Specialist/User Inbox/div__followUpDate (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'اختيار تاريخ اليوم'
WebUI.click(findTestObject('Organization Emploee_Home Page/Employment/td_CalendarDay'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'إدخال الشروط المخصصة'
WebUI.setText(findTestObject('Licensing Specialist/User Inbox/textarea__customTerms (1)'), 'شروط مخصصة')

'التعليق'
WebUI.setText(findTestObject('Licensing Specialist/User Inbox/textarea__comment'), 'موافقة موظف التراخيص')

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(10)

WebUI.verifyTextNotPresent(GlobalVariable.RequestNumber, false, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

