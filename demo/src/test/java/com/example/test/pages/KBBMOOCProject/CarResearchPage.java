package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarResearchPage extends KbbBasePage {
    public CarResearchPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
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
    public void clickonLXCoupe2D() throws InterruptedException
    {
        WebElement LXCoupe2D = keyword.findWebElementByXpath("//a[@class='css-1sw5zct erywcq03']");
        keyword.scrollAndWaitToClick(LXCoupe2D);
    }
    public void clickonSpecsvsFeatures() throws InterruptedException
    {
        WebElement SpecsvsFeatures = keyword.findWebElementByXpath("//div[@label='Specs & Features']");
        keyword.scrollAndWaitToClick(SpecsvsFeatures);
    }
    public void clickonReadmore() throws InterruptedException
    {
        WebElement Readmore = keyword.findWebElementByXpath("//p[text()='Read More']");
        keyword.scrollAndWaitToClick(Readmore);
    }
    
    }
    

