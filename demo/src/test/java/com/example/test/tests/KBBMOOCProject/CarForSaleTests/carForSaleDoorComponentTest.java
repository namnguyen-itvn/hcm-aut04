package com.example.test.tests.KBBMOOCProject.CarForSaleTests;

import com.example.test.core.datadriven.DataDriven;
import com.example.test.pages.KBBMOOCProject.carForSaleDoorComponentPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class carForSaleDoorComponentTest extends KbbBaseTest{
    @Test(testName ="Verify Car models for sale whose transmission is automatic should be displayed when user choose filter with transmission type as user's intention",dataProviderClass= DataDriven.class,dataProvider ="TestCase23")
    public void verifyCarTranmissionAutomaticDisplayed (String fourdoor) throws InterruptedException
    { 
        carForSaleDoorComponentPage carComponentPage = new carForSaleDoorComponentPage(driver);
        carComponentPage.clickTranmisson();
        carComponentPage.clickAutomatic();
        Assert.assertTrue(carComponentPage.checkButtonAutomatic());
        Assert.assertTrue(carComponentPage.checkChipComponent());
    }
    
}
