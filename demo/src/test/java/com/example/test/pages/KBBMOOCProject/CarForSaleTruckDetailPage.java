package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarForSaleTruckDetailPage extends KbbBasePage {

    public CarForSaleTruckDetailPage(WebDriver driver) {
        super(driver);
    }
    
    private WebElement bedTab = keyword.findWebElementByXpath("//li[last()]//div[@class='col-xs-10 margin-bottom-0']");
    private String strBed = bedTab.getText();

    public boolean checkWordContainInElement()
    {
        if(strBed.contains("Bed"))
        {
            return true;
        }
        return false;
    }
}
