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

Random rnd = new Random()

randomNumber = (1000 + rnd.nextInt(9999))


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
WebUI.setText(findTestObject('Organization Emploee_Home Page/External Office Approval/input__externalOfficeName'), 'مكتب كاتالون' + GlobalVariable.RandomNumber)


