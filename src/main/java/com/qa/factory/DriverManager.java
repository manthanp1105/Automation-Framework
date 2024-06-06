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
	
	// one forward slash ** Enter
	
	/**
	 * 
	 * @param browser
	 * @return
	 */
	
	public WebDriver initDriver(Properties prop) {
		
		String browsername = prop.getProperty("browser").toLowerCase().trim();
		
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else
			System.out.println("Please Pass the Valid Browser");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

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
