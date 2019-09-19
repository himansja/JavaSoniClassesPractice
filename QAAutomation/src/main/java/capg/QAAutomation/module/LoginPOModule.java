package capg.QAAutomation.module;

import org.openqa.selenium.WebDriver;

import capg.QAAutomation.po.FreeCRMHomePageLoginPO;

public class LoginPOModule {

	private WebDriver driver;

	public LoginPOModule(WebDriver driver) {
		this.driver = driver;
	}

	public void LoginPOPage() {

		FreeCRMHomePageLoginPO l = new FreeCRMHomePageLoginPO(driver);

		l.setUsername("himansja");
		l.setPassword("ispl123#");
		l.submitButon();
	}
}