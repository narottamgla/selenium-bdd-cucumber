package com.uiautomation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

import com.uiautomation.pages.SignUpPage;

public class SignUpNLBC {

	SignUpPage signUpPage;

	@Then("^User clicks on signup link on login page$")
	public void user_clicks_on_signup_link_on_login_page() throws Exception {
		signUpPage.navigateToSignUpUserPage();
	}

	@When("^the user navigated to signup page$")
	public void the_user_navigated_to_signup_page() throws Exception {
		Assert.assertEquals(true, signUpPage.isNavigateToSignUpPage());

	}

	@When("^User enters singup details as Email as \"([^\"]*)\" and Gender as \"([^\"]*)\"$")
	public void user_enters_singup_details_as_Email_as_and_Gender_as(String arg1, String arg2) throws Exception {
		signUpPage.enterSignUpDetails("test@test.com", "firstName", "lastName", "phoneNumber", "password", "cpassword");
		signUpPage.clickSignUpButton();
	}

	@Then("^the user should not registred successfuly with NLBC$")
	public void the_user_should_not_registred_successfuly_with_NLBC() throws Exception {
		Assert.assertEquals(true, signUpPage.isNavigateToSignUpPage());
	}
}
