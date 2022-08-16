package com.example.test.pages.KBBMOOCProject.WhatMyCarWorthPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CategoryAndStylePage extends KbbBasePage {

    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public void clickOnCoupeOptionInCategorySectionInCategoryAndStylePage() throws InterruptedException {
        WebElement btnCoupe = keyword.findWebElementByXpath("//div[text()='Coupe']");

        keyword.clickThenWait(btnCoupe);
    }

    public void clickToChooseAstyleInStyleSectionInCategoryAndStylePage() throws InterruptedException {
        WebElement btnStyle = keyword.findWebElementByXpath("//div[text()='230i xDrive Coupe 2D']");

        keyword.clickThenWait(btnStyle);
    }

    public void clickOnNextButtonInCategoryAndStylePage() throws InterruptedException {
        WebElement btnNext = keyword.findWebElementByXpath("//span[text()='Next']");

        keyword.clickThenWait(btnNext);
    }

    public void clickOnStyleDropdownInCategoryAndStylePage() throws InterruptedException {
        WebElement btnStyle = keyword.findWebElementByXpath("//div[@id='style']");

        keyword.clickThenWait(btnStyle);
    }

    public void clickToChooseaStyleinStyleDropdownInCategoryAndStylePage() throws InterruptedException {
        WebElement btnChoose = keyword.findWebElementByXpath("//div[@id='style']//option[@value='434546']");

        keyword.clickThenWait(btnChoose);
    }

    public void sendKeysToMileageTextBoxInCategoryAndStylePage(String mileage) throws InterruptedException {
        WebElement inputMileage = keyword.findWebElementByXpath("//input[@data-lean-auto='mileageInput']");
        keyword.sendKeys(inputMileage, mileage);
    }

    public void sendKeysToZipTextBoxInCategoryAndStylePage(String zip) throws InterruptedException {
        WebElement inputZip = keyword.findWebElementByXpath("//input[@data-lean-auto='zipcodeInput']");
        keyword.sendKeys(inputZip, zip);
    }
}
