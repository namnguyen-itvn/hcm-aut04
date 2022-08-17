
package com.example.test.tests.KBBMOOCProject.CarResearchPagesTests;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.pages.KBBMOOCProject.CarResearchPages.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarsPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {

    @Test(testName = "Verify Click on Car Image in Other Compact Sedans Section on Review Page to bring user to the Chosen Car Review Page")
    public void VerifyClickOnCarImageInOtherCompactSedansSectionOnReviewPageToBringUserToTheChosenCarReviewPage()
            throws InterruptedException {

        ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage = new ResearchNewAndUsedCarsPage(driver);
        researchNewAndUsedCarsPage.actionSelectaCars();
        Assert.assertTrue(researchNewAndUsedCarsPage.checkTitle());
        Assert.assertTrue(researchNewAndUsedCarsPage.checkBuildPriceButtonDisplay());
        Assert.assertTrue(researchNewAndUsedCarsPage.checkSeeCarForSaleButtonDisplay()); 
        ReviewCarsPage reviewPage = new ReviewCarsPage(driver);
        reviewPage.clickfirstOtherCompactSedans();
        
    }

}
