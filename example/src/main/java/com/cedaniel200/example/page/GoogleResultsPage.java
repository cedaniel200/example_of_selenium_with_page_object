package com.cedaniel200.example.page;

import org.openqa.selenium.WebDriver;

public class GoogleResultsPage extends PageBase {
	
	public GoogleResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}
