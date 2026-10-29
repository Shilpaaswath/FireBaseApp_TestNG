package com.testing.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	FileInputStream fileinput;
	public String getProperty(String key) {
		
		//file path
		
		String filepath = "properties\\application.properties";
		//2.Create a file inputstream
		
		try {
			fileinput = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3.properties file object 
		
		Properties prop = new Properties();
		try {
			prop.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 4.read the value by passing key to prop.get
		String value = (String)prop.get(key);
		return value;
		
	}


}
