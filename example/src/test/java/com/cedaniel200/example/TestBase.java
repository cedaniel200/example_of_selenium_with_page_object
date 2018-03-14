package com.cedaniel200.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.cedaniel200.example.factory.WebDriverFactory;

public class TestBase {

protected static WebDriver driver;
	
	@BeforeClass
	public static void initializeWebDriver() {
		driver = WebDriverFactory.getWebDriver();
	}
	
	@AfterClass
    public static void quit() {
    	driver.quit();
    	driver = null;
    }
}
