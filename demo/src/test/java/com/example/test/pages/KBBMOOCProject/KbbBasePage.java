package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.test.core.keywork.CustomKeyword;

public class KbbPageBase {
    public WebDriver driver;
    public WebDriverWait wait;
    public CustomKeyword keyword;
    public KbbPageBase(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.keyword = new CustomKeyword(driver);
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
