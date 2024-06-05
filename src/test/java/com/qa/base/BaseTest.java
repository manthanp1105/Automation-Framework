package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.factory.DriverManager;
import com.qa.pages.AccountsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.RegisterPage;

public class BaseTest {

	WebDriver driver;
	protected DriverManager dm;
	protected LoginPage lp;
	protected AccountsPage ap;
	protected RegisterPage rp;

	@BeforeTest
	public void setUp() {

		dm = new DriverManager();
		driver = dm.initDriver("chrome");
		lp = new LoginPage(driver);
		ap = new AccountsPage(driver);
		rp = new RegisterPage(driver);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
