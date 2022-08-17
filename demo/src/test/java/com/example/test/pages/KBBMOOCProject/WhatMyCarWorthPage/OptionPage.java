package com.example.test.pages.KBBMOOCProject.WhatMyCarWorthPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OptionPage extends KbbBasePage {

    public OptionPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public boolean compareOptionPageTitleToTitleInFileDatas(String optionPageTitleTest) {
        String optionPageTitle = driver.getTitle();
        if (optionPageTitle.equals(optionPageTitle)) {
            return true;
        }
        return false;
    }

    public boolean compareCarStyleAndCategoryNameIsSimilarToStyleAnCarDataInFileDatas(String categoryandstylenameinoption) {
        WebElement xpathCategoryAndStyle = keyword.findWebElementByXpath("//div[@class='css-1itv5e3 eisth834']/p");
        String categoryAndStyleName = xpathCategoryAndStyle.getText();
        if (categoryAndStyleName.equals(categoryandstylenameinoption)) {
            return true;
        }
        return false;
    }
}
