package com.travelocity.stepDefinitions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.travelocity.constants.AppNames;
import com.travelocity.framework.webdriver.Context;
import com.travelocity.pageobjects.TravelocityHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Step;
import io.qameta.allure.Story;



public class BackgroundStepsDefinitions {

    private WebDriver driver;
    static String app = "";
    private TravelocityHomePage travelocityHomePage;

    public BackgroundStepsDefinitions() {
        this.driver = Hooks.getwebDriver();
    }

    @Step("I select the url of the Travelocity Home page")
    @Given("^I select the url of the Travelocity Home page$")
    public void getUrlOfTravelocityHomePage() {
        app = AppNames.TRAVELOCITY_HOME_NAME;
    }

    @Step("I go to the url of the Travelocity Home page")
    @When("^I go to the url of the Travelocity Home page$")
    public void goToUrlOfTravelocityHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException {
        Context.initializePageInstance(driver, app);
        travelocityHomePage = new TravelocityHomePage(driver);
    }

    @Story("User should not be logged in to Travelocity")
    @Step("I should not be logged in")
    @Then("^I should not be logged in$")
    public void secureThatNoUserIsLoggedInToTravelocity() {
        if(travelocityHomePage.someUserIsLoggedInApp()) {
            travelocityHomePage.signOutAccount();
        }
        Assert.assertFalse( travelocityHomePage.someUserIsLoggedInApp(),"User has not been logged out succesfully");
    }
}
