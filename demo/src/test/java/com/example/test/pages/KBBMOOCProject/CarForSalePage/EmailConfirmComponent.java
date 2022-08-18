package com.example.test.pages.KBBMOOCProject.CarForSalePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class EmailConfirmComponent extends KbbBasePage {

    public EmailConfirmComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

   public WebElement msConfirmation = keyword.findWebElementByXpath("//div[@class='modal-body']//div");

    //* Check Message Email Confirmation  */
    public boolean checkEmailConfirmation(String confirmation){
       
        String getConfirmation = msConfirmation.getText();
        if(getConfirmation.equals(confirmation)){
            return true;
        }
        return false;
    }
    
}
