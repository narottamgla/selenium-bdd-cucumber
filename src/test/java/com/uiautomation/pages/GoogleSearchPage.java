package com.uiautomation.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("https://google.com")
public class GoogleSearchPage extends PageObject {
	@FindBy(name = "q")
	private WebElement searchInputField;

	@WhenPageOpens
	public void waitUntilGoogleLogoAppears() {
		$("#hplogo").waitUntilVisible();
	}

	public void searchFor(String searchRequest) {
		element(searchInputField).clear();
		element(searchInputField).typeAndEnter(searchRequest);
	}
}
