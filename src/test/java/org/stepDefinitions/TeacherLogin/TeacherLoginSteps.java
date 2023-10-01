package org.stepDefinitions.TeacherLogin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.pageObjects.PageObjectManager;
import org.pageObjects.TeacherLogin.TeacherLoginPage;
import org.testng.Assert;
import org.utils.TestSetup;

import java.io.IOException;

public class TeacherLoginSteps {

    TestSetup setup;
    public PageObjectManager pageObjectManager;
    public TeacherLoginPage teacherLoginPage;

    public TeacherLoginSteps(TestSetup setup) throws IOException {
        this.setup = setup;
        this.teacherLoginPage = setup.pageObjectManager.getTeacherLoginPage();
    }
    //------------------------Teacher_Login_000------------------------
    @Given("Teacher can successfully login Teacher portal")
    public void teacherCanSuccessfullyLoginTeacherPortal() throws InterruptedException {
        teacherLoginPage.getTeacherPortal();
        Thread.sleep(1000);
        Assert.assertTrue(teacherLoginPage.getTeacherLoginPage().isDisplayed());
        Assert.assertTrue(teacherLoginPage.setTPinNumber().isDisplayed());
        teacherLoginPage.setTPinNumber().sendKeys("13091");
        Assert.assertTrue(teacherLoginPage.setPassword().isDisplayed());
        teacherLoginPage.setPassword().sendKeys("123456");
        Assert.assertTrue(teacherLoginPage.getLoginButton().isDisplayed());
        teacherLoginPage.getLoginButton().click();
        Assert.assertTrue(teacherLoginPage.getMyRoutine().isDisplayed());
    }
//------------------------Teacher_Login_1------------------------

    @Given("Varify that the Teacher Login page is being displayed accurately")
    public void varifyThatTheStudentLoginPageIsBeingDisplayedAccurately() throws InterruptedException {
        teacherLoginPage.getTeacherPortal();
        Thread.sleep(1000);
        Assert.assertTrue(teacherLoginPage.getTeacherLoginPage().isDisplayed());
    }

    @Then("Enter TPIN Number {string}")
    public void enterTPINNumber(String Username) {
        Assert.assertTrue(teacherLoginPage.setTPinNumber().isDisplayed());
        teacherLoginPage.setTPinNumber().sendKeys(Username);
    }

    @Then("Check that the My Routine page is displayed accurately")
    public void checkThatTheMyRoutinePageIsDisplayedAccurately() {
        Assert.assertTrue(teacherLoginPage.getMyRoutine().isDisplayed());

    }

    @And("Enter Teacher Password {string}")
    public void enterTeacherPassword(String Password) {
        Assert.assertTrue(teacherLoginPage.setPassword().isDisplayed());
        teacherLoginPage.setPassword().sendKeys(Password);
    }

    @When("Click on login button on Teacher login page")
    public void clickOnLoginButtonOnTeacherLoginPage() {
        Assert.assertTrue(teacherLoginPage.getLoginButton().isDisplayed());
        teacherLoginPage.getLoginButton().click();
    }


}
