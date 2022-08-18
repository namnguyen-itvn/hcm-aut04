package com.example.test.tests.KBBMOOCProject.MyCarsValueTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.MyCarsValueDataProvider;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.CategoryStylePage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OptionPageIconWarningComponent;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.InputMileageandZipComponent;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OptionPageOptionNoteComponent;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OptionPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OptionPageSelectInteriorComponent;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.WhatMyCarWorthPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class IconWarningOptionPageTest  extends KbbBaseTest{
    

    
    @Test(testName = "Verify displayed warning icon beside CD/MP3(Single Disc) checkbox after user click CD/MP3(Multi Disc) checkbox",dataProviderClass =MyCarsValueDataProvider.class, dataProvider = "MileageandZip")
    public void verifydisplayedwarningiconandmessagebesideCDMP3SingleDisccheckboxafteruserclickCDMP3MultiDisccheckbox (String Mileage,String Zipcode, String VIN, String Email,String Category) throws InterruptedException{
        
        WhatMyCarWorthPage whatMyCarWorthPage=new WhatMyCarWorthPage(driver);
        whatMyCarWorthPage.actionInputVINandEmail(VIN,Email);

        CategoryStylePage categoryStylePage=new CategoryStylePage(driver);
        categoryStylePage.actionSelectCategory(Category);


        InputMileageandZipComponent inputMileageandZipPage=new InputMileageandZipComponent(driver);
        inputMileageandZipPage.actioninputMileageandZipcode(Mileage,Zipcode);

        OptionPage optionPage=new OptionPage(driver);
        optionPage.actionClickSlectYourOption();

        OptionPageSelectInteriorComponent selectInteriorPage=new OptionPageSelectInteriorComponent(driver);
        selectInteriorPage.actionSelectInterior();
        selectInteriorPage.actionSelectCPMP3();
        Assert.assertTrue(selectInteriorPage.isselectCPMP3SingDisSelected());
       
     
        OptionPageIconWarningComponent iconWarningComponent=new OptionPageIconWarningComponent(driver);
        Assert.assertTrue(iconWarningComponent.isIconDisplay());
        iconWarningComponent.actionclickIconDisplay();

        OptionPageOptionNoteComponent optionNoteComponent=new OptionPageOptionNoteComponent(driver);
        Assert.assertTrue(optionNoteComponent.isdisplayOverlay());
        Assert.assertTrue(optionNoteComponent.isTextIconWarning());


    }

}
