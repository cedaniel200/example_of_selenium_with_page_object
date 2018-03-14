package com.cedaniel200.example;

import org.junit.Assert;
import org.junit.Test;

import com.cedaniel200.example.page.GooglePage;
import com.cedaniel200.example.page.GoogleResultsPage;

public class GoogleSearchTest extends TestBase {
	
	@Test
	public void searchGoogleTest() {
		String searchTerm = "Selenium WebDriver";
		GooglePage googlePage = new GooglePage(driver);
		
		googlePage.open();
		googlePage.enterTermToSearch(searchTerm);
		GoogleResultsPage googleResultsPage = googlePage.clickOnGoogleSearch();		
		
		Assert.assertTrue(googleResultsPage.getTitle().contains(searchTerm));
	}

}
