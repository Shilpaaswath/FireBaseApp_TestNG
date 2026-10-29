package com.testing.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.base.Basepage_Firebaseapp;

public class Loginpage  extends Basepage_Firebaseapp {
	
	//In pages we identify the elements and define the actions
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="email_field")
	WebElement emailid;
	
	@FindBy(id="password_field")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login to Account']")
	WebElement loginbutton;
	
	public void enteremailid(String email)
	{
		emailid.sendKeys(email);
	}
	
	public void enterpassword(String strpassword)
	{
		password.sendKeys(strpassword);
	}
	
	public void clicklogin()
	{
		loginbutton.click();
	}
	
}
