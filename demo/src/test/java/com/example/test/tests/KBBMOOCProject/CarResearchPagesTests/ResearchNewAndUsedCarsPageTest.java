

package com.example.test.tests.KBBMOOCProject.CarResearchPagesTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.CarResearchPageData;
import com.example.test.core.datadriven.GetReviewCarResearch;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.ReviewCarResearchComponentPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.ReviewCarsPage;





public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {
    
    
    @Test(testName = "Verify the Car Review Page should be displayed after click Get Reviews Button using valid data",dataProviderClass = GetReviewCarResearch.class, dataProvider = "getreview")
    public void VerifytheCarReviewPageshouldbedisplayedafterclickGetReviewsButtonusingvaliddata(String zipcode) throws InterruptedException{
        
       ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage=new ResearchNewAndUsedCarsPage(driver);
       researchNewAndUsedCarsPage.actionSelectaVehicle();
       researchNewAndUsedCarsPage.actionInputZipcodeCarResearchPage(zipcode);
       researchNewAndUsedCarsPage.actionClickGetReviewBtnCarResearchPage();
       ReviewCarsPage reviewPage=new ReviewCarsPage(driver);
       Assert.assertTrue(reviewPage.isgetPageTitle());
       Assert.assertTrue(reviewPage.isgetComponentTitle());
       Assert.assertTrue(reviewPage.isBuildAndPriceBtnDisplayed());
       Assert.assertTrue(reviewPage.isSeeCarsForSaleBtnDisplayed());
    }
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

