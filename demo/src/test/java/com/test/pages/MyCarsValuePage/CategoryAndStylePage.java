package com.test.pages.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.pages.KBBBasePage;

public class CategoryAndStylePage extends KBBBasePage{

    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    //#region page actions
    /**
     * Option Make/Model
     * @throws InterruptedException
     */
    public void selectYourStyle() throws InterruptedException {
        WebElement optHatchback = keyword.findWebElementByXpath("//div[text()='LX Hatchback 4D']");
        keyword.scrollAndWaitToClick(optHatchback);
    }
    public void clickOnMakeModelNextButton() throws InterruptedException{
        WebElement btnMakeModelNext = keyword.findWebElementByXpath("//button[@data-lean-auto='categoryPickerButton']");
        keyword.scrollAndWaitToClick(btnMakeModelNext);
    }
    //#endregion
}
