package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CarForSalePage extends KbbBasePage{

    public CarForSalePage(WebDriver driver) {
        super(driver);
    }

    private WebElement mileageTab = keyword.findWebElementByXpath("//span[@ data-cmp='filterTitle']/span[text()='Mileage']");


    public void clickMileageTabInCarForSalePage() throws InterruptedException
    {
        keyword.waitForPageToLoad();
        keyword.scrollAndWaitToClick(mileageTab);
        Select select = new Select(keyword.findWebElementByXpath("//select[@id='1819194850']"));

        select.selectByIndex(1);
        keyword.scrollToTopOfPage();
        
    }

    public boolean checkTextBoxInMileageTab()
    {
        Boolean isSelected = keyword.findWebElementByXpath("(//option[@selected])[2]").isSelected();
        if(isSelected == false)
        {   
            return false;
        }
        return true;

    }

    public int getMiles()
    {
        WebElement miles = keyword.findWebElementByXpath("//span[@class='text-bold'][1]");
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
