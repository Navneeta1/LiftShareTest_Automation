package com.qa.uk.factory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
	public WebDriver init_driver(String browsername){
		
		if (browsername.equals("Chrome")){
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
			}
		     
	        getDriver().get("https://liftshare.com/uk");
	    
	    
	      WebElement Element = getDriver().findElement(By.xpath("//*[@id=\"c-p-bn\"]"));
	      JavascriptExecutor js = (JavascriptExecutor)getDriver();
		  js.executeScript("arguments[0].click();",Element);
		
	    
          return getDriver();
		
	}
	   public static synchronized WebDriver getDriver() {
		       return tlDriver.get();
	   }
	  
	   public static String getScreenshot() {
			File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
			File destination = new File(path);
			return path;
	   }
	

}

