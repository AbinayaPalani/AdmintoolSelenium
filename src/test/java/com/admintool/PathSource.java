package com.admintool;

import org.openqa.selenium.By;

public class PathSource {
	
	
	public static By Email = By.cssSelector("input[name='email']");
	public static By Password = By.cssSelector("input[name='password']");
	public static By LoginButton = By.xpath(".//button[@class='button-primary ']/span[text()='Login']");
	public static By FetchAccount = By.xpath(".//input[@id='fetchAccountInput']");
	public static By FetchAccountButton = By.xpath(".//a[@id='fetch_ac_btn']");
	public static By BillingTab = By.cssSelector("li[id='billing']");
	public static By AdminToolMenu = By.cssSelector("button[class='nostyle admin-tool-btn']");
	public static By IframeAdminToolId = By.id("adminTool");
	public static By AccountSummaryEditOption = By.id("editOption");
	public static By AccountActivity = By.id("acc-activityBtn");
	public static By SubmitForm = By.cssSelector("button#formSubmit.submit_btn");
	public static By ClearButton = By.cssSelector("button#formClear");
	public static By IndustryEdit = By.id("industryButton");
	public static By IndustryValue = By.xpath(".//span[@id='industry']");
	public static By IndustryTypeValue = By.xpath(".//input[@id='industryInput']");
	public static By IndustryListCount = By.xpath(".//ul[@id='industryList']/li");
	public static By MonthlyBillingDateSelect = By.xpath("//div[@class='dropdownmenu bottom']/ul[@id='billingDatesUL']/li");
	public static By AccountTypeChangeButton = By.id("accountTypeButton");
	public static By AutoUpgradeToggleButton = By.id("autoUpgradeToogle");
	public static By AllowAch = By.id("allowACHtoogle");
	public static By AutoPay = By.id("autoPayToogle");
	public static By ExcludeCollectionButton = By.id("excludeCollectionToogle");
	public static By ExcessUsageCharges = By.id("excessUsageChargesToogle");
	public static By CurrentAccountStatus = By.id("accountStatus");
	public static By ChangeAccountStatus = By.xpath(".//button[@id='accountStatusButton']/span");
	public static By Cancel_CancelName = By.xpath("//input[@id='popupName']");
	public static By Cancel_PhoneNumber = By.xpath("//input[@id='popupNumber']");
	public static By DsLink = By.xpath("//input[@id='popupURL']");
	public static By Cancel_CancelReason = By.xpath("//button[@id='popupCancellationReasonButton']");
	public static By Cancel_Addtnl = By.xpath("//textarea[@id='popupDescription']");
	public static By Cancel_AddtnlCancelReason = By.xpath("//textarea[@id='cancelReason']");
	public static By DatePeriod_30Days = By.id("datePeriod_30");
	public static By DatePeriod_60Days = By.id("datePeriod_60");
	public static By DatePeriod_90Days = By.id("datePeriod_90");
	public static By DatePeriod_180Days = By.id("datePeriod_180");
	public static By DatePeriod_1year = By.id("datePeriod_year");
	public static By DatePeriod_CustomDate = By.id("datePeriod_custom");
	public static By Notes = By.id("popupDescription");
	public static By CreateLink = By.xpath(".//span[@id='newRequest']");
	public static By Amount = By.xpath(".//input[@id='popupAmount']");
	public static By Reason = By.xpath(".//button[@id='popupReasonDropDownButton']");
	public static By ReasonList = By.xpath(".//ul[@id='popupReasonList']/li");
	public static By TransactionsList = By.xpath("//table[@id='paymentHistoryTable']/tbody/tr");
	public static By Refund = By.xpath("//table[@id='paymentHistoryTable']/tbody/tr/td[6]/a");
	public static By OtherReason = By.xpath("//textarea[@id='popupReason']");
	public static By CompanyName = By.xpath(".//input[@id='teamName']");
	public static By PrimaryAccountNum = By.xpath(".//input[@id='primaryAccount']");
	public static By AccountStatus = By.xpath(".//input[@id='userStatus']");
	//public static By IndustryValue = By.xpath(".//div[@id='industryDiv']/div/button/span");
	
	
	public static By NoPaymentHistory = By.xpath(".//tbody[@id='paymentHistoryBody']/tr/td[text()='No Payment History!']");
	
	//Section
	public static By ChangeStatus = By.id("changeStatus");
	public static By AccountDetails = By.id("accountSummary");
	public static By Credit = By.id("credit");
	public static By Debit = By.id("debit");
	public static By Re_rate = By.id("rerate");
	public static By ChangePlan = By.id("changePlan");
	public static By ChangeAssetPrice = By.id("changeAssetPrice");


	
	
	
	
}
