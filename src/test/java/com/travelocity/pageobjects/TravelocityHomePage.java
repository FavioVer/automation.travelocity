package com.travelocity.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelocityHomePage extends PageObjectBase {

    private final String COPYRIGHT_FOOTER_ID = "footer-copyright-msg";
    private final String ACCOUNT_MENU_BUTTON_SIGNED_ID = "header-account-menu-signed-in";
    private final String SIGN_OUT_OPTION_ID = "account-signout";
    
    
    @FindBy(id = ACCOUNT_MENU_BUTTON_SIGNED_ID)
    private WebElement accountMenuButtonSignedButton;
    
    @FindBy(id = SIGN_OUT_OPTION_ID)
    private WebElement signOutOption;

    public TravelocityHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageLocator() {
        return By.id(COPYRIGHT_FOOTER_ID);
    }

    public boolean someUserIsLoggedInApp() {
        return getWebDriverUtils().waitForElementToBeVisible(accountMenuButtonSignedButton);
    }

    public void signOutAccount() {
        click(accountMenuButtonSignedButton);
        if (getWebDriverUtils().waitForElementToBeVisible(signOutOption)) {
            click(signOutOption);
        }
    }
}
