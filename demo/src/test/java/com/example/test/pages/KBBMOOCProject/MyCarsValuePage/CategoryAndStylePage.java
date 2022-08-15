package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CategoryAndStylePage extends KbbBasePage{

    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        
    }

    //#region page actions
    /**
     * Option VIN
     */
    public void clickOnSelectboxAndClickOnAutomatic() {
        WebElement transmissionSelectBox = keyword.findWebElementByXpath("//select[@placeholder='Transmission']");
        keyword.scrollAndWaitToClick(transmissionSelectBox);
        WebElement optAutomatic = keyword.findWebElementByXpath("//option[@value='269401']");
        keyword.scrollAndWaitToClick(optAutomatic);
    }
    public void sendKeysToMileageTextbox(String mileage)  {
        WebElement txtMileage = keyword.findWebElementByXpath("//input[@data-lean-auto='mileageInput']");
        keyword.sendKeys(txtMileage, mileage);        
    }
    public void sendKeysToZIPTextbox(String zip) throws InterruptedException  {
        WebElement txtZipCode = keyword.findWebElementByXpath("//input[@data-lean-auto='zipcodeInput']");
        keyword.sendKeys(txtZipCode, zip);
        Thread.sleep(3000);
    }
    public void clickOnNextButton() throws InterruptedException{
        WebElement btnNext = keyword.findWebElementByXpath("//button[@data-cy='vinLpNext']");
        keyword.scrollAndWaitToClick(btnNext);
        Thread.sleep(4000);
    }
    /**
     * Option Make/Model
     */
    public void selectYourStyle() {
        WebElement optHatchback = keyword.findWebElementByXpath("//div[text()='LX Hatchback 4D']");
        keyword.scrollAndWaitToClick(optHatchback);
    }
    public void clickOnMakeModelNextButton() throws InterruptedException{
        WebElement btnMakeModelNext = keyword.findWebElementByXpath("//button[@data-lean-auto='categoryPickerButton']");
        keyword.scrollAndWaitToClick(btnMakeModelNext);
        Thread.sleep(4000);
    }
    //#endregion
}
