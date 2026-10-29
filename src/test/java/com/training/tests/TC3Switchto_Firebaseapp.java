package com.training.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.base.BaseTest_FireBase;
import com.testing.pages.Loginpage;
import com.testing.pages.Switchpage;
import com.testing.utilities.ScreenshotUtility;

public class TC3Switchto_Firebaseapp extends BaseTest_FireBase{
	
	WebDriver driver;
	Loginpage login;
	Switchpage switchframe;
	ScreenshotUtility screenshot;
	
	
	@BeforeMethod
	public void launchbrowser() {
		
		driver = openfireappbrowser();
	    login = new Loginpage(driver);
	    switchframe = new Switchpage(driver);
	    screenshot = new ScreenshotUtility();
		
		
	}
	@Test
	public void switchframe()
	{
		login.enteremailid("admin123@gmail.com");
		login.enterpassword("admin123");
		login.clicklogin();
		
		switchframe.switchto();
	}
	
	@AfterMethod
	
	public void teardown() {
		
		closeBrowser();
	}
	
	
	

}
