package com.example.test.pages.KBBMOOCProject.MyCarsValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class InputMileageandZipComponent  extends KbbBasePage{

    public InputMileageandZipComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
 
  private  WebElement inputMileage = keyword.findWebElementByXpath("//input[@data-lean-auto='mileageInput']");
  private  WebElement  inputZipCode= keyword.findWebElementByXpath("//input[@data-lean-auto='zipcodeInput']");
  private  WebElement  btnNext= keyword.findWebElementByXpath("//button[@data-cy='vinLpNext']");

    /**
     * @throws InterruptedException
     */
    public void actioninputMileageandZipcode() throws InterruptedException{
        keyword.sendKeys(inputMileage, "1000");
        keyword.sendKeys(inputZipCode, "30813");
        keyword.click(btnNext);
    }

    /**
     * @param Mileage
     * @param Zipcode
     * @param inputMileage
     * @param inputZipCode
     * @param btnNext
     * @throws InterruptedException
     */
    public void actioninputMileageandZipcode(String Mileage,String Zipcode) throws InterruptedException{
        keyword.sendKeys(inputMileage,Mileage);
        keyword.sendKeys(inputZipCode,Zipcode);
        keyword.click(btnNext);
    }
    
}