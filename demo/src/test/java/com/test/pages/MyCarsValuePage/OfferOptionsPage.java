package com.test.pages.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.pages.KBBBasePage;

public class OfferOptionsPage extends KBBBasePage{

    public OfferOptionsPage(WebDriver driver) {
        super(driver);
        
    }
    
    public String getValueOfVehiclesString() {
        WebElement h1YearMakeModel = keyword.findWebElementByXpath("//h1[text()='2016 Honda Fit']");
        WebElement pStyle = keyword.findWebElementByXpath("//p[text()='LX Hatchback 4D']");
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
