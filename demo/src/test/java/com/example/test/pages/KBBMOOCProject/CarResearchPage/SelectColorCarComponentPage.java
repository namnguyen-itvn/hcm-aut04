package com.example.test.pages.KBBMOOCProject.CarResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class SelectColorCarComponentPage extends KbbBasePage {

    public SelectColorCarComponentPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    
    WebElement clickRedButton = keyword.findWebElementByXpath("//div[text()='Red']");

    public void actionClickRedButton() throws InterruptedException{
        keyword.scrollAndWaitToClick(clickRedButton);

        
    }

}
