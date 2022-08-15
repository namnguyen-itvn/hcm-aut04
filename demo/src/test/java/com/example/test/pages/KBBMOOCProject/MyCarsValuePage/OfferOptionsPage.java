package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OfferOptionsPage extends KbbBasePage{

    public OfferOptionsPage(WebDriver driver) {
        super(driver);
        
    }
    WebElement chkGetTrade = keyword.findWebElementByXpath("//input[@id='no']");
    WebElement chkGetACashOffer = keyword.findWebElementByXpath("//input[@id='yes']");
    WebElement h1YearMakeModel = keyword.findWebElementByXpath("//h1[text()='2016 Honda Fit']");
    WebElement pStyle = keyword.findWebElementByXpath("//p[text()='LX Hatchback 4D']");

    

    public boolean optionGetTradeCannotUnCheck() {
        if(!chkGetTrade.isSelected()){
            return false;
        }
        return true;
    }
    public boolean checkGetACashOfferCheckboxCanBeUncheck() {
        if(!chkGetACashOffer.isSelected()){
            return true;
        }
        return false;
    }
    public boolean checkGetACashOfferCheckboxCanBeCheck() {
        keyword.click(chkGetACashOffer);
        if(chkGetACashOffer.isSelected()){
            return true;
        }
        return false;
    }
    
    public String getValueOfVehiclesString() {
        String strYearMakeModel = h1YearMakeModel.getText();
        String strStyle = pStyle.getText();
        String valueOfVehicles = strYearMakeModel + " " + strStyle;
        return valueOfVehicles;
    }

    public boolean compareValueOfVehiclesAsUserSelected(String yearMakeModelStyle){
        if(getValueOfVehiclesString().equals(yearMakeModelStyle)){
            return true;
        }
        return false;
    }
}
