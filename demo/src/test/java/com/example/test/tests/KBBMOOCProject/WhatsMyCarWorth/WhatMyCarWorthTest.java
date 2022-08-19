package com.example.test.tests.KBBMOOCProject.WhatsMyCarWorth;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.dataforWhatMyCarWorthTest;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.CategoryandStylePage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.EditMileageComponent;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.OptionPage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.OptionPagechangeMileage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.WhatMyCarWorthPage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.WhatsYourMileageandZIPCodeComponent;

public class WhatMyCarWorthTest extends KbbBaseTest {
    @Test(testName = "Send Infor in What My Car Worth Page", dataProviderClass = dataforWhatMyCarWorthTest.class, dataProvider = "dataWhatMyCarWorthTest",priority = 1)
    public void sendInforinWhatMyCarWorthPage(String vin,String email,String mileage ,String zipcode,String mileagee) {
        WhatMyCarWorthPage whatMyCarWorthPage = new WhatMyCarWorthPage(driver);
        whatMyCarWorthPage.sendVinTradeInandPrivatePartyValues(vin);
        whatMyCarWorthPage.sendEmailTradeInandPrivatePartyValues(email);
        whatMyCarWorthPage.clickOnGobutton();
        CategoryandStylePage categoryandStylePage = new CategoryandStylePage(driver);
        categoryandStylePage.clickOnDropListTransmission();
        categoryandStylePage.selectOnAutomatic();
        WhatsYourMileageandZIPCodeComponent whatsYourMileageandZIPCodeComponent = new WhatsYourMileageandZIPCodeComponent(driver);
        whatsYourMileageandZIPCodeComponent.sendInforZIP(zipcode);
        whatsYourMileageandZIPCodeComponent.sendInforMileage(mileage);
        whatsYourMileageandZIPCodeComponent.clickOnNextbutton();
    }
    @Test(testName = "Verify Edit Icon when user click on it, Should be edit Mileage successful",dataProviderClass = dataforWhatMyCarWorthTest.class,dataProvider = "dataWhatMyCarWorthTest",priority = 3)
    public void verifyEditIconwhenuserclickonitShouldbeeditMileagesuccessful(String vin,String email,String mileage ,String zipcode,String mileagee) {
        OptionPage optionPage = new OptionPage(driver);
        optionPage.clickOnIconEditMileage();
        EditMileageComponent editMileageComponent = new EditMileageComponent(driver);
        editMileageComponent.deleteMileage();
        editMileageComponent.sendInforchangeMileage(mileagee);
        editMileageComponent.clickOnSavebutton();
        OptionPagechangeMileage optionPagechangeMileage = new OptionPagechangeMileage(driver);
        Assert.assertTrue(optionPagechangeMileage.compareResultAfterUserChangeMileagesuccessful());
    }
    
}
