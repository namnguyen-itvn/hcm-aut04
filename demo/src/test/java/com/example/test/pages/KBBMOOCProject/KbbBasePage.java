package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.test.core.keyword.CustomKeyword;

public class KbbBasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public CustomKeyword keyword;
    public KbbBasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.keyword = new CustomKeyword(driver,wait);
        driver.manage().window().maximize();
    }
}
