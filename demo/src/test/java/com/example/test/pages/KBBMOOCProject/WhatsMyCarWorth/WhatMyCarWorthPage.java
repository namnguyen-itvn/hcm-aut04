package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WhatMyCarWorthPage extends KbbBasePage {

    public WhatMyCarWorthPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    WebElement textboxVin = keyword.findWebElementByXpath("//div[@id='vinNumberInput']//input");
    WebElement textboxEmail = keyword.findWebElementByXpath("//div[@id='vinEmailInput']//input");
    WebElement buttonGo = keyword.findWebElementByXpath("//div[@class='css-3ok99w']//button");

    public void actionGoToCategoryStylePage(String vin,String email) throws InterruptedException{
        keyword.sendKeys(textboxVin, vin);
        keyword.sendKeys(textboxEmail, email);
        keyword.scrollAndWaitToClick(buttonGo);
    }

    
}
