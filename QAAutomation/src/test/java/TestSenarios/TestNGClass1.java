package TestSenarios;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGClass1 {
	
	@Test(priority = 1,groups= {"smoketesting"})
	public void C() {
		System.out.println("output of method C");
	}
@Parameters({"Bowser"})
	@Test(priority = 2,groups= {"smoketesting"}, expectedExceptions = ArithmeticException.class)
	public void e(String xyz) {
		System.out.println("output of method e");
		System.out.println(xyz);
}
	@Parameters({"Bowser"})
	@Test(priority = 2,groups= {"sanitytesting"})
	void a(String abc) {
		System.out.println("output of method a");
		System.out.println(abc);
	
	}

	@Test(priority = 1, dependsOnMethods = "f",groups= {"sanitytesting"})
	void d() {
		System.out.println("output of method d");
	}

	@Test(priority = 1, dependsOnMethods = "a",groups= {"sanitytesting"})
	void f() {
		System.out.println("output of method f");
	}

	@BeforeMethod()
	void beforeMethod() {
		System.out.println("output of method beforeMethod");
	}
	
	@AfterMethod()
	void afterMethod() {
		System.out.println("output of method afterMethod");
	}


	@BeforeClass
	void beforeClass() {
		System.out.println("Ouput of before class");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("output of Afterclass");
	}


}
 