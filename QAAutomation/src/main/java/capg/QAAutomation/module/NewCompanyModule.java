package capg.QAAutomation.module;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import capg.QAAutoamtion.utilities.ExcelReadingClass;
import capg.QAAutoamtion.utilities.SceenShot;
import capg.QAAutomation.base.BaseTest;
import capg.QAAutomation.po.CreateNewCompanyPO;

public class NewCompanyModule extends BaseTest {
	
	private WebDriver driver;

	public NewCompanyModule (WebDriver driver){
		this.driver=driver;
	}

	public void EnterValuesinCompanyPage(ExcelReadingClass excelreading) throws Exception {
		
		LinkedHashMap<String, String> getTestCaseData = excelreading.getTestCaseData("NewCompany","1.0");
		CreateNewCompanyPO c= new CreateNewCompanyPO(driver);
		c.setcompanyname(getTestCaseData.get("CompanyName"));
		c.setcompanyphone(getTestCaseData.get("Phone"));
		c.setDescription(getTestCaseData.get("Description"));
		c.setStatus(getTestCaseData.get("Status"));
		//c.setaddressType("Shipping Address");
		c.setSave();
		System.out.println("New Company is Created");
		SceenShot.captureVisiblePart(driver, "C:\\Users\\hp\\SeleniumWorkspace\\SeleniumPractice\\Reports\\ScreenShots", "NewCo");
	}
	
}
