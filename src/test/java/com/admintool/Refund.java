package com.admintool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Refund {
	
	private static WebElement element;
	
	public static WebElement refundSection(WebDriver driver){
		
		element = driver.findElement(PathSource.Refund);
		return element;
				
	}
	
	public static WebElement refundLink(WebDriver driver){
		
		element = driver.findElement(PathSource.Refund);
		return element;

	}
	
	public static WebElement getApprovedBy(WebDriver driver){
		
		element = driver.findElement(PathSource.ApprovedBy);
		return element;
	}
	
	public static WebElement getRefundAmount(WebDriver driver){
		
		element = driver.findElement(PathSource.Amount);
		return element;
	}
	
	public static WebElement getRefundReason(WebDriver driver){
		
		element = driver.findElement(PathSource.Reason);
		return element;
	}
	
	public static WebElement checkPaymentHistory(WebDriver driver){
		
		element = driver.findElement(PathSource.NoPaymentHistory);
		return element;
	}
}
