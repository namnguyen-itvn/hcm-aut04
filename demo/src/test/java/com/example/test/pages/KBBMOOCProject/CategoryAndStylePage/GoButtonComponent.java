package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class GoButtonComponent extends KbbBasePage {

   public GoButtonComponent(WebDriver driver) {
      super(driver);
      // TODO Auto-generated constructor stub
   }

   private WebElement btnGo = keyword.findWebElementByXpath("//span[text()='Go']");

   /**
    * Search and Click on button Go
    */
   public void clickOnGoButtonInMyCarValuePage() {

      keyword.clickThenWait(btnGo);
   }
}
