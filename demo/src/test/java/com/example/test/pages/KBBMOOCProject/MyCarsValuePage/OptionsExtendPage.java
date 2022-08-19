package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBBasePage;

public class OptionsExtendPage extends KBBBasePage{

    public OptionsExtendPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    //#region Declare web objects
    private WebElement colorRed = keyword.findWebElementByXpath("//img[@alt='Red image']");
    private WebElement btnNext = keyword.findWebElementByXpath("//button[@data-lean-auto='optionsNextButton']");
    //#endregion

    //#region page actions
    public void clickOnRedColor(){
        keyword.scrollAndWaitToClick(colorRed);
    }
    public void clickOnNextButton() {
        keyword.scrollAndWaitToPageLoad(btnNext);
    }
    //#endregion
}
