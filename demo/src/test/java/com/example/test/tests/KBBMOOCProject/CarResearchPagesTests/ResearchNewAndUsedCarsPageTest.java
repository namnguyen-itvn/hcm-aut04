package com.example.test.tests.KBBMOOCProject.CarResearchPagesTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.CarResearchZipcode;
import com.example.test.core.datadriven.GetReviewCarResearch;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarsPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;



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
    

