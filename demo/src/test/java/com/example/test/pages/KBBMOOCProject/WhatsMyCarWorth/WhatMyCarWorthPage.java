package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WhatMyCarWorthPage extends KbbBasePage {

    public WhatMyCarWorthPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    WebElement txtVin = keyword.findWebElementByXpath("//div[@id='vinNumberInput']//input");
    WebElement txtEmail = keyword.findWebElementByXpath("//div[@id='vinEmailInput']//input");
    WebElement btnGo = keyword.findWebElementByXpath("//div[@class='css-3ok99w']//button");
    public void sendVinTradeInandPrivatePartyValues(String vin) throws InterruptedException{
        
        keyword.sendKeys(txtVin, vin);
    }
    public void sendEmailTradeInandPrivatePartyValues(String email) throws InterruptedException{
        
        keyword.sendKeys(txtEmail, email);
    }
    public void clickOnGobutton() throws InterruptedException{
       
        keyword.scrollAndWaitToClick(btnGo);
    }
    
}
