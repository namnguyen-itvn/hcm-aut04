package com.test.pages.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.pages.KBBBasePage;


public class WhatsMyCarWorthPage extends KBBBasePage{

    public WhatsMyCarWorthPage(WebDriver driver) {
        super(driver);
    }
    //#region Declare web objects
    WebElement btnGo = keyword.findWebElementByXpath("//button[@data-testid='vinSubmitBtn']");
    WebElement chkMakeModel = keyword.findWebElementByXpath("//div[text()='Make/Model']");
    //#endregion

    //#region page actions
   
    /**
     * Option Make/Model
     */
    public void clickOnMakeModelCheckbox() {
        keyword.scrollAndWaitToClick(chkMakeModel);
    }
    public void selectYear() throws InterruptedException {
        WebElement ddlYear = keyword.findWebElementByXpath("//select[@placeholder='Year']");
        keyword.scrollAndWaitToClick(ddlYear);
        Thread.sleep(1000);
        WebElement valueOfYear = keyword.findWebElementByXpath("//option[@value='2016']");
        keyword.scrollAndWaitToClick(valueOfYear);
    }
    public void selectMake() throws InterruptedException {
        WebElement ddlMake = keyword.findWebElementByXpath("//select[@placeholder='Make']");
        keyword.scrollAndWaitToClick(ddlMake);
        Thread.sleep(1000);
        WebElement valueOfMake = keyword.findWebElementByXpath("//option[@value='18']");
        keyword.scrollAndWaitToClick(valueOfMake);
    }
    public void selectModel() throws InterruptedException {
        WebElement ddlModel = keyword.findWebElementByXpath("//select[@placeholder='Model']");
        keyword.scrollAndWaitToClick(ddlModel);
        Thread.sleep(1000);
        WebElement valueOfModel = keyword.findWebElementByXpath("//option[@value='920']");
        keyword.scrollAndWaitToClick(valueOfModel);
    }
    public void sendKeysToTextboxes(String mileage, String zip, String email) {
        WebElement txtMileage = keyword.findWebElementByXpath("//input[@data-automation='vehicle-picker-input-4']");
        WebElement txtZIPCode = keyword.findWebElementByXpath("//input[@data-automation='vehicle-picker-input-3']");
        WebElement txtEmail = keyword.findWebElementByXpath("//input[@data-automation='vehicle-picker-input-5']");

        keyword.sendKeys(txtMileage, mileage);
        keyword.sendKeys(txtZIPCode, zip);
        keyword.sendKeys(txtEmail, email);

    }
    public void clickOnMakeModelGoButton() throws InterruptedException {
        WebElement btnMakeModelGo = keyword.findWebElementByXpath("//button[@data-lean-auto='vehiclePickerBtn']");
        keyword.scrollAndWaitToClick(btnMakeModelGo);
        Thread.sleep(4000);
    }
    //#endregion
}
