package com.uiautomation.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.nlbootcamps.com/")
public class SignUpPage extends PageObject {

    @FindBy(linkText="Sign up")
    private WebElement signUpLink;

    @FindBy(css="h5.modal-title")
    private WebElement signPageHeader;
    
    @FindBy(id="user_email")
    private WebElement userEmailTxBx;
    
    @FindBy(id="firstname")
    private WebElement firstNameTxBx;
    
    @FindBy(id="lastname")
    private WebElement lastNameTxBx;
    
    @FindBy(id="phoneNumber")
    private WebElement phoneNumberTxBx;
    
    @FindBy(id="user_male")
    private WebElement genderDropdown;
    
    @FindBy(id="password")
    private WebElement passwordTxBx;
    
    @FindBy(id="password2")
    private WebElement confirmpasswordTxBx;
    
    @FindBy(id="form-submit")
    private WebElement signUpButton;

    public void navigateToSignUpUserPage() {
    	waitFor(signUpLink);
    	signUpLink.click();
    }

    public boolean isNavigateToSignUpPage() {
    	waitFor(signPageHeader);
        return signPageHeader.isDisplayed();
    }
    
   public void enterSignUpDetails(String userName, String firstName,String lastName, String phoneNumber,String password,String cpassword) {
	   userEmailTxBx.clear();
	   userEmailTxBx.sendKeys(userName);
	   firstNameTxBx.clear();
	   firstNameTxBx.sendKeys(firstName);  
	   lastNameTxBx.clear();
	   lastNameTxBx.sendKeys(lastName);  
	   lastNameTxBx.clear();
	   phoneNumberTxBx.clear();
	   phoneNumberTxBx.sendKeys(phoneNumber);
	   passwordTxBx.clear();
	   passwordTxBx.sendKeys(password);
	   confirmpasswordTxBx.clear();
	   confirmpasswordTxBx.sendKeys(cpassword);
   }
   
   public void clickSignUpButton() {
	   signUpButton.click();   
   }
}    