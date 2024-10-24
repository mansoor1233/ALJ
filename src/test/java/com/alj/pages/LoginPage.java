package com.alj.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.alj.base.TestBase;

public class LoginPage extends TestBase {

	// Pagefactory-object repository

	@FindBy(name = "un")
	WebElement username;

	@FindBy(name = "pw")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;

	@FindBy(xpath = "//a[contains(text(),'Forgot your password')]")
	WebElement forgotpassword;

	@FindBy(xpath = "//img[@id='logo']")
	WebElement logo;

	// Initializing the PageObjects

	public LoginPage() throws IOException {

		PageFactory.initElements(driver, this);
	}

	// Actions
	public String ValidateLoginPageTitle() {
		return driver.getTitle();

	}

	public boolean validateAppianLogo() {
		return logo.isDisplayed();

	}

	public void logindetails(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		submit.click();
		//return new homepage();
		

	}

}
