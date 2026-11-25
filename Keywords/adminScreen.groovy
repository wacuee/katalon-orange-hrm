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

public class adminScreen extends BasePage {
	private TestObject adminMenu
	private TestObject addButton
	private TestObject userRole

	public adminScreen() {
		
		adminMenu=createTestObject("//a[contains(@class, 'oxd-main-menu-item') and contains(., 'Admin')]")
		addButton=createTestObject("//button[contains(@class, 'oxd-button')and contains(., 'Add')]")
		userRole=createTestObject("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
	}
	public void verifyAdminPage() {
		WebUI.click(adminMenu)
		WebUI.verifyEqual(WebUI.getUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers")
		WebUI.click(addButton)
	}
	public void addUser() {
		WebUI.verifyEqual(WebUI.getUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser")
		WebUI.selectOptionByLabel(userRole, 'Admin', false)
		
	}
}
