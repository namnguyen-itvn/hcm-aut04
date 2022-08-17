package com.example.test.pages.KBBMOOCProject.CarForSalePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarForSalePage extends KbbBasePage{

    public CarForSalePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    WebElement txtSearch = keyword.findWebElementByXpath("//div[@class='margin-bottom-3']//input");

    //* Input  Car Search  */
    public  void inputToTextBoxCarSearch(String search) throws InterruptedException{
        keyword.scrollAndWaitToClick(txtSearch);
        keyword.sendKeys(txtSearch, search);  
       
    }

       //*  Search Car  */
    public  void ClickOnOptionCarSearch() throws InterruptedException{
       WebElement optionSearch = keyword.findWebElementByXpath("//li[@id='react-autowhatever-1-section-0-item-0']");
        keyword.scrollAndWaitToClick(optionSearch);
    }


}
