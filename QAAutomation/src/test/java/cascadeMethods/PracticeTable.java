package cascadeMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTable {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		// WebElement Table = driver.findElement(By.xpath("//table[@class ='tsc_table_s13']"));
		WebElement table = driver.findElement(By.xpath("//table[@class ='tsc_table_s13']"));

		List<WebElement> rowlist = table.findElements(By.tagName("tr"));
		System.out.println(rowlist.size());
		for(int i=0; i< rowlist.size(); i++)
		{
			//System.out.println(rowlist.get(i).getText());
			if(i==0) {
				List<WebElement> column = rowlist.get(i).findElements(By.tagName("th"));
				
				for(int j=0; j<column.size();j++)
				{
					System.out.println(column.get(j).getText());
					
				}
			}else {
				List<WebElement> column = rowlist.get(i).findElements(By.tagName("td"));

				for(int j=0; j<column.size();j++)
				{
					System.out.println(column.get(j).getText());
					if (column.get(j).getText().equalsIgnoreCase("details"))
					{
						column.get(j).click();
					}
				}

			}

			}
			
			

					System.out.println("Process End");
	}

}
