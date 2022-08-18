package com.example.test.tests.KBBMOOCProject.MyCarsValueTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.MyCarsValueDataProvider;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.CategoryStylePage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.InputMileageandZipComponent;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OfferOptionPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OptionPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.SelectColorCarComponent;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.SelectKeyandVehicleComponent;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.WhatMyCarWorthPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;


public class OptionPageTest  extends KbbBaseTest{
    
    @Test(testName = "Verify Offer Option Page should be displayed after user selected No of the Item  Has Your Vehicle Had Any Modifications?",dataProviderClass =MyCarsValueDataProvider.class, dataProvider = "MileageandZip")
    public void verifyOfferOptionPageshouldbedisplayedafteruserselectedNooftheItemHasYourVehicleHadAnyModifications(String Mileage,String Zipcode, String VIN, String Email,String Category) throws InterruptedException{
        
        WhatMyCarWorthPage whatMyCarWorthPage=new WhatMyCarWorthPage(driver);
        whatMyCarWorthPage.actionInputVINandEmail(VIN,Email);

        CategoryStylePage categoryStylePage=new CategoryStylePage(driver);
        categoryStylePage.actionSelectCategory(Category);

        InputMileageandZipComponent inputMileageandZipPage=new InputMileageandZipComponent(driver);
        inputMileageandZipPage.actioninputMileageandZipcode(Mileage,Zipcode);

        OptionPage optionPage=new OptionPage(driver);
        optionPage.actionClickSlectYourOption();

       SelectColorCarComponent selectYourOptionPage=new SelectColorCarComponent(driver);
       selectYourOptionPage.actionClickRedButton();

       SelectKeyandVehicleComponent selectKeyandVehicleComponentPage=new SelectKeyandVehicleComponent(driver);
       selectKeyandVehicleComponentPage.actionselectKey();

       OfferOptionPage offerOptionPage=new OfferOptionPage(driver);
       Assert.assertTrue(offerOptionPage.getOfferOptionPageTitle());
       Assert.assertTrue(offerOptionPage.isTextBreadCrumd());
       
    }


   



}
