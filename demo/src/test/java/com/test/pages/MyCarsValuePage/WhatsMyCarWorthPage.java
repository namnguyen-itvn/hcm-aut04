package com.test.pages.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.pages.KBBBasePage;


public class WhatsMyCarWorthPage extends KBBBasePage{

    public WhatsMyCarWorthPage(WebDriver driver) {
        super(driver);
    }
    //#region Declare web objects
    private WebElement chkMakeModel = keyword.findWebElementByXpath("//div[text()='Make/Model']");
     //#endregion

    //#region page actions
   
    /**
     * Option Make/Model
     */
    public void clickOnMakeModelCheckbox() {
        keyword.scrollAndWaitToClick(chkMakeModel);
    }
    //#endregion
}
