package com.test;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	
	
	@org.testng.annotations.Test
	public void click()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://testingmasterstechnologies.blogspot.co.uk/2018/02/maven-project-integration-with-eclipse.html");
		System.err.println("Applicaton lunch successfully");
	}

}
