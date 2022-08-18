package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsDropdow extends KbbBasePage {

    public ReviewCarsDropdow(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
   private WebElement selectYear = keyword.findWebElementByXpath("//div[@class='css-9a28ny e1c5k7mc1']//select[@placeholder='Year']");
   private WebElement selectMake = keyword.findWebElementByXpath("//div[@class='css-9a28ny e1c5k7mc1']//select[@placeholder='Make']");
   private WebElement selectModel = keyword.findWebElementByXpath(" //div[@class='css-9a28ny e1c5k7mc1']//select[@placeholder='Model']");
   private WebElement btnGo = keyword.findWebElementByXpath("//form//button[@type='submit']");

    
  
   
    
    public void chooseTheYearOfChange() throws InterruptedException
    {
        
        keyword.selectElement(selectYear, "2020");
    }

    public void chooseTheMakeOfChange() throws InterruptedException
    {
        keyword.selectElement(selectMake, "Audi");

        
    }

    public void chooseTheModelOfChange() throws InterruptedException
    {
        keyword.selectElement(selectModel, "A3");

 
    }
    public void clickOnBtnGo() throws InterruptedException
    {
        keyword.scrollAndWaitToClick(btnGo);
    }
    
}
