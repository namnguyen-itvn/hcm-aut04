package com.test.tests.MyCarsValuePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.core.datadriven.TestDataProvider;
import com.test.pages.MyCarsValuePage.CategoryAndStylePage;
import com.test.pages.MyCarsValuePage.OfferOptionsPage;
import com.test.pages.MyCarsValuePage.OptionsPage;
import com.test.pages.MyCarsValuePage.WhatsMyCarWorthPage;
import com.test.tests.KBBBaseTest;


public class OfferOptionPageTests extends KBBBaseTest{
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
