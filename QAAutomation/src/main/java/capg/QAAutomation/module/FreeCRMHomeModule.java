package capg.QAAutomation.module;

import org.openqa.selenium.WebDriver;

import capg.QAAutomation.po.FreeCRMHomePagePO;

public class FreeCRMHomeModule {

	private WebDriver driver;

	public FreeCRMHomeModule (WebDriver driver){
		this.driver=driver;
	}
	public void FreeCRMHomePagePO() {

		FreeCRMHomePagePO f = new FreeCRMHomePagePO(driver);
		f.switchToFrame();
		f.MoveToMenuBar("companies");
	}
}
