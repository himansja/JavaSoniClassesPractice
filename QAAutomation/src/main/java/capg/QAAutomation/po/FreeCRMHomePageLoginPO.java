package capg.QAAutomation.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import capg.QAAutomation.base.BasePageObject;

public class FreeCRMHomePageLoginPO extends BasePageObject {

	WebDriver driver;

	By Username_login = By.name("username");
	By Password_login = By.name("password");
	By LoginButton = By.xpath("//input[@type='submit']");

	public FreeCRMHomePageLoginPO(WebDriver driver) {
		super(driver);
		// this.driver=driver;
	}

	public String getUserName() {
		// return driver.findElement(username).getText();
		return getText(Username_login);
	}

	public void setUsername(String Username) {
		//driver.findElement(Username_login).sendKeys(Username);
		type(Username_login, Username);

	}

	public String getLastName() {
		// return driver.findElement(Password_login).getText();
		return getText(Password_login);
	}

	public void setPassword(String password) {
		// driver.findElement(Password_login).sendKeys(surname);
		type(Password_login, password);
	}

	public void submitButon() {
		explictWaitIsElementClickable(LoginButton).click();
		//click(LoginButton);  If element is not returning then instead of using .click() in above write this code
 
	}

	public boolean submitButonIsDisplayed() {
		return locatorDisplayed(LoginButton);

	}
                
}
