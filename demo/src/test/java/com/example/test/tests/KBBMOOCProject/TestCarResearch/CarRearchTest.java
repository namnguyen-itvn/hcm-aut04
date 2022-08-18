package com.example.test.tests.KBBMOOCProject.TestCarResearch;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.CarResearchPages;
import com.example.test.pages.CompareTitleCar;
import com.example.test.pages.KBBMOOCProject.ButtonCarchevloca;
import com.example.test.pages.KBBMOOCProject.ButtonStyles;
import com.example.test.pages.KBBMOOCProject.SearchCarPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CarRearchTest extends KbbBaseTest {
    @Test(testName = "Verify Cars Review page  title is display when user click on item car name as Chevrolet Corvette of component Other Compact Coupes", dataProviderClass = CarResearchPages.class, dataProvider = "CarResearchPages")
    public void VerifyCarsReviewPageTitleIsDisplayWhenUserClickOnItemCarNameAsChevroletCorvetteOfComponentOtherCompactCoupesverifyProductsPageTitleWhenLoginSuccess(String zipcode) throws InterruptedException{
        SearchCarPage CarSearch = new SearchCarPage(driver);
        CarSearch.actionSelectaCars(zipcode);
        ButtonStyles buttonStyles =new ButtonStyles(driver);
        buttonStyles.clickOnButtonStyles();
        ButtonCarchevloca buttonCarchevloca=new ButtonCarchevloca(driver);
        buttonCarchevloca.clickOnButtonCar();
        CompareTitleCar Car = new CompareTitleCar(driver);
        Assert.assertTrue(Car.isgetPageTitle());
        Assert.assertTrue(Car.isgetPageTitleUrl());
 
    }

}
