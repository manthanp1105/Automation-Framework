package com.qa.pages;

import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;	
		
	}
	public String getPageTitle() {
		String accpagetitle = driver.getTitle();
		return accpagetitle;
		
	}
	

}
