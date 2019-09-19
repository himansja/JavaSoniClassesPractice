package TestSenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import capg.QAAutomation.base.BaseTest;
import capg.QAAutomation.base.BrowserFactory;
import capg.QAAutomation.po.FreeCRMHomePageLoginPO;
import capg.QAAutomation.po.FreeCRMHomePagePO;
import junit.framework.Assert;

public class FreeCRMLoginTestCase extends BaseTest {

	SoftAssert softAssert = new SoftAssert();

	@Test
	public void signupApplication() throws InterruptedException {
		/*
		 * WebDriver driver = BrowserFactory.initializeBrowser("Chrome",
		 * "https://www.freecrm.com/index.html");
		 * 
		 * // Simple way to implement POM
		 * 
		 * FreeCRMHomePageLoginPO l = new FreeCRMHomePageLoginPO(driver); Hard Assertion
		 * implemented String
		 * expected="#1 Free CRM software in the cloud for sales and service"; String
		 * actual =driver.getTitle(); Assert.assertEquals(expected, actual);
		 * 
		 * // Soft Assetion implemetation
		 * 
		 * l.setUsername("himansja"); l.setPassword("ispl123#");
		 * Assert.assertEquals(true, l.submitButonIsDisplayed());
		 *  l.submitButon();
		 * Thread.sleep(10000); FreeCRMHomePagePO c = new FreeCRMHomePagePO(driver);
		 * c.MoveToMenuBar("companines"); }
		 */

		/* Using Integration of Congif properties and excel */
		WebDriver driver = BrowserFactory.initializeBrowser(config.getBrowser(), config.getAppURL());

		// Simple way to implement POM

		FreeCRMHomePageLoginPO l = new FreeCRMHomePageLoginPO(driver);
		/*
		 * Hard Assertion implemented String
		 * expected="#1 Free CRM software in the cloud for sales and service"; String
		 * actual =driver.getTitle(); Assert.assertEquals(expected, actual);
		 */
		// Soft Assetion implemetation

		l.setUsername(config.getUsername());
		l.setPassword(config.getPassword());
		Assert.assertEquals(true, l.submitButonIsDisplayed());
		l.submitButon();
		Thread.sleep(10000);
		FreeCRMHomePagePO c = new FreeCRMHomePagePO(driver);
		c.MoveToMenuBar("companines");
		
	}
}
