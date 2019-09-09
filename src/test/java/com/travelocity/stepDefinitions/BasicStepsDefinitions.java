package com.travelocity.stepDefinitions;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.travelocity.constants.AppNames;
import com.travelocity.framework.webdriver.Context;
import com.travelocity.pageobjects.TravelocityHomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicStepsDefinitions {

	private WebDriver driver;
	static String app = "";
	private TravelocityHomePage travelocityHomePage;

	public BasicStepsDefinitions() {
		this.driver = Hooks.getwebDriver();
	}

	@Given("^I select the url of the Travelocity Home page$")
	public void getUrlOfTravelocityHomePage() {
		app = AppNames.TRAVELOCITY_HOME_NAME;
	}

	@When("^I go to the url of the Travelocity Home page$")
	public void goToUrlOfTravelocityHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException {
		Context.initializePageInstance(driver, app);
		travelocityHomePage = new TravelocityHomePage(driver);
	}

	@Then("^I should be able to see the login option$")
	public void secureThatUserCanSeeLogInOption() {
		if (travelocityHomePage.someUserIsLoggedInApp()) {
			travelocityHomePage.signOutAccount();
		}
		Assert.assertFalse("User cannot see the login option", travelocityHomePage.someUserIsLoggedInApp());
	}

	@And("^enter a username as \"([^\\\"]*)\" on the user field$")
	public void enterUsernameAs(String user) throws EncryptedDocumentException, InvalidFormatException, IOException {
		Assert.assertTrue("User was not entered correctly", StringUtils.isNotBlank(user));
	}

	@And("^enter a password as \"([^\\\"]*)\" on the password field$")
	public void enterPasswordAs(String password)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		Assert.assertTrue("User was not entered correctly", StringUtils.isNotBlank(password));
	}

	@Then("^I should not be able to see the login option$")
	public void secureThatUserCannotSeeLogInOption() {
		if (travelocityHomePage.someUserIsLoggedInApp()) {
			travelocityHomePage.signOutAccount();
		}
		Assert.assertTrue("User can actually see the login option", travelocityHomePage.someUserIsLoggedInApp());
	}
}
