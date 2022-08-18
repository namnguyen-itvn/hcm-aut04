package com.example.test.tests.KBBMOOCProjectTest.CarForSaleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.DataDriven;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.CarForSalePage;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.CarDeliveryPage;
import com.example.test.tests.KBBMOOCProjectTest.KbbBaseTest;

public class CarDeliveryPageTest extends KbbBaseTest {
    @Test(testName ="Verify Car models for sale whose home service have Delivery feature should be displayed when user choose filter with At Home Service type as user's intention",dataProviderClass =DataDriven.class,dataProvider = "dataDetailsCarDelivery" )
    public  void verifyCarModelForSaleResultDisplayed(String zip, String url ,String delivery) throws InterruptedException{
        CarForSalePage carForSalePage = new CarForSalePage(driver);
        carForSalePage.inputToZip(zip);
        carForSalePage.clickOnCheckBoxDelivery();
        CarDeliveryPage carDeliveryPage = new CarDeliveryPage(driver);
        Assert.assertTrue(carDeliveryPage.compareUrl(url));
        Assert.assertTrue(carDeliveryPage.checkTitleComponent());
        Assert.assertTrue(carDeliveryPage.checkChipDelivery());
        Assert.assertTrue(carDeliveryPage.checkButtonDelivery());
        Assert.assertTrue(carDeliveryPage.checkDelivery(delivery),"The Results has not  displayed");
    }
}
