package com.example.test.pages.KBBMOOCProject.CarForSalePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionSearchComponent extends KbbBasePage {

    public OptionSearchComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
       //*  Search Car  */
    private WebElement optionSearch = keyword.findWebElementByXpath("//li[@id='react-autowhatever-1-section-0-item-0']");
    public  void clickonOptionSearchCar() throws InterruptedException{
        
         keyword.scrollAndWaitToClick(optionSearch);
         keyword.waitForPageToLoad();
     }
    
}
