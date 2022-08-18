package com.test.pages.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.pages.KBBBasePage;

public class CategoryAndStylePage extends KBBBasePage{

    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    //#region Declare web objects
    private WebElement optHatchback = keyword.findWebElementByXpath("//div[text()='LX Hatchback 4D']");
    private WebElement btnMakeModelNext = keyword.findWebElementByXpath("//button[@data-lean-auto='categoryPickerButton']");
    //#endregion

    //#region page actions
    public void clickToSelectStyle() {
        keyword.scrollAndWaitToClick(optHatchback);
    }
    public void clickOnMakeModelNextButton() throws InterruptedException{
        keyword.scrollAndWaitToPageLoad(btnMakeModelNext);
    }
    //#endregion
}
