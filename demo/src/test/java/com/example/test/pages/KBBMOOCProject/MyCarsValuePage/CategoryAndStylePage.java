package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CategoryAndStylePage extends KbbBasePage{

    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        
    }
    //#region Declare web objects
    private WebElement transmissionSelectBox = keyword.findWebElementByXpath("//select[@placeholder='Transmission']");
    //#endregion

    //#region page actions
    public void clickOnSelectboxAndClickOnAutomatic(String automatic) throws InterruptedException{
        keyword.scrollAndWaitToClick(transmissionSelectBox);
        keyword.selectElement(transmissionSelectBox, automatic);
    }
    //#endregion
}
