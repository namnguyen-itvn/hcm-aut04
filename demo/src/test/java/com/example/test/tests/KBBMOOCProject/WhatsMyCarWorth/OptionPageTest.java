package com.example.test.tests.KBBMOOCProject.WhatsMyCarWorth;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.phpAccount;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.CategoryandStylePage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.ConditionPage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.OptionPage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.WhatMyCarWorthPage;

public class OptionPageTest extends KbbBaseTest {
    @Test(testName = "Select Option in What Equipment Is on Your Vehicle? ",dataProviderClass = phpAccount.class,dataProvider = "dataAddCard",priority = 1)
    public void selectOptioninWhatEquipmentIsonYourVehicle(String vin,String email,String mileage,String zipcode) throws InterruptedException{
        WhatMyCarWorthPage  whatMyCarWorthPage = new WhatMyCarWorthPage(driver);
        whatMyCarWorthPage.sendVinTradeInandPrivatePartyValues(vin);
        whatMyCarWorthPage.sendEmailTradeInandPrivatePartyValues(email);
        whatMyCarWorthPage.clickOnGobutton();
        CategoryandStylePage categoryandStylePage = new CategoryandStylePage(driver);
        categoryandStylePage.clickOnDropListTransmission();
        categoryandStylePage.selectOnAutomatic();
        categoryandStylePage.sendInforMileage(mileage);
        categoryandStylePage.sendInforZIP(zipcode);
        categoryandStylePage.clickOnNextbutton();
        OptionPage optionPage = new OptionPage(driver);
        optionPage.clickOnSelectYourOptionscheckbox();
        optionPage.clickOnBlackbutton();
        optionPage.clickOnDoYouHave2orMoreKeysorKeylessRemotescheckbox();
        optionPage.clickOnHasYourVehicleHadAnyModifications();
        optionPage.clickNextbutton();
    }
    @Test(testName = "Verify Popup 'Calculating Your Blue Book® Value.' should be shown and navigate to Detail Vehicle Value when user click on 'Select Your Options' then 'Vehicle’s Condition' click on available",dataProviderClass = phpAccount.class,dataProvider = "dataAddCard",priority = 2)
    public void verifyPopupCalculatingYourBlueBookValueshouldbeshownandnavigatetoDetailVehicleValue(String vin,String email,String mileage,String zipcode) throws InterruptedException{
        ConditionPage conditionPage = new ConditionPage(driver);
        conditionPage.clickOnItemFair();
        conditionPage.clickOnNextbutton();
    }
}
