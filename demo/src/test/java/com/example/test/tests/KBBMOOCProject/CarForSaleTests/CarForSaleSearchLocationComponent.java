package com.example.test.tests.KBBMOOCProject.CarForSaleTests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.pages.KBBMOOCProject.CarForSalePages.CarForSalePage;
import com.example.test.pages.KBBMOOCProject.CarForSalePages.CarForSalePageGetMilesFromFirstResult;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CarForSaleSearchLocationComponent extends KbbBaseTest{
    @Test(testName = "verify car models for sale corresponding to the Mileage tab will be displayed when the user selects the Mileage list")
    public void verifyCarModelsCorrespondingTotheMileageTabAfterChosingSpecificTabInList() throws InterruptedException
    {
    
        CarForSalePage cs = new CarForSalePage(driver);

        cs.clickMileageTabInCarForSalePage();
        Assert.assertTrue(cs.checkTextBoxInMileageTab());
        
        CarForSalePageGetMilesFromFirstResult csm = new CarForSalePageGetMilesFromFirstResult(driver);
        Assert.assertTrue(csm.comparasionMilesBetweenCheckboxAndResult());
    }
}