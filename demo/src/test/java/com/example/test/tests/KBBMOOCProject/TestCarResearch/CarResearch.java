package com.example.test.tests.KBBMOOCProject.TestCarResearch;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.phpAccount;
import com.example.test.pages.KBBMOOCProject.CarResearchPage;
import com.example.test.pages.KBBMOOCProject.CompareTitleCar;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CarResearch extends KbbBaseTest {
    @Test(testName = "Verify  Information Specifications will dipsplay full when user click Read More button of component Specifications ", dataProviderClass = phpAccount.class, dataProvider ="zip" )
    public void VerifyInformationSpecificationsWillDipsplayFullWhenUserClickReadMoreButtonOfComponentSpecifications(String zipcode) throws InterruptedException{
        CarResearchPage SpecificationsCar = new CarResearchPage(driver);
        SpecificationsCar.SelectYear();
        SpecificationsCar.SelectMake();
        SpecificationsCar.SelectModel();
        SpecificationsCar.ZipCode(zipcode);
        SpecificationsCar.clickOnGetReview();
        SpecificationsCar.clickonStyles();
        SpecificationsCar.clickonLXCoupe2D();
        CompareTitleCar Comparetitle = new CompareTitleCar(driver);
        Assert.assertTrue(Comparetitle.isgetPageTitlee());
        Assert.assertTrue(Comparetitle.isgetPageTitleeUrl());
        SpecificationsCar.clickonSpecsvsFeatures();
        SpecificationsCar.clickonReadmore();
       
       
    }
}
    

