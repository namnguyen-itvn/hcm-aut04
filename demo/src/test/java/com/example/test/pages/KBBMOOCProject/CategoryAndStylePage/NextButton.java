package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextButton extends KbbBasePage {

    public NextButton(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    private WebElement btnNext = keyword.findWebElementByXpath("//button");

    public void clickOnNextButtonInCategoryAndStylePage() {
        keyword.clickThenWait(btnNext);
    }
}
