package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public void simplePopUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		//driver.findElement(By.xpath("//button[@onclick='pushAlert()']")).click();
		//driver.switchTo().alert().dismiss();
		//driver.findElement(By.xpath("//button[@onclick='pushConfirm()']")).click();
		//Thread.sleep(1000);
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@onclick='promptConfirm()']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("Yes");
		a.accept();

	}

}
