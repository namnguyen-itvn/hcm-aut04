package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WhatMyCarWorthPage extends KbbBasePage {

    public WhatMyCarWorthPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    public void sendVinTradeInandPrivatePartyValues(String vin) throws InterruptedException{
        WebElement txtVin = keyword.findWebElementByXpath("//div[@id='vinNumberInput']//input");
        keyword.sendKeys(txtVin, vin);
    }
    public void sendEmailTradeInandPrivatePartyValues(String email) throws InterruptedException{
        WebElement txtEmail = keyword.findWebElementByXpath("//div[@id='vinEmailInput']//input");
        keyword.sendKeys(txtEmail, email);
    }
    public void clickOnGobutton() throws InterruptedException{
        WebElement btnGo = keyword.findWebElementByXpath("//div[@class='css-3ok99w']//button");
        keyword.scrollAndWaitToClick(btnGo);
    }
    
}
