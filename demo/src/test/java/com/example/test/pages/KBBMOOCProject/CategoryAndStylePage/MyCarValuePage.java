package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCarValuePage extends KbbBasePage {

   public MyCarValuePage(WebDriver driver) {
      super(driver);
      // TODO Auto-generated constructor stub
   }

   private WebElement btnLicensePlate = keyword.findWebElementByXpath("//div[text()='License Plate']");

   /**
    * Click on License radio box
    */
   public void clickOnLicensePlateCheckBoxInMyCarValuePage() {
      keyword.clickThenWait(btnLicensePlate);
   }
}
