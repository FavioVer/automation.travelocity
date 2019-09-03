package com.travelocity.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/features" },

        glue = { "com.travelocity.stepDefinitions" },

        tags = { "@BaseBooking" },

        plugin = { "pretty", "json:target/cucumber-reports.json", "html:target/cucumber-reports",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },

        monochrome = true)

public class AbstractCucumberRunner extends AbstractTestNGCucumberTests {

}