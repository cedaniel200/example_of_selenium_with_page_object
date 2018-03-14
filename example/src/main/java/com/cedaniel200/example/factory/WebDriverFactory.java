package com.cedaniel200.example.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

	private static final int DEFAULT_TIMEOUT = 10;
	private static WebDriver driver;
		
	public static WebDriver getWebDriver() {
		return getWebDriver(DEFAULT_TIMEOUT);
	}
	
	public static WebDriver getWebDriver(int timeoutInSeconds) {
		createWebDriverIfNull(timeoutInSeconds);
        return driver;
	}
	
	private static void createWebDriverIfNull(int timeout) {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "<< here place the path where chromedriver.exe is located >>");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		}
	}
	
}
