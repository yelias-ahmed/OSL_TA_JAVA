package org.testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(tags = "@Suite3", features = "src/test/java/features", glue = "org/stepDefinitions",
        plugin= {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","rerun:target/failed_scenarios.txt"})

public class CucumberTestsRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
