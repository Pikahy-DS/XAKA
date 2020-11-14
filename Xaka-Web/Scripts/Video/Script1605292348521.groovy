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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://video.goodline.info/#/signin')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Video/Page_/input__login'), 'demo')

WebUI.setEncryptedText(findTestObject('Object Repository/Video/Page_/input__password'), 'PblvLzUlPsM=')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Video/Page_/span_'))

WebUI.delay(2)

WebUI.navigateToUrl('https://video.goodline.info/#/camera/46712')

WebUI.delay(5)

WebUI.back()

WebUI.navigateToUrl('https://video.goodline.info/#/camera/11881')

WebUI.delay(5)

WebUI.back()

WebUI.navigateToUrl('https://video.goodline.info/#/camera/2949')

WebUI.delay(5)

WebUI.back()

WebUI.navigateToUrl('https://video.goodline.info/#/camera/5503')

WebUI.delay(5)

WebUI.back()

WebUI.navigateToUrl('https://video.goodline.info/#/camera/10582')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Video/Page_/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Video/Page_/svg_1_2_3'))

WebUI.click(findTestObject('Object Repository/Video/Page_/div_Live_sldp_expand_btn sldp_btn sldp-icon_6965b8'))

WebUI.click(findTestObject('Object Repository/Video/Page_/path'))

WebUI.click(findTestObject('Object Repository/Video/Page_/path_1'))

WebUI.click(findTestObject('Object Repository/Video/Page_/span_14'))

WebUI.click(findTestObject('Object Repository/Video/Page_/span_14'))

WebUI.click(findTestObject('Object Repository/Video/Page_/path_1_2'))

WebUI.click(findTestObject('Object Repository/Video/Page_/span__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Video/Page_/span__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Video/Page_/div_24'))

WebUI.click(findTestObject('Object Repository/Video/Page_/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Video/Page_/svg_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Video/Page_/path_1_2_3'))

WebUI.click(findTestObject('Object Repository/Video/Page_/svg_1_2_3_4_5_6'))

