package capg.QAAutomation.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import capg.QAAutomation.base.BasePageObject;

public class FreeCRMHomePagePO extends BasePageObject {

	WebDriver driver;
	By Calendar_menu = By.xpath("//a[@href='https://www.freecrm.com/system/index.cfm?action=calendar&sub=default']");
	By companyMenuBar = By.xpath("//a[@title='Companies']");
	By companyMenuItem = By.xpath("//a[@title='New Company']");

	public FreeCRMHomePagePO(WebDriver driver) {	
		super(driver);
		this.driver = driver;
	}

	public void switchToFrame() {
		frameSwitching("mainpanel");
	}

	
	public void MoveToMenuBar(String typeOfMenuBar) {

		if (typeOfMenuBar.equalsIgnoreCase("companies")) {
			switchToFrame();
			WebElement elm = findElementSafelyByLocator(companyMenuBar);
			Actions action = new Actions(driver);
			action.moveToElement(elm).build().perform();
			click(companyMenuItem);

		}
	}
}
