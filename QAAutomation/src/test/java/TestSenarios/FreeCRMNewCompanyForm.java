package TestSenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import capg.QAAutomation.base.BaseTest;
import capg.QAAutomation.base.BrowserFactory;
import capg.QAAutomation.module.NewCompanyModule;
import capg.QAAutomation.po.FreeCRMHomePageLoginPO;
import capg.QAAutomation.po.FreeCRMHomePagePO;

public class FreeCRMNewCompanyForm extends BaseTest{

	@Test
	public void NewCompany() throws Exception {
		WebDriver driver = BrowserFactory.initializeBrowser(config.getBrowser(), config.getAppURL());
		FreeCRMHomePageLoginPO l = new FreeCRMHomePageLoginPO(driver);
		l.setUsername(config.getUsername());
		l.setPassword(config.getPassword());
		Thread.sleep(10000);
		l.submitButon();
		Thread.sleep(10000);
		FreeCRMHomePagePO c = new FreeCRMHomePagePO(driver);
		c.MoveToMenuBar("companies");
		NewCompanyModule n = new NewCompanyModule(driver);
		n.EnterValuesinCompanyPage(excelreading);
		
	}
}
