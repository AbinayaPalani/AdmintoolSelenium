package com.admintool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	
	private static WebElement element;
	
	public static WebElement textBox_UserName(WebDriver driver)
	{
			
		element = driver.findElement(PathSource.Email);
		return element;		
	}
	
	public static WebElement textBox_Password(WebDriver driver){
		
		element = driver.findElement(PathSource.Password);
		return element;
	}
	
	public static WebElement loginButton(WebDriver driver){
		
		element = driver.findElement(PathSource.LoginButton);
		return element;
	}
	
	public static WebElement fetchAccount(WebDriver driver){
		
		element = driver.findElement(PathSource.FetchAccount);
		return element;
		
	}
	
	public static WebElement fetchButton(WebDriver driver){
		
		element = driver.findElement(PathSource.FetchAccountButton);
		return element;
	}
	
	public static WebElement billingTab(WebDriver driver){
		
		element = driver.findElement(PathSource.BillingTab);
		return element;
	}
	
	public static WebElement adminToolMenu(WebDriver driver){
		
		element = driver.findElement(PathSource.AdminToolMenu);
		return element;
	}

}
