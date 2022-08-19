package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OptionPage extends KbbBasePage {

    public OptionPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    /**
     * Check If The Title is Correct
     */
    public boolean compareOptionPageTitleToTitleInFileDatas(String optionPageTitleTest) {
        String optionPageTitle = driver.getTitle();
        if (optionPageTitle.equals(optionPageTitle)) {
            return true;
        }
        return false;
    }

    private WebElement xpathCategoryAndStyle = keyword.findWebElementByXpath("//div[@class='css-1itv5e3 eisth834']/p");

    /**
     * Check if Style and Category is Correct
     */
    public boolean compareCarStyleAndCategoryNameIsSimilarToStyleAnCarDataInFileDatas(
            String categoryandstylenameinoption) {
        String categoryAndStyleName = xpathCategoryAndStyle.getText();
        if (categoryAndStyleName.equals(categoryandstylenameinoption)) {
            return true;
        }
        return false;
    }
}
