package com.travelocity.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.travelocity.framework.webdriver.WebDriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    protected static WebDriver driver;

    public static WebDriver getwebDriver() {
        return driver;
    }

    @Before
    public void tearUp(Scenario scenario) {
        if (scenario.getSourceTagNames().contains("@NoBrowser")) {
            System.out.println("Initializing service testing");
        } else {
            driver = WebDriverFactory.generateDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.getSourceTagNames().contains("@NoBrowser")) {
            System.out.println("Finalizing service testing");
        } else {
            if (driver != null) {
                driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }
        }
    }
}
