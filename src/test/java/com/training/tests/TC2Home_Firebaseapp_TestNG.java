package com.training.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.base.BaseTest_FireBase;
import com.testing.pages.Homepage;
import com.testing.pages.Loginpage;
import com.testing.utilities.ScreenshotUtility;

public class TC2Home_Firebaseapp_TestNG extends BaseTest_FireBase{
	
	WebDriver driver;
	 Loginpage login;
	 Homepage homeframe;
	 ScreenshotUtility screenshot;
	
	@BeforeMethod
	public void launchbrowser() {
		driver = openfireappbrowser();
		login = new Loginpage(driver);
		homeframe = new Homepage(driver);
		screenshot = new ScreenshotUtility();
	}
	
	@Test
	public void homesubmit() throws InterruptedException
	{
		login.enteremailid("admin123@gmail.com");
	    login.enterpassword("admin123");
	    login.clicklogin();
	  
		homeframe.hometab();
		homeframe.name();
		homeframe.lname();
		homeframe.postaladdress();
		homeframe.Gender();
		homeframe.citydropdown();
		homeframe.Coursedropdown();
		homeframe.districts();
		homeframe.states();
		homeframe.pincode();
		homeframe.emailid();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takescreenshot(driver,methodName);
		homeframe.submit();
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		closeBrowser();
	}

	
	
	
}




