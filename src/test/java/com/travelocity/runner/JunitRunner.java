package com.travelocity.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" },

        glue = { "com.travelocity.stepDefinitions" },

        tags = { "@HomePage" },

        plugin = { "pretty", "json:target/cucumber-reports.json", "html:target/cucumber-reports" },

        monochrome = true)

public class JunitRunner {

}