package TestSenarios;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGClass3 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("output of beforesuite");
}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Output of Aftersuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("output of beferoTEst");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Output of AfterTest");
}
}

