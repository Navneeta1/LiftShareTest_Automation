package com.qa.uk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

   private WebDriver driver;
   public HomePage (WebDriver driver) {this.driver = driver;}
	   
	 
  public void ClickLogin() {
		   
		      driver.manage().window().maximize();
		      WebElement Element = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/button[1]"));
		      JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("arguments[0].click();",Element);
			  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("navneeta.cku@gmail.com");
			  driver.findElement(By.xpath("//body/main[@id='liftshare']/aside[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
			  
			  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Navneeta@123");
			  driver.findElement(By.xpath( "//span[contains(text(),'Log in')]")).click();
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		      driver.findElement(By.xpath("//*[@id=\"liftshare\"]/section/div/div/div[2]/div[2]/div/div/div[1]/div")).click();
        }
   
  //Add Journey Page code
  
  public void JourneyStart() {
		   
		   
			   driver.findElement(By.xpath("//header/div[1]/div[1]/a[1]")).click();
			   driver.findElement(By.xpath(" //input[@id='AutocompleteOrigin']")).sendKeys("Southampton SO14,UK");
			   
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
			 driver.findElement(By.xpath("//*[@id=\"liftshare\"]/div[3]/div[1]/div/div/div/div[1]/div[1]/ul/li")).click();
			   
			 
			 driver.findElement(By.xpath(" //input[@id='AutocompleteDestination']")).sendKeys("Southampton SO18,UK");
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			 driver.findElement(By.xpath("//*[@id=\"liftshare\"]/div[3]/div[1]/div/div/div/div[1]/div[2]/ul/li[1]")).click(); 
			
			    
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   
              
	    driver.findElement(By.xpath("//body/main[@id='liftshare']/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("//body/main[@id='liftshare']/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
        
        
        driver.findElement(By.xpath("//span[contains(text(),'Post journey')]")).click();
			  
       }
}


