package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ChooseaStyleComponent extends KbbBasePage {

    public ChooseaStyleComponent(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    private WebElement btnStyle = keyword.findWebElementByXpath("//div[text()='230i xDrive Coupe 2D']");

    /**
     * Search and Choose a Style Option
     */
    public void clickToChooseAstyleInStyleSectionInCategoryAndStylePage() throws InterruptedException {

        keyword.clickThenWait(btnStyle);
    }
}
