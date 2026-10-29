package com.testing.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.testing.utilities.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest_FireBase {
	
	WebDriver driver;
	PropertiesFile properties = new PropertiesFile();
	
	 public WebDriver openfireappbrowser() {
		 
		 if(driver==null)
		 {

	        ChromeOptions options = new ChromeOptions();

	        options.addArguments("--incognito");

	        WebDriverManager.chromedriver().setup();

	        driver = new ChromeDriver(options);

	        driver.manage().window().maximize();

	        String applicationurl = properties.getProperty("url");
	        driver.get(applicationurl);

	        System.out.println("Browser opened successfully");
		 }
	        return driver;
	    }
	 

	 
	 

	  public void closeBrowser() {

	        if (driver != null) {
	            driver.quit();
	        }

}
}
