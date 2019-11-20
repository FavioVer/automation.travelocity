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

    public void getUrlOfTravelocityHomePage() {
        app = AppNames.TRAVELOCITY_HOME_NAME;
    }

    @Given("^I am on the Travelocity Home page$")
    public void goToTravelocityHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException {
        getUrlOfTravelocityHomePage();
        Context.initializePageInstance(driver, app);
        travelocityHomePage = new TravelocityHomePage(driver);
    }

    @Given("^I am not logged in Travelocity$")
    public void getNotLoggedUser() throws EncryptedDocumentException {
    }

    @When("^I click on the account menu for not logged users$")
    public void clickOnTheAccountMenuForNotLoggedUsers()
            throws EncryptedDocumentException {
        Assert.assertTrue("User cannot see the account menu option for the not logged users",
                travelocityHomePage.isAccountMenuButtonVisible());
    }

    @Then("^I should be able to see the create account option$")
    public void verifyUserCanSeeCreateAccountOption()
            throws EncryptedDocumentException {
        Assert.assertTrue("User cannot see the option to create an account",
                travelocityHomePage.isAccountMenuButtonVisible());
    }

    @When("^click on the available option to log in from the account menu$")
    public void selectAvailableLogInOptionFromAccountMenu() throws EncryptedDocumentException {

    }

    @When("^enter a username as \"([^\\\"]*)\" on the user field$")
    public void enterUsernameAs(String user) throws EncryptedDocumentException {
        Assert.assertTrue("User was not entered correctly", StringUtils.isNotBlank(user));
    }


    @When("^enter a password as \"([^\\\"]*)\" on the password field$")
    public void enterPasswordAs(String password)
            throws EncryptedDocumentException {
        Assert.assertTrue("User was not entered correctly", StringUtils.isNotBlank(password));
    }


    @When("^I click on the login option$")
    public void clickOnTheLoginOption() throws EncryptedDocumentException {

    }

    @Then("^I should be able to see the account menu option for my logged user$")
    public void verifyUserCanSeeAccountMenuForLoggedUser() {
        Assert.assertTrue("User can not see the account menu for their logged user",
                travelocityHomePage.isAccountMenuButtonForLoggedUserVisible());
    }
}
