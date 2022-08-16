package com.example.test.pages.KBBMOOCProject.CarFinderPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;


public class ShopByPricePage extends KbbBasePage {
    public ShopByPricePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    WebElement selectMinPrice = keyword.findWebElementByXpath("//select[@placeholder='Min price']");
    WebElement selectMaxPrice = keyword.findWebElementByXpath("//select[@placeholder='Max price']");
   

    public void actionSenkeyShopByPriceToFindVehicle() throws InterruptedException{
        keyword.selectElement(selectMinPrice,"$5,000");
        keyword.selectElement(selectMaxPrice,"$10,000");
       
    }

    public void actionClickSeeResultBtn() {
    WebElement btnSeeResult = keyword.findWebElementByXpath("//span[text()='See Results']");
    
        keyword.scrollAndWaitToClick(btnSeeResult);
    }
}