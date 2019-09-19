package capg.QAAutomation.base;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {

	WebDriver driver;
	WebDriverWait wait;
	
	protected BasePageObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 60); 
	}

	public WebElement findElementSafelyByLocator(By locator) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(StaleElementReferenceException.class);
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	}

	public void type(By locator, String value) {
		findElementSafelyByLocator(locator).sendKeys(value);

	}

	public void click(By locator) {
		findElementSafelyByLocator(locator).click();
	}

	public String getText(By locator) {
		return findElementSafelyByLocator(locator).getText();
	}

	public boolean locatorDisplayed(By locator) {
		return findElementSafelyByLocator(locator).isDisplayed();
	}

	public void frameSwitching(String fameName) {
		driver.switchTo().frame(fameName);
	}

	  // Explicit wait object creation
	public WebElement explictWaitIsElementClickable(By locator) {        //is Element clickable
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public WebElement explictWaitIsElementVisible(By locator) {   //is element visible
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public Boolean explictWaitIsElementInVisible(By locator) {
	return	wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));

	}
	
	
}