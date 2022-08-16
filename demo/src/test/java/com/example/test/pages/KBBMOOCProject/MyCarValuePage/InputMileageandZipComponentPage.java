package com.example.test.pages.KBBMOOCProject.MyCarValuePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class InputMileageandZipComponentPage  extends KbbBasePage{

    public InputMileageandZipComponentPage(WebDriver driver) {
        super(driver);
    }
 
    WebElement inputMileage = keyword.findWebElementByXpath("//input[@data-lean-auto='mileageInput']");
    WebElement  inputZipCode= keyword.findWebElementByXpath("//input[@data-lean-auto='zipcodeInput']");
    WebElement  btnNext= keyword.findWebElementByXpath("//button[@data-cy='vinLpNext']");

    public void actioninputMileageandZipcode() throws InterruptedException{
        keyword.sendKeys(inputMileage, "1000");
        keyword.sendKeys(inputZipCode, "30813");
        keyword.click(btnNext);
    }

    public void actioninputMileageandZipcode(String Mileage,String Zipcode) throws InterruptedException{
        keyword.sendKeys(inputMileage,Mileage);
        keyword.sendKeys(inputZipCode,Zipcode);
        keyword.click(btnNext);
    }
    
    
}
