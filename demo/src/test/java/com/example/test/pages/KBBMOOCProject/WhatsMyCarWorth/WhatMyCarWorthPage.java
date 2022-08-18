package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WhatMyCarWorthPage extends KbbBasePage {

    public WhatMyCarWorthPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    private WebElement textboxVin = keyword.findWebElementByXpath("//div[@id='vinNumberInput']//input");
    private WebElement textboxEmail = keyword.findWebElementByXpath("//div[@id='vinEmailInput']//input");
    private WebElement buttonGo = keyword.findWebElementByXpath("//div[@class='css-3ok99w']//button");

    /**
     * Enter VIN value, Email value and click on Go button
     * @param vin
     * @param email
     * @throws InterruptedException
     */ 
    public void actionGoToCategoryStylePage(String vin,String email) throws InterruptedException{
        keyword.sendKeys(textboxVin, vin);
        keyword.sendKeys(textboxEmail, email);
        keyword.scrollAndWaitToClick(buttonGo);
    }

    
}
