package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarResultSearchPage extends KbbBasePage{

    public CarResultSearchPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    String getTitle = driver.getTitle();
   

    public boolean checkTitleComponent(String title) throws InterruptedException{
        keyword.waitForPageToLoad();
        if(getTitle.equals(title)){
            return true;
        }return false;
    }

     public boolean checkLocationZIp(String zip) throws InterruptedException{
    
     WebElement locationZip = keyword.findWebElementByXpath("//span[@class='padding-left-1']");
     String strLocationZip = locationZip.getText();
     if(strLocationZip.equals(zip)){
        return true;
     }return false;
    }
}
