package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.test.core.keywork.CustomKeyword;

public class KbbPageBase {
    public WebDriver driver;
    public WebDriverWait wait;
    public CustomKeyword keyword;
    public KbbPageBase(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.keyword = new CustomKeyword(driver, wait);
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
     * Check element is displayed or not
     * @param element
     * @return
     */
    public boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    
    /**
     *
     * @param btnCondition
     * @return Element enabled or not
     */
    public boolean isElementEnabled(WebElement btnCondition) {
        return keyword.findElement(btnCondition).isEnabled();
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
