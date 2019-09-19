package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Table {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']/tbody"));
		List<WebElement> rowslist=table.findElements(By.tagName("tr"));
		
		System.out.println(rowslist.size());
		
		for(int i=1;i<rowslist.size();i++) {
			
			
			List<WebElement> headerCols=rowslist.get(i).findElements(By.tagName("td"));
			
			for(int j=0; j<headerCols.size();j++) {
				System.out.println(headerCols.get(j).getText());
			}
			
		}
		
		
		
	}

}
