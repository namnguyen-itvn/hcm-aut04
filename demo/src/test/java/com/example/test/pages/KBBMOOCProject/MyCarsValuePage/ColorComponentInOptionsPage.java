package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ColorComponentInOptionsPage extends KbbBasePage{

    public ColorComponentInOptionsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    //#region Declare web objects
    private WebElement colorRed = keyword.findWebElementByXpath("//img[@alt='Red image']");
    //#endregion

    //#region page actions
    public void clickOnRedColor() {
        keyword.scrollAndWaitToClick(colorRed);
    }
    //#endregion
}
