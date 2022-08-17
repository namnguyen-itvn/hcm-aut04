package com.example.test.pages.KBBMOOCProject.CarForSalePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarSearchPage extends KbbBasePage{

    public CarSearchPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    WebElement btnfirstCar = keyword.findWebElementByXpath("//div[@id='500114042']");
    
    //* Click Go to Car Details  */
    public void clickOnFirstCar() throws InterruptedException{
        
        keyword.scrollAndWaitToClick(btnfirstCar);
    }
}
