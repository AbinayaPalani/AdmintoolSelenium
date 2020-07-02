package com.admintool;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Credit {
	
	
	
	private static WebElement element;
	private static List<WebElement> elements;
	
	public static WebElement creditSection(WebDriver driver){
		
		
		element = driver.findElement(PathSource.Credit);
		return element;
		
	}
	
	public static WebElement createCreditLink(WebDriver driver){
		
		element = driver.findElement(PathSource.CreateLink);
		return element;
		
		
	}
	
	public static WebElement getApprovedByCredit(WebDriver driver){
		
		element = driver.findElement(PathSource.ApprovedBy);
		return element;
	}
	
	public static WebElement getCreditAmount(WebDriver driver){
		
		element = driver.findElement(PathSource.Amount);
		return element;
	}
	
	public static WebElement getCreditReason(WebDriver driver){
		
		element = driver.findElement(PathSource.Reason);
		return element;
	}
	
	public static WebElement getOtherCreditReason(WebDriver driver){
		
		element = driver.findElement(PathSource.OtherReason);
		return element;
	}
	
	public static WebElement getAdditionalNotesForCredit(WebDriver driver){
		
		element = driver.findElement(PathSource.Notes);
		return element;
	}
	
	public static List<WebElement> getCreditReasonCountList(WebDriver driver){
		
		elements = driver.findElements(PathSource.ReasonList);
		return elements;
	}
	

	

}
