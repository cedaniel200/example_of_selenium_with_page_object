package com.cedaniel200.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends PageBase {
	
	private static final String URL = "https://www.google.com.co";
	
	@FindBy(id="lst-ib")
	private WebElement searchField;
	
	@FindBy(name="btnK")
	private WebElement googleSearchButton;

	public GooglePage(WebDriver driver) {
		super(driver);
	}
	
	public void open() {
		driver.get(URL);
	}

	public void enterTermToSearch(String searchTerm) {
		searchField.sendKeys(searchTerm);
	}
	
	public GoogleResultsPage clickOnGoogleSearch() {
		googleSearchButton.click();
		return new GoogleResultsPage(driver);
	}

}