package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	public WebDriver driver;
	private By texts = By.xpath("//div[@id = 'content']//h2");
	private By logoutlink = By.linkText("Logout");
	private By Searchbox = By.xpath("//input[@type= 'text']");
	private By Searchicon = By.xpath("//div[@id= 'search']//button");
	

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public Boolean logoutLinkPresent() {
		return driver.findElement(logoutlink).isDisplayed();
	}
	

	public List<String> getTexts() {
		List<WebElement> headers = driver.findElements(texts);
		List<String> expheaders = new ArrayList<String>();
		for (WebElement e : headers) {
			String names = e.getText();
			expheaders.add(names);	
		}
		System.out.println(headers);
		return expheaders;

	}
	public ProductInfoPage productSearch(String prodname) {
		driver.findElement(Searchbox).sendKeys(prodname);
		driver.findElement(Searchicon).click();
		return new ProductInfoPage(driver);
		
	}
	public void searchProductCount() {
		
	}

}
