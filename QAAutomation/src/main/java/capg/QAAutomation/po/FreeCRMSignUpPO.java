package capg.QAAutomation.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import capg.QAAutomation.base.BasePageObject;

public class FreeCRMSignUpPO extends BasePageObject{

	WebDriver driver;

	By Editionpaymentplan_id = By.id("payment_plan_id");
	By firstname = By.name("first_name");
	By Lastname = By.name("surname");
	By email = By.name("email");
	By Confirmemail = By.name("email_confirm");
	By Username = By.name("username");
	By Password = By.name("password");
	By ConfirmPassword = By.name("password");
	By AgreementCheckbox = By.name("agreeTerms");
	By SubmitButton = By.id("submitButton");

	public FreeCRMSignUpPO(WebDriver driver) {
		super(driver);
		
		//this.driver=driver;
	}

	public String getFirstname() {
	//	return driver.findElement(firstname).getText();
	return getText(firstname);
	}

	public void setFirstname(String Firstname) {
		//driver.findElement(firstname).sendKeys(Firstname);
		type(firstname, Firstname);

	}

	public String getLastName() {
		return driver.findElement(Lastname).getText();
	}

	public void setLastname(String surname) {
		driver.findElement(Lastname).sendKeys(surname);
	}

	public String getemailid() {
		return driver.findElement(email).getText();
	}

	public void setemailid(String emailid) {
		driver.findElement(email).sendKeys(emailid);
	}
	
	public String getPassword() {
		return driver.findElement(Password).getText();
	}
	
	public void setPassword(String enterpassword) {
		driver.findElement(Password).sendKeys(enterpassword);
	}
}
