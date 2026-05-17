import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LoginScreen extends BasePage{
	private TestObject inputUsername
	private TestObject inputPassword
	private TestObject buttonnLogin
	private TestObject landingLogin
	private TestObject noInput
	private TestObject invalidCredentials
	private TestObject checkLogin
	public LoginScreen() {
		landingLogin = createTestObject("//h5[text()='Login']") 
		inputUsername = createTestObject("//input[@name='username']")
		inputPassword = createTestObject("//input[@name='password']")
		buttonnLogin = createTestObject("//button[@type='submit']")
		noInput=createTestObject("//*[contains(@class,'oxd-input-field-error-message')]")
		invalidCredentials=createTestObject("//*[contains(@class,'oxd-alert oxd-alert--error')]")
	}

	public login(String username, String password) {
		WebUI.waitForElementVisible(landingLogin , 3)
		WebUI.setText(inputUsername, username)
		WebUI.setText(inputPassword, password)
		WebUI.click(buttonnLogin)
		WebUI.verifyEqual(WebUI.getUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")
	}
	public void loginFail(String username, String password) {
		WebUI.waitForElementVisible(landingLogin , 3)
		WebUI.setText(inputUsername, username)
		WebUI.setText(inputPassword, password)
		WebUI.click(buttonnLogin)
		WebUI.verifyElementVisible(invalidCredentials)
	}
	public void noLoginInput(String username, String password) {
		WebUI.waitForElementVisible(landingLogin , 3)
		WebUI.setText(inputUsername, username)
		WebUI.setText(inputPassword, password)
		WebUI.click(buttonnLogin)
		WebUI.waitForElementVisible(noInput, 1)
	}
}
