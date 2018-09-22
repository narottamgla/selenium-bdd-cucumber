package com.uiautomation.steps;

import org.junit.Assert;

import com.uiautomation.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jline.internal.Log;
import net.serenitybdd.core.Serenity;

public class LoginNLBCSteps {

	LoginPage loginPage;

	@Given("^the user is navigate to homepage$")
	public void the_user_is_navigate_to_homepage() throws Exception {
		Log.info("ENV: "+Serenity.sessionVariableCalled("Env"));
		loginPage.open();
		Assert.assertTrue(loginPage.isNavigateToHomePage());
	}

	@When("^the user click on join link$")
	public void the_user_click_on_join_link() throws Exception {
		loginPage.navigateJoinUserPage();
	}

	@Then("^login user page should display to user$")
	public void register_user_page_should_display_to_user() throws Exception {
		Assert.assertTrue(loginPage.isNavigateToLoginPage());
	}

	@When("^the user enters Invalid details$")
	public void the_user_enters_Invalid_details() throws Exception {
		loginPage.enterLoginCredentials("user", "password");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_with_email_button() throws Exception {
		loginPage.clickLoginButton();
	}
}
