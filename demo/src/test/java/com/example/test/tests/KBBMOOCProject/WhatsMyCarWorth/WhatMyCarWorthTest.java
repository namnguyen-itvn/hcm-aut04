package com.example.test.tests.KBBMOOCProject.WhatsMyCarWorth;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.DataKbb;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.CategoryAndStylePage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.DetailVehicleValuePage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.OptionPage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.WhatMyCarWorthPage;

public class WhatMyCarWorthTest extends KbbBaseTest {

    @Test(testName = "Verify the VIN Code is displayed Correctly as the user entered", dataProviderClass = DataKbb.class, dataProvider = "dataAddToCard",priority = 1)
    public void VerifyTheVINCodeIsDisplayedCorrectlyAsTheUserEntered(String vin,String email,String mileage ,String zipcode,String editmileage,String changeMileage) throws InterruptedException{
        WhatMyCarWorthPage whatMyCarWorthPage = new WhatMyCarWorthPage(driver);
        whatMyCarWorthPage.actionGoToCategoryStylePage(vin,email);

        CategoryAndStylePage categoryandStylePage = new CategoryAndStylePage(driver);
        categoryandStylePage.actionSelectOnAutomatic();
        categoryandStylePage.actionEnterValueTextboxMileage(mileage);
        categoryandStylePage.actionEnterValueTextboxZIPCode(zipcode);
        categoryandStylePage.actionClickOnNextbutton();

        OptionPage optionPage = new OptionPage(driver);
        optionPage.actionClickOnSelectYourOptions();
        optionPage.actionClickOnButtonRed();
        optionPage.actionClickOnTwoSelectYes();
        optionPage.actionClickOnButtonNext();

        DetailVehicleValuePage detailVehicleValuePage = new DetailVehicleValuePage(driver);
        
        Assert.assertTrue(detailVehicleValuePage.actionCompareValueVinINVehicleValueDetailWithValueVINEnteredVinValue(vin));

    }  


    @Test(testName = "Verify Mileage value Change successful when user edit Mileage value", dataProviderClass = DataKbb.class, dataProvider = "dataAddToCard",priority = 1)
    public void VerifyMileageValueChangeSuccessfulWhenUserEditMileageValue(String vin,String email,String mileage ,String zipcode,String editmileage) throws InterruptedException{  
        WhatMyCarWorthPage whatMyCarWorthPage = new WhatMyCarWorthPage(driver);
        whatMyCarWorthPage.actionGoToCategoryStylePage(vin,email);

        CategoryAndStylePage categoryandStylePage = new CategoryAndStylePage(driver);
        categoryandStylePage.actionSelectOnAutomatic();
        categoryandStylePage.actionEnterValueTextboxMileage(mileage);
        categoryandStylePage.actionEnterValueTextboxZIPCode(zipcode);
        categoryandStylePage.actionClickOnNextbutton();

        OptionPage optionPage = new OptionPage(driver);
        optionPage.actionClickOnSelectYourOptions();
        optionPage.actionClickOnButtonRed();
        optionPage.actionClickOnTwoSelectYes();
        optionPage.actionClickOnButtonNext();

        DetailVehicleValuePage detailVehicleValuePage = new DetailVehicleValuePage(driver);
        detailVehicleValuePage.actionClickOnIconEditMileage();
        detailVehicleValuePage.actionDeleteValueMileage();
        detailVehicleValuePage.actionEditValueMileage(editmileage);
        detailVehicleValuePage.actionClickOnSavebutton();

        //
        Assert.assertTrue(detailVehicleValuePage.actionCompareResultAfterUserEditValueMileagesuccessful(editmileage));
    }

    
    
    
}
