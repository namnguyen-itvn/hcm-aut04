package com.example.test.tests.KBBMOOCProject.CarResearchPagesTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.pages.KBBMOOCProject.CarResearchPages.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarsPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;



public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {
    
    
    @Test(testName = "Verify the Car Review Page should be displayed after click Get Reviews Button using valid data ")
    public void VerifytheCarReviewPageshouldbedisplayedafterclickGetReviewsButtonusingvaliddata() throws InterruptedException{
        
       ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage=new ResearchNewAndUsedCarsPage(driver);
       researchNewAndUsedCarsPage.actionSelectaVehicle();
       ReviewCarsPage reviewPage=new ReviewCarsPage(driver);
       Assert.assertTrue(reviewPage.isgetPageTitle());
       Assert.assertTrue(reviewPage.isgetComponentTitle());
       Assert.assertTrue(reviewPage.isBuildAndPriceBtnDisplayed());
       Assert.assertTrue(reviewPage.isSeeCarsForSaleBtnDisplayed());
    }
}
    
