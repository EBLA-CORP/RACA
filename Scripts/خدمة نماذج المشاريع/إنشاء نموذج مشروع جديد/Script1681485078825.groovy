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

WebUI.callTestCase(findTestCase('تسجيل الدخول/تسجيل دخول موظف جمعية'), [:], FailureHandling.STOP_ON_FAILURE)

'خدمة نماذج المشاريع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/input__search'), 'نماذج المشاريع')

WebUI.delay(2)

WebUI.click(findTestObject('Organization Emploee_Home Page/span_service (common)'))

WebUI.delay(5)

'نوع الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__requestType'), 'جديد')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__requestType'), Keys.chord(Keys.ENTER))

'نوع المشروع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__projectType'), 'برامجي')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__projectType'), Keys.chord(Keys.ENTER))

'اسم المشروع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__projectName'), 'كاتالون')

'نطاق التنفيذ'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__projectWorkArea'), 'داخل قطر')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__projectWorkArea'), Keys.chord(Keys.ENTER))

'وصف المشروع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/textarea__projectDescription'), 'أوتوماشن كاتالون')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'المنطقة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__beneficiaryRegion'), 'الدوحة')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__beneficiaryRegion'), Keys.chord(Keys.ENTER))

'المنطقة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__executionRegion'), 'الدوحة')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__executionRegion'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

'تبويب بيانات تصنيف المشروع'
WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Models/a_Project Cetegory Info TAB'))

WebUI.delay(1)

'تصنيف المشاريع الداخلية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__internalProjectClassification'), 'التنمية الاجتماعية')

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__internalProjectClassification'), Keys.chord(
        Keys.ENTER))

'هدف التنمية المستدامة الاول'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__firstSDGoal'), GlobalVariable.FirstSDGoal)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__firstSDGoal'), Keys.chord(Keys.ENTER))

'هدف التنمية المستدامة الثانى'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__secondSDGoal'), GlobalVariable.SecondSDGoal)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__secondSDGoal'), Keys.chord(Keys.ENTER))

'هدف التنمية المستدامة الثالث'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__thirdSDGoal'), GlobalVariable.ThirdSDGoal)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__thirdSDGoal'), Keys.chord(Keys.ENTER))

'نسبة الهدف الاول'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__firstSDGoalPercentage'), '50')

'نسبة الهدف الثانى'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__secondSDGoalPercentage'), '35')

'نسبة الهدف الثالث'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__thirdSDGoalPercentage'), '15')

WebUI.delay(2)

'تبويب بيانات ملخص المشروع'
WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Models/a_Project Summary Info TAB'))

WebUI.delay(1)

'أهداف المشروع '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/textarea__goals'), 'أهداف')

'عدد المستفيدين المباشرين'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__directBeneficiaryNumber'), '20')

'عدد المستفيدين غير المباشرين'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__indirectBeneficiaryNumber'), '40')

'عدد الأسر المستفيدة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__beneficiaryFamiliesNumber'), '10')

'%نسبة المستفيدين المباشرين حسب الفئة العمرية من 0 إلى 5'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__beneficiaries0to5'), '20')

'%نسبة المستفيدين المباشرين حسب الفئة العمرية من 5 إلى 18'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__beneficiaries5to18'), '40')

'%نسبة المستفيدين المباشرين حسب الفئة العمرية من 19 إلى 60'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__beneficiaries19to60'), '30')

'%نسبة المستفيدين المباشرين حسب الفئة العمرية فوق ال 60'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__beneficiariesOver60'), '10')

'تقييم الاحتياجات للمشروع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/textarea__needsAssessment'), 'تقييم')

'عناصر نجاح المشروع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/textarea__successItems'), 'عناصر نجاح')

'مخرجات المشروع '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/textarea__outputs'), 'مخرجات المشروع')

'النتائج المتوقعة'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/textarea__expectedResults'), 'نتائج جيدة')

'الاثر المتوقع بعد تنفيذ'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/textarea__expectedImpact'), 'أثر مستدام')

'عناصر أستدامة المشروع'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/textarea__sustainabilityItems'), 'عناصر استدامة كثيرة')

'آلية التخارج'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__exitMechanism'), GlobalVariable.ExitMechanism)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__exitMechanism'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

'تبويب مكونات / موازنة المشروع'
WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Models/a_Project Components-Budgets TAB'))

WebUI.delay(1)

'إضافة مكونات المشروع'
WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Models/i__addNewComponent (plus-box)'))

'أسم المكون'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__componentName'), 'مكون')

'التفاصيل '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__details'), 'تفاصيل')

'التكلفة الاجمالية'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__totalCost'), '1000')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(2)

'تبويب مؤشرات تقييم المشروع'
WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Models/a_Project Evaluation Indicators TAB'))

WebUI.delay(1)

'إضافة مؤشرات تقييم المشروع'
WebUI.click(findTestObject('Organization Emploee_Home Page/Projects Models/i__addNewIndicator (plus-box)'))

'المؤشر '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__indicator'), GlobalVariable.Indicator)

WebUI.sendKeys(findTestObject('Organization Emploee_Home Page/Projects Models/input__indicator'), Keys.chord(Keys.ENTER))

'النسبة '
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__percentage'), '100')

'ملاحظات مستقبل الطلب'
WebUI.setText(findTestObject('Organization Emploee_Home Page/Projects Models/input__notes'), 'ملاحظات')

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

