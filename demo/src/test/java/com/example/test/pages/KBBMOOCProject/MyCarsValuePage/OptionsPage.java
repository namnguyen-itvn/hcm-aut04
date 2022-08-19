package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBBasePage;

public class OptionsPage extends KBBBasePage{

    public OptionsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    //#region Declare web objects
    private WebElement optSelectYourOptions = keyword.findWebElementByXpath("//div[text()='Select Your Options']");
    //#endregion

    //#region page actions
    public void clickOnSelectYourOptionsOption(){
        keyword.scrollAndWaitToClick(optSelectYourOptions);
    }
     //#endregion
}
