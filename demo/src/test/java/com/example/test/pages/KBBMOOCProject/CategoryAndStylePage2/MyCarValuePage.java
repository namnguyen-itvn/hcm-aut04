package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class MyCarValuePage extends KbbBasePage {

   public MyCarValuePage(WebDriver driver) {
      super(driver);
      // TODO Auto-generated constructor stub
   }

   WebElement btnMakeModel = keyword.findWebElementByXpath("//div[text()='Make/Model']");

   /**
    * Search and choose Make/Model radio
    */
   public void clickOnMakeModelCheckBoxInMyCarValuePage() throws InterruptedException {
      keyword.clickThenWait(btnMakeModel);
   }
}
