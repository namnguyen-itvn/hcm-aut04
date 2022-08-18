package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CategoryAndStylePage extends KbbBasePage {

    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    private WebElement btnCoupe = keyword.findWebElementByXpath("//div[text()='Coupe']");

    /**
     * Search and Click On Coupe Option
     */
    public void clickOnCoupeOptionInCategorySectionInCategoryAndStylePage() throws InterruptedException {

        keyword.clickThenWait(btnCoupe);
    }
}
