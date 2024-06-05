package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;

public class RegisterPageTest extends BaseTest {
	
	@Test
	public void pageTitleTest() {
		lp.goToRegisterPage();
		String actTitle = rp.getPageTitle();
		System.out.println("Title of the Register Page is: "+actTitle);
		Assert.assertEquals(actTitle, "Register Account");
		
		
	}

}
