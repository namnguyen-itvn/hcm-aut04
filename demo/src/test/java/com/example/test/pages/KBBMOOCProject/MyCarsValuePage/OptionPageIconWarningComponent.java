package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionPageIconWarningComponent extends KbbBasePage {

    public OptionPageIconWarningComponent(WebDriver driver) {
        super(driver);
        
    }
    
    WebElement iconWarning= driver.findElement(By.cssSelector(".css-1nmg2hd"));
    
    public boolean isIconDisplay() throws InterruptedException{
        if(iconWarning.isDisplayed())
        {
            return true;
        }
        return false;
        }
      
    


    public void actionclickIconDisplay() throws InterruptedException{
        iconWarning.click();
    }
    
}
