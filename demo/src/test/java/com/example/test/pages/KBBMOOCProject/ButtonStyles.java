package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonStyles extends KbbBasePage {

    public ButtonStyles(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

     WebElement btnStyles = keyword.findWebElementByXpath("//div[@label='Styles']");
   
public void clickOnButtonStyles () throws InterruptedException{
    
    keyword.scrollAndWaitToClick(btnStyles);


}
}

