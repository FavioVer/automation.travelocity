package com.travelocity.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TravelocityHomePage extends PageObjectBase {

    private static final String COPYRIGHT_FOOTER_ID = "footer-copyright-msg";
    private static final String ACCOUNT_MENU_BUTTON_LOGGED_ID = "header-account-menu-signed-in";
    private static final String ACCOUNT_MENU_BUTTON__ID = "header-account-menu";
    private static final String SIGN_OUT_OPTION_ID = "account-signout";
    private static final String CREATE_ACCOUNT_ID = "account-register";
    private static final String SIGN_IN_EXCLUSIVE_MEMBERS_ID = "account-signin";
    private static final String EMAIL_ADDRESS_INPUT_ID = "gss-signin-email";
    private static final String PASSWORD_INPUT_ID = "gss-signin-password";
    private static final String SIGN_IN_BUTTON_ID = "gss-signin-submit";
    private static final String FLIGHT_SECTION_BUTTON_ID = "tab-flight-tab-hp" ;
    private static final String HOTELS_SECTION_BUTTON_ID = "tab-hotel-tab-hp";
    private static final String DESTINATION_INPUT_ID = "hotel-destination-hp-hotel";
    private static final String CHECK_IN_INPUT_ID = "hotel-checkin-hp-hotel";
    private static final String HOTELS_SEARCH_BUTTON_CSS = "#gcw-hotel-form-hp-hotel .gcw-submit";

    @FindBy(id = ACCOUNT_MENU_BUTTON_LOGGED_ID)
    private WebElement accountMenuButtonForLoggedUser;

    @FindBy(id = ACCOUNT_MENU_BUTTON__ID)
    private WebElement accountMenuButton;

    @FindBy(id = SIGN_OUT_OPTION_ID)
    private WebElement signOutOption;

    @FindBy(id = CREATE_ACCOUNT_ID)
    private WebElement createAccountOption;

    @FindBy(id = SIGN_IN_EXCLUSIVE_MEMBERS_ID)
    private WebElement signInExclusiveMembersOption;

    @FindBy(id = EMAIL_ADDRESS_INPUT_ID)
    private  WebElement emailAddressInput;

    @FindBy(id = PASSWORD_INPUT_ID)
    private WebElement  passwordInput;

    @FindBy(id = SIGN_IN_BUTTON_ID)
    private WebElement signInButton;

    @FindBy(id = FLIGHT_SECTION_BUTTON_ID)
    private WebElement flightSectionButton;

    @FindBy(id = HOTELS_SECTION_BUTTON_ID)
    private WebElement hotelsSectionButton;

    @FindBy(id = DESTINATION_INPUT_ID)
    private WebElement destinationInput;

    @FindBy(id = CHECK_IN_INPUT_ID)
    private WebElement checkInInput;

    @FindBy(css = HOTELS_SEARCH_BUTTON_CSS)
    private WebElement hotelsSearchButton;

    public TravelocityHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageLocator() {
        return By.id(COPYRIGHT_FOOTER_ID);
    }

    public boolean isAccountMenuButtonForLoggedUserVisible() {
        try {
            return getWebDriverUtils().waitForElementToBeVisible(accountMenuButtonForLoggedUser);
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean isAccountMenuButtonVisible() {
        try {
            return getWebDriverUtils().waitForElementToBeVisible(accountMenuButton);
        } catch (TimeoutException e) {
            return false;
        }
    }
    public void clickOnAccountMenuButton(){
        click(accountMenuButton);
    }

    public void clickOnSignInExclusiveMembersOption(){
        click(signInExclusiveMembersOption);
    }

    public void sendTypeOnEmailAddressInput(String email){
        getWebDriverUtils().waitForElementToBeVisible(emailAddressInput);
        typeOnField(emailAddressInput,email);
    }

    public void sendTypeOnPasswordInput(String password){
        getWebDriverUtils().waitForElementToBeVisible(passwordInput);
        typeOnField(passwordInput,password);
    }

    public void clickOnSignInButton(){
        click(signInButton);
    }

    public void clickOnHotelsButton(){
        click(hotelsSectionButton);
    }

    public void signOutAccount() {
        click(accountMenuButtonForLoggedUser);
        if (getWebDriverUtils().waitForElementToBeVisible(signOutOption)) {
            click(signOutOption);
        }
    }

    public boolean isFlightSectionButtonClickable(){
        return getWebDriverUtils().waitForElementToBeClickable(flightSectionButton);
    }

    public boolean isHotelsSectionButtonClickable(){
        return getWebDriverUtils().waitForElementToBeClickable(hotelsSectionButton);
    }

    public boolean isDestinationInputVisible(){
        return getWebDriverUtils().waitForElementToBeVisible(destinationInput);
    }

    public boolean isCheckInInputVisible(){
        return getWebDriverUtils().waitForElementToBeVisible(checkInInput);
    }

    public boolean isHotelsSearchButtonClickable(){
        return getWebDriverUtils().waitForElementToBeClickable(hotelsSearchButton);
    }

}
