package com.admintool;


import java.awt.Toolkit;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AdminMainFunction {
	
	private static WebDriver driver = null;
	Random creditRandom, debitRandom;
	

	@Test
	public void adminToolCalls() throws InterruptedException{
		

		
		
		APICalls.getUserByAccountPin();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		//options.addArguments("--headless");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(options);
		
		java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
        Dimension dim= new Dimension((int)screenSize.getWidth(),(int)screenSize.getHeight());

        driver.manage().window().setSize(dim);
		
		Actions actions = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 10000);
		
		driver.get("https://staging.access.answerconnect.com");
		
		Login.textBox_UserName(driver).sendKeys("abinaya.palani@anywhere.co");
		
		Login.textBox_Password(driver).sendKeys("mani1798");
		
		Login.loginButton(driver).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(PathSource.FetchAccount));
		
		Login.fetchAccount(driver).sendKeys("tester@a.com");
		
		Login.fetchButton(driver).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//ul[@id='search_Result']")));
		
		Login.fetchButton(driver).click();
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(PathSource.BillingTab));
		
		Login.billingTab(driver).click();
		
		Login.adminToolMenu(driver).click();
		
		System.out.println(1);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("adminTool")));
		
		System.out.println(2);
		
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("adminTool");

		
		System.out.println(3);
		 
		System.out.println(driver.switchTo().activeElement());
		
		String CompanyName = AccountSummary.getCompanyName(driver).getAttribute("value");
		
		System.out.println("Team Name:"+CompanyName);
			
		System.out.println(APICalls.CompanyName);
		
		Assert.assertEquals("Problem with companyName", APICalls.CompanyName, CompanyName);
		
		String PrimaryNumber = AccountSummary.getPrimaryAccount(driver).getAttribute("value");
		
		Assert.assertEquals("Problem with Primary Account Number", APICalls.primaryAccountNumber, PrimaryNumber);
		
		String CustomerStatus = AccountSummary.getCustomerStatus(driver).getAttribute("value");
		
		Assert.assertEquals("Problem with customer status", APICalls.CustomerStatus, CustomerStatus);
		
		
		//Credit Submit section
		
		if(Credit.creditSection(driver).isDisplayed()){

			Credit.creditSection(driver).click();
			
			Credit.createCreditLink(driver).click();
			
			Credit.getDSLinkForCredit(driver).sendKeys("https://www.google.com");
			
			Credit.getCreditAmount(driver).sendKeys("1.9");
			
			Credit.getCreditReason(driver).click();
			
			System.out.println(Credit.getCreditReasonCountList(driver).size());
			
			creditRandom = new Random();
			
			int randomNumCredit = 1 + creditRandom.nextInt(Credit.getCreditReasonCountList(driver).size());
			
			System.out.println(randomNumCredit);
			
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(PathSource.Reason));
			
			
			int CreditReason = Credit.getCreditReasonCountList(driver).size();
			
			
			
			System.out.println("Passing number"+Credit.getCreditReasonCountList(driver).size());
			
			WebElement reasonElementscroll = driver.findElement(By.xpath(".//ul[@id='popupReasonList']/li"+"["+randomNumCredit+"]"));

			
			List<WebElement> reasonElement = driver.findElements(By.xpath(".//ul[@id='popupReasonList']/li"));
			
			System.out.println(reasonElement.toString());

			
			//WebElement reasonElement = driver.findElement(By.xpath(".//ul[@id='popupReasonList']/li"+"["+randomNumCredit+"]"));

			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", reasonElementscroll);
			
			Thread.sleep(1000);
			
			
			if(randomNumCredit==16){
		
				
				
				
				//actions.moveToElement(reasonElement).click().perform();
				
				Thread.sleep(1000);
				
				reasonElementscroll.click();
				//reasonElement.get(randomNumCredit).click();

				
				//river.findElement(By.xpath(".//ul[@id='popupReasonList']/li"+"["+randomNumCredit+"]")).click();
				
				Credit.getOtherCreditReason(driver).sendKeys("Testing the credit adjustment and filling the content in credit other reason");
								
				
			}
			else{
		    
			//driver.findElement(By.xpath(".//ul[@id='popupReasonList']/li"+"["+randomNumCredit+"]")).click();
				Thread.sleep(1000);
				
				reasonElementscroll.click();
				//reasonElement.get(randomNumCredit).click();
			
			}
			
			Credit.getAdditionalNotesForCredit(driver).sendKeys("Testing the credit adjustment in admintool...!");
			
			CommonCode.submitForm(driver).click();
			
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(Debit.debitSection(driver)));
			
			//Debit Submit Section
			
			
			if(Debit.debitSection(driver).isDisplayed()){
				
				Debit.debitSection(driver).click();
				
				Debit.createDebitLink(driver).click();
				
				Debit.getDsLinkForDebit(driver).sendKeys("abinaya@test.com");
				
				debitRandom = new Random();
				
				Debit.debitAmount(driver).sendKeys("1");
				
				Debit.getDebitReason(driver).click();
				
				int randomNumDebit = 1 + debitRandom.nextInt(Debit.getDebitReasonCountList(driver).size());
				
				
				if(Debit.getDebitReasonCountList(driver).size() == 5){
					
					driver.findElement(By.xpath(".//ul[@id='popupReasonList']/li"+"["+randomNumDebit+"]")).click();
					
					Debit.getDebitOtherReason(driver).sendKeys("Testing the debit adjustment and filling the content in credit other reason");
					
					
				}
				
				else{
					
					driver.findElement(By.xpath(".//ul[@id='popupReasonList']/li"+"["+randomNumDebit+"]")).click();	
					
				}
				
				Debit.getAdditionalNotesForDebit(driver).sendKeys("Testing the debit adjustment in admin tool..!");
				
				CommonCode.submitForm(driver).click();
					
			}
			
			//Refund Section
			
			if(Refund.refundSection(driver).isDisplayed()){
				
				Refund.refundSection(driver).click();
				
				if(Refund.checkPaymentHistory(driver).isDisplayed()){
					
					
					
				}
				else{
				
					Refund.refundLink(driver).click();
					
					Refund.getDsLinkForRefund(driver).sendKeys("abinaya@test.com");
					
					
					
					
					
			   }
				
				
				
				
			}
			
			
		
		

		
		
		
		
		
		
			
	}
	
}
