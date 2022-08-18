package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsPage  extends KbbBasePage{

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
   
   private WebElement btnChangeVehicle=keyword.findWebElementByXpath("//a[text()='Change Vehicle']");
    public void clickonbtnChangeVehicle() throws InterruptedException
    {
       
        keyword.scrollAndWaitToClick(btnChangeVehicle);
    }





}