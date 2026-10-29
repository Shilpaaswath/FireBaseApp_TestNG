package com.testing.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage_Firebaseapp {
	
	WebDriver driver;
	
	public Basepage_Firebaseapp(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
   
	 
	public void waitforelement(WebElement element, int time )
	{
		WebDriverWait wait = new WebDriverWait(driver , time);
		wait.until(ExpectedConditions.visibilityOf(element));
				
	}
	

}
