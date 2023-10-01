package org.pageObjects.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AdminLoginPage {
    public WebDriver driver;

    public String Stime = "";
    String AdminPortalUrl = "https://ums.osl.team";

    By AdminLoginPage = By.xpath("//div[@class='panel-title text-center']");
    By Username = By.xpath("//input[@id='UserName']");
    By Password = By.xpath("(//input[@id='Password'])[1]");
    By LoginButton = By.xpath("//button[@id='Submit']");
    By Welcome = By.xpath("//h1[normalize-space()='Welcome to UMS']");
    By AdministrationMenu = By.xpath("//a[normalize-space()='Administration']");
    By Routine = By.xpath("//a[normalize-space()='Routine']");
    By ManageClassRoutine = By.xpath("//a[normalize-space()='Manage Class Routine']");
    By ManageClassRoutinePage = By.xpath("//h4[normalize-space()='Manage Class Routine']");
    By CreateRoutine = By.xpath("//a[normalize-space()='Create Routine']");
    By CreateClassRoutinePage = By.xpath("//h4[normalize-space()='Create Class Routine']");
    By RoutineDate = By.xpath("//input[@id='ClassRoutineDate']");
    By LectureStartTime = By.xpath("//input[@id='LectureStartTime']");
    By LectureStartH = By.xpath("(//span[@class='hour active hour_am'])[3]");
    By LectureStartM = By.xpath("(//span[@class='minute active'])[4]");
    By LectureEndTime = By.xpath("//input[@id='LectureEndTime']");
    By LectureEndM = By.xpath("(//span[@class='minute active'])[5]");
    By LectureType = By.xpath("//select[@id='LectureType']");
    By InBranch = By.xpath("//option[normalize-space()='In-Branch Class']");
    By OnlineClass = By.xpath("//option[normalize-space()='Online Class']");
    By AddBatchBtn = By.xpath("//input[@id='addBatchBtn']");
    By ModalContent = By.xpath("(//div[@class='modal-content'])[1]");
    By Organization = By.xpath("//select[@id='OrganizationId']");
    By OrganizationList = By.xpath("//option[normalize-space()='UDVASH']");
    By Program = By.xpath("//select[@id='ProgramId']");
    By ProgramList = By.xpath("//option[normalize-space()='QA Program']");
    By Session = By.xpath("//select[@id='SessionId']");
    By SessionList = By.xpath("//option[normalize-space()='2023']");
    By Course = By.xpath("//select[@id='CourseId']");
    By CourseList = By.xpath("//option[@title='QA Math (Complementary)']");
    By Lecture = By.xpath("//input[@id='Lecture']");
    By LectureList = By.xpath("//li[@class='active']//a[@role='option']");
    By RoutineBy = By.xpath("//select[@id='RoutineBy']");
    By RoutineByList = By.xpath("//option[normalize-space()='Branch Wise']");
    By SubmitButton = By.xpath("//button[@class='btn btn-default replace-btn-class addBatchSubmitButton']");
    By SelectedBatch = By.xpath("//div[@title='QA Program-2023']");
    By interactiveCheckbox = By.xpath("//input[@id='interactive-class-checkbox']");
    By Host = By.xpath("//input[@class='form-control interactive-host']");
    By TPIN = By.xpath("//input[@class='form-control interactive-teacher']");
    By ClassType = By.xpath("(//select[@name='ClassTypesFirst'])[1]");
    By ClassTypeList = By.xpath("(//option[@value='1'][normalize-space()='Regular Class'])[2]");
    By CreatePublish = By.xpath("//input[@id='class-routine-create-publish']");
    By HostList = By.xpath("(//a[@role='option'])[1]");
    By TeacherList = By.xpath("(//li[@class='active'])[2]");
    By RoutineSuccessfully = By.xpath("//div[@class='alert alert-success']");
    By ViewButton = By.xpath("//button[@id='btnSubmit']");
    By Details = By.xpath("//h4[normalize-space()='Details']");
    By UpdateRoutinePage = By.xpath("//h4[normalize-space()='Update Class Routine']");
    By UpdateButton = By.xpath("//input[@id='class-routine-create']");








    public WebElement getUpdateButton() {return driver.findElement(UpdateButton);}
    public WebElement getUpdateRoutinePage() {return driver.findElement(UpdateRoutinePage);}







    public AdminLoginPage(WebDriver driver){this.driver = driver;}

    public void getAdminPortal(){driver.navigate().to(AdminPortalUrl);}
    public WebElement getAdminLoginPage() {return driver.findElement(AdminLoginPage);}
    public WebElement getUsername() {return driver.findElement(Username);}
    public WebElement getPassword() {return driver.findElement(Password);}
    public WebElement getLoginButton() {return driver.findElement(LoginButton);}
    public WebElement getWelcome() {return driver.findElement(Welcome);}
    public WebElement getDetails() {return driver.findElement(Details);}
    public WebElement getViewButton() {return driver.findElement(ViewButton);}
    public WebElement getRoutineSuccessfully() {return driver.findElement(RoutineSuccessfully);}
    public WebElement getTeacherList() {return driver.findElement(TeacherList);}
    public WebElement getHostList() {return driver.findElement(HostList);}
    public WebElement getCreatePublish() {return driver.findElement(CreatePublish);}
    public WebElement getSelectedBatch() {return driver.findElement(SelectedBatch);}
    public WebElement getinteractiveCheckbox() {return driver.findElement(interactiveCheckbox);}
    public WebElement getHost() {return driver.findElement(Host);}
    public WebElement getTPIN() {return driver.findElement(TPIN);}
    public WebElement getClassType() {return driver.findElement(ClassType);}
    public WebElement getClassTypeList() {return driver.findElement(ClassTypeList);}
    public WebElement getSubmitButton() {return driver.findElement(SubmitButton);}
    public WebElement getModalContent() {return driver.findElement(ModalContent);}
    public WebElement getOrganizationList() {return driver.findElement(OrganizationList);}
    public WebElement getOrganization() {return driver.findElement(Organization);}
    public WebElement getProgramList() {return driver.findElement(ProgramList);}
    public WebElement getProgram() {return driver.findElement(Program);}
    public WebElement getSessionList() {return driver.findElement(SessionList);}
    public WebElement getSession() {return driver.findElement(Session);}
    public WebElement getLectureList() {return driver.findElement(LectureList);}
    public WebElement getLecture() {return driver.findElement(Lecture);}
    public WebElement getCourse() {return driver.findElement(Course);}
    public WebElement getCourseList() {return driver.findElement(CourseList);}
    public WebElement getRoutineBy() {return driver.findElement(RoutineBy);}
    public WebElement getRoutineByList() {return driver.findElement(RoutineByList);}
    public WebElement getInBranch() {return driver.findElement(InBranch);}
    public WebElement getOnlineClass() {return driver.findElement(OnlineClass);}
    public WebElement AddBatchBtn() {return driver.findElement(AddBatchBtn);}
    public WebElement getLectureType() {return driver.findElement(LectureType);}
    public WebElement getLectureEndM() {return driver.findElement(LectureEndM);}
    public WebElement getLectureEndH() {return driver.findElement(By.xpath("(//span[contains(@class, 'hour_am') and contains(text(),'"+Stime+"')])[4]"));}
    public WebElement getLectureEndTime() {return driver.findElement(LectureEndTime);}
    public WebElement getLectureStartM() {return driver.findElement(LectureStartM);}
    public WebElement getLectureStartH() {return driver.findElement(LectureStartH);}
    public WebElement getLectureStartTime() {return driver.findElement(LectureStartTime);}
    public WebElement getRoutineDate() {return driver.findElement(RoutineDate);}
    public WebElement getCreateClassRoutinePage() {return driver.findElement(CreateClassRoutinePage);}
    public WebElement getCreateRoutine() {return driver.findElement(CreateRoutine);}
    public WebElement getManageClassRoutinePage() {return driver.findElement(ManageClassRoutinePage);}
    public WebElement getManageClassRoutine() {return driver.findElement(ManageClassRoutine);}
    public WebElement getRoutine() {return driver.findElement(Routine);}
    public WebElement getAdministrationMenu() {return driver.findElement(AdministrationMenu);}


    public WebElement getEditBtn (){
        int i=1;
        WebElement edit = null;
        try{
            for (i=1; i<=22; i++){
              driver.findElement(By.xpath(("(//a[@class='glyphicon glyphicon-pencil'])["+i+"]"))).isDisplayed();

            }

        }
        catch (Exception e){
            i=i-1;
            edit = driver.findElement(By.xpath("(//a[@class='glyphicon glyphicon-pencil'])["+i+"]"));
        }
        return edit;
    }

}
