package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	
	

	/*@Test
    public void testmethod()
   {
	System.out.println("HELLO WORLD");
    }*/
	
	
	@Test
	public void lunchBrowser()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasterstechnologies.blogspot.co.uk/2018/02/maven-project-integration-with-eclipse.html");
		System.out.println("Application lunch successfully");
		
		
		System.out.println("I am Git HUB");
		
		
		
		driver.quit();
	}
}



