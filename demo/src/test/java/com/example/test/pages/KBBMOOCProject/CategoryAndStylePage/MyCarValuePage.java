package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class MyCarValuePage extends KbbBasePage {

   public MyCarValuePage(WebDriver driver) {
      super(driver);
      // TODO Auto-generated constructor stub
   }
   private WebElement btnLicensePlate = keyword.findWebElementByXpath("//div[text()='License Plate']");

   public void clickOnLicensePlateCheckBoxInMyCarValuePage()  {
      keyword.clickThenWait(btnLicensePlate);
   }

   public void clickOnGoButtonInMyCarValuePage()  {
      WebElement btnGo = keyword.findWebElementByXpath("//span[text()='Go']");

      keyword.clickThenWait(btnGo);
   }
}
