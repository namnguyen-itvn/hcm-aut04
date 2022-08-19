package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OptionPagechangeMileage extends KbbBasePage {

    public OptionPagechangeMileage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private WebElement iconMileage = keyword.findWebElementByXpath("//a[text()='12,345']");
    public boolean compareResultAfterUserChangeMileagesuccessful(){
        if (iconMileage.isDisplayed()) {
            return true;
        }
        return false;
    }
    
}
