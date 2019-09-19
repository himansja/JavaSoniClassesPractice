package TestSenarios;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	
	@Test(dataProvider ="InputData")
	public void abc(String DataReader) {
		System.out.println("output of "+  DataReader);
	}
	
	@Test
	public void xyz() {
		System.out.println("output of xyz");
	}
		
	@DataProvider(name= "InputData")          //Standard syntax
	public Object[][] dp(){
		return new Object[][] {{"One"},{"two"},{"three"},{"Four"}, {"Five"}};
	}
}
