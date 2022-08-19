package com.example.test.pages.KBBMOOCProject.CarsResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsPage extends KbbBasePage {

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    // #region
    private WebElement getReviewComponentTitles = keyword.findWebElementByXpath("//div[@class='css-1044rcd eds0yfe0']//h2[@class='css-1eagefn e148eed12']");
    private WebElement btnBuildAndPrice = keyword.findWebElementByXpath("//span[text()='Build & Price']");
    private WebElement btnSeeCarsForSale = keyword.findWebElementByXpath("//span[text()='See Cars for Sale']");

    // #endregion

    public boolean isgetPageTitle(String expectedMessageText) {
        if (driver.getTitle().equals(expectedMessageText)) {
            return true;
        }
        return false;
    }

    public boolean isgetPageURLHondaCivicPage(String URLHondaCivicPage) {
        if (driver.getCurrentUrl().equals(URLHondaCivicPage)) {
            return true;
        }
        return false;
    }

    public boolean isgetComponentTitles(String expectedMessageText1) {
        if (getReviewComponentTitles.getText().equals(expectedMessageText1)) {
            return true;
        }
        return false;
    }

    public boolean isBuildAndPriceBtnDisplayed() {

        if (btnBuildAndPrice.isDisplayed()) {
            return true;
        }
        return false;
    }

    public boolean isSeeCarsForSaleBtnDisplayed() {

        if (btnSeeCarsForSale.isDisplayed()) {
            return true;
        }
        return false;
    }

}
