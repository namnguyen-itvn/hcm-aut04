package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextButtonComponent extends KbbBasePage {

    public NextButtonComponent(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    /**
     * Search and Click on Next button
     */
    private WebElement btnNext = keyword.findWebElementByXpath("//button");

    public void clickOnNextButtonInCategoryAndStylePage() {
        keyword.clickThenWait(btnNext);
    }
}
