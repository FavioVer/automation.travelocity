package com.travelocity.stepDefinitions;

import com.travelocity.pageobjects.TravelocityHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.EncryptedDocumentException;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class BasicStepsDefinitions {

    private TravelocityHomePage travelocityHomePage;


    @Given("I am on the Travelocity Home page")
    public void goToTravelocityHomePage() throws EncryptedDocumentException, IOException {
        travelocityHomePage = new TravelocityHomePage();
        travelocityHomePage.goToPageURL(travelocityHomePage.getOwnUrl());
        assertTrue("Travelocity home has loaded properly", travelocityHomePage.isLoaded());
    }


    @Given("I am not logged in Travelocity")
    public void getNotLoggedUser() throws EncryptedDocumentException {
    }

    @When("I click on the account menu for not logged users")
    public void clickOnTheAccountMenuForNotLoggedUsers()
            throws EncryptedDocumentException {
        assertTrue("User cannot see the account menu option for the not logged users",
                travelocityHomePage.isAccountMenuButtonVisible());
    }

    @Then("I should be able to see the create account option")
    public void verifyUserCanSeeCreateAccountOption()
            throws EncryptedDocumentException {
        assertTrue("User cannot see the option to create an account",
                travelocityHomePage.isAccountMenuButtonVisible());
    }

    @When("I click on the available option to log in from the account menu")
    public void selectAvailableLogInOptionFromAccountMenu() throws EncryptedDocumentException {

    }

    @When("I enter a username as {string} on the user field")
    public void enterUsernameAs(String user) throws EncryptedDocumentException {
        assertTrue("User was not entered correctly", StringUtils.isNotBlank(user));
    }


    @When("I enter a password as {string} on the password field")
    public void enterPasswordAs(String password)
            throws EncryptedDocumentException {
        assertTrue("User was not entered correctly", StringUtils.isNotBlank(password));
    }


    @When("I click on the login option")
    public void clickOnTheLoginOption() throws EncryptedDocumentException {

    }

    @Then("I should be able to see the account menu option for my logged user")
    public void verifyUserCanSeeAccountMenuForLoggedUser() {
        assertTrue("User can not see the account menu for their logged user",
                travelocityHomePage.isAccountMenuButtonForLoggedUserVisible());
    }
}
