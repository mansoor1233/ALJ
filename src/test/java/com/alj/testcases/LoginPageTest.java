package com.alj.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.alj.base.TestBase;
import com.alj.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;

	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException {
		browserinitialization();
		loginPage = new LoginPage();

	}

	@org.testng.annotations.Test(priority = 1)
	public void loginpagePageTitle() {
		String title = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Appian for ALJ Automotive Holding Company Limited");

	}

	@org.testng.annotations.Test(priority = 2)
	public void AppianLogoImageTest() {
		boolean flag = loginPage.validateAppianLogo();
		Assert.assertTrue(flag);
		;
	}

	@org.testng.annotations.Test(priority = 3)
	public void LoginDetailsTest() {
		loginPage.logindetails(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
