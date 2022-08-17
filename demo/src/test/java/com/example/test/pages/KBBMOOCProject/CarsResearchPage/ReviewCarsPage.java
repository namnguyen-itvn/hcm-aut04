package com.example.test.pages.KBBMOOCProject.CarsResearchPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsPage extends KbbBasePage {

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    String expectedMessageText = "2018 Honda Civic Values & Cars for Sale | Kelley Blue Book";

    public boolean isgetPageTitle() {
        if (driver.getTitle().equals(expectedMessageText)) {
            return true;
        }
        return false;
    }

    WebElement getReviewComponentTitles = keyword
            .findWebElementByXpath("//div[@class='css-1044rcd eds0yfe0']//h2[@class='css-1eagefn e148eed12']");
    String expectedMessageText1 = "2018 Honda Civic Review";

    public boolean isgetComponentTitles() {
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
    String expectedMessageText2 = "Kelley Blue Book";

    public boolean isgetPageTitleWriteAReview() {
        if (driver.getTitle().equals(expectedMessageText2)) {
            return true;
        }
        return false;
    }
    WebElement btnSubmitReview = keyword.findWebElementByXpath("//span[@class='css-cje431 e1uau9z01']");
/**
 * 
 * @return
 */
    public boolean isSeeSubmitReviewBtnDisplayed() {

        if (btnSubmitReview.isDisplayed()) {
            return true;
        }
        return false;
    }

}