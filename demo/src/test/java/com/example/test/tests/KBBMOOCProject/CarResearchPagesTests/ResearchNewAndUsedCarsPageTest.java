
package com.example.test.tests.KBBMOOCProject.CarResearchPagesTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.CarResearchPageData;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarResearchComponentPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarsPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {

    @Test(testName = "Verify Click on Car Image in Other Compact Sedans Section on Review Page to bring user to the Chosen Car Review Page", dataProviderClass = CarResearchPageData.class, dataProvider = "CarResearchPageData")
    public void VerifyClickOnCarImageInOtherCompactSedansSectionOnReviewPageToBringUserToTheChosenCarReviewPage(String zipcode, String expectedTitle)
            throws InterruptedException {

        ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage = new ResearchNewAndUsedCarsPage(driver);
        researchNewAndUsedCarsPage.actionSelectaCars(zipcode);
        ReviewCarsPage reviewPage = new ReviewCarsPage(driver);
        reviewPage.clickfirstOtherCompactSedans();
        ReviewCarResearchComponentPage researchComponentPage = new ReviewCarResearchComponentPage(driver);
        Assert.assertTrue(researchComponentPage.checkTitle(expectedTitle));
        Assert.assertTrue(researchComponentPage.checkBuildPriceButtonDisplay());
        Assert.assertTrue(researchComponentPage.checkSeeCarForSaleButtonDisplay());

    }

}
