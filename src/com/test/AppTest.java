package com.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest{

	@Test
	public void  testOpenWeb(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		
	
	
	}
	
	
	
}