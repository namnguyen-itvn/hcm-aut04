package com.example.test.tests.KBBMOOCProject.WhatsMyCarWorth;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.dataforOptionPageTest;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.CategoryandStylePage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.ConditionPage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.DoYouHave2orMoreKeysorKeylessRemotesComponent;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.HasYourVehicleHadAnyModificationsComponent;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.OptionPage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.PopupCalculatingYourBlueBookValuePage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.WhatEquipmentIsonYourVehicleComponent;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.WhatMyCarWorthPage;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth.WhatsYourMileageandZIPCodeComponent;
public class OptionPageTest extends KbbBaseTest {
    @Test(testName = "Select Option in What Equipment Is on Your Vehicle? ",dataProviderClass = dataforOptionPageTest.class,dataProvider = "dataOptionPageTest",priority = 1)
    public void selectOptioninWhatEquipmentIsonYourVehicle(String vin,String email,String mileage,String zipcode) {
        WhatMyCarWorthPage  whatMyCarWorthPage = new WhatMyCarWorthPage(driver);
        whatMyCarWorthPage.sendVinTradeInandPrivatePartyValues(vin);
        whatMyCarWorthPage.sendEmailTradeInandPrivatePartyValues(email);
        whatMyCarWorthPage.clickOnGobutton();
        CategoryandStylePage categoryandStylePage = new CategoryandStylePage(driver);
        categoryandStylePage.clickOnDropListTransmission();
        categoryandStylePage.selectOnManual();
        WhatsYourMileageandZIPCodeComponent whatsYourMileageandZIPCodeComponent = new WhatsYourMileageandZIPCodeComponent(driver);
        whatsYourMileageandZIPCodeComponent.sendInforZIP(zipcode);
        whatsYourMileageandZIPCodeComponent.sendInforMileage(mileage);
        whatsYourMileageandZIPCodeComponent.clickOnNextbutton();
        OptionPage optionPage = new OptionPage(driver);
        optionPage.clickOnSelectYourOptionscheckbox();
        WhatEquipmentIsonYourVehicleComponent whatEquipmentIsonYourVehicleComponent = new WhatEquipmentIsonYourVehicleComponent(driver);
        whatEquipmentIsonYourVehicleComponent.clickOnBlackbutton();
        DoYouHave2orMoreKeysorKeylessRemotesComponent doYouHave2orMoreKeysorKeylessRemotesComponent = new DoYouHave2orMoreKeysorKeylessRemotesComponent(driver);
        doYouHave2orMoreKeysorKeylessRemotesComponent.clickOnDoYouHave2orMoreKeysorKeylessRemotescheckbox();
        HasYourVehicleHadAnyModificationsComponent hasYourVehicleHadAnyModificationsComponent = new HasYourVehicleHadAnyModificationsComponent(driver);
        hasYourVehicleHadAnyModificationsComponent.clickOnHasYourVehicleHadAnyModifications();
        hasYourVehicleHadAnyModificationsComponent.clickNextbutton();
    }
    @Test(testName = "Verify Popup 'Calculating Your Blue Book® Value.' should be shown and navigate to Detail Vehicle Value when user click on 'Select Your Options' then 'Vehicle’s Condition' click on available",dataProviderClass = dataforOptionPageTest.class, dataProvider = "dataOptionPageTest",priority = 2)
    public void verifyPopupCalculatingYourBlueBookValueshouldbeshownandnavigatetoDetailVehicleValue(String vin,String email,String mileage,String zipcode) {
        ConditionPage conditionPage = new ConditionPage(driver);
        conditionPage.clickOnItemFair();
        conditionPage.clickOnNextbutton();
        PopupCalculatingYourBlueBookValuePage popupCalculatingYourBlueBookValuePage = new PopupCalculatingYourBlueBookValuePage(driver);
        Assert.assertTrue(popupCalculatingYourBlueBookValuePage.checktitlePopupWhenUserClickOnFairbutton());
    }
}
