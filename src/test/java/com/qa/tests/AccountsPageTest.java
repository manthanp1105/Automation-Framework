package com.qa.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;

public class AccountsPageTest extends BaseTest {

	public WebDriver driver;

	@BeforeClass
	public void haveLogin() {
		ap = lp.doLogin("mpandya1105@gmail.com", "Test123");

	}

	@Test
	public void logoutLinkTest() {
		Assert.assertTrue(ap.logoutLinkPresent());
	}

	@Test
	public void accountPageHeadersTest() {
		List<String> expectedHeaders = ap.getTexts();
		Assert.assertEquals(expectedHeaders.size(), 4);

	}
	
	@Test
	public void ProductInfoTest() {
		
		ap.productSearch("Macbook");
		
		
	}
	
	

}
