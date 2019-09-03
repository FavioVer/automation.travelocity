package com.travelocity.stepDefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class BaseStepDefinition {

    int firstNumber;
    int secondNumber;
    int sum;
    int substraction;

    @Story("Preconditions: User should not be loggued in ")
    @Step("Given I have a : {0}")
    @Given("^I have a (\\d+)$")
    public void getFirstNumber(int number) {
        firstNumber = number;
    }

    @Step("Given I have another : {0}")
    @Given("^I have another (\\d+)$")
    public void getSecondNumber(int number) {
        secondNumber = number;
    }

    @Step("When I Add the two numbers$")
    @When("^I add the two numbers$")
    public void addTwoNumbers() {
        sum = firstNumber + secondNumber;
    }
    
    @Step("I substract a$")
    @When("^I substract a (\\d+)$")
    public void substractTwoNumbers(int number) {
        substraction = firstNumber - number;
    }

    @Step("the result of the sum is: {0}")
    @Then("^the result of the sum is (\\d+)$")
    public void validateSum(int result) {
        Assert.assertEquals(sum, result);
    }
    
    @Step("the result of the substraction is: {0}")
    @Then("^the result of the substraction is \\+?(-?\\d+)$")
    public void validateSubstraction(int result) {
        Assert.assertEquals(substraction, result);
    }
}
