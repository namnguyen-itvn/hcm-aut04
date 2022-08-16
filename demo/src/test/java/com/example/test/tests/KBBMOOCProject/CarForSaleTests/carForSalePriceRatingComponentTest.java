package com.example.test.tests.KBBMOOCProject.CarForSaleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.DataDriven;
import com.example.test.pages.KBBMOOCProject.carForSalePriceRatingComponent;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class carForSalePriceRatingComponentTest extends KbbBaseTest {
    @Test(testName ="Verify Good Price Car Is Displayed",dataProviderClass =DataDriven.class,dataProvider ="TestCase22")
    public  void verifyGoodPriceCarIsDisplayed(String goodprice,String tittle) throws InterruptedException{
        carForSalePriceRatingComponent carForSalePriceRating = new carForSalePriceRatingComponent(driver);
        carForSalePriceRating.checkTitlePage();
        carForSalePriceRating.clickPriceRating();
        Assert.assertTrue(carForSalePriceRating.chekPriceRatingFilterAfterClick(),"Price Rating Filter Not Displayed");
        carForSalePriceRating.clickGoodPrice();
        Assert.assertTrue(carForSalePriceRating.checkGoodPrice(goodprice),"The Car Good Price Not Displayed");
    }
        
}
