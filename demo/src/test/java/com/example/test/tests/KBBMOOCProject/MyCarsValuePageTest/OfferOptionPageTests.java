package com.example.test.tests.KBBMOOCProject.MyCarsValuePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.TestDataProvider;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.CategoryAndStylePage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.KeyQuestionComponentInOptionsPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.ModificationQuestionComponentInOptionsPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OfferOptionsPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OptionsExtendPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.OptionsPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.WhatsMyCarWorthMakeModelOptionPage;
import com.example.test.pages.KBBMOOCProject.MyCarsValuePage.WhatsMyCarWorthPage;
import com.example.test.tests.KBBBaseTest;


public class OfferOptionPageTests extends KBBBaseTest{
    @Test(testName = "Verify the Year/Make/Model/Style are displayed correctly as user selected", dataProviderClass = TestDataProvider.class, dataProvider = "OfferOptions")
    public void verifyTheYearMakeModelStyleAreDisplayedCorrectlyAsUserSelected(String mileage, String zip, String email, String yearMakeModelStyle, String year, String make, String model){
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
        optionsExtendPage.clickOnNextButton();
        // KeyQuestionComponentInOptionsPage keyQuestionComponentInOptionsPage = new KeyQuestionComponentInOptionsPage(driver);
        // keyQuestionComponentInOptionsPage.clickYesOptionInKeyQuestion();
        // ModificationQuestionComponentInOptionsPage modificationQuestionComponentInOptionsPage = new ModificationQuestionComponentInOptionsPage(driver);
        // modificationQuestionComponentInOptionsPage.clickNoOptionInModificationsQuestion();
        // modificationQuestionComponentInOptionsPage.clickOnNextButton();
        OfferOptionsPage offerOptionsPage = new OfferOptionsPage(driver);
        Assert.assertTrue(offerOptionsPage.compareValueOfVehiclesAsUserSelected(yearMakeModelStyle));
    }
}
