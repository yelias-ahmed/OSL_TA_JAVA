package org.pageObjects.StudentLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentLoginPage {
    public WebDriver driver;

    By StudentLoginPage = By.xpath("//h2[normalize-space()='Student Login']");
    By RegistrationNumber = By.xpath("//input[@id='RegistrationNumber']");
    By NextButton = By.xpath("//button[@id='btnSubmit']");
    By PasswordPage = By.xpath("//h3[normalize-space()='Enter Your Password']");
    By Password = By.xpath("(//input[@id='Password'])[1]");
    By LoginButton = By.xpath("//button[normalize-space()='Login']");
    By MyRoutineToday = By.xpath("//h2[normalize-space()='MY ROUTINE TODAY']");


    public StudentLoginPage(WebDriver driver) {this.driver = driver;}
    public WebElement getStudentLoginPage() {return driver.findElement(StudentLoginPage);}
    public WebElement setRegistrtionNumber() {return driver.findElement(RegistrationNumber);}
    public WebElement getNextButton() {return driver.findElement(NextButton);}
    public WebElement getPasswordPage() {return driver.findElement(PasswordPage);}
    public WebElement setPassword() {return driver.findElement(Password);}
    public WebElement getLoginButton() {return driver.findElement(LoginButton);}
    public WebElement getMyRoutineToday() {return driver.findElement(MyRoutineToday);}





}
