package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YearComponent extends KbbBasePage {

    public YearComponent(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    private WebElement btnYear = keyword.findWebElementByXpath("//div[@class='year']");

    /**
     * Search and Click on year Dropdown
     */
    public void clickOnYearDropDownInMyCarValuePage() throws InterruptedException {
        keyword.clickThenWait(btnYear);
    }

    private WebElement optYear = keyword.findWebElementByXpath("//div[@class='year']//option[@value= '2020']");

    /**
     * Search and Choose an Option in Year Dropdown
     */
    public void clickToChooseaYearInYearDropDownInMyCarValuePage() throws InterruptedException {
        keyword.clickThenWait(optYear);
    }
}
