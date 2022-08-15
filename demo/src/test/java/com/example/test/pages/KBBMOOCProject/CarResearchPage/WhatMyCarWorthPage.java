package com.example.test.pages.KBBMOOCProject.CarResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class WhatMyCarWorthPage extends KbbBasePage {

    public WhatMyCarWorthPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }


   
    WebElement inputVIN = keyword.findWebElementByXpath("//input[@data-lean-auto='vinInput']");

    WebElement inputEmail = keyword.findWebElementByXpath("//input[@data-lean-auto='emailVinInput']");
    
    WebElement btnGo = keyword.findWebElementByXpath("//button[@data-lean-auto='vinSubmitBtn']");

    


    public void actionInputVINandEmail() throws InterruptedException{
       
       keyword.sendKeys(inputVIN, "3VWSB81H8WM210368"); 
       keyword.sendKeys(inputEmail, "abc@gmail.com");
       keyword.click(btnGo);

    }

    public void actionInputVIN(String VIN) throws InterruptedException{
       
       inputVIN.sendKeys(VIN);
 
     }
     public void actionInputEmail(String Email) throws InterruptedException{
       
        keyword.sendKeys(inputEmail, Email);
        keyword.click(btnGo);
 
     }

    
    

}
