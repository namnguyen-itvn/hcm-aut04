package com.test.tests.MyCarsValuePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.core.datadriven.TestDataProvider;
import com.test.pages.MyCarsValuePage.CategoryAndStylePage;
import com.test.pages.MyCarsValuePage.OfferOptionsPage;
import com.test.pages.MyCarsValuePage.OptionsExtendPage;
import com.test.pages.MyCarsValuePage.OptionsPage;
import com.test.pages.MyCarsValuePage.WhatsMyCarWorthMakeModelOptionPage;
import com.test.pages.MyCarsValuePage.WhatsMyCarWorthPage;
import com.test.tests.KBBBaseTest;


public class OfferOptionPageTests extends KBBBaseTest{
    @Test(testName = "Verify the Year/Make/Model/Style are displayed correctly as user selected", dataProviderClass = TestDataProvider.class, dataProvider = "OfferOptions")
    public void verifyTheYearMakeModelStyleAreDisplayedCorrectlyAsUserSelected(String mileage, String zip, String email, String yearMakeModelStyle, String year, String make, String model) throws InterruptedException {
        WhatsMyCarWorthPage whatsMyCarWorthPage = new WhatsMyCarWorthPage(driver);
        whatsMyCarWorthPage.clickOnMakeModelCheckbox();
        WhatsMyCarWorthMakeModelOptionPage whatsMyCarWorthMakeModelOptionPage = new WhatsMyCarWorthMakeModelOptionPage(driver);
        whatsMyCarWorthMakeModelOptionPage.selectYear(year);
        whatsMyCarWorthMakeModelOptionPage.selectMake(make);
        whatsMyCarWorthMakeModelOptionPage.selectModel(model);
        whatsMyCarWorthMakeModelOptionPage.sendKeysToTextboxes(mileage, zip, email);
        whatsMyCarWorthMakeModelOptionPage.clickOnMakeModelGoButton();
        CategoryAndStylePage categoryAndStylePage = new CategoryAndStylePage(driver);
        categoryAndStylePage.clickToSelectStyle();
        categoryAndStylePage.clickOnMakeModelNextButton();
        OptionsPage optionsPage = new OptionsPage(driver);
        optionsPage.clickOnSelectYourOptionsOption();
        OptionsExtendPage optionsExtendPage = new OptionsExtendPage(driver);
        optionsExtendPage.clickOnRedColor();
        // optionsPage.clickYesOptionInKeyQuestion();
        // optionsPage.clickNoOptionInModificationsQuestion();
        optionsExtendPage.clickOnNextButton();
        OfferOptionsPage offerOptionsPage = new OfferOptionsPage(driver);
        Assert.assertTrue(offerOptionsPage.compareValueOfVehiclesAsUserSelected(yearMakeModelStyle));
    }
}
