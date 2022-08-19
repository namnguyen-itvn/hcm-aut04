package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.test.core.keyword.CustomKeywordForCategoryAndStylePage;

public class KbbBasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public CustomKeywordForCategoryAndStylePage keyword;
    public KbbBasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.keyword = new CustomKeywordForCategoryAndStylePage(driver, wait);
        driver.manage().window().maximize();
    }
    
    /**
     * return current PageTitle
     * @return
     */
    public String pageTitle() {
        return driver.getTitle();
    }

    /**
     * return True if TitlePage is correct as expected
     * @param expectedTitle
     * @return
     */
    public boolean isTitlePageCorrect(String expectedTitle)
    {
        return pageTitle().equals(expectedTitle);
    }
}