package com.example.test.tests.KBBMOOCProject.CarResearchPagesTests;

import org.testng.annotations.Test;

import com.example.test.pages.KBBMOOCProject.CarResearchPages.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarsPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {

    @Test(testName = "Verify Select a different year in list from Year dropdown located on top of Car Name on Review Page to change to a different vehicle Page with the chosen year in Review Page")
    public void verifySelectADifferentYearInListFromYearDropdownLocatedOnTopOfCarNameOnReviewPageToChangeToADifferentVehiclePageWithTheChosenYearinReviewPage()
            throws InterruptedException {

        ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage = new ResearchNewAndUsedCarsPage(driver);
        researchNewAndUsedCarsPage.actionSelectaCars();
        ReviewCarsPage reviewPage = new ReviewCarsPage(driver);
        reviewPage.clickfirstOtherCompactSedans();

    }

    // sangda
    //tétt2

    @Test(testName = " Select a different year in list from Year dropdown located on top of Car Name on Review Page to change to a different vehicle Page with the chosen year in Review Page")
    public void SelectADifferentYearInListFromYearDropdownLocatedOnTopOfCarNameOnReviewPageToChangeToADifferentVehiclePageWithTheChosenYearinReviewPage()
            throws InterruptedException {

        ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage = new ResearchNewAndUsedCarsPage(driver);
        researchNewAndUsedCarsPage.actionSelectaCars();
        ReviewCarsPage reviewPage = new ReviewCarsPage(driver);
        reviewPage.firstOther();

    }

}
