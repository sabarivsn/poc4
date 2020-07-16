package com.poc4.stepDefinitions;

import com.poc4.calc.SharedState;
import cucumber.api.java.en.When;

public class MultiplySteps {
    private SharedState sharedState;

    public MultiplySteps(SharedState sharedState) {

        this.sharedState = sharedState;
    }

    @When("^calling multiply$")
    public void addTwoNumbers() throws Throwable {
        sharedState.result = sharedState.num1 * sharedState.num2;
    }
}
