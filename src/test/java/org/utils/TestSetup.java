package org.utils;

import org.pageObjects.PageObjectManager;

import java.io.IOException;

public class TestSetup {
    public PageObjectManager pageObjectManager;
    public TestBase testBase;

    public TestSetup() throws IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());

    }
}
