package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarForSaleTruckPage extends KbbBasePage {

    public CarForSaleTruckPage(WebDriver driver) {
        super(driver);
    }
    WebElement truckBedTab = keyword.findWebElementByXpath("//span[@ data-cmp='filterTitle']/span[text()='Truck Bed Length']");
   
    public String strActual = pageTitle();
    public String strExpected = "Trucks for Sale (Test Drive at Home) - Kelley Blue Book";

    WebElement yourSearch = keyword.findWebElementByXpath("//span[text()='Your Search']");
   


    public void clickTruckBedTab() throws InterruptedException
    {
        keyword.waitToClick(truckBedTab);

        WebElement longTextbox = keyword.findWebElementByXpath("//div[text()='Long']");        

        keyword.waitToClick(longTextbox);

    }

    public boolean checkSearckKeyLong()
    {
        WebElement keySearchLong = keyword.findWebElementByXpath("//span[text()='Long']");
        String strLong = keySearchLong.getText();
        if(strLong.contains("Long"))
        {
            return true;
        }
        return false;
    }

    public boolean checkSearckKeyTruck()
    {
        WebElement keySearchTruck = keyword.findWebElementByXpath("//span[text()='Truck']");
        String strTruck = keySearchTruck.getText();
        if(strTruck.contains("Truck"))
        {
            return true;
        }
        return false;
    }

    public void scrollTop() throws InterruptedException
    {
        keyword.scrollToTopOfPage();
        keyword.waitForPageToLoad();
    }

    public boolean checkTextboxinBedTab()
    {
        
        Boolean isSelected = driver.findElement(By.xpath("//input[@value='LONG']")).isSelected(); 
        return isSelected;       
    }

    public void clickFirstResultInCarForSaleTruckPage() throws InterruptedException
    {
        WebElement fisrtResult = keyword.findWebElementByXpath("//div[@data-qaid='cntnr-listings']/div[2]");
        keyword.waitToClick(fisrtResult);
        keyword.waitForPageToLoad();
    }
}