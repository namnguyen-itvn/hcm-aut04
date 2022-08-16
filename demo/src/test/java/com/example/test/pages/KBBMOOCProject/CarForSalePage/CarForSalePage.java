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
    public  void inputCarSearch(String search) throws InterruptedException{
        keyword.scrollAndWaitToClick(txtSearch);
        keyword.sendKeys(txtSearch, search);  
       
    }

       //*  Search Car  */
    public  void ClickOptionCarSearch() throws InterruptedException{
       WebElement optionSearch = keyword.findWebElementByXpath("//li[@id='react-autowhatever-1-section-0-item-0']");
        keyword.scrollAndWaitToClick(optionSearch);
    }
    //* Click Go to Car Details  */
    public void clickCar() throws InterruptedException{
        WebElement btnfirstCar = keyword.findWebElementByXpath("//h2[text()='Used 2018 RAM 3500 Laramie']");
        keyword.scrollAndWaitToClick(btnfirstCar);
    }

}
