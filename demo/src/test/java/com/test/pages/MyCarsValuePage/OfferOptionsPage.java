package com.test.pages.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.pages.KBBBasePage;

public class OfferOptionsPage extends KBBBasePage{

    public OfferOptionsPage(WebDriver driver) {
        super(driver);
        
    }
    //#region Declare web objects
    private WebElement h1YearMakeModel = keyword.findWebElementByXpath("//h1[text()='2016 Honda Fit']");
    private WebElement pStyle = keyword.findWebElementByXpath("//p[text()='LX Hatchback 4D']");
    //#endregion

    //#region page actions
    /**
     * get Value: year, make, model and style
     * @return
     */
    public String getValueOfVehiclesString() {
        String strYearMakeModel = h1YearMakeModel.getText();
        String strStyle = pStyle.getText();
        String valueOfVehicles = strYearMakeModel + " " + strStyle;
        return valueOfVehicles;
    }

    /**
     * 
     * @param yearMakeModelStyle
     * @return
     */
    public boolean compareValueOfVehiclesAsUserSelected(String yearMakeModelStyle){
        if(getValueOfVehiclesString().equals(yearMakeModelStyle)){
            return true;
        }
        return false;
    }
    //#endregion
}
