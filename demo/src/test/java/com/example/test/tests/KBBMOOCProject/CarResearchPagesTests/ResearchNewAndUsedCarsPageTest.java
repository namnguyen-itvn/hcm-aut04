
package com.example.test.tests.KBBMOOCProject.CarResearchPagesTests;



import org.testng.annotations.Test;

import com.example.test.pages.KBBMOOCProject.CarResearchPage.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.ReviewCarsPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {

    
    @Test(testName = " Verify click on See less in Other Compact Sedans Section on Review Page after click on See More Compact Sedans to show less Item")
    public void VerifyClickOnSeeLessinOtherCompactSedansSectionOnReviewPageAfterClickOnSeeMoreCompactSedansToShowLessItem()
            throws InterruptedException {

        ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage = new ResearchNewAndUsedCarsPage(driver);
        researchNewAndUsedCarsPage.actionSelectaCars();
        ReviewCarsPage reviewCarsPage = new ReviewCarsPage(driver);
        reviewCarsPage.clickonSeeMore();

    }
}
