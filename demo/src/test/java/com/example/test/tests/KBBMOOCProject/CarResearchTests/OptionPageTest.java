package com.example.test.tests.KBBMOOCProject.CarResearchTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.MileageandZipcode;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.CategoryStylePage;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.InputMileageandZipComponentPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.OfferOptionPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.OptionPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.SelectColorCarComponentPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.SelectKeyandVehicleComponentPage;
import com.example.test.pages.KBBMOOCProject.CarResearchPage.WhatMyCarWorthPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;


public class OptionPageTest  extends KbbBaseTest{
    
    @Test(testName = "Verify Offer Option Page should be displayed after user selected No of the Item  Has Your Vehicle Had Any Modifications?",dataProviderClass =MileageandZipcode.class, dataProvider = "MileageandZip")
    public void verifyOfferOptionPageshouldbedisplayedafteruserselectedNooftheItemHasYourVehicleHadAnyModifications(String Mileage,String Zipcode, String VIN, String Email,String Category) throws InterruptedException{
        
        WhatMyCarWorthPage whatMyCarWorthPage=new WhatMyCarWorthPage(driver);
        whatMyCarWorthPage.actionInputVINandEmail(VIN,Email);
       // whatMyCarWorthPage.actionInputEmail(Email);

        CategoryStylePage categoryStylePage=new CategoryStylePage(driver);
        categoryStylePage.actionSelectCategory(Category);

        InputMileageandZipComponentPage inputMileageandZipPage=new InputMileageandZipComponentPage(driver);
        inputMileageandZipPage.actioninputMileageandZipcode(Mileage,Zipcode);

        OptionPage optionPage=new OptionPage(driver);
        optionPage.actionClickSlectYourOption();

       SelectColorCarComponentPage selectYourOptionPage=new SelectColorCarComponentPage(driver);
       selectYourOptionPage.actionClickRedButton();

       SelectKeyandVehicleComponentPage selectKeyandVehicleComponentPage=new SelectKeyandVehicleComponentPage(driver);
       selectKeyandVehicleComponentPage.actionselectKey();

       OfferOptionPage offerOptionPage=new OfferOptionPage(driver);
       Assert.assertTrue(offerOptionPage.getOfferOptionPageTitle());
       Assert.assertTrue(offerOptionPage.isTextBreadCrumd());
       
    }


   



}
