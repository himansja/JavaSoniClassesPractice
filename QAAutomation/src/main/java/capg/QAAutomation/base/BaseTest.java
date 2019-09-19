package capg.QAAutomation.base;

import java.io.IOException;

import capg.QAAutoamtion.utilities.ExcelReadingClass;

public class BaseTest {
	
	public static ConfigFileReader config;
	public static ExcelReadingClass excelreading;
	static {
		 config = new ConfigFileReader();
		 config.readconfigfile();
		 excelreading = new ExcelReadingClass();
		 try {
			excelreading.excelreading(config.getInputfile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
