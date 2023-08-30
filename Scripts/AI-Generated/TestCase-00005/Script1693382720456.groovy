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

'step 1: Navigate to Page_product_chekhol-rozovyi'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/product/chekhol-rozovyi')

'step 2: At Page_product_chekhol-rozovyi click on label_object'

testObj = findTestObject('Object Repository/Page_product_chekhol-rozovyi/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/chekhol-rozovyi(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_product_chekhol-rozovyi click on button_object'

testObj = findTestObject('Object Repository/Page_product_chekhol-rozovyi/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/chekhol-rozovyi(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page_product_chekhol-rozovyi'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00005_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
