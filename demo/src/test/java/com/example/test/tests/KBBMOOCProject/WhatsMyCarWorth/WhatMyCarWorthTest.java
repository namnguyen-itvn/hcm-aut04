package com.example.test.tests.KBBMOOCProject.WhatsMyCarWorth;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.phpAccount;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.CategoryandStylePage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.OptionPage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.WhatMyCarWorthPage;

public class WhatMyCarWorthTest extends KbbBaseTest {
    @Test(testName = "Send Infor in What My Car Worth Page", dataProviderClass = phpAccount.class, dataProvider = "dataAddToCard",priority = 1)
    public void sendInforinWhatMyCarWorthPage(String vin,String email,String mileage ,String zipcode,String mileagee) throws InterruptedException{
        WhatMyCarWorthPage whatMyCarWorthPage = new WhatMyCarWorthPage(driver);
        whatMyCarWorthPage.sendVinTradeInandPrivatePartyValues(vin);
        whatMyCarWorthPage.sendEmailTradeInandPrivatePartyValues(email);
        whatMyCarWorthPage.clickOnGobutton();
    }
    @Test(testName = "Send Infor Category and Style Page",dataProviderClass = phpAccount.class,dataProvider = "dataAddToCard",priority = 2)
    public void sendInforCategoryandStylePage(String vin,String email,String mileage ,String zipcode,String mileagee) throws InterruptedException{
        CategoryandStylePage categoryandStylePage = new CategoryandStylePage(driver);
        categoryandStylePage.clickOnDropListTransmission();
        categoryandStylePage.selectOnAutomatic();
        categoryandStylePage.sendInforMileage(mileage);
        categoryandStylePage.sendInforZIP(zipcode);
        categoryandStylePage.clickOnNextbutton();

    }
    @Test(testName = "Verify Edit Icon when user click on it, Should be edit Mileage successful",dataProviderClass = phpAccount.class,dataProvider = "dataAddToCard",priority = 3)
    public void verifyEditIconwhenuserclickonitShouldbeeditMileagesuccessful(String vin,String email,String mileage ,String zipcode,String mileagee) throws InterruptedException{
        OptionPage optionPage = new OptionPage(driver);
        optionPage.clickOnIconEditMileage();
        optionPage.sendInforchangeMileage(mileagee);
        optionPage.clickOnSavebutton();
        Assert.assertTrue(optionPage.compareResultAfterUserChangeMileagesuccessful());
    
    }
    
}
