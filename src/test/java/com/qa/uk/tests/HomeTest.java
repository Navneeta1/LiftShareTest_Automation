package com.qa.uk.tests;

import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
		
		@Test(priority=0)
public void LoginTest() throws InterruptedException {
			
			
		page.ClickLogin();
		
		}
		@Test(priority=1)
public void AddJourneyTest() throws InterruptedException {		
	  
			page.JourneyStart();
	}
		
}

