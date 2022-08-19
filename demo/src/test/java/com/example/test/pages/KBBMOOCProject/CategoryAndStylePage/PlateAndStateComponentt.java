package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlateAndStateComponentt extends KbbBasePage {

   public PlateAndStateComponentt(WebDriver driver) {
      super(driver);
      // TODO Auto-generated constructor stub
   }

   private WebElement inputPlate = keyword.findWebElementByXpath("//div[@id='lpNumberInput']//input");

   /**
    * Send key to Plate Text Box
    */
   public void sendKeysToPlateTextBoxInMyCarValuePage(String plate) {
      keyword.sendKeys(inputPlate, plate);
   }

   private WebElement btnState = keyword.findWebElementByXpath("//div[@id='state']");

   /**
    * Search and Click on State Drop Down
    */
   public void clickOnStateDropDownInMyCarValuePage() {

      keyword.clickThenWait(btnState);
   }

   /**
    * Search and Choose an Option In State Drop Down
    */
   private WebElement optState = keyword.findWebElementByXpath("//div[@id='state']//option[@value= 'HI']");

   public void clickToChooseStateInStateDropDownInMyCarValuePage() {
      keyword.clickThenWait(optState);
   }
}
