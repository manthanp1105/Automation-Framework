package com.qa.Utiities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ElementUtilsMethods {

	public  WebDriver driver;
	
	public ElementUtilsMethods(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement doGetElement(By locator) {
		return driver.findElement(locator);

	}

	public boolean doElementPresent(By locator) {
		return driver.findElement(locator).isDisplayed();

	}

	public void doSendKeys(By locator, String value) {
		doGetElement(locator).sendKeys(value);
	}

	public String doGetText(By locator) {
		return doGetElement(locator).getText();

	}

	public void doClick(By locator) {
		doGetElement(locator).click();
	}

	public List<WebElement> doSelectElements(By locator, String value) {
		List<WebElement> menus = driver.findElements(locator);
		for (WebElement e : menus) {
			String text = e.getText();
			if (text.contains(value)) {
				e.click();
				break;
			}
		}

		return menus;

	}
	// ################## Select Class #################

	public void doSelectByIndex(WebElement locator, int index) {
		Select select = new Select(locator);
		select.selectByIndex(index);
	}

	public void doSelectByValue(WebElement locator, String value) {
		Select select = new Select(locator);
		select.selectByValue(value);
	}

	public void doSelectByText(WebElement locator, String value) {
		Select select = new Select(locator);
		select.selectByVisibleText(value);
	}
	// ########################################################

	// ################# Actions Class ################

	public void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(doGetElement(locator), value).build().perform();

	}

	public void doDragAndDrop(WebElement ele1, WebElement ele2) {
		Actions action = new Actions(driver);
		action.dragAndDrop(ele1, ele2).build().perform();
	}

	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(doGetElement(locator)).build().perform();
	}

	public void doDragDrop(WebElement ele1, WebElement ele2) {
		Actions action = new Actions(driver);
		action.clickAndHold(ele1).moveToElement(ele2).release().build().perform();

	}

	public void doRightClick(WebElement ele) {
		Actions action = new Actions(driver);
		action.contextClick(ele);

	}

	public void doHoverOnElement(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele);

	}

	public void doPageScrollUp() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
	}
	public void doPageScrollDown() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).perform();
	}
	
	

}
