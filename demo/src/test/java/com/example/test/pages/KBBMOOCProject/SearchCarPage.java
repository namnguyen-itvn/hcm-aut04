package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchCarPage  extends KbbBasePage{

    public SearchCarPage(WebDriver driver) {
        super(driver);
    }
   
    // private WebElement Make = keyword.findWebElementByXpath("//select/option[text()='Honda']");
    // private WebElement Model = keyword.findWebElementByXpath("//select/option[text()='Civic']");
    // private WebElement ZipCode = keyword.findWebElementByXpath("//input[@class='zipcode css-160wkqx e1c4c4fv1']");
    // private WebElement btnGetReview = keyword.findWebElementByXpath("//button[@data-automation='submit-button']");
//     public void SelectYear() throws InterruptedException
//     {
//        WebElement Year = keyword.findWebElementByXpath("//select/option[@value='2020']");
//         keyword.scrollAndWaitToClick(Year);
//     }
//     public void SelectMake() throws InterruptedException
//     {
        
//         keyword.scrollAndWaitToClick(Make);
//     }

//     public void SelectModel() throws InterruptedException
//     {
        
//         keyword.scrollAndWaitToClick(Model);
//     }

//     public void ZipCode(String zipcode)
//     {
        
//          keyword.sendKeys(ZipCode, zipcode);
        
//     }
//     public void clickOnGetReview() throws InterruptedException
//     {
       
//         keyword.scrollAndWaitToClick(btnGetReview);
//     }
  
// }
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