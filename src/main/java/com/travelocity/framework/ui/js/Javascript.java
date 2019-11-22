package com.travelocity.framework.ui.js;


import com.travelocity.framework.ui.driver.Drivers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * Javascript.
 */
public final class Javascript {

    private Javascript() {
    }

    /**
     * Executes a click on the element by javascript.
     *
     * @param webElement the {@link WebElement}
     */
    public static void click(WebElement webElement) {
        js().executeScript("arguments[0].click();", webElement);
    }

    /**
     * Creates an javascript executor.
     *
     * @return the {@link JavascriptExecutor}
     */
    private static JavascriptExecutor js() {
        return (JavascriptExecutor) Drivers.getDriver().getWebDriver();
    }
}
