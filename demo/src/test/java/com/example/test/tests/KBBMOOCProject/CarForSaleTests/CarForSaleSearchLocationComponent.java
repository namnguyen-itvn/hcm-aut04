package com.example.test.tests.KBBMOOCProject.CarForSaleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.pages.KBBMOOCProject.CarForSalePage;
import com.example.test.pages.KBBMOOCProject.CarForSaleTruckDetailPage;
import com.example.test.pages.KBBMOOCProject.CarForSaleTruckPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CarForSaleSearchLocationComponent extends KbbBaseTest{
    @Test(testName = "verify Car models for sale which correspond with Truck Bed Length in body style tab should be displayed when the user click on Long checkbox")
    public void verifyCarModelsForSaleCorrespondWithTruckBedLengthShoulBeDisplayedWhenUserClickLongCheckbox() throws InterruptedException
    {
        CarForSalePage cs = new CarForSalePage(driver);

        cs.clickBodyTypeInCarForSalePage();
        
        CarForSaleTruckPage cst = new CarForSaleTruckPage(driver);
        
        Assert.assertEquals(cst.strActual, cst.strExpected);
        
        cst.clickTruckBedTab();
        Assert.assertTrue(cst.checkTextboxinBedTab(), "its not checked or error");

        cst.scrollTop();
        
        Assert.assertTrue(cst.checkSearckKeyLong());
        Assert.assertTrue(cst.checkSearckKeyTruck());

        cst.clickFirstResultInCarForSaleTruckPage();

        CarForSaleTruckDetailPage cstd = new CarForSaleTruckDetailPage(driver);
        Assert.assertTrue(cstd.checkWordContainInElement());
    }
}