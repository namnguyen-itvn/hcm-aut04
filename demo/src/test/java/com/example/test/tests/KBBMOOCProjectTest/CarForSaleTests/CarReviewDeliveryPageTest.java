package com.example.test.tests.KBBMOOCProjectTest.CarForSaleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.DataDriven;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.CarForSalePage;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.CarReviewDeliveryPage;
import com.example.test.tests.KBBMOOCProjectTest.KbbBaseTest;

public class CarReviewDeliveryPageTest extends KbbBaseTest {
    @Test(testName ="Verify Car models for sale whose home service have Delivery feature should be displayed when user choose filter with At Home Service type as user's intention",dataProviderClass =DataDriven.class,dataProvider = "dataDetailsCarDelivery" )
    public  void verifyCarModelForSaleResultDisplayed(String zip, String delivery) throws InterruptedException{
        CarForSalePage carForSalePage = new CarForSalePage(driver);
        carForSalePage.inputZip(zip);
        carForSalePage.clickCheckBoxDelivery();
        CarReviewDeliveryPage DetailsCarDeliveryPage = new CarReviewDeliveryPage(driver);
        Assert.assertTrue(DetailsCarDeliveryPage.checkTitleConponent());
        Assert.assertTrue(DetailsCarDeliveryPage.checkbuttonDelivery());
        Assert.assertTrue(DetailsCarDeliveryPage.checkDelivery(delivery),"The Results has not  displayed");
    }
}
