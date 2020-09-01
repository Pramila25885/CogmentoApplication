package com.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;

public class LoginPage extends Library{
	
//Constructor
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@name='email']")
	WebElement Email;
	@FindBy(xpath="//*[@name='password']")
	WebElement Password;
	@FindBy(xpath="//*[text()='Login']")
	WebElement Loginbtn;
	
	public void login(String email, String password) {
		Email.sendKeys(email);
		Password.sendKeys(password);
	}
			
	public void submit() {
		Loginbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
