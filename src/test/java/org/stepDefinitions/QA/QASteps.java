package org.stepDefinitions.QA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.pageObjects.PageObjectManager;
import org.pageObjects.QA.QAPage;
import org.testng.Assert;
import org.utils.TestSetup;

import java.io.IOException;

public class QASteps {
    TestSetup setup;
    public PageObjectManager pageObjectManager;
    public QAPage qaPage;
    WebDriver driver;


    public QASteps(TestSetup setup) throws IOException {
        this.setup = setup;
        this.qaPage = setup.pageObjectManager.getQaPage();
        this.driver = qaPage.driver;
    }


    @Then("Q&A Menu should be displayed correctly no top navigation")
    public void qAMenuShouldBeDisplayedCorrectlyNoTopNavigation() {
        Assert.assertTrue(qaPage.getQnAMenu().isDisplayed());
    }

    @When("Click on Q&A Menu from top navigation")
    public void clickOnQAMenuFromTopNavigation() throws InterruptedException {
        qaPage.getQnAMenu().click();
        Thread.sleep(1000);
    }

    @Then("Verify that the Q&A Services page is being Load and displayed accurately")
    public void verifyThatTheQAServicesPageIsBeingDisplayedAccurately() throws InterruptedException {
        Assert.assertTrue(qaPage.getQnAPage().isDisplayed());
        boolean flag = true;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while(flag)
        {
            Thread.sleep(2000);
            js.executeScript("arguments[0].scrollIntoView();", qaPage.getLoadMore());
            Thread.sleep(1000);
            qaPage.getLoadMore().click();
            flag = qaPage.getLoadMore().isDisplayed();
        }
        js.executeScript("arguments[0].scrollIntoView();", qaPage.getQnAPage());
        Thread.sleep(2000);
    }

    @And("Click proceed on any subject from Q&A services Page")
    public void clickProceedOnAnySubjectFromQAServicesPage() throws InterruptedException {
        Assert.assertTrue(qaPage.getAnySubject().isDisplayed());
        qaPage.getAnySubject().click();
        Thread.sleep(1000);
    }

    @Then("Question and answer page should displayed")
    public void questionAndAnswerPageShouldDisplayed() {
        Assert.assertTrue(qaPage.getQuestionAnswerPage().isDisplayed());

    }

    @And("Check that the Ask a new Question Button is available")
    public void checkThatTheAskANewQuestionButtonIsAvailable() {
        Assert.assertTrue(qaPage.getAskANewQuestion().isDisplayed());
    }

    @When("Click on Ask a new question button")
    public void clickOnAskANewQuestionButton() throws InterruptedException {
        qaPage.getAskANewQuestion().click();
        Thread.sleep(1000);
    }

    @Then("Check that the ask a new question page is displayed")
    public void checkThatTheAskANewQuestionPageIsDisplayed() {
        Assert.assertTrue(qaPage.getAskANewQuestionPage().isDisplayed());
    }

    @And("Select a course from course dropdown list")
    public void selectACourseFromCourseDropdownList() throws InterruptedException {
        Assert.assertTrue(qaPage.getCourseDropdown().isDisplayed());
        qaPage.getCourseDropdown().click();
        Thread.sleep(1000);
        Assert.assertTrue(qaPage.getCourseDropdownList().isDisplayed());
        qaPage.getCourseDropdownList().click();
        Thread.sleep(1000);
    }

    @And("Select Subject from subject dropdown list")
    public void selectSubjectFromSubjectDropdownList() throws InterruptedException {
        Assert.assertTrue(qaPage.getSubjectDropdown().isDisplayed());
        qaPage.getSubjectDropdown().click();
        Thread.sleep(1000);
        Assert.assertTrue(qaPage.getSubjectDropdownList().isDisplayed());
        qaPage.getSubjectDropdownList().click();
        Thread.sleep(1000);
    }

    @And("Select chapter from chapter dropdown list")
    public void selectChapterFromChapterDropdownList() throws InterruptedException {
        Assert.assertTrue(qaPage.getChapterDropdown().isDisplayed());
        qaPage.getChapterDropdown().click();
        Thread.sleep(1000);
        Assert.assertTrue(qaPage.getChapterDropdownList().isDisplayed());
        qaPage.getChapterDropdownList().click();
        Thread.sleep(1000);
    }

