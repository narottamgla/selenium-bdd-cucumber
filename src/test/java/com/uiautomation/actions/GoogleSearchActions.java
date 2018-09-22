package com.uiautomation.actions;

import java.util.ArrayList;
import java.util.List;

import com.uiautomation.pages.GoogleSearchPage;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;

public class GoogleSearchActions {
	GoogleSearchPage searchPage;

	@Step
	public void openGoogleSearchPage() {
		searchPage.open();
	}

	@Step
	public void searchFor(String searchRequest) {
		searchPage.searchFor(searchRequest);
	}

	@Step
	public List<String> verifyResult(String searchResult) {
		List<String> results = new ArrayList<>();
		//add search result to list and return
		return results;
	}
}