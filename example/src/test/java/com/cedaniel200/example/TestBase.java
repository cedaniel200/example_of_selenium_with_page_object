package com.cedaniel200.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class TestBase {

protected static WebDriver driver;
	
	@BeforeClass
	public static void initializeWebDriver() {
		
	}
	
	@AfterClass
    public static void quit() {
    	driver.quit();
    	driver = null;
    }
}