    @And("Type a question in ask a question text box")
    public void typeAQuestionInAskAQuestionTextBox() throws InterruptedException {
        Assert.assertTrue(qaPage.getAskANewQuestionText().isDisplayed());
        qaPage.getAskANewQuestionText().sendKeys("প্রোটন পরমাণুর কোথায় অবস্থান করে?");
        Thread.sleep(1000);
    }

    @When("Click on submit button")
    public void clickOnSubmitButton() throws InterruptedException {
        Assert.assertTrue(qaPage.getSubmit().isDisplayed());
        qaPage.getSubmit().click();
        Thread.sleep(1000);
    }

    @Then("Question&Answer Menu should be displayed correctly no top navigation")
    public void questionAnswerMenuShouldBeDisplayedCorrectlyNoTopNavigation() {
        Assert.assertTrue(qaPage.getQuestionAnswerMenu().isDisplayed());
    }

    @When("Click on Question&Answer Menu from top navigation")
    public void clickOnQuestionAnswerMenuFromTopNavigation() throws InterruptedException {
        qaPage.getQuestionAnswerMenu().click();
        Thread.sleep(1000);
    }

    @And("Click On Pending Question sub menu from dropdown")
    public void clickOnPendingQuestionSubMenuFromDropdown() throws InterruptedException {
        qaPage.getPendingQuestion().click();
        Thread.sleep(1000);
    }

    @Then("Check that asked question displayed in New Question section")
    public void checkThatAskedQuestionDisplayedInNewQuestionSection() {
        Assert.assertTrue(qaPage.getNewQuestion().isDisplayed());
    }

    @When("Click on Answer Button side QA Arc Course")
    public void clickOnAnswerButton() throws InterruptedException {
        qaPage.getAnswerButton().click();
        Thread.sleep(3000);
    }

    @Then("Student's Question page should displayed")
    public void studentSQuestionPageShouldDisplayed() {

        Assert.assertTrue(qaPage.getStudentsQuestion().isDisplayed());
    }

    @And("Enter answer in the text box")
    public void enterAnswerInTheTextBox() throws InterruptedException {
        Assert.assertTrue(qaPage.getInputAnswer().isDisplayed());
        qaPage.getInputAnswer().sendKeys("In the nucleus");
        Thread.sleep(8000);
    }

