package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;

public class LoginPageTest extends BaseTest {

	public WebDriver driver;

	@Test (priority =1)
	public void loginPageTitleTest() {
		String title = lp.getPageTitle();
		System.out.println("Login Page title is: "+title);
		Assert.assertEquals(title, "Account Login");
	}

	@Test (priority =2)
	public void registerLinkTest() {
		String exptext = lp.getRegisterLink();
		//System.out.println("Link name is: "+exptext);
		Assert.assertEquals(exptext, "Register");
	}

	@Test(priority =3)
	public void loginTest() {
		lp.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}

}
