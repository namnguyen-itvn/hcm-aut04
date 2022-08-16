package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionPageSelectInteriorComponent extends KbbBasePage {

    public OptionPageSelectInteriorComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    WebElement SelectInterior = keyword.findWebElementByXpath("//div//button[@data-lean-auto='optionSection_Interior']");
    
    public void actionSelectInterior() throws InterruptedException{
        keyword.click(SelectInterior);
    
    }
   
}

