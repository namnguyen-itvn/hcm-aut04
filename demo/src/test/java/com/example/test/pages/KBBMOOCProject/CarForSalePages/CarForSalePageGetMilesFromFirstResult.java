package com.example.test.pages.KBBMOOCProject.CarForSalePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarForSalePageGetMilesFromFirstResult extends KbbBasePage{

    public CarForSalePageGetMilesFromFirstResult(WebDriver driver) {
        super(driver);
    }

    private WebElement miles = keyword.findWebElementByXpath("//span[@class='text-bold'][1]");

    public int getMiles()
    {
        String strMiles = miles.getText().replace(" miles", "");
        double dbMiles = Double.parseDouble(strMiles.replaceAll(",", ""));
        int intMiles = (int) dbMiles;
        return intMiles;
    }

    public boolean comparasionMilesBetweenCheckboxAndResult() throws InterruptedException
    {
        keyword.waitForPageToLoad();
        if(getMiles()<15000)
        {
            return true;
        }
        return false;
    }
    
}
