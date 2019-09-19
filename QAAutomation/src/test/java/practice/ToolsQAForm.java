package practice;

import java.util.List;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQAForm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@name='firstname']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Himanshu");
		driver.findElement(By.xpath("//input[@name='lastname']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jain");



		String tyopeOfSex="Sex-0";

		List<WebElement> elmList= driver.findElements(By.xpath("//div[@class='control-group']/child::input[contains(@id,'sex')]"));

		for(int i=0;i<elmList.size();i++) {
			if(elmList.get(i).getAttribute("id").equalsIgnoreCase(tyopeOfSex)) {
				elmList.get(i).click();
			}
		}

		String typofyear="4";


		List<WebElement> yearlist= driver.findElements(By.xpath("//div[@class='control-group']/child::input[contains(@name,'xp')]"));
		for(int i=0;i<yearlist.size();i++)
		{
			if(yearlist.get(i).getAttribute("value").equalsIgnoreCase(typofyear))
			{
				yearlist.get(i).click();

			}
		}


		//driver.findElement(By.xpath("//div[@class='control-group']/child::input[@id='exp-1']")).click();
		//driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09-05-2018");

		String AutomationTool ="Selenium IDE";

	List<WebElement> AutoTo = driver.findElements(By.xpath("//div[@class='control-group']/input[@name='tool']"));
		for(int i=0;i<AutoTo.size();i++)
		{
			if(AutoTo.get(i).getAttribute("value").equalsIgnoreCase(AutomationTool))
			{
				AutoTo.get(i).click();
			}

		//driver.findElement(By.xpath("//option[text()='WebElement Commands']")).click();	
		//driver.findElement(By.xpath("//div[@class='controls']/select[@id ='continents']/child::option[2]")).click();

		

		/*List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='continents']/option"));
		System.out.println(allOptions.size());

		for (int i=0;i< allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText());
			if(allOptions.get(i).getText().equalsIgnoreCase("AFRICA")) {
				allOptions.get(i).click();
				Thread.sleep(1000);
			}
			
		}
*/
/*		Select drop = new Select(driver.findElement(By.xpath("//select[@id='continents']")));

		String S = "Africa";

		drop.selectByVisibleText(S);

		Select multipleDrop = new Select(driver.findElement(By.xpath("//Select[@id='selenium_commands']")));

		multipleDrop.selectByVisibleText("Switch Commands");
		multipleDrop.selectByIndex(4);
		//multipleDrop.deselectAll();
		//multipleDrop.getOptions();

		//driver.findElement(By.xpath("photo")).click();
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("D:\\Test upload.txt");
*/
		
		List<WebElement> Selcomands = driver.findElements(By.xpath("//select[@id = \"selenium_commands\"]/option"));
		
		System.out.println(Selcomands.size());
		/*for(int j=0; j<Selcomands.size();j++)
		{
			if(Selcomands.get(j).getText().equalsIgnoreCase("Navigation Commands"))
			{
				Selcomands.get(j).click();
	
			}*/
	
		}	
			
	System.out.println("Process End");
	}
	}


	