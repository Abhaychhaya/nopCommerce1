package com.nopCommerce1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver Idriver;
	
	public LoginPage(WebDriver rdriver){
		
		Idriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
	}
    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtEmail;
    
    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;
     
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    @CacheLookup
    WebElement btnLogin;
    
    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement lnkLogout;
    
    //Action Method Created 
    
    public void setUserName(String Uname) {
    	txtEmail.clear();
    	txtEmail.sendKeys(Uname);
    	
    }
    
    public void setPassword(String Pwd) {
    	txtPassword.clear();
    	txtPassword.sendKeys(Pwd);
    }
    
    public void clickLogin() {
    	
    	btnLogin.click();
    }
    
    public void clickLogout() {
    	
    	lnkLogout.click();
    }

}
