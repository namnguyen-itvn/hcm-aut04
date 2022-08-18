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
     * Option VIN
     * @throws InterruptedException
     */
    public void clickOnSelectYourOptions(){
        keyword.scrollAndWaitToClick(optSelectYourOptions);
    }
    public void clickOnRedColor() {
        WebElement colorRed = keyword.findWebElementByXpath("//img[@alt='Red image']");
        keyword.scrollAndWaitToClick(colorRed);
    }
    public void clickYesOptionInKeyQuestion() {
        WebElement withKeys = keyword.findWebElementByXpath("//label[@data-testid='withKeys']");
        keyword.scrollAndWaitToClick(withKeys);
    }
    public void clickNoOptionInModificationsQuestion() {
        WebElement withoutModifications = keyword.findWebElementByXpath("//label[@data-testid='withoutModifications']");
        keyword.scrollAndWaitToClick(withoutModifications);
    }
    public void clickOnNextButton() throws InterruptedException {
        WebElement btnNext = keyword.findWebElementByXpath("//button[@data-lean-auto='optionsNextButton']");
        keyword.scrollAndWaitToPageLoad(btnNext);
    }
     //#endregion
}
