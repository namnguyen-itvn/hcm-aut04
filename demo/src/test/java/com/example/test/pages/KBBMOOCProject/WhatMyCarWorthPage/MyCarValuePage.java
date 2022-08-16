package com.example.test.pages.KBBMOOCProject.WhatMyCarWorthPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class MyCarValuePage extends KbbBasePage {

   public MyCarValuePage(WebDriver driver) {
      super(driver);
      // TODO Auto-generated constructor stub
   }

   WebElement btnMakeModel = keyword.findWebElementByXpath("//div[text()='Make/Model']");
   WebElement btnLicensePlate = keyword.findWebElementByXpath("//div[text()='License Plate']");

   public void clickOnMakeModelCheckBoxInMyCarValuePage() throws InterruptedException {
      keyword.clickThenWait(btnMakeModel);
   }

   public void clickOnLicensePlateCheckBoxInMyCarValuePage() throws InterruptedException {
      keyword.clickThenWait(btnLicensePlate);
   }

   public void clickOnYearDropDownInMyCarValuePage() throws InterruptedException {
      WebElement btnYear = keyword.findWebElementByXpath("//div[@class='year']");
      keyword.clickThenWait(btnYear);
   }

   public void clickToChooseaYearInYearDropDownInMyCarValuePage() throws InterruptedException {
      WebElement optYear = keyword.findWebElementByXpath("//div[@class='year']//option[@value= '2020']");
      keyword.clickThenWait(optYear);
   }

   public void clickOnMakeDropDownInMyCarValuePage() throws InterruptedException {
      WebElement btnMake = keyword.findWebElementByXpath("//div[@class='make']");
      keyword.clickThenWait(btnMake);
   }

   public void clickToChooseaMakeInMakeDropDownInMyCarValuePage() throws InterruptedException {
      WebElement optMake = keyword.findWebElementByXpath("//div[@class='make']//option[@value= '5']");
      keyword.clickThenWait(optMake);
   }

   public void clickOnModelDropDownInMyCarValuePage() throws InterruptedException {
      WebElement btnModel = keyword.findWebElementByXpath("//div[@class='model']");
      keyword.clickThenWait(btnModel);
   }

   public void clickToChooseaModelInModelDropDownInMyCarValuePage() throws InterruptedException {
      WebElement optModel = keyword.findWebElementByXpath("//div[@class='model']//option[@value= '32913']");
      keyword.clickThenWait(optModel);
   }

   public void sendKeysToMileageTextBoxInMyCarValuePage(String mileage) throws InterruptedException {
      WebElement inputMileage = keyword
            .findWebElementByXpath("//label[@class='text-input mileageInput css-msksum e2plhlo3']//input");
      keyword.sendKeys(inputMileage, mileage);
   }

   public void sendKeysToZipTextBoxInMyCarValuePage(String zip) throws InterruptedException {
      WebElement inputZip = keyword
            .findWebElementByXpath("//label[@class='text-input zipInput css-msksum e2plhlo3']//input");
      keyword.sendKeys(inputZip, zip);
   }

   public void clickOnGoButtonInMyCarValuePage() throws InterruptedException {
      WebElement btnGo = keyword.findWebElementByXpath("//span[text()='Go']");
      keyword.clickThenWait(btnGo);
   }

   public void sendKeysToPlateTextBoxInMyCarValuePage(String plate) throws InterruptedException {
      WebElement inputPlate = keyword.findWebElementByXpath("//div[@id='lpNumberInput']//input");
      keyword.sendKeys(inputPlate, plate);
   }
   public void clickOnStateDropDownInMyCarValuePage() throws InterruptedException {
      WebElement btnState = keyword.findWebElementByXpath("//div[@id='state']");
      keyword.clickThenWait(btnState);
   }

   public void clickToChooseStateInStateDropDownInMyCarValuePage() throws InterruptedException {
      WebElement optState = keyword.findWebElementByXpath("//div[@id='state']//option[@value= 'HI']");
      keyword.clickThenWait(optState);
   }
}
