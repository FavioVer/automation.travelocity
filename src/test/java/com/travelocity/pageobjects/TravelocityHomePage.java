package com.travelocity.pageobjects;

import com.travelocity.constants.AppNames;
import com.travelocity.framework.configuration.ExecutionPropertiesProvider;
import com.travelocity.framework.ui.page.web.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class TravelocityHomePage extends WebPage {

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

    public TravelocityHomePage() throws IOException {
        super();
    }

    @Override
    protected By getPageLocator() {
        return By.id(COPYRIGHT_FOOTER_ID);
    }

    @Override
    protected void loadOwnUrl() throws IOException {
        setOwnUrl(ExecutionPropertiesProvider.getPropertyValue(AppNames.TRAVELOCITY_HOME_NAME));
    }

    public boolean isAccountMenuButtonForLoggedUserVisible() {
        return isElementVisible(accountMenuButtonForLoggedUser);
    }

    public boolean isAccountMenuButtonVisible() {
        return isElementVisible(accountMenuButton);
    }

    public void signOutAccount() {
        click(accountMenuButtonForLoggedUser);
        if (isElementClickable(signOutOption)) {
            click(signOutOption);
        }
    }
}
