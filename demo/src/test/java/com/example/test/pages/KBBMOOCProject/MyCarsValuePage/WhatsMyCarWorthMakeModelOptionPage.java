package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBBasePage;


public class WhatsMyCarWorthMakeModelOptionPage extends KBBBasePage{

    public WhatsMyCarWorthMakeModelOptionPage(WebDriver driver) {
        super(driver);
    }
    //#region Declare web objects
    private WebElement ddlYear = keyword.findWebElementByXpath("//select[@placeholder='Year']");
    private WebElement ddlMake = keyword.findWebElementByXpath("//select[@placeholder='Make']");
    private WebElement ddlModel = keyword.findWebElementByXpath("//select[@placeholder='Model']");
    private WebElement txtMileage = keyword.findWebElementByXpath("//input[@data-automation='vehicle-picker-input-4']");
    private WebElement txtZIPCode = keyword.findWebElementByXpath("//input[@data-automation='vehicle-picker-input-3']");
    private WebElement txtEmail = keyword.findWebElementByXpath("//input[@data-automation='vehicle-picker-input-5']");
    private WebElement btnMakeModelGo = keyword.findWebElementByXpath("//button[@data-lean-auto='vehiclePickerBtn']");
    //#endregion

    //#region page actions

    /**
     * select Year inside Dropdownlist Year
     * @param year
     */
    public void selectYear(String year){
        keyword.scrollAndWaitToClick(ddlYear);
        keyword.selectElement(ddlYear, year);
    }

    /**
     * select Make inside Dropdownlist Make
     * @param make
     */
    public void selectMake(String make) {
        keyword.scrollAndWaitToClick(ddlMake);
        keyword.selectElement(ddlMake, make);
    }

    /**
     * select Model inside Dropdownlist Model
     * @param model
     */
    public void selectModel(String model){
        keyword.scrollAndWaitToClick(ddlModel);
        keyword.selectElement(ddlModel, model);
    }

    /**
     * send keys to Mileage textbox, ZIP Code textbox, Email textbox
     * @param mileage
     * @param zip
     * @param email
     */
    public void sendKeysToTextboxes(String mileage, String zip, String email) {
        keyword.sendKeys(txtMileage, mileage);
        keyword.sendKeys(txtZIPCode, zip);
        keyword.sendKeys(txtEmail, email);
    }

    /**
     * click On Go button to navigate to CategoryAndStypePage
     */
    public void clickOnMakeModelGoButton() {
        keyword.scrollAndWaitToPageLoad(btnMakeModelGo);
    }
    //#endregion
}
