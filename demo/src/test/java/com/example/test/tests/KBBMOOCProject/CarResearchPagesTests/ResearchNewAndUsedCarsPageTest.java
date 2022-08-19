
package com.example.test.tests.KBBMOOCProject.CarResearchPagesTests;

import org.testng.annotations.Test;

import com.example.test.core.datadriven.CarResearchZipcode;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.ReviewCarsPage;

public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {

    @Test(testName = " Verify click on See More in Other Compact Sedans Section on Review Page after click on See More Compact Sedans to show more Item", dataProviderClass = CarResearchZipcode.class, dataProvider = "CarResearchZipcode")
    public void verifyClickOnSeeMoreInOtherCompactSedansSectionOnReviewPageAfterClickOnSeeMoreCompactSedansToShowMoreItem(
            String zipcode)
            throws InterruptedException {

        ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage = new ResearchNewAndUsedCarsPage(driver);
        researchNewAndUsedCarsPage.actionSelectaCars(zipcode);
        ReviewCarsPage reviewCarsPage = new ReviewCarsPage(driver);
        reviewCarsPage.clickOnSeeMore();

    }
}
