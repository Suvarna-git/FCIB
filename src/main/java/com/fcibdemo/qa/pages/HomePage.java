package com.fcibdemo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fcibdemo.qa.base.TestBase;
import com.fcibdemo.qa.util.Windowhandle;

public class HomePage extends TestBase {

	Windowhandle win = new Windowhandle(driver);
	@FindBy(xpath = "//a[@title='GPS Application']")
	WebElement gpsLink;
	
	@FindBy(xpath="//a[normalize-space()='Payment']")
	WebElement paymentLink;
	
	@FindBy(xpath="//a[normalize-space()='List']")
	WebElement paymentListLink;
	
	@FindBy(xpath="//a[@title='Application Support Menu']")
	WebElement applicationSupportToolLink;
	
	@FindBy(xpath="//a[normalize-space()='Import/Export Swift']")
	WebElement importExportSwiftLink;
	
	
	@FindBy(xpath="//button[normalize-space()='Logout']")
	WebElement LogoutLink;
	
	@FindBy(xpath="//span[normalize-space()='Ok']")
	WebElement LogoutOKBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public PaymentFlow checkPayment() throws InterruptedException {
		gpsLink.click();
		paymentLink.click();
		paymentListLink.click();
		win.handlewin();
		return new PaymentFlow();
	}
	
	public PaymentFlow importSwiftLink() throws InterruptedException {
		applicationSupportToolLink.click();
		importExportSwiftLink.click();
		win.handlewin();
		return new PaymentFlow();
	} 

	public void LogOut() {
		LogoutLink.click();
		LogoutOKBtn.click();
		driver.quit();
	}
}
