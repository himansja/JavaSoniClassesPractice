package practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedbusHomePage {

	public static void main(String[] args) throws InterruptedException {
		
		String projectFolder= System.getProperty("user.dir");
		
		System.out.println(projectFolder);
		
		
		Map<String, Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.redbus.in/bus-tickets/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtSource']")).click();
		driver.findElement(By.xpath("//input[@id='txtSource']")).sendKeys("Pune");
		
		driver.findElement(By.id("txtDestination")).click();
		driver.findElement(By.id("txtDestination")).sendKeys("Raipur(chhattisgarh)");
		
		/*String fromval=driver.findElement(By.xpath("//input[@id='txtSource']")).getText();
		System.out.println(fromval);*/
		
		//driver.findElement(By.id("txtSource")).clear();
		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
		Thread.sleep(1000);
		
		List<WebElement> dateList=driver.findElements(By.xpath("//div[@id='onward']//div[@id='rb-calmiddle' and @class='main-calendar']/ul[@class='rb-calendar-days']/li"));
		
		System.out.println(dateList.size());
		for(int i=0; i<dateList.size();i++) {
			
			if (!(dateList.get(i).getAttribute("class").equals("past")))
				if(dateList.get(i).getText().equals("20")) {
					dateList.get(i).click();
					System.out.println(dateList.get(i).getText()); 
				}
		}
		
		/*driver.findElement(By.xpath("//input[@id='txtReturnCalendar']")).sendKeys("25-Aug-2018");
		
		
		driver.findElement(By.xpath("//button[contains(@class,'searchBuses')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@property='item']")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("HOTELS")).click();
*/		
		
		System.out.println("Process End");
		

	}

}
