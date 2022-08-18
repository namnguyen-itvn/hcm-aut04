package com.example.test.tests.KBBMOOCProject.CarForSaleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.PriceRating;
import com.example.test.pages.KBBMOOCProject.carForSalePriceRatingComponent;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class carForSalePriceRatingComponentTest extends KbbBaseTest {
    @Test(testName ="Verify Good Price Car Is Displayed",dataProviderClass =PriceRating.class,dataProvider ="GoodPrice")
    public  void verifyGoodPriceCarIsDisplayed(String goodprice,String tittle) throws InterruptedException{
        carForSalePriceRatingComponent carForSalePriceRating = new carForSalePriceRatingComponent(driver);
        carForSalePriceRating.checkTitlePage();
        carForSalePriceRating.clickFilterPriceRating();
        Assert.assertTrue(carForSalePriceRating.chekPriceRatingFilterAfterClick(),"Price Rating Filter Not Displayed");
        carForSalePriceRating.clickCheckBoxGoodPrice();
        carForSalePriceRating.checkCheckBoxGoodPriceIsSelected();
        Assert.assertTrue(carForSalePriceRating.checkGoodPrice(goodprice),"The Car Good Price Not Displayed");
    }
        
}
