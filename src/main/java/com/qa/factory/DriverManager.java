package com.qa.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	public Properties prop;

	public WebDriver driver;
	String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";

	public WebDriver initDriver(String browser) {
		if (browser.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.trim().equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else
			System.out.println("Please Pass the Valid Browser");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);

		return driver;
	}

 
	public Properties initProperties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop;

	}
}
