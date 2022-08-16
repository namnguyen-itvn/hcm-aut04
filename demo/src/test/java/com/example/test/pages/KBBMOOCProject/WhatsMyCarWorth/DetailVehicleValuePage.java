package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailVehicleValuePage extends KbbBasePage {

    public DetailVehicleValuePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    public void actionClickOnIconEditMileage() throws InterruptedException{
        WebElement iconEdit = keyword.findWebElementByXpath("//a[@data-analytics='mileage_top_lnk']");
        keyword.scrollAndWaitToClick(iconEdit);
    }
    public void actionEditValueMileage(String mileagee) throws InterruptedException{
        WebElement textboxMileage = keyword.findWebElementByXpath("//input[@type='tel']");
        keyword.sendKeys(textboxMileage, mileagee);
    }
    public void actionClickOnSavebutton() throws InterruptedException{
        WebElement buttonSave = keyword.findWebElementByXpath("//button[@data-analytics='mileage_save_btn']");
        keyword.scrollAndWaitToClick(buttonSave);
    }
    
    public boolean actionCompareResultAfterUserEditValueMileagesuccessful(){
        WebElement iconMileage = keyword.findWebElementByXpath("//a[text()='100,002']");
        if (iconMileage.isDisplayed()) {
            return true;
        }
        return false;
    }
    
    public boolean actionCompareValueVinINVehicleValueDetailWithValueVINEnteredVinValue(){
        WebElement iconMileage = keyword.findWebElementByXpath("//span[text()='3VWSB81H8WM210368']");
        if (iconMileage.isDisplayed()) {
            return true;
        }
        return false;
    }
}
