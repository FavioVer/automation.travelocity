package com.travelocity.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" },

		glue = { "com.travelocity.stepDefinitions" },

		tags = { "@HomePage or @Login" },

		plugin = { "pretty", "json:target/cucumber-reports.json", "html:target/cucumber-reports",
				"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm" },

		monochrome = true)

public class JunitRunner {

}