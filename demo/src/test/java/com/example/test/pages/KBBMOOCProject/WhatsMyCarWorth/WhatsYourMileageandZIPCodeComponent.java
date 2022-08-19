package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatsYourMileageandZIPCodeComponent extends KbbBasePage {

    public WhatsYourMileageandZIPCodeComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private WebElement txtmileage = keyword.findWebElementByXpath("//div//input[@data-lean-auto='mileageInput']");
    private WebElement txtZipcode = keyword.findWebElementByXpath("//div//input[@data-lean-auto='zipcodeInput']");
    private WebElement btnNext = keyword.findWebElementByXpath("//button[@data-cy='vinLpNext']");
    
    public void sendInforMileage(String mileage) {
        keyword.sendKeys(txtmileage, mileage);
    }
    public void sendInforZIP(String zipcode) {
        keyword.sendKeys(txtZipcode, zipcode);
    }
    public void clickOnNextbutton() {
        
        keyword.scrollAndWaitToClick(btnNext);
    }
    
}
