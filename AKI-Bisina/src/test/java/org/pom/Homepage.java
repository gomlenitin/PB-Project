package org.pom;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Ultilityclass {
	

	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//a[@class='header-user']")
    private WebElement LoginImageIcon; 
	
	@FindBy(xpath="//div[@class='selected-dial-code']")
    private WebElement LoginDialoption; 
	
	@FindBy(xpath="//span[text()='+91']")
    private WebElement LoginDialNumber; 
	
	@FindBy(xpath="//input[@name='mobile_number']")
    private WebElement Loginphonetext; 
	
	@FindBy(xpath="//button[@class='get-otp request-otp-btn pop-bnt']")
    private WebElement LoginOTPrequest; 
	
	@FindBy(xpath="//a[@class='get-otp submit-login-otp-btn']")
    private WebElement LoginOTPsubmit; 
	

	public WebElement getLoginImageIcon() {
		return LoginImageIcon;
	}

	public WebElement getLoginDialoption() {
		return LoginDialoption;
	}

	public WebElement getLoginDialNumber() {
		return LoginDialNumber;
	}

	public WebElement getLoginphonetext() {
		return Loginphonetext;
	}

	public WebElement getLoginOTPrequest() {
		return LoginOTPrequest;
	}

	public WebElement getLoginOTPsubmit() {
		return LoginOTPsubmit;
	}
	
	
	
	

	
}
