package TestSenarios;

import org.testng.annotations.Test;

public class TestNGClass2 {
	
@Test(groups= {"sanitytesting"})
public void z() {
		System.out.println("TestNG2 output of method z");
	}
@Test	 
void v() {
		System.out.println("TestNG2 output of method v");
	}
@Test(groups= {"sanitytesting"})
void x() {
		System.out.println("TestNG2 output of method x");
	}
@Test	
void y() {
		System.out.println("TestNG2 output of method y");
	}
@Test	
void l() {
		System.out.println("TestNG2 output of method l");
	}
}
