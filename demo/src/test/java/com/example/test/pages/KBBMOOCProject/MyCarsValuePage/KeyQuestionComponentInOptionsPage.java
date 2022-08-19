package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class KeyQuestionComponentInOptionsPage extends KbbBasePage{

    public KeyQuestionComponentInOptionsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    //#region Declare web objects
    private WebElement withKeys = keyword.findWebElementByXpath("//label[@data-testid='withKeys']");
    //#endregion

    //#region page actions
    public void clickYesOptionInKeyQuestion() {
        keyword.scrollAndWaitToClick(withKeys);
    }
    //#endregion
}
