package com.admintool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountSummary {
	
	private static WebElement element;
	
	public static WebElement accountSummarySection(WebDriver driver){
		
		element = driver.findElement(PathSource.AccountDetails);
		return element;
	}
	
	public static WebElement accountActivitySection(WebDriver driver){
		
		element = driver.findElement(PathSource.AccountActivity);
		return element;
	}
	
	public static WebElement getCompanyName(WebDriver driver){
		
		element = driver.findElement(PathSource.CompanyName);
		return element;
		
	}
	
	public static WebElement getPrimaryAccount(WebDriver driver){
		
		element = driver.findElement(PathSource.PrimaryAccountNum);
		return element;
	}
	
	public static WebElement getCustomerStatus(WebDriver driver){
		
		element = driver.findElement(PathSource.AccountStatus);
		return element;
	}

	public static WebElement getIndustry(WebDriver driver){
		
		element = driver.findElement(PathSource.IndustryValue);
		return element;
	}
	
	
	
	
	

}
