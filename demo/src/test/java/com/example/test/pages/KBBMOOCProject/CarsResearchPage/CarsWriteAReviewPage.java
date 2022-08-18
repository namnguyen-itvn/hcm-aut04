package com.example.test.pages.KBBMOOCProject.CarsResearchPage;

import org.openqa.selenium.WebDriver;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarsWriteAReviewPage extends KbbBasePage {

    public CarsWriteAReviewPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }


    //#region

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

    //#endregion
    
}
