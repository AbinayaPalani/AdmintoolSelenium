package com.admintool;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	

	public static WebDriver driver;
	
	public void Driver(WebDriver driver){
		
		WebDriverManager.chromedriver().setup();
		Driver.driver = driver;	
	}
	
	
	
	
	

}
