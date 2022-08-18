package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionsPage extends KbbBasePage{

    public OptionsPage(WebDriver driver) {
        super(driver);
    }
    //#region Declare Web Objects
    private WebElement optSelectYourOptions = keyword.findWebElementByXpath("//div[text()='Select Your Options']");
    //#endregion

    //#region page actions
    /**
     * click On option "SelectYourOptions" to extend more component
     */
    public void clickOnSelectYourOptions(){
        keyword.scrollAndWaitToClick(optSelectYourOptions);
    }
     //#endregion
}
