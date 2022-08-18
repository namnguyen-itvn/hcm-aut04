package com.example.test.pages.KBBMOOCProject.CarResearchPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ResearchNewAndUsedCarsPage extends KbbBasePage {

    public ResearchNewAndUsedCarsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
//#region Declare web object
   private WebElement selectYear = keyword.findWebElementByXpath("//select[@placeholder='Year']");
   private WebElement selectMake = keyword.findWebElementByXpath("//div[@class='make']//select[@placeholder='Make']");
   private WebElement selectModel = keyword.findWebElementByXpath("//div[@class='model']//select[@placeholder='Model']");
   private WebElement inputZip = keyword.findWebElementByXpath("//input[@type='tel']");
   private WebElement btnGetReview = keyword.findWebElementByXpath("//form//button[@type='submit']");

//#endregion

//#region page action
    public void actionSelectaVehicle() throws InterruptedException{
        keyword.selectElement(selectYear,"2018");
        keyword.selectElement(selectMake,"Honda");
        keyword.selectElement(selectModel,"Civic");
    }
    public void actionInputZipcodeCarResearchPage(String zipcode) {
        keyword.sendKeys(inputZip,zipcode);
    }
    public void actionClickGetReviewBtnCarResearchPage() throws InterruptedException {
        keyword.waitToClick(btnGetReview);
    }
//#endregion
}