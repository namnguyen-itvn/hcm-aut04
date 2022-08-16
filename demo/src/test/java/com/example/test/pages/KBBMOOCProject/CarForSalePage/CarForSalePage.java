package com.example.test.pages.KBBMOOCProject.CarForSalePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarForSalePage extends KbbBasePage{

    public CarForSalePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    WebElement txtZip = keyword.findWebElementByXpath("//input[@name='zip']");
    WebElement selectDelivery = keyword.findWebElementByXpath("//div[text()='Delivery']");
    WebElement txtSearch = keyword.findWebElementByXpath("//div[@class='margin-bottom-3']//input");
    
   


    //*Input Zip Code */
    public void inputZip (String zip) throws InterruptedException{
        keyword.waitForPageToLoad();
        txtZip.sendKeys(zip);
    }
    
    //*Click Check Box Delivery  */
    public void clickCheckBoxDelivery () throws InterruptedException{
        keyword.waitForPageToLoad();
        keyword.scrollAndWaitToClick(selectDelivery);
        
    }
   
//_________________________________________________________________________________________________________________________________________
   
    //* Input  Car Search  */
     public  void inputCarSearch(String search) throws InterruptedException{
        keyword.scrollAndWaitToClick(txtSearch);
        keyword.sendKeys(txtSearch, search); 
        
    }
   
       //*  Click Options in Text box Search  */
    public  void ClickOptionCarSearch() throws InterruptedException{
       WebElement optionSearch = keyword.findWebElementByXpath("//li[@id='react-autowhatever-1-section-0-item-0']");
        keyword.scrollAndWaitToClick(optionSearch);
    }
    
}
