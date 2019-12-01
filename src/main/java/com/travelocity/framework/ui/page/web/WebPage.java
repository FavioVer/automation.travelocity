package com.travelocity.framework.ui.page.web;

import com.travelocity.framework.ui.driver.Driver;
import com.travelocity.framework.ui.driver.Drivers;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class WebPage extends WebOperations {

    protected WebPage() {
        Driver driver = Drivers.getDriver();
        initElements(driver.getWebDriver(), this);
    }

    protected abstract By getPageLocator();

    public boolean isLoaded() {
        return isElementLocatedVisible(getPageLocator());
    }

}
