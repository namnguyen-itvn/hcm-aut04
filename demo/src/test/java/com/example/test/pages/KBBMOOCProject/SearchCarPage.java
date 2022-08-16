package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchCarPage  extends KbbBasePage{

    public SearchCarPage(WebDriver driver) {
        super(driver);
    }
    public void SelectYear() throws InterruptedException
    {
        WebElement Year = keyword.findWebElementByXpath("//select/option[@value='2020']");
        keyword.scrollAndWaitToClick(Year);
    }
    public void SelectMake() throws InterruptedException
    {
        WebElement Make = keyword.findWebElementByXpath("//select/option[text()='Honda']");
        keyword.scrollAndWaitToClick(Make);
    }

    public void SelectModel() throws InterruptedException
    {
        WebElement Model = keyword.findWebElementByXpath("//select/option[text()='Civic']");
        keyword.scrollAndWaitToClick(Model);
    }

    public void ZipCode(String zipcode)
    {
        WebElement ZipCode = keyword.findWebElementByXpath("//input[@class='zipcode css-160wkqx e1c4c4fv1']");
         keyword.sendKeys(ZipCode, zipcode);
        
    }
    public void clickOnGetReview() throws InterruptedException
    {
        WebElement btnGetReview = keyword.findWebElementByXpath("//button[@data-automation='submit-button']");
        keyword.scrollAndWaitToClick(btnGetReview);
    }
    public void clickonStyles() throws InterruptedException
    {
        WebElement btnStyles = keyword.findWebElementByXpath("//div[@label='Styles']");
        keyword.scrollAndWaitToClick(btnStyles);
    }
    public void clickonCarChevrolet() throws InterruptedException
    {
        WebElement btnCarChevrolet = keyword.findWebElementByXpath("//a[@href='/chevrolet/corvette/']");
        keyword.scrollAndWaitToClick(btnCarChevrolet);
    }
}
