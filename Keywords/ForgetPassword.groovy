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

public class ForgetPassword extends BasePage {
    private TestObject inputUsername
    private TestObject resetPass
	private TestObject cancelBtn
	private TestObject loginScreen

    public void visit() {
        WebUI.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode")
    }

	public ForgetPassword() {
		inputUsername = createTestObject("//input[@name='username']")
		resetPass=createTestObject("//button[@type='submit']")
		cancelBtn=createTestObject("//button[@type='button']")
	}

	public resetPassword(String username) {
		WebUI.setText(inputUsername, username)
		WebUI.click(resetPass)
	}
	public void cancelButton()
	{
		WebUI.click(cancelBtn)
		WebUI.verifyEqual(WebUI.getUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
	}
}
