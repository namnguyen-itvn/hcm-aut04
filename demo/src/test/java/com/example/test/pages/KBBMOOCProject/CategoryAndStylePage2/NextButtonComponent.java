package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextButtonComponent extends KbbBasePage {

    public NextButtonComponent(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    private WebElement btnNext = keyword.findWebElementByXpath("//button");

    /**
     * Search and click on Next Button
     */
    public void clickOnNextButtonInCategoryAndStylePage() throws InterruptedException {

        keyword.clickThenWait(btnNext);
    }
}
