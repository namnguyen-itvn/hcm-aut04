package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HasYourVehicleHadAnyModificationsComponent extends KbbBasePage {

    public HasYourVehicleHadAnyModificationsComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private WebElement checkboxHasYourVehicleHadAnyModifications = keyword.findWebElementByXpath("//div/label[@data-testid='withModifications']");
    private WebElement btnNext = keyword.findWebElementByXpath("//div/button[@data-lean-auto='optionsNextButton']");
    public void clickOnHasYourVehicleHadAnyModifications() {
       
        keyword.scrollAndWaitToClick(checkboxHasYourVehicleHadAnyModifications);
    }
    public void clickNextbutton() {
       
        keyword.scrollAndWaitToClick(btnNext);
    }
    
}
