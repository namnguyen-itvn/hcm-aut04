package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OptionPage extends KbbBasePage {

    public OptionPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    /**
     * Check the Title of the Page
     */
    public boolean compareOptionPageTitleToTitleInFileDatas(String optionPageTitleTest) {
        String optionPageTitle = driver.getTitle();
        if (optionPageTitle.equals(optionPageTitle)) {
            return true;
        }
        return false;
    }

    /**
     * Check if the Style Change
     */
    private WebElement xpathCategoryAndStyle = keyword.findWebElementByXpath("//div[@class='css-1itv5e3 eisth834']/p");

    public boolean compareCarStyleAndCategoryNameIsSimilarToStyleAnCarDataInFileDatas(
            String categoryandstylenameinoption) {
        String categoryAndStyleName = xpathCategoryAndStyle.getText();
        if (categoryAndStyleName.equals(categoryandstylenameinoption)) {
            return true;
        }
        return false;
    }
}
