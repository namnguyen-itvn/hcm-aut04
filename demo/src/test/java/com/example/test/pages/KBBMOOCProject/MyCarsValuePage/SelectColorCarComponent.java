package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class SelectColorCarComponent extends KbbBasePage {

    public SelectColorCarComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    
  private  WebElement clickRedButton = keyword.findWebElementByXpath("//div[text()='Red']");

    /**
     * @throws InterruptedException
     */
    public void actionClickRedButton() throws InterruptedException{
        keyword.scrollAndWaitToClick(clickRedButton);

        
    }

}
