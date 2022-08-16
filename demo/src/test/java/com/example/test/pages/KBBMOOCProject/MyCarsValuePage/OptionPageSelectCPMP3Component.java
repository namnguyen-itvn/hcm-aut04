package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionPageSelectCPMP3Component extends KbbBasePage {

    public OptionPageSelectCPMP3Component(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
        WebElement selectCPMP3SingDis= keyword.findWebElementByXpath("//div/label[@data-lean-auto='optionCheckBoxButton_cd/mp3-(single-disc)']");
        WebElement selectCPMP3MultiDis= keyword.findWebElementByXpath("//div/label[@data-lean-auto='optionCheckBoxButton_cd/mp3-(multi-disc)']");
  
        public void actionSelectCPMP3() throws InterruptedException{
    
             keyword.click(selectCPMP3SingDis);
             keyword.click(selectCPMP3MultiDis);

    }
  
    public boolean isselectCPMP3SingDisSelected() throws InterruptedException{
        if(!selectCPMP3SingDis.isSelected())
        {
            return true;
        }
        return false;
    }
        
}
