package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		String ParantWindow =driver.getWindowHandle();
		System.out.println(ParantWindow);

		driver.findElement(By.xpath("//a[@href ='javascript:terms_win()']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.rediff.com/w3c/policy.html']")).click();
		Thread.sleep(1000);



		Set <String> WindowSet= driver.getWindowHandles(); 

		Iterator<String> itr = WindowSet.iterator();
		System.out.println(WindowSet);
		
		List<String> windowsList = new ArrayList<String>(WindowSet); //Converting Set to List Type
		
		driver.switchTo().window(windowsList.get(1)).close();
		
		driver.switchTo().window(windowsList.get(2)).close();
		
		driver.switchTo().window(windowsList.get(0)).close();
				
		/*while(itr.hasNext()) 
		{
			String windowAddress = itr.next();
		System.out.println(windowAddress);
			if(!(windowAddress.equals(ParantWindow))) {
				System.out.println(windowAddress); 
			driver.switchTo().window(windowAddress);
			driver.findElement(By.xpath("//div[@class='floatR']//input[@type='button']")).click();
			driver.switchTo().window(windowAddress).close(); // this will close the pop up window
				
				
			}
		}   */


	//driver.switchTo().window(ParantWindow).close(); // this will switch back to parent window

	//driver.close(); //this will close the main window not the pop up window 
}
}