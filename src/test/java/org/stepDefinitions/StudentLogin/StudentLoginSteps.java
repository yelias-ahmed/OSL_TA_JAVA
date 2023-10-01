package org.stepDefinitions.StudentLogin;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.pageObjects.PageObjectManager;
import org.testng.Assert;
import org.utils.TestSetup;
import org.pageObjects.StudentLogin.StudentLoginPage;
import java.io.IOException;
import io.cucumber.java.en.Given;

public class StudentLoginSteps {
    TestSetup setup;
    public PageObjectManager pageObjectManager;
    public StudentLoginPage studentLoginPage;

    public StudentLoginSteps(TestSetup setup) throws IOException {
        this.setup = setup;
        this.studentLoginPage = setup.pageObjectManager.getStudentLoginPage();
    }

    //------------------------Student_Login_000------------------------

    @Given("Student can successfully login student portal")
    public void studentCanSuccessfullyLoginStudentPortal() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(studentLoginPage.getStudentLoginPage().isDisplayed());
        Assert.assertTrue(studentLoginPage.setRegistrtionNumber().isDisplayed());
        studentLoginPage.setRegistrtionNumber().sendKeys("2378587");
        Assert.assertTrue(studentLoginPage.getNextButton().isDisplayed());
        studentLoginPage.getNextButton().click();
        Thread.sleep(1000);
        Assert.assertTrue(studentLoginPage.getPasswordPage().isDisplayed());
        Assert.assertTrue(studentLoginPage.setPassword().isDisplayed());
        studentLoginPage.setPassword().sendKeys("123456");
        Assert.assertTrue(studentLoginPage.getLoginButton().isDisplayed());
        studentLoginPage.getLoginButton().click();
        Thread.sleep(1000);
        Assert.assertTrue(studentLoginPage.getMyRoutineToday().isDisplayed());
    }

//------------------------Student_Login_1------------------------

    @Given("Varify that the Student Login page is being displayed accurately")
    public void varifyThatTheStudentLoginPageIsBeingDisplayedAccurately() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(studentLoginPage.getStudentLoginPage().isDisplayed());
    }


    @Then("Enter Registration Number {string}")
    public void enterRegistrationNumber(String Username) {
        Assert.assertTrue(studentLoginPage.setRegistrtionNumber().isDisplayed());
        studentLoginPage.setRegistrtionNumber().sendKeys(Username);
    }

    @When("click on Next button")
    public void clickOnNextButton() {
        Assert.assertTrue(studentLoginPage.getNextButton().isDisplayed());
        studentLoginPage.getNextButton().click();
    }

    @Then("Enter Your Password Page should be displayed")
    public void enterYourPasswordPageShouldBeDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(studentLoginPage.getPasswordPage().isDisplayed());
    }

    @And("Enter Your Password {string}")
    public void enterYourPassword(String Password) {
        Assert.assertTrue(studentLoginPage.setPassword().isDisplayed());
        studentLoginPage.setPassword().sendKeys(Password);
    }

    @When("Click on login button")
    public void clickOnLoginButton() throws InterruptedException {
        Assert.assertTrue(studentLoginPage.getLoginButton().isDisplayed());
        studentLoginPage.getLoginButton().click();
        Thread.sleep(1000);
    }

    @Then("Check that the My routine page is displayed accurately")
    public void checkThatTheMyRoutinePageIsDisplayedAccurately() {
        Assert.assertTrue(studentLoginPage.getMyRoutineToday().isDisplayed());

    }


}

