package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.test.core.keyword.CustomKeywordforwhatmycarworth;

public class KbbBasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public CustomKeywordforwhatmycarworth keyword;
    public KbbBasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.keyword = new CustomKeywordforwhatmycarworth(driver, wait);
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
