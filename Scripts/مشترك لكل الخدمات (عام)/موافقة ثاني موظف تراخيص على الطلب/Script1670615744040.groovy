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

switch (GlobalVariable.LicensingSpecialist2nd) {
    case GlobalVariable.switch_LicensingUser1:
        WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول أخصائي تراخيص 1'), [:], FailureHandling.STOP_ON_FAILURE)

        break
    case GlobalVariable.switch_LicensingUser2:
        WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول أخصائي تراخيص 2'), [:], FailureHandling.STOP_ON_FAILURE)

        break
    case GlobalVariable.switch_LicensingUser3:
        WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول أخصائي تراخيص 3'), [:], FailureHandling.STOP_ON_FAILURE)

        break
    case GlobalVariable.switch_LicensingUser4:
        WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول أخصائي تراخيص 4'), [:], FailureHandling.STOP_ON_FAILURE)

        break
    default:
        break
}

WebUI.click(findTestObject('Organization Manager_Home Page/span_user inbox'))

WebUI.delay(2)

WebUI.rightClick(findTestObject('Licensing Manager/User Inbox/Request Number'))

WebUI.click(findTestObject('Licensing Specialist/User Inbox/span_Accept 2nd (right click)'))

WebUI.setText(findTestObject('Licensing Specialist/User Inbox/textarea__Accept comment'), 'موافقة ثاني موظف تراخيص')

WebUI.click(findTestObject('Licensing Specialist/User Inbox/button_Accept (popup window)'))

WebUI.delay(2)

WebUI.click(findTestObject('Licensing Specialist/User Inbox/i__Reload (Refresh)'))

WebUI.delay(3)

WebUI.verifyTextNotPresent(GlobalVariable.RequestNumber, false, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

