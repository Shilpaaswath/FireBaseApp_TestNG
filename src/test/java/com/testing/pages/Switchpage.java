package com.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testing.base.Basepage_Firebaseapp;

public class Switchpage extends Basepage_Firebaseapp{
	
	WebDriver driver;

	public Switchpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//button[contains(text(),'Switch To')]")
	WebElement switchto;
	
	public void switchto()
	{
		waitforelement(switchto , 10);
		switchto.click();
	}
	

	

}
