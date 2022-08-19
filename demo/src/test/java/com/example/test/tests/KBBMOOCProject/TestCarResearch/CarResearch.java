package com.example.test.tests.KBBMOOCProject.TestCarResearch;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.CarResearchData;
import com.example.test.pages.KBBMOOCProject.ButtonLXCoupe2D;
import com.example.test.pages.KBBMOOCProject.ButtonReadmore;
import com.example.test.pages.KBBMOOCProject.ButtonSpecsvsFeatures;
import com.example.test.pages.KBBMOOCProject.ButtonStyles;
import com.example.test.pages.KBBMOOCProject.CompareTitleCar;
import com.example.test.pages.KBBMOOCProject.SearchCarPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CarResearch extends KbbBaseTest {
    @Test(testName = "Verify  Information Specifications will dipsplay full when user click Read More button of component Specifications ", dataProviderClass = CarResearchData.class, dataProvider ="CarResearchData" )
    public void VerifyInformationSpecificationsWillDipsplayFullWhenUserClickReadMoreButtonOfComponentSpecifications(String zipcode) throws InterruptedException{
        SearchCarPage searchCarPage = new SearchCarPage(driver);
        searchCarPage.SelectCars(zipcode);
        ButtonStyles buttonStyles =new ButtonStyles(driver);
        buttonStyles.clickOnButtonStyles();
        ButtonLXCoupe2D buttonLXCoupe2D=new ButtonLXCoupe2D(driver);
        buttonLXCoupe2D.clickonLXCoupe2D();
        ButtonSpecsvsFeatures buttonSpecsvsFeatures=new ButtonSpecsvsFeatures(driver);
        buttonSpecsvsFeatures.clickonSpecsvsFeatures();
        CompareTitleCar Comparetitle = new CompareTitleCar(driver);
        Assert.assertTrue(Comparetitle.isgetPageTitle());
        Assert.assertTrue(Comparetitle.isgetPageTitleUrl());
        ButtonReadmore buttonReadmore=new ButtonReadmore(driver);
        buttonReadmore.clickonReadmore();
       
       
      

       
       
    }
}
    

