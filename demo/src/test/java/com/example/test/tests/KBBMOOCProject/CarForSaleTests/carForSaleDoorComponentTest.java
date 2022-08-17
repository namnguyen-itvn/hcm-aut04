package com.example.test.tests.KBBMOOCProject.CarForSaleTests;

import com.example.test.pages.KBBMOOCProject.carForSaleDoorComponentPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class carForSaleDoorComponentTest extends KbbBaseTest{
    @Test(testName ="TC 1: Verify Car models for sale whose transmission is automatic should be displayed when user choose filter with transmission type as user's intention")
    public void verifyCarTranmissionAutomaticDisplayed () throws InterruptedException
    { 
        carForSaleDoorComponentPage carComponentPage = new carForSaleDoorComponentPage(driver);
        carComponentPage.clickTranmisson();
        carComponentPage.clickAutomatic();
        Assert.assertTrue(carComponentPage.checkButtonAutomatic());
        Assert.assertTrue(carComponentPage.checkChipComponent());
    }
    
}
