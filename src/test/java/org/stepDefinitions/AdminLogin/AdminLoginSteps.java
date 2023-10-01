package org.stepDefinitions.AdminLogin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.pageObjects.Admin.AdminLoginPage;
import org.pageObjects.PageObjectManager;
import org.testng.Assert;
import org.utils.TestSetup;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AdminLoginSteps {

    TestSetup setup;
    public PageObjectManager pageObjectManager;
    public AdminLoginPage adminLoginPage;
    public WebDriver driver;
    String str ="";

    public AdminLoginSteps(TestSetup setup) throws IOException {
        this.setup = setup;
        this.adminLoginPage = setup.pageObjectManager.getAdminLoginPage();
        this.driver = adminLoginPage.driver;
    }


    @Given("Admin can successfully login Admin portal")
    public void adminCanSuccessfullyLoginAdminPortal() throws InterruptedException {
        adminLoginPage.getAdminPortal();
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getAdminLoginPage().isDisplayed());
        adminLoginPage.getUsername().sendKeys("asif@qups.com");
        adminLoginPage.getPassword().sendKeys("123456");
        adminLoginPage.getLoginButton().click();
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getWelcome().isDisplayed());

    }

    @Given("Varify that the Admin Login page is being displayed accurately")
    public void varifyThatTheAdminLoginPageIsBeingDisplayedAccurately() throws InterruptedException {
        adminLoginPage.getAdminPortal();
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getAdminLoginPage().isDisplayed());
    }

    @Then("Enter User Email {string}")
    public void enterUserEmail(String Email) {
        adminLoginPage.getUsername().sendKeys(Email);
    }

    @When("Click on log in button")
    public void clickOnLogInButton() {
        adminLoginPage.getLoginButton().click();
    }

    @Then("Check that the Welcome page is displayed accurately")
    public void checkThatTheWelcomePageIsDisplayedAccurately() {
        Assert.assertTrue(adminLoginPage.getWelcome().isDisplayed());
    }

    @And("Enter Admin Password {string}")
    public void enterAdminPassword(String Password) {
        adminLoginPage.getPassword().sendKeys(Password);
    }

    @Then("Check that the administration menu displayed Properly")
    public void checkThatTheAdministrationMenuDisplayedProperly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getAdministrationMenu().isDisplayed());
    }

    @When("Click on administration menu")
    public void clickOnAdministrationMenu() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getAdministrationMenu().click();
    }

    @Then("Check that the Routine menu showing in side navigation")
    public void checkThatTheRoutineMenuShowingInSideNavigation() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getRoutine().isDisplayed());
    }

    @When("Click on routine in side navigation")
    public void clickOnRoutineInSideNevigation() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getRoutine().click();
    }

    @Then("Select manage class routine from dropdown")
    public void selectManageClassRoutineFromDropdown() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getManageClassRoutine().click();
    }

    @Then("Check that the manage class routine page should displayed")
    public void checkThatTheManageClassRoutinePageShouldDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getManageClassRoutinePage().isDisplayed());
    }

    @Then("Check that the create routine button displayed properly")
    public void checkThatTheCreateRoutineButtonDisplayedProperly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getCreateRoutine().isDisplayed());

    }

    @When("Click On Create routine Button")
    public void clickOnCreateRoutineButton() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getCreateRoutine().click();
    }

    @Then("Check that the Create Class Routine Page is displayed properly")
    public void checkThatTheCreateClassRoutinePageIsDisplayedProperly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getCreateClassRoutinePage().isDisplayed());
    }

    @Then("Check that the Date is selected Properly")
    public void checkThatTheDateIsSelectedProperly() throws InterruptedException {
        Thread.sleep(1000);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String str = formatter.format(date);
        Assert.assertEquals(adminLoginPage.getRoutineDate().getAttribute("value"),str);

    }

    @Then("Check that the lecture start is showing properly")
    public void checkThatTheLectureStartIsShowingProperly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getLectureStartTime().isDisplayed());
    }

    @When("Click on lecture start")
    public void clickOnLectureStart() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getLectureStartTime().click();
    }

    @Then("Select start time from calender")
    public void selectStartTimeFromCalender() throws InterruptedException {
        Thread.sleep(1000);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        str = formatter.format(date);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', '"+str+"')",adminLoginPage.getLectureStartTime());
   }

    @Then("Check that the lecture end is showing properly")
    public void checkThatTheLectureEndIsShowingProperly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getLectureEndTime().isDisplayed());
    }

    @When("Click on lecture end")
    public void clickOnLectureEnd() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getLectureEndTime().click();
    }

    @Then("Select end time from calender")
    public void selectEndTimeFromCalender() throws InterruptedException, ParseException {
        Thread.sleep(1000);
        SimpleDateFormat df = new SimpleDateFormat("hh:mm a");
        Date d = df.parse(str);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.MINUTE, 5);
        str = df.format(cal.getTime());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', '"+str+"')",adminLoginPage.getLectureEndTime());
    }


    @Then("Check that the Lecture Type is showing properly")
    public void checkThatTheLectureTypeIsShowingProperly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getLectureType().isDisplayed());

    }

    @When("Click on Lecture Type dropdown")
    public void clickOnLectureTypeDropdown() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getLectureType().click();
    }

    @Then("Select In-Branch Class from Lecture Type dropdown")
    public void selectInBranchClassFromLectureTypeDropdown() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getInBranch().click();

    }

    @Then("Select Online Class from Lecture Type dropdown")
    public void selectOnlineClassFromLectureTypeDropdown() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getOnlineClass().click();

    }

    @Then("Check that the Add Batch Roll button is showing properly")
    public void checkThatTheAddBatchRollButtonIsShowingProperly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.AddBatchBtn().isDisplayed());

    }


    @When("Click on Add Batch Roll")
    public void clickOnAddBatchRoll() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.AddBatchBtn().click();

    }

    @Then("Add Batch Roll  Popup should be displayed")
    public void addBatchRollPopupShouldBeDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getModalContent().isDisplayed());
    }

    @Then("Select Organization program session and course name")
    public void selectOrganizationProgramSessionAndCourseName() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getOrganization().click();
        Thread.sleep(1000);
        adminLoginPage.getOrganizationList().click();
        Thread.sleep(1000);
        adminLoginPage.getProgram().click();
        Thread.sleep(1000);
        adminLoginPage.getProgramList().click();
        Thread.sleep(1000);
        adminLoginPage.getSession().click();
        Thread.sleep(1000);
        adminLoginPage.getSessionList().click();
        Thread.sleep(1000);
        adminLoginPage.getCourse().click();
        Thread.sleep(1000);
        adminLoginPage.getCourseList().click();



    }

    @Then("Enter D in Lecture And check that the suggestion are showing")
    public void enterDInLectureAndCheckThatTheSuggestionAreShowing() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getLecture().sendKeys("D");
    }

    @Then("Select a suggestion from list")
    public void selectASuggestionFromList() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getLectureList().click();
    }

    @Then("Select Branch Wise from Routine by dropdown list")
    public void selectBranchWiseFromRoutineByDropdownList() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getRoutineBy().click();
        Thread.sleep(1000);
        adminLoginPage.getRoutineByList().click();
    }

    @Then("Select mother course, Brunch, Campus, Version of study, Gender, Batch Type, Batch Time, Batch Name")
    public void selectMotherCourseBrunchCampusVersionOfStudyGenderBatchTypeBatchTimeBatchName() {

    }

    @When("Click on submit Button")
    public void clickOnSubmitButton() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getSubmitButton().click();
    }

    @Then("Check that the selected batch should displayed")
    public void checkThatTheSelectedBatchShouldDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getSelectedBatch().isDisplayed());

    }

    @Then("Select Interactive Class Checkbox")
    public void selectInteractiveClassCheckbox() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getinteractiveCheckbox().click();

    }

    @Then("Enter Host Teacher PIN Class Type")
    public void enterHostTeacherPINClassType() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getHost().sendKeys("RR");
        Thread.sleep(2000);
        adminLoginPage.getHostList().click();
        Thread.sleep(1000);
        adminLoginPage.getTPIN().sendKeys("13091");
        Thread.sleep(2000);
        adminLoginPage.getTeacherList().click();
        Thread.sleep(1000);
        adminLoginPage.getClassType().click();
        Thread.sleep(1000);
        adminLoginPage.getClassTypeList().click();
    }

    @When("Click on Create And Publish")
    public void clickOnCreateAndPublish() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getCreatePublish().click();

    }

    @Then("Check that the routine is successfully created and published")
    public void checkThatTheRoutineIsSuccessfullyCreatedAndPublished() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getRoutineSuccessfully().isDisplayed());
        Thread.sleep(1000);
    }

    @When("Click on View button below the page")
    public void clickOnViewButtonBelowThePage() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getViewButton().click();

    }

    @Then("Check that the routine details should displayed")
    public void checkThatTheRoutineDetailsShouldDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getDetails().isDisplayed());
    }

    @When("Click on edit button")
    public void clickOnEditButton() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getEditBtn().click();
        Thread.sleep(20000);
    }

    @Then("Check that the Update Class Routine page should displayed")
    public void checkThatTheUpdateClassRoutinePageShouldDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(adminLoginPage.getUpdateRoutinePage().isDisplayed());

    }

    @Then("Click On Update Button")
    public void clickOnUpdateButton() throws InterruptedException {
        Thread.sleep(1000);
        adminLoginPage.getUpdateButton().click();
    }






}





























