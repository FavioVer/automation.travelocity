package com.travelocity.framework.ui.page.web;

import com.disney.cast.platform.common.bdd.ui.driver.Drivers;
import com.disney.cast.platform.common.bdd.ui.page.CommonOperations;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public abstract class WebOperations extends CommonOperations {

    /**
     * Navigates to the URL.
     *
     * @param url the URL
     */
    protected void goTo(String url) {
        Drivers.getDriver().getWebDriver().get(url);
    }

    /**
     * Refresh the page.
     */
    protected void refresh() {
        Drivers.getDriver().getWebDriver().navigate().refresh();
    }

    /**
     * Types on the element.
     *
     * @param webElement the {@link WebElement}
     * @param text       the text
     */
    protected boolean type(WebElement webElement, String text) {
        isVisible(webElement);
        webElement.sendKeys(text);
        return isTextPresent(webElement, text);
    }

    /**
     * Selects an option by text from an HTML Select.
     *
     * @param webElement the {@link WebElement}
     * @param text       the text to select
     */
    protected void selectByText(WebElement webElement, String text) {
        select(webElement).selectByVisibleText(text);
    }

    private Select select(WebElement webElement) {
        return new Select(webElement);
    }

}
