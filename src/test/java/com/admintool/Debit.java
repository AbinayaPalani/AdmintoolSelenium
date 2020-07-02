package com.admintool;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Debit {
	
	private static WebElement element;
	private static List<WebElement> elements;
	
	public static WebElement debitSection(WebDriver driver){
		
		element = driver.findElement(PathSource.Debit);
		return element;
	}
	
	public static WebElement createDebitLink(WebDriver driver){
		
		element = driver.findElement(PathSource.CreateLink);
		return element;
		
	}
	
	public static WebElement getApprovedByDebit(WebDriver driver){
		
		element = driver.findElement(PathSource.ApprovedBy);
		return element;
	}
	
	public static WebElement debitAmount(WebDriver driver){
		
		element = driver.findElement(PathSource.Amount);
		return element;
	}
	
	public static WebElement getDebitReason(WebDriver driver){
		
		element = driver.findElement(PathSource.Reason);
		return element;
	}
	
	public static WebElement getDebitOtherReason(WebDriver driver){
		
		element = driver.findElement(PathSource.OtherReason);
		return element;
	}
	
	public static WebElement getAdditionalNotesForDebit(WebDriver driver){
		
		element = driver.findElement(PathSource.Notes);
		return element;
	}
	
	public static List<WebElement> getDebitReasonCountList(WebDriver driver){
		
		elements = driver.findElements(PathSource.ReasonList);
		return elements;
	}
	

}
