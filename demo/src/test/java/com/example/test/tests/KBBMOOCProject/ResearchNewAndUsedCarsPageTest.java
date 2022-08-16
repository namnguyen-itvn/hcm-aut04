package com.example.test.tests.KBBMOOCProject;

import com.example.test.tests.KBBMOOCProject.KbbBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.example.test.pages.KBBMOOCProject.CarsResearchPage.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarsResearchPage.ReviewCarsPage;

public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {
/**
 * 
 * @throws InterruptedException
 */
    @Test(testName = "Verify click on highlight Zip Code link located under Car Name on Review Page and Input Zip Code To Change Vehicle Zip Code and displayed location")
    public void verifyClickOnHighlightZipCodeLinkLocatedUnderCarNameOnReviewPageAndInputZipCodeToChangeVehicleZipCodeAndDisplayedLocation()
            throws InterruptedException {

        ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage = new ResearchNewAndUsedCarsPage(driver);
        researchNewAndUsedCarsPage.selectYears();
        researchNewAndUsedCarsPage.selectMake();
        researchNewAndUsedCarsPage.selectModel();
        researchNewAndUsedCarsPage.selectZipCode();
        researchNewAndUsedCarsPage.btnGetReviews();
        researchNewAndUsedCarsPage.btnChangeZipCode();
        researchNewAndUsedCarsPage.deleteZipCode();
        researchNewAndUsedCarsPage.sendKeyZipCode();
        researchNewAndUsedCarsPage.btnSaveZipCode();
        ReviewCarsPage reviewPage = new ReviewCarsPage(driver);
        Assert.assertTrue(reviewPage.isgetPageTitle());
        Assert.assertTrue(reviewPage.isgetComponentTitles());
        Assert.assertTrue(reviewPage.isBuildAndPriceBtnDisplayed());
        Assert.assertTrue(reviewPage.isSeeCarsForSaleBtnDisplayed());
        Assert.assertTrue(reviewPage.assertTrueNameZipCodeDisplayed());

    }

}