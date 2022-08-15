package com.example.test.pages.KBBMOOCProject.CarResearchPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ResearchNewAndUsedCarsPage extends KbbBasePage {

    public ResearchNewAndUsedCarsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    WebElement selectYear = keyword.findWebElementByXpath("//select[@placeholder='Year']");
    WebElement selectMake = keyword.findWebElementByXpath("//div[@class='make']//select[@placeholder='Make']");
    WebElement selectModel = keyword.findWebElementByXpath("//div[@class='model']//select[@placeholder='Model']");
    WebElement inputZip = keyword.findWebElementByXpath("//input[@type='tel']");
    WebElement btnGetReview = keyword.findWebElementByXpath("//form//button[@type='submit']");

    


    public void actionSelectaVehicle() throws InterruptedException{
        keyword.selectElement(selectYear,"2018");
        keyword.selectElement(selectMake,"Honda");
        keyword.selectElement(selectModel,"Civic");
        keyword.sendKeys(inputZip, "92168");
        keyword.waitToClick(btnGetReview);

    }

    

}