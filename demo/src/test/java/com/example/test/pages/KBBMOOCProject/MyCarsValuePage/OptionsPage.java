package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionsPage extends KbbBasePage{

    public OptionsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    //#region page actions
    /**
     * Option VIN
     */
    public void clickOnSelectYourOptions(){
        WebElement optSelectYourOptions = keyword.findWebElementByXpath("//div[text()='Select Your Options']");
        keyword.click(optSelectYourOptions);
    }
    public void clickOnRedColor() {
        WebElement colorRed = keyword.findWebElementByXpath("//img[@alt='Red image']");
        keyword.click(colorRed);
    }
    public void clickYesOptionInKeyQuestion() {
        WebElement withKeys = keyword.findWebElementByXpath("//label[@data-testid='withKeys']");
        keyword.click(withKeys);
    }
    public void clickNoOptionInModificationsQuestion(){
        WebElement withoutModifications = keyword.findWebElementByXpath("//label[@data-testid='withoutModifications']");
        keyword.click(withoutModifications);
    }
    public void clickOnNextButton() {
        WebElement btnNext = keyword.findWebElementByXpath("//button[@data-lean-auto='optionsNextButton']");
        keyword.click(btnNext);
    }

    /**
     * Option Make/Model
     */
    
     //#endregion
}
