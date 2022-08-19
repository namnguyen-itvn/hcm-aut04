package com.example.test.pages.KBBMOOCProject.CarsResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZipCodeComponent extends KbbHomePage {

    public ZipCodeComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    // #region
    private WebElement sendKeyOnInputTextZipCode = keyword.findWebElementByXpath("//input[@data-lean-auto='zip-input']");
    private WebElement btnSaveZipCode = keyword.findWebElementByXpath("//button[@data-lean-auto='save-button']");

    // #endregion
    public void deleteZipCode() throws InterruptedException {
        sendKeyOnInputTextZipCode.clear();
    }

    

    public void sendKeyZipCode(String zipafter) throws InterruptedException {
        keyword.sendKeys(sendKeyOnInputTextZipCode, zipafter);
    }

    public void btnSaveZipCodeOnCarsResearchPage() throws InterruptedException {
        keyword.scrollAndWaitToClick(btnSaveZipCode);

   
}
    
}
