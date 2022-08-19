package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatEquipmentIsonYourVehicleComponent extends KbbBasePage {

    public WhatEquipmentIsonYourVehicleComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private  WebElement btnBlack = keyword.findWebElementByXpath("//div/img[@src='https://file.kelleybluebookimages.com/kbb/base/houseswatch/black.jpg']");
   
   
    public void clickOnBlackbutton() {
        
        keyword.scrollAndWaitToClick(btnBlack);
    }
   
   	

    
}
