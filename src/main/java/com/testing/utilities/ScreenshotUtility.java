package com.testing.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

	  public void takescreenshot(WebDriver driver,String methodName)
	  {
		  TakesScreenshot screenshot = ((TakesScreenshot)driver);
		  
		  File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		  
		  String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
		
		  String filepath = "screenshots\\screenshot"+"_"+timestamp+"_"+methodName+".jpg";
		  File destFile = new File(filepath);
		  
		  try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
