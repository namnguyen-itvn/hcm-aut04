package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonSpecsvsFeatures extends KbbBasePage {

    public ButtonSpecsvsFeatures(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    WebElement btnSpecsvsFeatures = keyword.findWebElementByXpath("//div[@label='Specs & Features']");
   
    public void clickonSpecsvsFeatures () throws InterruptedException{
        
        keyword.scrollAndWaitToClick(btnSpecsvsFeatures);
        
    }
    
    }

