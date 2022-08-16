package com.example.test.tests.KBBMOOCProject.CarFinderPageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.pages.KBBMOOCProject.CarFinderPages.CarFinderPage;
import com.example.test.pages.KBBMOOCProject.CarFinderPages.ShopByPricePage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;



public class CarFinderPageTest extends KbbBaseTest {
    
    
    @Test(testName = "Verify the result 0 matches is displayed in Car Finder | Find Your Perfect Car | Kelley Blue Book page")
    public void verifyTheResult0MatchesIsDisplayedInCarFinderFindYourPerfectCarKelleyBlueBookPage() throws InterruptedException{
        
       ShopByPricePage shopByPricePage=new ShopByPricePage(driver);
       shopByPricePage.actionSenkeyShopByPriceToFindVehicle();
       shopByPricePage.actionClickSeeResultBtn();
       
       CarFinderPage carFinderPage=new CarFinderPage(driver);
       Assert.assertTrue(carFinderPage.isgetPageTitle());
       Assert.assertTrue(carFinderPage.isgetComponentTitle());
       Assert.assertTrue(carFinderPage.isgetBreadcrumb());
       Assert.assertTrue(carFinderPage.isgetResultCarFinder());
    }
}