    @When("Click on submit & Next Button")
    public void clickOnSubmitNextButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", qaPage.getSubmitNextBtn());
        Thread.sleep(8000);
        Assert.assertTrue(qaPage.getSubmitNextBtn().isDisplayed());
        Assert.assertTrue(qaPage.getSubmitNextBtn().isEnabled());
        qaPage.getSubmitNextBtn().click();
        Thread.sleep(3000);
    }

    @Then("Success! message should be displayed")
    public void successMessageShouldBeDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(qaPage.getSuccessMsg().isDisplayed());

    }

    @Then("Ensure accurate display of notification badge within the notification icon")
    public void ensureAccurateDisplayOfNotificationBadgeWithinTheNotificationIcon() {
        Assert.assertTrue(qaPage.getNotificationBadge().isDisplayed());
    }

    @When("Click on notification icon")
    public void clickOnNotificationIcon() throws InterruptedException {
        qaPage.getNotificaltionIcon().click();
        Thread.sleep(1000);
    }

    @Then("Check that the notification Page should displayed")
    public void checkThatTheNotificationPageShouldDisplayed() {
        Assert.assertTrue(qaPage.getNotificationPage().isDisplayed());
    }

    @And("Check that the notification card should displayed")
    public void checkThatTheNotificationCardShouldDisplayed() {
        Assert.assertTrue(qaPage.getNotificationCard().isDisplayed());
    }

    @Then("Check that the notification badge is gone")
    public void checkThatTheNotificationBadgeIsGone() {
        Assert.assertFalse(qaPage.getNotificationBadge().isDisplayed());
    }

    @When("click on notification card")
    public void clickOnNotificationCard() throws InterruptedException {
        qaPage.getNotificationCard().click();
        Thread.sleep(1000);
    }

    @And("Check that the Answer should displayed")
    public void checkThatTheAnswerShouldDisplayed() {
        Assert.assertTrue(qaPage.getAnswer().isDisplayed());
    }

    @When("click on Back to notification")
    public void clickOnBackToNotification() throws InterruptedException {
        Assert.assertTrue(qaPage.getBackToNotificationCard().isDisplayed());
        qaPage.getBackToNotificationCard().click();
        Thread.sleep(1000);
    }

    @Then("Check that the notification icon is displayed Correctly")
    public void checkThatTheNotificationIconIsDisplayedCorrectly() {
        Assert.assertTrue(qaPage.getNotificaltionIcon().isDisplayed());
    }

    @When("Click on not yet icon")
    public void clickOnNotYetIcon() throws InterruptedException {
        Assert.assertTrue(qaPage.getNotYet().isDisplayed());
        qaPage.getNotYet().click();
        Thread.sleep(1000);
    }

    @Then("Check that the Ask a question Text box should displayed")
    public void checkThatTheAskAQuestionTextBoxShouldDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(qaPage.getAskANewQuestionText().isDisplayed());
    }

    @Then("Asked question should displayed")
    public void askedQuestionShouldDisplayed() {
        Assert.assertTrue(qaPage.getStudentReplay().isDisplayed());
    }

    @Then("Check that Review Request section should displayed")
    public void checkThatReviewRequestSectionShouldDisplayed() {
        Assert.assertTrue(qaPage.getReviewRequest().isDisplayed());
    }

    @When("Click on Review Button side QA Arc Course")
    public void clickOnReviewButtonSideQAArcCourse() throws InterruptedException {
        qaPage.getReviewRequestButton().click();
        Thread.sleep(1000);

    }

    @When("Click on Submit & Next Button of Review Request")
    public void clickOnSubmitNextButtonOfReviewRequest() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", qaPage.getSubmitNext());
        Thread.sleep(8000);
        Assert.assertTrue(qaPage.getSubmitNext().isDisplayed());
        Assert.assertTrue(qaPage.getSubmitNext().isEnabled());
        qaPage.getSubmitNext().click();
        Thread.sleep(1000);
    }

    @When("Click on satisfied icon")
    public void clickOnSatisfiedIcon() throws InterruptedException {
        Assert.assertTrue(qaPage.getSatisfied().isDisplayed());
        qaPage.getSatisfied().click();
        Thread.sleep(1000);
    }

    @Then("Check that te Satisfied mark should displayed")
    public void checkThatTeSatisfiedMarkShouldDisplayed() {
        Assert.assertTrue(qaPage.getSatisfiedMark().isDisplayed());
    }


    @When("Click on Student Menu")
    public void clickOnStudentMenu() throws InterruptedException {
        Assert.assertTrue(qaPage.getStudentMenu().isDisplayed());
        qaPage.getStudentMenu().click();
        Thread.sleep(1000);
    }

    @Then("Check that the Student Area page should displayed")
    public void checkThatTheStudentAreaPageShouldDisplayed() {
        Assert.assertTrue(qaPage.getStudentArea().isDisplayed());
    }

    @When("Click on Q&A2 Service")
    public void clickOnQAService() throws InterruptedException {
        qaPage.getQnA2Service().click();
        Thread.sleep(1000);
    }

    @And("Click on Qn&A2 Moderation")
    public void clickOnQnAModeration() throws InterruptedException {
        qaPage.getQnA2Moderation().click();
        Thread.sleep(1000);
    }

    @Then("Check that the Moderation Page should displayed")
    public void checkThatTheModerationPageShouldDisplayed() {
        Assert.assertTrue(qaPage.getModerationPage().isDisplayed());
    }


    @And("Enter reg number on Moderation page")
    public void enterRegNumberOnModerationPage() {
        qaPage.getRegiRoll().sendKeys("2378587");
    }

    @When("Click on View button")
    public void clickOnViewButton() throws InterruptedException {
        qaPage.getViewButton().click();
        Thread.sleep(1000);
    }

    @Then("Check that the Summary Section should displayed")
    public void checkThatTheSummarySectionShouldDisplayed() {
        Assert.assertTrue(qaPage.getSummarySection().isDisplayed());
    }

    @When("Click on Moderate button")
    public void clickOnModerateButton() throws InterruptedException {
        qaPage.getModerate().click();
        Thread.sleep(1000);
    }

    @Then("Check that student question page should displayed")
    public void checkThatStudentQuestionPageShouldDisplayed() {
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
        Assert.assertTrue(qaPage.getStudentQuestionPage().isDisplayed());
    }

    @When("Click on paperclip icon and input image location")
    public void clickOnPaperclipIconAndInputImageLocation() {
        qaPage.getPaperclip().click();
        qaPage.getEditAnswerImg().sendKeys("C:\\UploadImg.png");
    }

    @Then("Check that the image should displayed")
    public void checkThatTheImageShouldDisplayed() throws InterruptedException {
        Assert.assertTrue(qaPage.getImgFluid().isDisplayed());
        Thread.sleep(3000);
    }

    @When("click on update & next and exit")
    public void clickOnUpdateNextAndExit() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", qaPage.getUpdateNNext());
        Thread.sleep(1000);
        qaPage.getUpdateNNext().click();
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", qaPage.getExitButton());
        Thread.sleep(1000);
        qaPage.getExitButton().click();
        Thread.sleep(1000);
    }

    @And("Verify that the page is being Load and displayed accurately")
    public void verifyThatThePageIsBeingLoadAndDisplayedAccurately() throws InterruptedException {
        boolean flag = true;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while(flag)
        {
            try {
                js.executeScript("arguments[0].scrollIntoView();", qaPage.getLoadMoreButton());
                Thread.sleep(1000);
                qaPage.getLoadMoreButton().click();
                Thread.sleep(2000);
                flag = qaPage.getLoadMoreButton().isDisplayed();
            }
            catch (Exception e){break;}
        }
        js.executeScript("arguments[0].scrollIntoView();", qaPage.getQuestionAnswerPage());
        Thread.sleep(2000);
    }

    @And("Input a search keyword into the search bar")
    public void inputASearchKeywordIntoTheSearchBar() throws InterruptedException {
        qaPage.getSearchBar().sendKeys("প্রোটন পরমাণুর কোথায় অবস্থান করে?");
        Thread.sleep(1000);
    }

    @When("Select a search suggestion by clicking on it")
    public void selectASearchSuggestionByClickingOnIt() throws InterruptedException {
        qaPage.getSearchSugg().click();
        Thread.sleep(1000);
    }

    @Then("Confirm the display of the searched question and its corresponding answer")
    public void confirmTheDisplayOfTheSearchedQuestionAndItsCorrespondingAnswer() throws InterruptedException {
        Assert.assertTrue(qaPage.getSearchResult().isDisplayed());
        Thread.sleep(1000);
    }

    @And("Click on delete All Button")
    public void clickOnDeleteAllButton() throws InterruptedException {
        qaPage.getDeleteAll().click();
        Thread.sleep(1000);
        qaPage.getDeleteYesButton().click();
        Thread.sleep(1000);
    }

    @Then("Type a reply in ask a question text box")
    public void typeAReplyInAskAQuestionTextBox() {
        qaPage.getAskANewQuestionText2().sendKeys("Please explain in detail");
    }

    @Then("Check that the Ask a question TextBox should displayed")
    public void checkThatAskAQuestionTextBoxShouldDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue( qaPage.getAskANewQuestionText2().isDisplayed());
    }

    @When("Click the Submit button located below the text box")
    public void clickTheSubmitButtonLocatedBelowTheTextBox() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", qaPage.getAskANewQuestionText2());
        Thread.sleep(3000);
        Assert.assertTrue(qaPage.getSubmit2().isDisplayed());
        qaPage.getSubmit2().click();
        Thread.sleep(1000);
    }

    @And("Enter Review Answer in the text box")
    public void enterReviewAnswerInTheTextBox() throws InterruptedException {
        Assert.assertTrue(qaPage.getInputAnswer().isDisplayed());
        qaPage.getInputAnswer().sendKeys("প্রোটন ও নিউট্রন একসাথে পরমাণুর কেন্দ্রে অবস্থান করে যাকে বলা হয় নিউক্লিয়াস। নিউক্লিয়াসের চারপাশে ইলেকট্রন নির্দিষ্ট বৃত্তাকার পথে ঘুরতে থাকে।");
        Thread.sleep(8000);
    }

    @When("click on Reject & next and exit")
    public void clickOnRejectNextAndExit() throws InterruptedException {
        qaPage.getRejectButton().click();
        Thread.sleep(1000);
        qaPage.getExitButton().click();
        Thread.sleep(1000);
    }


}



















