package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class MakeComponent extends KbbBasePage {

    public MakeComponent(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    private WebElement btnMake = keyword.findWebElementByXpath("//div[@class='make']");

    /**
     * Search and click on Make Dropdown
     */
    public void clickOnMakeDropDownInMyCarValuePage() throws InterruptedException {
        keyword.clickThenWait(btnMake);
    }

    private WebElement optMake = keyword.findWebElementByXpath("//div[@class='make']//option[@value= '5']");

    /**
     * Search and Choose Make Option
     */
    public void clickToChooseaMakeInMakeDropDownInMyCarValuePage() throws InterruptedException {
        keyword.clickThenWait(optMake);
    }
}
