package com.uiautomation.steps;

import com.uiautomation.pages.GoogleSearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.steps.ScenarioSteps;

public class GoogleSearchSteps extends ScenarioSteps {

	GoogleSearchPage googleSearchPage;

	@Given("^User navigate to google Home Page$")
	public void user_navigate_to_google_Home_Page() throws Exception {
		googleSearchPage.open();
	}

	@When("^User enters search keyword as \"([^\"]*)\"$")
	public void user_enters_search_keyword_as(String arg1) throws Exception {
		googleSearchPage.performSearch(arg1);
	}

	@Then("^Search result should display as search keywrod \"([^\"]*)\"$")
	public void search_result_should_display_as_search_keywrod(String arg1) throws Exception {
		Assert.assertTrue(googleSearchPage.getSearchResultList().get(0).contains(arg1.toLowerCase()));
	}
}
