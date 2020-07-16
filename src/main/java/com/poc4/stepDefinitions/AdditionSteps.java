package com.poc4.stepDefinitions;

import com.poc4.calc.SharedState;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AdditionSteps {

    private SharedState sharedState;

    public AdditionSteps(SharedState sharedState) {

        this.sharedState = sharedState;
    }

    @Given("^(.*) and (.*)$")
    public void givenTwoNumbers(int a, int b) {
        sharedState.num1 = a;
        sharedState.num2 = b;
    }

    @When("^calling add$")
    public void addTwoNumbers() throws Throwable {
        sharedState.result = sharedState.num1 + sharedState.num2;
    }

    @Then("the result should be (.*)$")
    public void it_should_be_like_this(int expectedResult) throws Throwable {
        Assert.assertEquals(sharedState.result, expectedResult);
    }

    @Then("^it should fail$")
    public void it_should_fail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.fail("Fails is intentional");
    }
}
