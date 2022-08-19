package com.example.test.tests.KBBMOOCProject.CarFinderPageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.ShopByPrice;
import com.example.test.pages.KBBMOOCProject.CarFinderPages.CarFinderPage;
import com.example.test.pages.KBBMOOCProject.CarFinderPages.ShopByPricePage;
import com.example.test.tests.KBBMOOCProject.CarResearchPagesTests.KbbBaseTest;



public class CarFinderPageTest extends KbbBaseTest {
    
    
    @Test(testName = "Verify the result 0 matches is displayed in Car Finder | Find Your Perfect Car | Kelley Blue Book page", dataProviderClass = ShopByPrice.class, dataProvider = "minmaxprice")
    public void verifyTheResult0MatchesIsDisplayedInCarFinderFindYourPerfectCarKelleyBlueBookPage(String minprice, String maxprice) throws InterruptedException{
        
       ShopByPricePage shopByPricePage=new ShopByPricePage(driver);
       shopByPricePage.actionShopByPriceToFindVehicle(minprice, maxprice);
       shopByPricePage.actionClickSeeResultForShopByPrice();
       
       CarFinderPage carFinderPage=new CarFinderPage(driver);
       Assert.assertTrue(carFinderPage.isgetPageTitle());
       Assert.assertTrue(carFinderPage.isgetComponentTitle());
       Assert.assertTrue(carFinderPage.isgetBreadcrumb());
       Assert.assertTrue(carFinderPage.isgetResultCarFinder());
    }
}

