package com.example.test.pages.KBBMOOCProject.CarFinderPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;


public class ShopByPricePage extends KbbBasePage {
    public ShopByPricePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    //#region Declare web object
    private WebElement selectMinPrice = keyword.findWebElementByXpath("//select[@placeholder='Min price']");
    private WebElement selectMaxPrice = keyword.findWebElementByXpath("//select[@placeholder='Max price']");
   //#endregion

    public void actionShopByPriceToFindVehicle(String minprice, String maxprice) throws InterruptedException{
        keyword.selectElement(selectMinPrice,minprice);
        keyword.selectElement(selectMaxPrice,maxprice);  
    }
    // private WebElement btnSeeResult = keyword.findWebElementByXpath("//div//a[@class='css-14twj67 e1uau9z02']");  
    public void actionClickSeeResultForShopByPrice() throws InterruptedException {
        WebElement btnSeeResult = keyword.findWebElementByXpath("//div//a[@class='css-14twj67 e1uau9z02']");  
        keyword.scrollAndWaitToClick(btnSeeResult);
    }
 


}