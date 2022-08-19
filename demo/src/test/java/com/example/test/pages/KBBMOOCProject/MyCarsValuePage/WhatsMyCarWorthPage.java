package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;


public class WhatsMyCarWorthPage extends KbbBasePage{

    public WhatsMyCarWorthPage(WebDriver driver) {
        super(driver);
    }
    //#region Declare web objects
    private WebElement txtVIN = keyword.findWebElementByXpath("//div[@id='vinNumberInput']//input");
    private WebElement txtEmail = keyword.findWebElementByXpath("//div[@id='vinEmailInput']//input");
    private WebElement btnGo = keyword.findWebElementByXpath("//button[@data-testid='vinSubmitBtn']");
    //#endregion

    //#region page actions
    public void sendKeysToVINTextbox(String vin) {
        keyword.sendKeys(txtVIN, vin);
    }
    public void sendKeysToEmailTextbox(String email) {
        keyword.sendKeys(txtEmail, email);
    }
    public void clickOnVINGoButton()  {
        keyword.scrollAndWaitToPageLoad(btnGo);
    }
    //#endregion
}
