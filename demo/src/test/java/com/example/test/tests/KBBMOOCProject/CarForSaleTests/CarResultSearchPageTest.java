package com.example.test.tests.KBBMOOCProject.CarForSaleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.DataDriven;
import com.example.test.pages.KBBMOOCProject.CarResultSearchPage;
import com.example.test.pages.KBBMOOCProject.carForSaleDoorComponentPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CarResultSearchPageTest extends KbbBaseTest{
    @Test(testName ="Verify the error message 'Enter a valid ZIP code' is displayed when an incorrect area code is entered",dataProviderClass= DataDriven.class,dataProvider ="ZipCode")
    public void verifyCarModelsForSaleWhichHave4DoorsShouldBeDisplayedWhenUserChooseFilterWithDoorTypeAsUsersIntention (String zip,String title) throws InterruptedException
    { 
        carForSaleDoorComponentPage carComponentPage = new carForSaleDoorComponentPage(driver);
        carComponentPage.inputZipCode(zip);
        CarResultSearchPage carResultSearchPage = new CarResultSearchPage(driver);
        Assert.assertTrue(carResultSearchPage.checkTitleComponent(title));
        Assert.assertTrue(carResultSearchPage.checkLocationZIp(zip));
    }
}
