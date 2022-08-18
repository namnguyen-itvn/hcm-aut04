package com.example.test.pages.KBBMOOCProject.CarForSalePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarForSalePage extends KbbBasePage{

    public CarForSalePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    private WebElement txtSearch = keyword.findWebElementByXpath("//div[@class='margin-bottom-3']//input");
    private WebElement btnSearch = keyword.findWebElementByXpath("//div[@class='margin-bottom-3']//button[@aria-label='search-btn']");


    public  void inputToTextBoxCarSearch(String search) throws InterruptedException{
        keyword.waitForPageToLoad();
        keyword.sendKeysAndWait(txtSearch, search);
       
    }
    

}
