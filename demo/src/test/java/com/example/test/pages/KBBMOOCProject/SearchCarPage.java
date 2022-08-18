package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchCarPage  extends KbbBasePage{

    public SearchCarPage(WebDriver driver) {
        super(driver);
    }
WebElement selectYear = keyword.findWebElementByXpath("//select[@placeholder='Year']");
    WebElement selectMake = keyword.findWebElementByXpath("//div[@class='make']//select[@placeholder='Make']");
    WebElement selectModel = keyword.findWebElementByXpath("//div[@class='model']//select[@placeholder='Model']");
    WebElement inputZip = keyword.findWebElementByXpath("//input[@type='tel']");
    WebElement btnGetReview = keyword.findWebElementByXpath("//form//button[@type='submit']");
  
    
    
    public void actionSelectaCars(String zipcode) throws InterruptedException{
          
        keyword.selectElement(selectYear, "2020");
        keyword.selectElement(selectMake, "Honda");
        keyword.selectElement(selectModel, "Civic");
        keyword.sendKeys(inputZip, zipcode);
        keyword.scrollAndWaitToClick(btnGetReview);
        
        
    }
}
