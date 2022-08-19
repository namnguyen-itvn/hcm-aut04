package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupCalculatingYourBlueBookValuePage extends KbbBasePage {

    public PopupCalculatingYourBlueBookValuePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private WebElement titPopup = keyword.findWebElementByXpath("//div//h1[text()=' Calculating Your Blue Book® Value']");
    public boolean checktitlePopupWhenUserClickOnFairbutton(){
        if (titPopup.isDisplayed()) {
            return true;
        }return false;
    }
    
}
