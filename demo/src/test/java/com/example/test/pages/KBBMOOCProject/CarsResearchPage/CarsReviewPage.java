package com.example.test.pages.KBBMOOCProject.CarsResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarsReviewPage extends KbbBasePage {

    public CarsReviewPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    WebElement btnWriteAReview = keyword.findWebElementByXpath("//a[@data-analytics='consrev_lnk']");
    WebElement btnWriteAReviewOnCarsReviewPage = keyword.findWebElementByXpath("//a[text()='Write a Review']");

    public boolean isSeeWriteAReviewBtnDisplayed() {

        if (btnWriteAReview.isDisplayed()) {
            return true;
        }
        return false;
    }

    public void actionClickWriteAReviewButton() throws InterruptedException {
        keyword.scrollAndWaitToClick(btnWriteAReview);
    }

}
