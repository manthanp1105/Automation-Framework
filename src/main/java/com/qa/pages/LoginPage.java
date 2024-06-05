package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Utiities.ElementUtilsMethods;

public class LoginPage {

	private By Registerlink = By.linkText("Register");
	private By username = By.id("input-email");
	private By password = By.id("input-password");
	private By loginbtn = By.xpath("//input[@value = 'Login']");

	public WebDriver driver;
	ElementUtilsMethods eu;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtilsMethods(driver);

	}

	public String getPageTitle() {
		String acttitle = driver.getTitle();
		return acttitle;
	}

	public String getRegisterLink() {
		String text = eu.doGetElement(Registerlink).getText();
		return text;

	}

	public AccountsPage doLogin(String un, String pass) {

		eu.doGetElement(username).sendKeys(un);
		eu.doGetElement(password).sendKeys(pass);
		eu.doClick(loginbtn);
		return new AccountsPage(driver);

	}

	public RegisterPage goToRegisterPage() {
		eu.doClick(Registerlink);
		return new RegisterPage(driver);

	}

}
