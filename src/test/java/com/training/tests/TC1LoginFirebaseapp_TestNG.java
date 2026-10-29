
package com.training.tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;
import com.testing.base.BaseTest_FireBase;
import com.testing.pages.Loginpage;
import com.testing.utilities.ScreenshotUtility;

import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1LoginFirebaseapp_TestNG extends BaseTest_FireBase{

    WebDriver driver;
    Loginpage login;
    ScreenshotUtility screenshot;

    @BeforeMethod
    public void launchbrowser() {
     	driver = openfireappbrowser();
        login = new Loginpage(driver);
        screenshot = new ScreenshotUtility();
    }
   

    @Test
    public void loginToFirebaseApp() {

        login.enteremailid("admin123@gmail.com");
        login.enterpassword("admin123");
        login.clicklogin();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takescreenshot(driver,methodName);

        System.out.println("Login test executed and login Successfull");
    }
    
   
   /* @Test
    @Parameters({"username","password"})
    public void loginToFirebaseAppwithinvalidentries(String username,String password) {

        login.enteremailid(username);
        login.enterpassword(password);
        login.clicklogin();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takescreenshot(driver,methodName);

        System.out.println("Login test executed and Login not successfull");
    }
    
    @Test
    public void loginToFirebasewithonlyusername() {

        login.enteremailid("admin123@gmail.com");
        login.clicklogin();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takescreenshot(driver,methodName);

        System.out.println("Login test executed and Login not successfull");
    }*/
    
    @AfterMethod
    public void closebrowser() {
    	closeBrowser();
    }

       
    
}

