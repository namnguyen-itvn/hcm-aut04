package com.example.test.pages.KBBMOOCProject.CarsResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class zipCodeComponent extends KbbBasePage {

    public zipCodeComponent(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    // #region
    WebElement btnChangeZipCode = keyword.findWebElementByXpath("//span[@data-automation='zipcode-link']");
    WebElement sendKeyOnInputTextZipCodeDelete = keyword.findWebElementByXpath("//input[@data-lean-auto='zip-input']");
    WebElement sendKeyOnInputTextZipCode = keyword.findWebElementByXpath("//input[@data-lean-auto='zip-input']");
    WebElement btnSaveZipCode = keyword.findWebElementByXpath("//button[@data-lean-auto='save-button']");
    // #endregion

    public void btnChangeZipCodeOnCarsResearchPage() throws InterruptedException {

        keyword.scrollByToClick(btnChangeZipCode);

    }

    public void deleteZipCode() throws InterruptedException {
        sendKeyOnInputTextZipCodeDelete.clear();
    }

    public void sendKeyZipCode(String zipafter) throws InterruptedException {
        keyword.sendKeys(sendKeyOnInputTextZipCode, zipafter);
    }

    public void btnSaveZipCodeOnCarsResearchPage() throws InterruptedException {
        keyword.scrollAndWaitToClick(btnSaveZipCode);
    }

}
