package org.stepDefinitions.StudentPortal;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.pageObjects.PageObjectManager;
import org.pageObjects.StudentPortal.StudentPortalPage;
import org.testng.Assert;
import org.utils.TestSetup;

import java.io.IOException;

public class StudentPortalsteps {
    TestSetup setup;
    public PageObjectManager pageObjectManager;
    public StudentPortalPage studentPortalPage;
    WebDriver driver;

    public StudentPortalsteps(TestSetup setup) throws IOException {
        this.setup = setup;
        this.studentPortalPage = setup.pageObjectManager.getStudentPortalPage();
        this.driver = studentPortalPage.driver;
    }

    @Then("Master Class Menu should be displayed correctly no top navigation")
    public void masterClassMenuShouldBeDisplayedCorrectlyNoTopNavigation() {
        Assert.assertTrue(studentPortalPage.getMasterClassManu().isDisplayed());
    }

    @When("Click on Master Class Menu from top navigation")
    public void clickOnMasterClassMenuFromTopNavigation() throws InterruptedException {
        studentPortalPage.getMasterClassManu().click();
        Thread.sleep(1000);
    }



    @When("Click on Proceed in any Master Class")
    public void clickOnProceedInAnyMasterClass() throws InterruptedException {
        Assert.assertTrue(studentPortalPage.getProceedButton().isDisplayed());
        studentPortalPage.getProceedButton().click();
        Thread.sleep(1000);
    }

    @Then("Check that the Master Class page is being Load and displayed accurately")
    public void checkThatTheMasterClassPageIsBeingLoadAndDisplayedAccurately() throws InterruptedException {
        boolean flag = true;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while(flag)
        {
            try {
                js.executeScript("arguments[0].scrollIntoView();", studentPortalPage.getLoadMore());
                Thread.sleep(1000);
                studentPortalPage.getLoadMore().click();
                Thread.sleep(2000);
                flag = studentPortalPage.getLoadMore().isDisplayed();
            }
            catch (Exception e){break;}
        }
        js.executeScript("arguments[0].scrollIntoView();", studentPortalPage.getLoadMore());
        Thread.sleep(2000);
    }


    @Then("Verify that the Master Class page is Displayed By Course")
    public void verifyThatTheMasterClassPageIsDisplayedByCourse() {
        Assert.assertTrue(studentPortalPage.getMasterClassPage().isDisplayed());
        Assert.assertTrue(studentPortalPage.getMasterClassCourse().isDisplayed());
    }

    @Then("Check that the Master Class page is displayed By Lecture")
    public void checkThatTheMasterClassPageIsDisplayedByLecture() {
        Assert.assertTrue(studentPortalPage.getMasterClassPage().isDisplayed());
        Assert.assertTrue(studentPortalPage.getChapter().isDisplayed());
    }

    @And("Check that the Search bar is displayed accurately")
    public void checkThatTheSearchBarIsDisplayedAccurately() {
        Assert.assertTrue(studentPortalPage.getSearchBar().isDisplayed());
    }

    @And("Type a search keyword into the search bar")
    public void typeASearchKeywordIntoTheSearchBar() throws InterruptedException {
        studentPortalPage.getSearchBar().sendKeys("বাফার");
        Thread.sleep(3000);
    }

    @Then("Check that the search result is showing")
    public void checkThatTheSearchResultIsShowing() {
        Assert.assertTrue(studentPortalPage.getSearchResult().isDisplayed());
    }

    @When("Click on any subject quiz")
    public void clickOnAnySubjectQuiz() throws InterruptedException {
        studentPortalPage.getQuiz().click();
        Thread.sleep(1000);
    }

    @And("click on Start Quiz or retake quiz")
    public void clickOnStartQuizRetakeQuiz() {
        studentPortalPage.getStartQuiz().click();
    }


    @Then("Select options from questions")
    public void selectOptionsFromQuestions() throws InterruptedException {
        studentPortalPage.SelectAllOption();
        Thread.sleep(1000);
    }

    @When("Click on submit")
    public void clickOnSubmit() throws InterruptedException {
        studentPortalPage.getSubmitQuiz().click();
        Thread.sleep(1000);
    }

    @Then("Check that a pop up is showing")
    public void checkThatAPopUpIsShowing() {
        Assert .assertTrue(studentPortalPage.getAlartBox().isDisplayed());
    }

    @When("Click on yes button")
    public void clickOnYesButton() throws InterruptedException {
        studentPortalPage.getYesButton().click();
        Thread.sleep(1000);
    }

    @Then("check that the Analysis Report is showing")
    public void checkThatTheAnalysisReportIsShowing() throws InterruptedException {
        Assert.assertTrue(studentPortalPage.getAnalysisReport().isDisplayed());
        Thread.sleep(1000);
    }
}
