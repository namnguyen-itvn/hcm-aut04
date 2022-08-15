package com.example.test.tests.KBBMOOCProject.MyCarsValueTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.TestDataProvider;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.CategoryAndStylePage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OfferOptionsPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OptionsPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.WhatsMyCarWorthPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;


public class OfferOptionPageTests extends KbbBaseTest{

    @Test(testName = "Verify that 'Get a Cash Offer for Your Specific Vehicle' checkbox can be check and uncheck but 'Get Your Trade-In & Private Party Values' can not uncheck", dataProviderClass = TestDataProvider.class, dataProvider = "WhatsMyCarWorth")
    public void verifyThatGetACashOfferForYourSpecificVehicleCheckboxCanBeCheckAndUncheckButGetYourTradeInPrivatePartyValuesCanNotUncheck(String vin, String email, String mileage, String zip) throws InterruptedException {
        WhatsMyCarWorthPage whatsMyCarWorthPage = new WhatsMyCarWorthPage(driver);
        whatsMyCarWorthPage.sendKeysToVINTextbox(vin);
        whatsMyCarWorthPage.sendKeysToEmailTextbox(email);
        whatsMyCarWorthPage.clickOnVINGoButton();
        CategoryAndStylePage categoryAndStylePage = new CategoryAndStylePage(driver);
        categoryAndStylePage.clickOnSelectboxAndClickOnAutomatic();
        categoryAndStylePage.sendKeysToMileageTextbox(mileage);
        categoryAndStylePage.sendKeysToZIPTextbox(zip);
        categoryAndStylePage.clickOnNextButton();
        OptionsPage optionsPage = new OptionsPage(driver);
        optionsPage.clickOnSelectYourOptions();
        optionsPage.clickOnRedColor();
        optionsPage.clickYesOptionInKeyQuestion();
        optionsPage.clickNoOptionInModificationsQuestion();
        optionsPage.clickOnNextButton();
        OfferOptionsPage offerOptionsPage = new OfferOptionsPage(driver);
        Assert.assertTrue(offerOptionsPage.optionGetTradeCannotUnCheck());
    }
    @Test(testName = "Verify the Year/Make/Model/Style are displayed correctly as user selected", dataProviderClass = TestDataProvider.class, dataProvider = "OfferOptions")
    public void verifyTheYearMakeModelStyleAreDisplayedCorrectlyAsUserSelected(String mileage, String zip, String email, String yearMakeModelStyle) throws InterruptedException {
        WhatsMyCarWorthPage whatsMyCarWorthPage = new WhatsMyCarWorthPage(driver);
        whatsMyCarWorthPage.clickOnMakeModelCheckbox();
        whatsMyCarWorthPage.selectYear();
        whatsMyCarWorthPage.selectMake();
        whatsMyCarWorthPage.selectModel();
        whatsMyCarWorthPage.sendKeysToTextboxes(mileage, zip, email);
        whatsMyCarWorthPage.clickOnMakeModelGoButton();
        CategoryAndStylePage categoryAndStylePage = new CategoryAndStylePage(driver);
        categoryAndStylePage.selectYourStyle();
        categoryAndStylePage.clickOnMakeModelNextButton();
        OptionsPage optionsPage = new OptionsPage(driver);
        optionsPage.clickOnSelectYourOptions();
        optionsPage.clickOnRedColor();
        optionsPage.clickYesOptionInKeyQuestion();
        optionsPage.clickNoOptionInModificationsQuestion();
        optionsPage.clickOnNextButton();
        OfferOptionsPage offerOptionsPage = new OfferOptionsPage(driver);
        Assert.assertTrue(offerOptionsPage.compareValueOfVehiclesAsUserSelected(yearMakeModelStyle));
    }
}
