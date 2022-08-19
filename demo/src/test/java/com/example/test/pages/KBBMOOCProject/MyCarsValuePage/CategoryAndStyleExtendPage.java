package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CategoryAndStyleExtendPage extends KbbBasePage{

    public CategoryAndStyleExtendPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    //#region Declare web objects
    private WebElement txtMileage = keyword.findWebElementByXpath("//input[@data-lean-auto='mileageInput']");
    private WebElement txtZipCode = keyword.findWebElementByXpath("//input[@data-lean-auto='zipcodeInput']");
    private WebElement btnNext = keyword.findWebElementByXpath("//button[@data-cy='vinLpNext']");
    //#endregion

    //#region page actions
    public void sendKeysToMileageTextbox(String mileage)  {
        keyword.sendKeys(txtMileage, mileage);     
        keyword.scrollAndWaitToClick(txtZipCode);
        keyword.scrollAndWaitToClick(txtMileage);
        keyword.scrollAndWaitToClick(txtMileage);   
    }
    public void sendKeysToZIPTextbox(String zip){ 
        keyword.sendKeyAndWait(txtZipCode, zip);
    }
    public void clickOnNextButton() {
        keyword.scrollAndWaitToPageLoad(btnNext);
    }
    //#endregion
}
