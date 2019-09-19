package practice;

import java.util.List;

import org.apache.commons.collections4.sequence.DeleteCommand;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		int frameCount = driver.findElements(By.tagName("iframe")).size();
        System.out.println(frameCount);   
        
        
		List<WebElement> framelist = driver.findElements(By.tagName("iframe"));
		for(int i=0;i<framelist.size();i++)
		{
			String frameId = framelist.get(i).getAttribute("name");
			System.out.println(frameId);
		}	
		//driver.switchTo().frame(framelist.get(0)); //Switch to frame through weblement as return
		driver.switchTo().frame("iframe1"); // Switch to frame through string as return
		driver.findElement(By.xpath("//div[@class ='control-group']/input[@name ='firstname']")).sendKeys("Himanshu");
		driver.switchTo().defaultContent(); //Switch back to main HTML body.
		//driver.findElement(By.xpath("//a[@href='http://www.facebook.com/sharer.php?u=http://toolsqa.com/iframe-practice-page/&t=IFrame%20practice%20page']")).click();
		driver.switchTo().frame("iframe2"); //Switch to next frame
		driver.findElement(By.xpath("//a[@id='ui-id-4']")).click();
		System.out.println("Process end");
		

	}










}
