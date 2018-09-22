package com.uiautomation.apiactions;

import java.io.File;
import java.io.FileNotFoundException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.uiautomation.registeruserpojo.RegisterUserRequest;
import com.uiautomation.utils.Constants;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class RegisterUserActions {
	
	private String scenarioTestData = Constants.TEST_DATA_BASEPATH;
	private RegisterUserRequest registerUserRequest;
	public Response response;
	
	@Step
	public void getJSONRequestWithValidRegisterUserData() throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		File registerUserJson = new File(scenarioTestData + Constants.REGISTERUSER_REQUEST_DATA);
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.serializeNulls().setPrettyPrinting().create();
		registerUserRequest = gson.fromJson(new JsonReader(new java.io.FileReader(registerUserJson)), RegisterUserRequest.class);
		registerUserRequest.setEmail("useremail@test.com");
		registerUserRequest.setPassword("userpassword");
	}
	
	@Step
	public void requestQuoteAPIWithPostMethod() throws Exception {
		response = SerenityRest.given().contentType("application/json").body(registerUserRequest).when()
				.post(Constants.REGISTERUSER_ENDPOINT);
	}

	@Step
	public int getStatusCode() throws Exception {
		return response.then().extract().statusCode();
	}

	@Step
	public String getContentType() throws Exception {
		return response.then().extract().contentType();
	}
}
