package com.example.test.pages.KBBMOOCProject.CarForSalePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarForSalePage extends KbbBasePage{

    public CarForSalePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    WebElement txtZip = keyword.findWebElementByXpath("//input[@name='zip']");
    WebElement selectDelivery = keyword.findWebElementByXpath("//div[text()='Delivery']");
    WebElement txtSearch = keyword.findWebElementByXpath("//div[@class='margin-bottom-3']//input");
    
   


    //*Input Zip Code */
    public void inputToZip (String zip) throws InterruptedException{
        keyword.waitForPageToLoad();
        txtZip.sendKeys(zip);
    }
    
    //*Click Check Box Delivery  */
    public void clickOnCheckBoxDelivery () throws InterruptedException{
        keyword.waitForPageToLoad();
        keyword.scrollAndWaitToClick(selectDelivery);
        keyword.waitForPageToLoad();
        
    }
   

   
}
