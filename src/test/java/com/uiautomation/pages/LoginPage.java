package com.uiautomation.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

@DefaultUrl("http://www.nlbootcamps.com/")
public class LoginPage extends PageObject {

	@FindBy(css = ".nav-link[data-toggle='modal']")
	private WebElement joinLink;

	@FindBy(css = ".navbar a img")
	private WebElement homePageLogo;

	@FindBy(name = "username")
	private WebElement joinUserPageHeader;

	@FindBy(id = "username")
	private WebElement userNameTxBx;

	@FindBy(xpath = "(//*[@id='password'])[2]")
	private WebElement userPasswordTxBx;

	@FindBy(xpath = "(//input[@value='Login'])")
	private WebElement loginButton;

	public void navigateJoinUserPage() {
		//waitFor(joinLink);
		joinLink.click();
	}

	public boolean isNavigateToHomePage() {
		waitFor(homePageLogo);
		return homePageLogo.isDisplayed();
	}

	public boolean isNavigateToLoginPage() {
		waitFor(joinUserPageHeader);
		return joinUserPageHeader.isDisplayed();
	}

	public void enterLoginCredentials(String userName, String userPassword) {
		userNameTxBx.clear();
		userNameTxBx.sendKeys(userName);
		userPasswordTxBx.clear();
		userPasswordTxBx.sendKeys(userPassword);
	}

	@Step
	public void clickLoginButton() {
		loginButton.click();
	}
}