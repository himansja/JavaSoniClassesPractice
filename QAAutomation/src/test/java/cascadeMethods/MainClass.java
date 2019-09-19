package cascadeMethods;

import java.io.IOException;

import capg.QAAutoamtion.utilities.ExcelReadingClass;
import capg.QAAutomation.base.ConfigFileReader;
import practice.AlertPopUp;

public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		/*
		 * Demo1 d = d2.Demo2Method(); Demo2 d2 = d3.Demo3Method(); Demo3 d3 = new
		 * Demo3();
		 */

		/*
		 * Demo3 d = new Demo3(); Demo2 d2=d.Demo3Method(); //d.Demo3Method();
		 * d.Demo3Method().Demo2Method().Demo1Method();
		 */

		/*
		 * int i=0; int j; j=i--; System.out.println(j); System.out.println(i);
		 */

		/*
		 * for (int i=0; i<5; i++) { System.out.println("outer :"+i);
		 * 
		 * for(int j=0; j<5; j++) { System.out.println("inner :"+j); } } }
		 * 
		 */

		// RevString obj =new RevString();
		// obj.reverseUsingSplitfxn();
		// obj.reverseWithoutSplitfxn(); */
		// obj.StringConvertCapital();

		/*
		 * ExcelReadingClass c = new ExcelReadingClass(); c.excelreading();
		 * System.out.println(c.getColData("Depesh", "13.0", "Password"));
		 */
		// ConfigFileReader obj1 = new ConfigFileReader();
		// obj1.readconfigfile();
		//obj1.getAppURL();
		
		AlertPopUp Alert = new AlertPopUp();
		Alert.simplePopUp();
	}

}
