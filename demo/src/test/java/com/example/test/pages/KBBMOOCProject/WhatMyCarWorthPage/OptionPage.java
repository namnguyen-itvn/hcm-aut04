package com.example.test.pages.KBBMOOCProject.WhatMyCarWorthPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionPage extends KbbBasePage {

    public OptionPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    public String optionPageTitle = driver.getTitle();
    WebElement xpathCategoryAndStyle = keyword.findWebElementByXpath("//div[@class='css-1itv5e3 eisth834']/p");
    public String categoryAndStyleName = xpathCategoryAndStyle.getText();
     
}
