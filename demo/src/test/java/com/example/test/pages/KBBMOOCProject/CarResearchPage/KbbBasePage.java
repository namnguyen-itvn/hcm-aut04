package com.example.test.pages.KBBMOOCProject.CarResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.test.core.keyword.CustomKeywordClick;

public class KbbBasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public CustomKeywordClick keyword;
    public KbbBasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.keyword = new CustomKeywordClick(driver, wait);

    }
    
    
}
