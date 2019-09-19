package capg.QAAutomation.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FreeSignUpPageFactory {

	WebDriver Driver;

	@FindBy(name = "first_name") // by giving tagname and value
	WebElement firstName;

	@FindBy(how = How.NAME, using = "surname")
	WebElement Lastname;

	@FindBy(how = How.NAME, using = "email")
	WebElement email_id;

	public FreeSignUpPageFactory(WebDriver Driver) {
		this.Driver = Driver;
	}

	public void setFirstname(String fName) {
		firstName.sendKeys(fName);
	}

	public String getFirstname() {
	return firstName.getText();
			
}

}
