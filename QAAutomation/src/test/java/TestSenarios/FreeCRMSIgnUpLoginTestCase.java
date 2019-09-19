package TestSenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import capg.QAAutomation.base.BrowserFactory;
import capg.QAAutomation.po.FreeCRMSignUpPO;
import capg.QAAutomation.po.FreeSignUpPageFactory;

public class FreeCRMSIgnUpLoginTestCase {

	@Test
	public void signupApplication() {
		WebDriver driver = BrowserFactory.initializeBrowser("Chrome", "https://www.freecrm.com/register/");

		// Simple way to implement POM
		/*
		 * FreeCRMSignUpPO f = new FreeCRMSignUpPO(driver); f.setFirstname("himanshu");
		 * f.setLastname("Jain"); f.setemailid("himanshujain.feb90@yahoo.com");
		 * f.setPassword("Himanshu@123");
		 */

		// Using PageFactory-->POM
		FreeSignUpPageFactory f = PageFactory.initElements(driver, FreeSignUpPageFactory.class);
		f.setFirstname("Himanshu");
	}

}
