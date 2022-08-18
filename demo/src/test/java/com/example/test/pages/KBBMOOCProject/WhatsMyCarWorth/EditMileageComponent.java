package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditMileageComponent extends KbbBasePage {

    public EditMileageComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private WebElement inputMileage = keyword.findWebElementByXpath("//input[@value='1,000']");
    private WebElement txtMileage = keyword.findWebElementByXpath("//input[@value='1,000']");
    private WebElement btnSave = keyword.findWebElementByXpath("//button[@data-analytics='mileage_save_btn']");
   
    public void deleteMileage(){
        inputMileage.clear();
    }
    public void sendInforchangeMileage(String mileagee) {
        
        keyword.sendKeys(txtMileage, mileagee);
    }
    public void clickOnSavebutton() {
        
        keyword.scrollAndWaitToClick(btnSave);
    }
}
