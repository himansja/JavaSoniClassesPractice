package TestSenarios;

import org.testng.annotations.Factory;

public class FactoryAnnotations {

	@Factory
	public Object[] factoryMethod() {
	Object[] tests= new Object[2];   //defines how many object we are going to create
	tests[0]= new TestNGClass1();   // object1
	tests[1]= new TestNGClass2();   // object2
	return tests;
	}
}
