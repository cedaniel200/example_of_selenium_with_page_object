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
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\cesar.meneses\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		}
	}
	
}
