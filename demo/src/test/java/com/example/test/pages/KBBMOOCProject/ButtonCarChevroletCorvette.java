package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonCarChevroletCorvette extends KbbBasePage {

    public ButtonCarChevroletCorvette(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

WebElement btnCarChevrolet = keyword.findWebElementByXpath("//a[@href='/chevrolet/corvette/']");
public void clickOnButtonCar () throws InterruptedException{
    keyword.scrollAndWaitToClick(btnCarChevrolet);  
}
    
}