package com.travelocity.stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.And;
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
                travelocityHomePage.clickOnAccountMenuButton();

    }

    @Then("^I should be able to see the create account option$")
    public void verifyUserCanSeeCreateAccountOption()
            throws EncryptedDocumentException {
        Assert.assertTrue("User cannot see the option to create an account",
                travelocityHomePage.isAccountMenuButtonVisible());
    }

    @When("^click on the available option to log in from the account menu$")
    public void selectAvailableLogInOptionFromAccountMenu() throws EncryptedDocumentException {
        travelocityHomePage.clickOnSignInExclusiveMembersOption();
    }

    @When("^enter a username as \"([^\\\"]*)\" on the user field$")
    public void enterUsernameAs(String email) throws EncryptedDocumentException {
        travelocityHomePage.sendTypeOnEmailAddressInput(email);
    }


    @When("^enter a password as \"([^\\\"]*)\" on the password field$")
    public void enterPasswordAs(String password)
            throws EncryptedDocumentException {
        travelocityHomePage.sendTypeOnPasswordInput(password);
    }


    @When("^I click on the login option$")
    public void clickOnTheLoginOption() throws EncryptedDocumentException {
        travelocityHomePage.clickOnSignInButton();
    }

    @Then("^I should be able to see the account menu option for my logged user$")
    public void verifyUserCanSeeAccountMenuForLoggedUser() {
        Assert.assertTrue("User can not see the account menu for their logged user",
                travelocityHomePage.isAccountMenuButtonForLoggedUserVisible());
    }

    @When("I go to the section for services selection")
    public void iGoToTheSectionForServicesSelection() {

    }

    @Then("All the options for services selection should be visible and clickable")
    public void allTheOptionsForServicesSelectionShouldBeVisibleAndClickable() {
        Assert.assertTrue("The button for Flight section is not clickable.",travelocityHomePage.isFlightSectionButtonClickable());
        Assert.assertTrue("The button for Hotels section is not clickable.",travelocityHomePage.isHotelsSectionButtonClickable());
    }

    @When("I click on the Hotels selection")
    public void iClickOnTheHotelsSelection() {
        travelocityHomePage.clickOnHotelsButton();
    }

    @Then("The destination input is visible and enable")
    public void theDestinationInputIsVisibleAndEnable() {
        Assert.assertTrue("The destination input is not visible.",travelocityHomePage.isDestinationInputVisible());
    }

    @And("The check in input should be visible and enable")
    public void theCheckInInputShouldBeVisibleAndEnable() {
        Assert.assertTrue("The check in input is not visible.",travelocityHomePage.isCheckInInputVisible());
    }

    @And("The search button should be visible and clickable")
    public void theSearchButtonShouldBeVisibleAndClickable() {
        Assert.assertTrue("The hotels search button is not visible.",travelocityHomePage.isHotelsSearchButtonClickable());
    }
}
