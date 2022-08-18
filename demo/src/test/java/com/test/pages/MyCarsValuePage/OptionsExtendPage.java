package com.test.pages.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.pages.KBBBasePage;

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
    // public void clickYesOptionInKeyQuestion(){
    //     WebElement withKeys = keyword.findWebElementByXpath("//label[@data-testid='withKeys']");
    //     keyword.scrollAndWaitToClick(withKeys);
    // }
    // public void clickNoOptionInModificationsQuestion(){
    //     WebElement withoutModifications = keyword.findWebElementByXpath("//label[@data-testid='withoutModifications']");
    //     keyword.scrollAndWaitToClick(withoutModifications);
    // }
    public void clickOnNextButton() throws InterruptedException {
        keyword.scrollAndWaitToPageLoad(btnNext);
    }
    //#endregion
}
