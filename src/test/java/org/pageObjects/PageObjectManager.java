package org.pageObjects;
import org.openqa.selenium.WebDriver;
import org.pageObjects.Admin.AdminLoginPage;
import org.pageObjects.QA.QAPage;
import org.pageObjects.StudentLogin.StudentLoginPage;
import org.pageObjects.StudentPortal.StudentPortalPage;
import org.pageObjects.TeacherLogin.TeacherLoginPage;

public class PageObjectManager {
    public WebDriver driver;
    public StudentLoginPage studentloginpage;
    public TeacherLoginPage teacherLoginPage;
    public AdminLoginPage adminLoginPage;
    public QAPage qaPage;
    public StudentPortalPage studentPortalPage;


    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }


    public StudentLoginPage getStudentLoginPage()
    {
        studentloginpage= new StudentLoginPage(driver);
        return studentloginpage;
    }

    public TeacherLoginPage getTeacherLoginPage()
    {
        teacherLoginPage = new TeacherLoginPage(driver);
        return teacherLoginPage;
    }

    public AdminLoginPage getAdminLoginPage() {
        adminLoginPage =new AdminLoginPage(driver);
        return adminLoginPage;
    }
    public QAPage getQaPage() {
        qaPage = new QAPage(driver);
        return qaPage;
    }
    public StudentPortalPage getStudentPortalPage() {
        studentPortalPage = new StudentPortalPage(driver);
        return studentPortalPage;
    }
}
