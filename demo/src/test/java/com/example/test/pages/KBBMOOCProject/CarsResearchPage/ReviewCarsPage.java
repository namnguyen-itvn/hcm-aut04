package com.example.test.pages.KBBMOOCProject.CarsResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsPage extends KbbBasePage {

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }


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

    WebElement getReviewComponentTitles = keyword
            .findWebElementByXpath("//div[@class='css-1044rcd eds0yfe0']//h2[@class='css-1eagefn e148eed12']");

    public boolean isgetComponentTitles(String expectedMessageText1) {
        if (getReviewComponentTitles.getText().equals(expectedMessageText1)) {
            return true;
        }
        return false;
    }

    WebElement btnBuildAndPrice = keyword.findWebElementByXpath("//span[text()='Build & Price']");

    public boolean isBuildAndPriceBtnDisplayed() {

        if (btnBuildAndPrice.isDisplayed()) {
            return true;
        }
        return false;
    }

    WebElement btnSeeCarsForSale = keyword.findWebElementByXpath("//span[text()='See Cars for Sale']");

    public boolean isSeeCarsForSaleBtnDisplayed() {

        if (btnSeeCarsForSale.isDisplayed()) {
            return true;
        }
        return false;
    }

    WebElement btnWriteAReview = keyword.findWebElementByXpath("//a[text()='Write a Review']");

    public boolean isSeeWriteAReviewBtnDisplayed() {

        if (btnWriteAReview.isDisplayed()) {
            return true;
        }
        return false;
    }


    public boolean isgetPageTitleWriteAReview(String expectedMessageText2) {
        if (driver.getTitle().equals(expectedMessageText2)) {
            return true;
        }
        return false;
    }




    public boolean isgetPageURLWriteAReview(String URLReviewPage) {
        if (driver.getCurrentUrl().equals(URLReviewPage)) {
            return true;
        }
        return false;
    }
}
