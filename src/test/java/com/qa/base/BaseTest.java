package com.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.factory.DriverManager;
import com.qa.pages.AccountsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.RegisterPage;

public class BaseTest {

	WebDriver driver;
	protected DriverManager dm;
	protected LoginPage lp;
	protected AccountsPage ap;
	//protected RegisterPage rp;
	protected Properties prop;

	@BeforeMethod
	public void setUp() {

		dm = new DriverManager();
		prop = dm.initProperties();
		driver = dm.initDriver(prop);
		lp = new LoginPage(driver);
		
		
		ap = new AccountsPage(driver);
		//rp = new RegisterPage(driver);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
