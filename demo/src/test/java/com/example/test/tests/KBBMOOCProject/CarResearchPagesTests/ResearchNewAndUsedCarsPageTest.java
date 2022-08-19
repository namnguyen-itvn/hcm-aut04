package com.example.test.tests.KBBMOOCProject.CarResearchPagesTests;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.example.test.core.datadriven.CarResearchZipCode;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarsComponent;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarsDropdow;
import com.example.test.pages.KBBMOOCProject.CarResearchPages.ReviewCarsPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {



    @Test( testName = "Verify Click on Change Vehicle link located under Car Name on Review Page and Input Data To Change to a different Vehicle Review Page",dataProviderClass = CarResearchZipCode.class,dataProvider = "inputzipcode")
    public void verifyClickOnChangeVehicleLinkLocatedUnderCarNameonReviewPageAndInputDataToChangeToADifferentVehicleReviewPage(String zipcode) throws InterruptedException {


        ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage = new ResearchNewAndUsedCarsPage(driver);
        researchNewAndUsedCarsPage.actionSelectaCars(zipcode);
        
        ReviewCarsPage reviewCarsPage = new ReviewCarsPage(driver);
        reviewCarsPage.clickonbtnChangeVehicle();

        ReviewCarsDropdow reviewCarsDropdow = new ReviewCarsDropdow(driver);
        reviewCarsDropdow.chooseTheYearOfChange();
        reviewCarsDropdow.chooseTheMakeOfChange();
        reviewCarsDropdow.chooseTheModelOfChange();
        reviewCarsDropdow.clickOnBtnGo();

        ReviewCarsComponent reviewCarsComponent=new ReviewCarsComponent(driver);
        Assert.assertTrue(reviewCarsComponent.isgetPageTitle2020AudiA3());
        Assert.assertTrue(reviewCarsComponent.assertIsTitleUsed2020AudiA3());
        Assert.assertTrue(reviewCarsComponent.isBuildAndPriceBtnDisplayedAudi2020());
        Assert.assertTrue(reviewCarsComponent.isSeeCarsForSaleBtnDisplayedAudi2020());
        

       
        
    }
    
}

