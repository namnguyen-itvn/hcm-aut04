package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class OptionPage extends KbbBasePage {
    public OptionPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private WebElement iconEdit = keyword.findWebElementByXpath("//a[@data-analytics='mileage_top_lnk']");
    private WebElement btnNext = keyword.findWebElementByXpath("//div/button[@data-lean-auto='optionsNextButton']");
    private WebElement checkboxSelectYourOptions = keyword.findWebElementByXpath("//div[text()='Select Your Options']");
    
    public void clickOnIconEditMileage() {
        keyword.scrollAndWaitToClick(iconEdit);
        // keyword.waitToClick(iconEdit);
    }
    public void clickOnSelectYourOptionscheckbox() {
        keyword.scrollAndWaitToClick(checkboxSelectYourOptions);
    }
    public void clickNextbutton() {
       
        keyword.scrollAndWaitToClick(btnNext);
    }
    
}
