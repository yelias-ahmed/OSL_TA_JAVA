package org.pageObjects.TeacherLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeacherLoginPage {
    public WebDriver driver;

    String TeacherPortalUrl = "https://ums-portal.osl.team/Teacher";

    By TeacherLoginPage = By.xpath("//h2[normalize-space()='Teacher Login']");
    By TPinNumber = By.xpath("//input[@id='Username']");
    By Password = By.xpath("(//input[@id='Password'])[1]");
    By LoginButton = By.xpath("//button[normalize-space()='Login']");
    By MyRoutine = By.xpath("//h2[normalize-space()='MY ROUTINE']");



    public TeacherLoginPage(WebDriver driver){this.driver = driver;}

    public void getTeacherPortal(){driver.navigate().to(TeacherPortalUrl);}
    public WebElement getTeacherLoginPage() {return driver.findElement(TeacherLoginPage);}
    public WebElement setTPinNumber() {return driver.findElement(TPinNumber);}
    public WebElement setPassword() {return driver.findElement(Password);}
    public WebElement getLoginButton() {return driver.findElement(LoginButton);}
    public WebElement getMyRoutine() {return driver.findElement(MyRoutine);}

}
