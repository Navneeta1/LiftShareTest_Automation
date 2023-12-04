package com.qa.uk.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.uk.factory.DriverFactory;
import com.qa.uk.pages.HomePage;



public class BaseTest {
	DriverFactory df ;
	WebDriver driver;
	HomePage page;
	

	@BeforeTest()
	public void setup() {
		df = new DriverFactory();
		driver= df.init_driver("Chrome");
		page = new HomePage(driver);
		
	}


	@AfterTest()
	public void teardown() {
		//driver.quit();
	}


	
	
}
