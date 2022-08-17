package com.example.test.tests.KBBMOOCProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.dataPageResearch;
import com.example.test.pages.KBBMOOCProject.CarsResearchPage.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarsResearchPage.ReviewCarsPage;

public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {
    /**
     * 
     * @param year
     * @param make
     * @param model
     * @param zip
     * @param expectedMessageText
     * @param expectedMessageText1
     * @param URLHondaCivicPage
     * @param expectedMessageText2
     * @param URLReviewPage
     * @throws InterruptedException
     */
    @Test(testName = "Verify click on highlight Zip Code link located under Car Name on Review Page and Input Zip Code To Change Vehicle Zip Code and displayed location", dataProviderClass = dataPageResearch.class, dataProvider = "dataPageTest")
    public void verifyClickOnHighlightZipCodeLinkLocatedUnderCarNameOnReviewPageAndInputZipCodeToChangeVehicleZipCodeAndDisplayedLocation(
            String year, String make, String model, String zip, String expectedMessageText,
            String expectedMessageText1, String URLHondaCivicPage, String expectedMessageText2, String URLReviewPage)
            throws InterruptedException {

        ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage = new ResearchNewAndUsedCarsPage(driver);
        researchNewAndUsedCarsPage.selectYears(year);
        researchNewAndUsedCarsPage.selectMake(make);
        researchNewAndUsedCarsPage.selectModel(model);
        researchNewAndUsedCarsPage.selectZipCode(zip);
        researchNewAndUsedCarsPage.btnGetReviews();
        ReviewCarsPage reviewPage = new ReviewCarsPage(driver);
        Assert.assertTrue(reviewPage.isgetPageTitle(expectedMessageText));
        Assert.assertTrue(reviewPage.isgetPageURLHondaCivicPage(URLHondaCivicPage));
        Assert.assertTrue(reviewPage.isgetComponentTitles(expectedMessageText1));
        Assert.assertTrue(reviewPage.isBuildAndPriceBtnDisplayed());
        Assert.assertTrue(reviewPage.isSeeCarsForSaleBtnDisplayed());
        Assert.assertTrue(reviewPage.isSeeWriteAReviewBtnDisplayed());
        researchNewAndUsedCarsPage.actionClickWriteAReviewButton();
        Assert.assertTrue(reviewPage.isgetPageTitleWriteAReview(expectedMessageText2));
        // get URL
        Assert.assertTrue(reviewPage.isgetPageURLWriteAReview(URLReviewPage));
    }

}