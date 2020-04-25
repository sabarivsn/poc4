package com.poc4.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features="resources/features",glue= {"com.poc4.stepDefinitions"},
        plugin = {"pretty","json:target/cucumber.json","html:target/cucumber"})

public class CucumberTestRunner {

    private TestNGCucumberRunner runner;

    @BeforeClass
    public void setup() {
        runner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider= "resources/features")
    public void test(CucumberFeatureWrapper wrapper) throws Throwable {
        runner.runCucumber(wrapper.getCucumberFeature());
    }

    @DataProvider(name= "resources/features")
    public Object[][] getFeatures() {
        return runner.provideFeatures();
    }

    @AfterClass
    public void clean() {
        runner.finish();
    }
}
