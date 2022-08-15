package com.example.test.pages.SauceLabsFinalPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceLabProductPage extends BasePage {

    public SauceLabProductPage(WebDriver driver) {
        super(driver);
    }
    
    /**
     * Declare Web Element
     */
    WebElement listProduct = (WebElement) keyword.findListWebElementByXpath("//div[@class='inventory_item']");
    /**
     * Page Action
     */ 
    // public boolean isTitlePageCorrect(String expectedTitle)
    // {
    //     return pageTitle().equals(expectedTitle);
    // }

    public boolean isListProductHaveCountCorrect() {
        if(listProduct.equals(6))
        return true;
        else return false;
    }
}
