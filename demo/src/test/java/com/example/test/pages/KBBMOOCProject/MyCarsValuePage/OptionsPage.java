package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionsPage extends KbbBasePage{

    public OptionsPage(WebDriver driver) {
        super(driver);
   
    }
    //#region page actions
    /**
     * Option VIN
     */
    public void clickOnSelectYourOptions(){
        WebElement optSelectYourOptions = keyword.findWebElementByXpath("//div[text()='Select Your Options']");
        keyword.scrollAndWaitToClick(optSelectYourOptions);
    }
    public void clickOnRedColor() {
        WebElement colorRed = keyword.findWebElementByXpath("//img[@alt='Red image']");
        keyword.scrollAndWaitToClick(colorRed);
    }
    public void clickYesOptionInKeyQuestion() throws InterruptedException {
        WebElement withKeys = keyword.findWebElementByXpath("//label[@data-testid='withKeys']");
        keyword.scrollAndWaitToClick(withKeys);
    }
    public void clickNoOptionInModificationsQuestion() throws InterruptedException {
        WebElement withoutModifications = keyword.findWebElementByXpath("//label[@data-testid='withoutModifications']");
        keyword.scrollAndWaitToClick(withoutModifications);
    }
    public void clickOnNextButton() throws InterruptedException {
        WebElement btnNext = keyword.findWebElementByXpath("//button[@data-lean-auto='optionsNextButton']");
        keyword.scrollAndWaitToClick(btnNext);
        Thread.sleep(4000);
    }

    
     //#endregion
}
