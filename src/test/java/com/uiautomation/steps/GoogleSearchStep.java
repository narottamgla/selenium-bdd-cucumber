package com.uiautomation.steps;

import com.uiautomation.actions.GoogleSearchActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleSearchStep {
	@Steps
	GoogleSearchActions googleSearchActions;

	@Given("I want to search in Google")
	public void iWantToSearchInGoogle() throws Throwable {
		googleSearchActions.openGoogleSearchPage();
	}

	@When("I search for '(.*)'")
	public void iSearchFor(String searchRequest) throws Throwable {
		googleSearchActions.searchFor(searchRequest);
	}

	@Then("I should see link to '(.*)'")
	public void iShouldSeeLinkTo(String searchResult) throws Throwable {
		googleSearchActions.verifyResult(searchResult);
	}
}