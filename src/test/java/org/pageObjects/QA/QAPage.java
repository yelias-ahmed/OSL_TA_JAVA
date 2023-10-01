package org.pageObjects.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QAPage {
    public WebDriver driver;

    By QnAMenu = By.xpath("//a[normalize-space()='Q&A']");
    By QnAPage = By.xpath("//h1[normalize-space()='Q&A SERVICES']");
    By LoadMore = By.xpath("//a[normalize-space()='Load More']");
    By LoadMoreButton = By.xpath("//button[@id='allQnALoadMore']");
    By AnySubject = By.xpath("(//a[@type='submit'][normalize-space()='Proceed'])[2]");
    By QuestionAnswerPage  = By.xpath("//h2[normalize-space()='Question and Answer']");
    By AskANewQuestion  = By.xpath("//a[@id='askNewQuestion']");
    By AskANewQuestionPage  = By.xpath("//h2[normalize-space()='Ask a New Question']");
    By AskANewQuestionText  = By.xpath("//textarea[@placeholder='Ask a question']");
    By AskANewQuestionText2  = By.xpath("(//textarea[@placeholder='Ask a question'])[2]");
    By CourseDropdown  = By.xpath("//select[@id='AskCourse']");
    By CourseDropdownList  = By.xpath("(//option[@value='130'][normalize-space()='QA Arc'])[1]");
    By SubjectDropdown  = By.xpath("//select[@id='AskSubject']");
    By SubjectDropdownList  = By.xpath("//select[@id='AskSubject']//option[@value='75'][normalize-space()='Architecture']");
    By ChapterDropdown  = By.xpath("//select[@id='AskChapter']");
    By ChapterDropdownList  = By.xpath("//option[@value='327']");
    By Submit = By.xpath("//input[@value='Submit']");
    By Submit2 = By.xpath("(//input[@value='Submit'])[2]");
    By QuestionAnswerMenu = By.xpath("//a[normalize-space()='Question & Answer']");
    By PendingQuestion = By.xpath("//a[normalize-space()='Pending Question']");
    By NewQuestion = By.xpath("//h5[normalize-space()='New Question']");
    By StudentsQuestion = By.xpath("(//b[normalize-space()=\"Student's Question\"])[1]");
    By SubmitNextBtn = By.xpath("//input[@id='SubmitNextBtn']");
    By InputAnswer = By.xpath("//textarea[@id='input-answer']");
    By SuccessMsg = By.xpath("//div[@class='alert alert-success']");
    By NotificationBadge = By.xpath("//span[@id='notification_badge']");
    By NotificationCard = By.xpath("(//div[@class='card-body'])[2]");
    By Notificationpage = By.xpath("//h2[normalize-space()='Notifications']");
    By BackToNotificationCard = By.xpath("//a[@class='btn px-3 shadow-none']");
    By Answer = By.xpath("(//div[@class='teacher-reply'])[1]");
    By NotificaltionIcon = By.xpath("//i[@class='fas fa-bell']");
    By NotYet = By.xpath("//a[@class='btn btn-notYet']");
    By StudentReplay = By.xpath("(//div[@class='student-reply text-right thread-details-container'])[2]");
    By ReviewRequest = By.xpath("//h5[normalize-space()='Review Request']");
    By SubmitNext = By.xpath("//input[@value='Submit & Next']");
    By Satisfied = By.xpath("//a[@class='btn btn-satisfied mr-2']");
    By SatisfiedMark = By.xpath("//span[@class='text-success']");
    By StudentMenu = By.xpath("//a[normalize-space()='Student']");
    By StudentArea = By.xpath("//h1[normalize-space()='Student Area']");
    By QnA2Service = By.xpath("//a[normalize-space()='Q&A2 Service']");
    By QnA2Moderation = By.xpath("//a[normalize-space()='Q&A2 Moderation']");
    By RegiRoll = By.xpath("//input[@id='RegiRoll']");
    By ViewButton = By.xpath("//button[@id='btnView']");
    By Moderate = By.xpath("(//button[normalize-space()='Moderate'])[1]");
    By ModerationPage = By.xpath("//h4[normalize-space()='Q&A Moderation']");
    By SummarySection = By.xpath("//h4[normalize-space()='Summary']");
    By EditAnswerImg = By.xpath("(//input[@id='editAnswer-image-file-input'])[1]");
    By StudentQuestionPage = By.xpath("(//b[normalize-space()=\"Student's Question\"])[1]");
    By Paperclip = By.xpath("//i[@class='fa fa-paperclip']");
    By UpdateNNext = By.xpath("//button[@id='SaveNewQuestion']");
    By ExitButton = By.xpath("//button[@id='btnExit']");
    By ImgFluid = By.xpath("(//img[@class='img-fluid modal-item'])[1]");
    By SearchBar = By.xpath("//input[@placeholder='Search your question here']");
    By SearchSugg = By.xpath("(//a[@class='singleThreadQuestionSpan'])[1]");
    By SearchResult = By.xpath("//div[@class='card-body searchedThreadBox']");
    By DeleteAll = By.xpath("//a[normalize-space()='Delete All']");
    By DeleteYesButton = By.xpath("//a[@id='delete_all_notification']");
    By RejectButton = By.xpath("//button[@class='clsBtnAnswerAction btn btn-danger']");
















    public QAPage(WebDriver driver) {this.driver = driver;}

    public WebElement getQnAMenu(){return driver.findElement(QnAMenu);}
    public WebElement getQnAPage(){return driver.findElement(QnAPage);}
    public WebElement getLoadMore(){return driver.findElement(LoadMore);}
    public WebElement getAnySubject() {return driver.findElement(AnySubject);}
    public WebElement getQuestionAnswerPage() {return driver.findElement(QuestionAnswerPage);}
    public WebElement getAskANewQuestion() {return driver.findElement(AskANewQuestion);}
    public WebElement getAskANewQuestionPage() {return driver.findElement(AskANewQuestionPage);}
    public WebElement getAskANewQuestionText() {return driver.findElement(AskANewQuestionText);}
    public WebElement getAskANewQuestionText2() {return driver.findElement(AskANewQuestionText2);}
    public WebElement getCourseDropdown() {return driver.findElement(CourseDropdown);}
    public WebElement getCourseDropdownList() {return driver.findElement(CourseDropdownList);}
    public WebElement getSubjectDropdown() {return driver.findElement(SubjectDropdown);}
    public WebElement getSubjectDropdownList() {return driver.findElement(SubjectDropdownList);}
    public WebElement getChapterDropdown() {return driver.findElement(ChapterDropdown);}
    public WebElement getChapterDropdownList() {return driver.findElement(ChapterDropdownList);}
    public WebElement getSubmit() {return driver.findElement(Submit);}
    public WebElement getSubmit2() {return driver.findElement(Submit2);}
    public WebElement getQuestionAnswerMenu() {return driver.findElement(QuestionAnswerMenu);}
    public WebElement getPendingQuestion() {return driver.findElement(PendingQuestion);}
    public WebElement getNewQuestion() {return driver.findElement(NewQuestion);}
    public WebElement getStudentsQuestion() {return driver.findElement(StudentsQuestion);}
    public WebElement getSubmitNextBtn() {return driver.findElement(SubmitNextBtn);}
    public WebElement getInputAnswer() {return driver.findElement(InputAnswer);}
    public WebElement getAnswerButton()
    {

        String xpath = null;
        int k=2;
        try {
        if (driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[2]")).isDisplayed())
            k = 3;    }
        catch (Exception e){k=2;}


        for(int i=1; ; i++)
        {

            xpath = "//body[1]/div[2]/div[1]/div["+k+"]/div[2]/table[1]/tbody[1]/tr["+i+"]/td[2]";
            if (driver.findElement(By.xpath(xpath)).getText().equals("QA Arc"))
            {
                xpath ="//tbody[1]/tr["+i+"]/td[6]/a[1]";
                break;

            }
        }
        return driver.findElement(By.xpath(xpath));
    }
    public WebElement getSuccessMsg() {return driver.findElement(SuccessMsg);}
    public WebElement getNotificationBadge(){return driver.findElement(NotificationBadge);}
    public WebElement getNotificationCard(){return driver.findElement(NotificationCard);}
    public WebElement getNotificationPage(){return driver.findElement(Notificationpage);}
    public WebElement getBackToNotificationCard(){return driver.findElement(BackToNotificationCard);}
    public WebElement getAnswer(){return driver.findElement(Answer);}
    public WebElement getNotificaltionIcon(){return driver.findElement(NotificaltionIcon);}
    public WebElement getNotYet(){return driver.findElement(NotYet);}
    public WebElement getStudentReplay(){return driver.findElement(StudentReplay);}
    public WebElement getReviewRequest(){return driver.findElement(ReviewRequest);}
    public WebElement getReviewRequestButton()
    {   String xpath = null;
        for(int i=1; ; i++)
        {
            xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr["+i+"]/td[2]";
            if (driver.findElement(By.xpath(xpath)).getText().equals("QA Arc"))
            {
                xpath ="//tbody[1]/tr["+i+"]/td[7]/a[1]";
                break;

            }
        }
        return driver.findElement(By.xpath(xpath));
    }
    public WebElement getSubmitNext(){return driver.findElement(SubmitNext);}
    public WebElement getSatisfied(){return driver.findElement(Satisfied);}
    public WebElement getSatisfiedMark(){return driver.findElement(SatisfiedMark);}
    public WebElement getStudentMenu(){return driver.findElement(StudentMenu);}
    public WebElement getStudentArea(){return driver.findElement(StudentArea);}
    public WebElement getQnA2Service(){return driver.findElement(QnA2Service);}
    public WebElement getQnA2Moderation(){return driver.findElement(QnA2Moderation);}
    public WebElement getRegiRoll(){return driver.findElement(RegiRoll);}
    public WebElement getViewButton(){return driver.findElement(ViewButton);}
    public WebElement getModerate(){return driver.findElement(Moderate);}
    public WebElement getModerationPage(){return driver.findElement(ModerationPage);}
    public WebElement getSummarySection(){return driver.findElement(SummarySection);}
    public WebElement getEditAnswerImg(){return driver.findElement(EditAnswerImg);}
    public WebElement getStudentQuestionPage(){return driver.findElement(StudentQuestionPage);}
    public WebElement getPaperclip(){return driver.findElement(Paperclip);}
    public WebElement getUpdateNNext(){return driver.findElement(UpdateNNext);}
    public WebElement getExitButton(){return driver.findElement(ExitButton);}
    public WebElement getImgFluid(){return driver.findElement(ImgFluid);}
    public WebElement getLoadMoreButton(){return driver.findElement(LoadMoreButton);}
    public WebElement getSearchBar(){return driver.findElement(SearchBar);}
    public WebElement getSearchSugg(){return driver.findElement(SearchSugg);}
    public WebElement getSearchResult(){return driver.findElement(SearchResult);}
    public WebElement getDeleteAll(){return driver.findElement(DeleteAll);}
    public WebElement getDeleteYesButton(){return driver.findElement(DeleteYesButton);}
    public WebElement getRejectButton(){return driver.findElement(RejectButton);}





}
