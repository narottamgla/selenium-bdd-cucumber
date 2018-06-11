package com.uiautomation.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleSearchPage extends PageObject {

	@FindBy(name = "q")
	private WebElement searchTxBx;

	@FindBy(css = "#search h3 a")
	private List<WebElement> searchResults;

	public void performSearch(String searchKeyword) {
		waitFor(searchTxBx);
		searchTxBx.clear();
		searchTxBx.sendKeys(searchKeyword);
		searchTxBx.submit();
	}

	public List<String> getSearchResultList() {
		List<String> results = new ArrayList<>();
		for (WebElement result : searchResults) {
			results.add(result.getText().toLowerCase());
		}
		return results;
	}
}
