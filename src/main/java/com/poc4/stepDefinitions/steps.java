package com.poc4.stepDefinitions;

import com.poc1.sample.Employee;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class steps {
    @When("^I do this$")
    public void i_do_this() throws Throwable {
        //nothing
    }

    @Then("^it should be like this$")
    public void it_should_be_like_this() throws Throwable {
        Employee employee = new Employee();
        employee.name = "Sabari";
        employee.details = "none";
        Assert.assertEquals("Sabari", employee.name);
        Assert.assertEquals("none", employee.details);
    }

    @Then("^it should fail$")
    public void it_should_fail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.fail("Fails is intentional");
    }
}
