package com.travelocity.framework.ui.driver.utils;

import com.travelocity.framework.logger.Loggable;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils implements Loggable {
    protected static final int TIME_OUT_FOR_ELEMENT = 5;
    protected static final int TIME_OUT_FOR_WAIT = 10;

    private WebDriverWait driverWait;

    public void initializeDriverWait(WebDriver driver) {
        driverWait = new WebDriverWait(driver, TIME_OUT_FOR_WAIT);
    }

    public boolean waitForElementLocatedToBePresent(By by) {
        try {
            driverWait.until(ExpectedConditions.presenceOfElementLocated(by));
            return true;
        } catch (TimeoutException | NoSuchElementException e) {
            error(e.getMessage());
        }
        return false;
    }

    public boolean waitForElementLocatedToBeVisible(By by) {
        try {
            driverWait.until((ExpectedConditions.visibilityOfElementLocated(by)));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            error(e.getMessage());
        }
        return false;
    }

    public boolean waitForElementToBeVisible(WebElement element) {
        try {
            driverWait.until((ExpectedConditions.visibilityOf(element)));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            error(e.getMessage());
        }
        return false;
    }


    public boolean waitForElementToBeClickable(WebElement element) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            error(e.getMessage());
        }
        return false;
    }

}
