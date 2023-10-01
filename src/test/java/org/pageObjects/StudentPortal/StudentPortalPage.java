package org.pageObjects.StudentPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentPortalPage {

    public WebDriver driver;


    By MasterClassManu = By.xpath("//a[normalize-space()='Master Class']");
    By MasterClassPage = By.xpath("//h1[normalize-space()='master class']");
    By MasterClassCourse = By.xpath("//h5[normalize-space()='Engineering Master Class']");
    By ProceedButton = By.xpath("(//a[@type='submit'][normalize-space()='Proceed'])[1]");
    By Chapter = By.xpath("(//h5[@class='card-title pt-1'][contains(text(),'অধ্যায়-২ : গুণগত রসায়ন')])[1]");
    By LoadMore = By.xpath("//button[@type='submit']");
    By Video = By.xpath("(//a[contains(text(),'Video')])[1]");
    By Notes = By.xpath("(//a[contains(text(),'Notes')])[1]");
    By Quiz = By.xpath("(//a[contains(text(),'Quiz')])[1]");
    By SearchBar = By.xpath("//input[@id='SearchText']");
    By SearchResult = By.xpath("//td[contains(text(),'বাফার দ্রবণ')]");
    By StartQuiz = By.xpath("//a[@id='startQuiz']");
    By SubmitQuiz = By.xpath("//a[normalize-space()='Submit']");
    By AlartBox = By.xpath("//div[@class='modal-content text-center mx-auto']");
    By YesButton = By.xpath("//a[normalize-space()='Yes']");
    By AnalysisReport = By.xpath("//h4[normalize-space()='Analysis Report']");











    public StudentPortalPage(WebDriver driver) {this.driver = driver;}

    public WebElement getMasterClassManu() {return driver.findElement(MasterClassManu);}
    public WebElement getMasterClassPage() {return driver.findElement(MasterClassPage);}
    public WebElement getMasterClassCourse() {return driver.findElement(MasterClassCourse);}
    public WebElement getProceedButton() {return driver.findElement(ProceedButton);}
    public WebElement getChapter() {return driver.findElement(Chapter);}
    public WebElement getLoadMore() {return driver.findElement(LoadMore);}
    public WebElement getVideo() {return driver.findElement(Video);}
    public WebElement getNotes() {return driver.findElement(Notes);}
    public WebElement getQuiz() {return driver.findElement(Quiz);}
    public WebElement getSearchBar() {return driver.findElement(SearchBar);}
    public WebElement getSearchResult() {return driver.findElement(SearchResult);}
    public WebElement getStartQuiz() {return driver.findElement(StartQuiz);}
    public void SelectAllOption() throws InterruptedException {
        for (int i=1; i<=10; i++)
        {
            Thread.sleep(1000);
            String xpath = "//label[@for='OptionB_"+i+"']";
            WebElement option = driver.findElement(By.xpath(xpath));
            option.click();
        }
    }

    public WebElement getSubmitQuiz() {return driver.findElement(SubmitQuiz);}
    public WebElement getAlartBox() {return driver.findElement(AlartBox);}
    public WebElement getYesButton() {return driver.findElement(YesButton);}
    public WebElement getAnalysisReport() {return driver.findElement(AnalysisReport);}

}
