package org.stepDefinitions;

import io.cucumber.java.After;
import org.utils.TestSetup;

import java.io.IOException;

public class Hooks {
    public TestSetup setup;
    public Hooks(TestSetup setup) {
        this.setup = setup;
    }

    @After
    public void tearDown( ) throws IOException {
        setup.testBase.WebDriverManager().quit();
    }
}
