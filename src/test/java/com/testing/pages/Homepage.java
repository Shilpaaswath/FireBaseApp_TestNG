package com.testing.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.testing.base.Basepage_Firebaseapp;

public class Homepage extends Basepage_Firebaseapp{
	
    WebDriver driver;
	
	public Homepage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement home;
	
	public void hometab() {
		waitforelement(home , 10);
		home.click();
	}
	
	@FindBy(id="name")
	WebElement name;
	
	public void name() {
		name.sendKeys("Shilpa Ashwath");
	}
	
	@FindBy(id="lname")
	WebElement lastname;
	public void lname() {
		lastname.sendKeys("Ashwathnarayanaswamy");
	}
	
	@FindBy(id = "postaladdress")
	WebElement postaladdress;
	public void postaladdress() {
		postaladdress.sendKeys("USA");
	}
	
	@FindBy(id = "personaladdress")
	WebElement personaladdress;
	public void personaladdress() {
		personaladdress.sendKeys("USA");
	}

	@FindBy(xpath="//input[@value='female']")
	WebElement gender;
	public void Gender() {
		gender.click();
	}
	
	@FindBy(id="city")
	List<WebElement> citydropdown;
	
	public void citydropdown() {
	for (WebElement city : citydropdown)
	{
		if(city.getText().equals("MUMBAI"))
		{
			city.click();
			break;
		}
	}
	}
	
	@FindBy(name="course")
	WebElement Coursedropdown;
	public void Coursedropdown() {
	Select Course = new Select(Coursedropdown);
	Course.selectByVisibleText("MCA");
	}
	
	@FindBy(id="district")
	WebElement districts;
	
	public void districts() {
	Select district = new Select(districts);
	district.selectByVisibleText("GOA");
	}
	
	@FindBy(id="state")
	WebElement states;
	public void states() {
	Select state = new Select(states);
	state.selectByVisibleText("PATNA");
	}
	
	@FindBy(id="pincode")
	WebElement pincode;
	public void pincode() {
		pincode.sendKeys("78681");
	}
	
	@FindBy(id="emailid")
	WebElement emailid;
	public void emailid() {
		emailid.sendKeys("shilpa@gmail.com");
	}
	
	@FindBy(xpath="//button[text() = 'Submit']")
	WebElement Submit;
	public void submit() {
		
		Submit.click();
	}

	
	

	

	

}
