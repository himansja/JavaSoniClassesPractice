package capg.QAAutomation.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class ConfigFileReader {
	Properties propertiesdata;

	public void readconfigfile() {
		
		FileReader pFile; // Reading the file using FileReader .exe, .ini, .properties etc.
		String projectFolder = System.getProperty("user.dir");
		String filepath = projectFolder + "//GlobalConfig//Config.properties";
		try {
			pFile = new FileReader(filepath);
			BufferedReader reader = new BufferedReader(pFile); // Reading the file into byte by byte
			propertiesdata = new Properties(); // reading the .properties file
			propertiesdata.load(reader);
			reader.close();
			String Browsername = propertiesdata.getProperty("Browser"); // sample code to get browser from properties file
			System.out.println(Browsername);
			System.out.println(propertiesdata.getProperty("ApplicationURL")); // sample code to get ApplicationURl from properties file

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getBrowser() {      // for identifying exception for each properties
		String Browsername = propertiesdata.getProperty("Browser");
		if(Browsername != null) 
			return Browsername;
		else
			throw new RuntimeException("Browser not define");
	}

	public String getAppURL() {
		String AppURl = propertiesdata.getProperty("ApplicationURL");
		if(AppURl != null)
			return AppURl;
		else
			throw new RuntimeException("Application uRl is not found");

	}
	public String getUsername() {
		String username = propertiesdata.getProperty("Username");
		if(username != null)
			return username;
		else
			throw new RuntimeException("Username not found");
	}
	public String getPassword() {
		String password = propertiesdata.getProperty("Password");
		if(password != null)
			return password;
		else
			throw new RuntimeException("password not found");
	}
	public String getInputfile() {
		String inputfile = propertiesdata.getProperty("Inputfile");
		if(inputfile != null)
			return inputfile;
		else
			throw new RuntimeException("File not found");
	}
}