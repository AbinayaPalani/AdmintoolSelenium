package com.admintool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonCode {
	
	private static WebElement element;
	
	public static WebElement submitForm(WebDriver driver){
		
		element = driver.findElement(PathSource.SubmitForm);
		return element;
	}
	
	public static WebElement clearForm(WebDriver driver){
		
		element = driver.findElement(PathSource.ClearButton);
		return element;
	}
	
	
	
	

}
