package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CategoryAndStylePage extends KbbBasePage{

    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        
    }
    //#region Declare web objects
    private WebElement transmissionSelectBox = keyword.findWebElementByXpath("//select[@placeholder='Transmission']");
    //#endregion

    //#region page actions
    /**
     * Option VIN
     * @throws InterruptedException
     */
    public void clickOnSelectboxAndClickOnAutomatic(String automatic){
        keyword.scrollAndWaitToClick(transmissionSelectBox);
        keyword.selectElement(transmissionSelectBox, automatic);
    }
    public void sendKeysToMileageTextbox(String mileage)  {
        WebElement txtMileage = keyword.findWebElementByXpath("//input[@data-lean-auto='mileageInput']");
        keyword.sendKeys(txtMileage, mileage);        
    }
    public void sendKeysToZIPTextbox(String zip) throws InterruptedException { 
        WebElement txtZipCode = keyword.findWebElementByXpath("//input[@data-lean-auto='zipcodeInput']");
        keyword.sendKeyAndWait(txtZipCode, zip);
    }
    public void clickOnNextButton() throws InterruptedException{
        WebElement btnNext = keyword.findWebElementByXpath("//button[@data-cy='vinLpNext']");
        keyword.scrollAndWaitToPageLoad(btnNext);
    }
    
    //#endregion
}
