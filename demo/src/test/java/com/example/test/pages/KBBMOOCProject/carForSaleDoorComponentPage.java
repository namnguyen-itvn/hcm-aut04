package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;

public class carForSaleDoorComponentPage extends KbbBasePage{

    public carForSaleDoorComponentPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    WebElement txtZipCode = keyword.findWebElementByXpath(" //input[@name='zip']");
    WebElement tranmission = keyword.findWebElementByXpath("//span[text()='Transmission']");
    WebElement Automatic = keyword.findWebElementByXpath("//div[text()='Automatic']");
    // Click tranmission
    public void clickTranmisson() throws InterruptedException
    {
       
        keyword.scrollAndWaitToClick(tranmission);
    }

    // Click Automatic
    public void clickAutomatic() throws InterruptedException
    {
        
        keyword.scrollAndWaitToClick(Automatic);
    }

    public boolean checkButtonAutomatic (){
        WebElement checkboxAutomatic =   keyword.findWebElementByXpath("//input[@value='AUT']");
        if(checkboxAutomatic.isSelected()){
            return true;
        }return false;
    }

    public String StrSearchAUT = "Automatic";
    public boolean checkChipComponent(){
        WebElement chipAutomatic = keyword.findWebElementByXpath(" //div[@data-cmp='chip']/span[text()='Automatic']");
        String getChipAutimatic = chipAutomatic.getText();
        if(StrSearchAUT.equals(getChipAutimatic)){
            return true;
        }return false;
    }


    public void inputZipCode(String zip) throws InterruptedException{
        keyword.waitForPageToLoad();
        keyword.sendKeys(txtZipCode, zip);
        
    }
    
    
}
