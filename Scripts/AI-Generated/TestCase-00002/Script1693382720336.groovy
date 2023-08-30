import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page_home click on hyperlink_category_chekhly_dlya_samsung --> navigate to Page_category_chekhly-dlya-samsung'

testObj = findTestObject('Object Repository/Page_home/hyperlink_category_chekhly_dlya_samsung')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_category_chekhly-dlya-samsung click on hyperlink_category_chekhly_na_ipad --> navigate to Page_category_chekhly-na-ipad'

testObj = findTestObject('Object Repository/Page_category_chekhly-dlya-samsung/hyperlink_category_chekhly_na_ipad')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-dlya-samsung(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_category_chekhly-na-ipad click on hyperlink_category_chekhly_na_iphone --> navigate to Page_category_chekhly-na-iphone'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-ipad/hyperlink_category_chekhly_na_iphone')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-ipad(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page_category_chekhly-na-iphone click on h1_object'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-iphone/h1_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-iphone(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page_category_chekhly-na-iphone click on hyperlink_category_podborki --> navigate to Page_category_podborki'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-iphone/hyperlink_category_podborki')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-iphone(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page_category_podborki click on button_object'

testObj = findTestObject('Object Repository/Page_category_podborki/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/podborki(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page_category_podborki click on label_object'

testObj = findTestObject('Object Repository/Page_category_podborki/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/podborki(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page_category_podborki click on button_object'

testObj = findTestObject('Object Repository/Page_category_podborki/button_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/podborki(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: Add visual checkpoint at Page_category_podborki'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00002_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
