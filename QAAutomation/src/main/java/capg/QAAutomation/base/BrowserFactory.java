package capg.QAAutomation.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	static String rootFolder = System.getProperty("user.dir");
	static WebDriver driver;

	public static WebDriver initializeBrowser(String browserType, String appURL) {
		
		if(browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(appURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		}
		else if (browserType.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			File pathBinary = new File("C:\\Users\\himansja\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary); 
			DesiredCapabilities desired = DesiredCapabilities.firefox();
			FirefoxOptions options = new FirefoxOptions();
			desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
			driver = new FirefoxDriver(options);
			driver.get(appURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		}
		else if(browserType.equalsIgnoreCase(("IE"))) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(appURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		}
		return driver;
	}

}
