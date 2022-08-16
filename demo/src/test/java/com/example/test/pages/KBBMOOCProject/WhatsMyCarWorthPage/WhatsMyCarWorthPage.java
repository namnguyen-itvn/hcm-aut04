package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorthPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;


public class WhatsMyCarWorthPage extends KbbBasePage {
    
    public WhatsMyCarWorthPage(WebDriver driver) {
        super(driver);
    }
    

    WebElement txtVIN = keyword.findWebElementByXpath("//div[@id='vinNumberInput']//input");
    WebElement txtEmail = keyword.findWebElementByXpath("//div[@id='vinEmailInput']//input");
    WebElement btnGo = keyword.findWebElementByXpath("//button[@data-testid='vinSubmitBtn']");
    WebElement chkLicensePlate = keyword.findWebElementByXpath("//div[text()='License Plate']");
    WebElement chkMakeModel = keyword.findWebElementByXpath("//div[text()='Make/Model']");
    //#endregion

    //#region page actions
    /**
     * Option VIN
     * @throws InterruptedException
     */
    public void sendKeysToVINTextbox(String vin) throws InterruptedException {
        keyword.sendKeys(txtVIN, vin);
    }
    public void sendInvalidKeysToVINTextbox(String errorMessage) throws InterruptedException {
        keyword.sendKeys(txtVIN, errorMessage);
    }
    public void sendKeysToEmailTextbox(String email) throws InterruptedException {
        keyword.sendKeys(txtEmail, email);
    }
    public void clickOnVINGoButton() throws InterruptedException {
        keyword.scrollAndWaitToClick(btnGo);
    }
    public String getErrorMessageString(){
        WebElement spanErrorMessage = keyword.findWebElementByXpath("//span[@data-automation='error-message']");
        String errorMessageString = spanErrorMessage.getText();
        
        return errorMessageString;
    }
    public boolean compareErrorMessage(String errorMessage) {
        if(getErrorMessageString().equals(errorMessage) ){
            return true;
        }
        return false;
    }

    /**
     * Option License Plate
     * @throws InterruptedException
     */
    public void clickOnLicensePlateCheckbox() throws InterruptedException {
        keyword.scrollAndWaitToClick(chkLicensePlate);
    }
    public void sendKeysToTextboxes(String plate, String invalidEmail) throws InterruptedException {
        WebElement txtPlate = keyword.findWebElementByXpath("//input[@data-lean-auto='plateInput']");
        WebElement txtEmail = keyword.findWebElementByXpath("//input[@data-lean-auto='emailLpInput']");
        keyword.sendKeys(txtPlate, plate);
        keyword.sendKeys(txtEmail, invalidEmail);
    }
    public void selectState() throws InterruptedException {
        WebElement ddlState = keyword.findWebElementByXpath("//select[@placeholder='State']");
        keyword.scrollAndWaitToClick(ddlState);
        
    }
    public void selectHIoption() throws InterruptedException{
        WebElement optHI = keyword.findWebElementByXpath("//option[@value='HI']");
        keyword.scrollAndWaitToClick(optHI);
    }
    public void clickOnLicensePlateGoButton() throws InterruptedException{
        WebElement btnLicensePlateGo = keyword.findWebElementByXpath("//button[@data-testid='lpSubmitBtn']");
        keyword.scrollAndWaitToClick(btnLicensePlateGo);
        
    }
    public String getEmailErrorMessageString(){
        WebElement spanEmailErrorMessage = keyword.findWebElementByXpath("//span[@data-automation='error-message']");
        String emailErrorMessageString = spanEmailErrorMessage.getText();
        
        return emailErrorMessageString;
    }
    public boolean compareEmailErrorMessage(String emailErrorMessage) {
        if(getErrorMessageString().equals(emailErrorMessage) ){
            return true;
        }
        return false;
    }

    /**
     * Option Make/Model
     * @throws InterruptedException
     */
    public void clickOnMakeModelCheckbox() throws InterruptedException {
        keyword.scrollAndWaitToClick(chkMakeModel);
    }
    public void selectYear() throws InterruptedException {
        WebElement ddlYear = keyword.findWebElementByXpath("//select[@placeholder='Year']");
        keyword.scrollAndWaitToClick(ddlYear);
      
        WebElement valueOfYear = keyword.findWebElementByXpath("//option[@value='2016']");
        keyword.scrollAndWaitToClick(valueOfYear);
    }
    public void selectMake() throws InterruptedException {
        WebElement ddlMake = keyword.findWebElementByXpath("//select[@placeholder='Make']");
        keyword.scrollAndWaitToClick(ddlMake);
       
        WebElement valueOfMake = keyword.findWebElementByXpath("//option[@value='18']");
        keyword.scrollAndWaitToClick(valueOfMake);
    }
    public void selectModel() throws InterruptedException {
        WebElement ddlModel = keyword.findWebElementByXpath("//select[@placeholder='Model']");
        keyword.scrollAndWaitToClick(ddlModel);
       
        WebElement valueOfModel = keyword.findWebElementByXpath("//option[@value='920']");
        keyword.scrollAndWaitToClick(valueOfModel);
    }
    public void sendKeysToTextboxes(String mileage, String zip, String email) throws InterruptedException {
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
        
    }
}
