package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatEquipmentIsonYourVehicleComponent extends KbbBasePage {

    public WhatEquipmentIsonYourVehicleComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private  WebElement btnBlack = keyword.findWebElementByXpath("//div/img[@src='https://file.kelleybluebookimages.com/kbb/base/houseswatch/black.jpg']");
    private WebElement checkboxDoYouHave2orMoreKeysorKeylessRemotes = keyword.findWebElementByXpath("//div/label[@data-testid='withKeys']");
    private WebElement checkboxHasYourVehicleHadAnyModifications = keyword.findWebElementByXpath("//div/label[@data-testid='withModifications']");
    public void clickOnBlackbutton() {
        
        keyword.scrollAndWaitToClick(btnBlack);
    }
    public void clickOnDoYouHave2orMoreKeysorKeylessRemotescheckbox() {
       
        keyword.scrollAndWaitToClick(checkboxDoYouHave2orMoreKeysorKeylessRemotes);
    }
    public void clickOnHasYourVehicleHadAnyModifications() {
       
        keyword.scrollAndWaitToClick(checkboxHasYourVehicleHadAnyModifications);
    }	

    
}
