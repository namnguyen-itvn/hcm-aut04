package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class WhatMyCarWorthPage extends KbbBasePage {

    public WhatMyCarWorthPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }


   
   private WebElement inputVIN = keyword.findWebElementByXpath("//input[@data-lean-auto='vinInput']");
   private  WebElement inputEmail = keyword.findWebElementByXpath("//input[@data-lean-auto='emailVinInput']");
   private WebElement btnGo = keyword.findWebElementByXpath("//button[@data-lean-auto='vinSubmitBtn']");

    


    /**
     * @throws InterruptedException
     */
    public void actionInputVINandEmail() throws InterruptedException{
       
       keyword.sendKeys(inputVIN, "3VWSB81H8WM210368"); 
       keyword.sendKeys(inputEmail, "abc@gmail.com");
       keyword.click(btnGo);

    }

    /**
     * @param VIN
     * @param Email
     * @throws InterruptedException
     */
    public void actionInputVINandEmail(String VIN, String Email) throws InterruptedException{
       
        keyword.sendKeys(inputVIN, VIN); 
        keyword.sendKeys(inputEmail, Email);
        keyword.click(btnGo);
 
     }

    
    

}