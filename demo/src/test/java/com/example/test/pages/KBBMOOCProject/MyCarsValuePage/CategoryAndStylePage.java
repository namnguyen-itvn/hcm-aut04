package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CategoryAndStylePage extends KbbBasePage{

    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    //#region page actions
    /**
     * Option VIN
     */
    public void clickOnSelectboxAndClickOnAutomatic() {
        WebElement transmissionSelectBox = keyword.findWebElementByXpath("//select[@placeholder='Transmission']");
        keyword.click(transmissionSelectBox);
        WebElement optAutomatic = keyword.findWebElementByXpath("//option[@value='269401']");
        keyword.click(optAutomatic);
    }
    public void sendKeysToMileageTextbox(String mileage)  {
        WebElement txtMileage = keyword.findWebElementByXpath("//input[@data-lean-auto='mileageInput']");
        keyword.sendKeys(txtMileage, mileage);        
    }
    public void sendKeysToZIPTextbox(String zip)  {
        WebElement txtZipCode = keyword.findWebElementByXpath("//input[@data-lean-auto='zipcodeInput']");
        keyword.sendKeys(txtZipCode, zip);
    }
    public void clickOnNextButton() {
        WebElement btnNext = keyword.findWebElementByXpath("//button[@data-cy='vinLpNext']");
        keyword.click(btnNext);
    }
    /**
     * Option Make/Model
     */
    public void selectYourStyle() {
        WebElement optHatchback = keyword.findWebElementByXpath("//div[text()='LX Hatchback 4D']");
        keyword.click(optHatchback);
    }
    public void clickOnMakeModelNextButton(){
        WebElement btnMakeModelNext = keyword.findWebElementByXpath("//button[@data-lean-auto='categoryPickerButton']");
        keyword.click(btnMakeModelNext);
    }
    //#endregion
}
