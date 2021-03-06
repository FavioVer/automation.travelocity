package com.travelocity.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelocityHomePage extends PageObjectBase {

    private static final String COPYRIGHT_FOOTER_ID = "footer-copyright-msg";
    private static final String ACCOUNT_MENU_BUTTON_LOGGED_ID = "header-account-menu-signed-in";
    private static final String ACCOUNT_MENU_BUTTON__ID = "header-account-menu";
    private static final String SIGN_OUT_OPTION_ID = "account-signout";
    private static final String CREATE_ACCOUNT_ID = "account-register";

    @FindBy(id = ACCOUNT_MENU_BUTTON_LOGGED_ID)
    private WebElement accountMenuButtonForLoggedUser;

    @FindBy(id = ACCOUNT_MENU_BUTTON__ID)
    private WebElement accountMenuButton;

    @FindBy(id = SIGN_OUT_OPTION_ID)
    private WebElement signOutOption;

    @FindBy(id = CREATE_ACCOUNT_ID)
    private WebElement createAccountOption;

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

    public void signOutAccount() {
        click(accountMenuButtonForLoggedUser);
        if (getWebDriverUtils().waitForElementToBeVisible(signOutOption)) {
            click(signOutOption);
        }
    }
}
