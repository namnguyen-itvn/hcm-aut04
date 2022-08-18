package com.example.test.tests.KBBMOOCProject.CarResearchPagesTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.CarResearchZipCode;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarsComponent;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarsPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;


//TriDH5
public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {
    

    @Test(testName = "Verify Select a different year in list from Year dropdown located on top of Car Name on Review Page to change to a different vehicle Page with the chosen year in Review Page",dataProviderClass =   CarResearchZipCode.class, dataProvider = "inputzipcode")
    public void verifySelectADifferentYearInListFromYearDropdownLocatedOnTopOfCarNameOnReviewPageToChangeToADifferentVehiclePageWithTheChosenYearinReviewPage(String zipcode) throws InterruptedException{
        
       ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage=new ResearchNewAndUsedCarsPage(driver);
       researchNewAndUsedCarsPage.actionSelectaCars(zipcode);
       ReviewCarsPage reviewPage=new ReviewCarsPage(driver);
       reviewPage.actionClickDropdowChangeYear();
       ReviewCarsComponent reviewCarsComponent =new ReviewCarsComponent(driver);
       Assert.assertTrue(reviewCarsComponent.isgetPageTitle2019HondaCivic());
       Assert.assertTrue(reviewCarsComponent.assertIsTitleUsed2019HondaCivic());
       Assert.assertTrue(reviewCarsComponent.isBuildAndPriceBtnDisplayedHonda2019());
       Assert.assertTrue(reviewCarsComponent.isSeeCarsForSaleBtnDisplayedHonda2019());
       
       
    }
}