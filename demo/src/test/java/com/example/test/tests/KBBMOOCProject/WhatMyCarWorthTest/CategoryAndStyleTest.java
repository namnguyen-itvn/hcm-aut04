package com.example.test.tests.KBBMOOCProject.WhatMyCarWorthTest;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.example.test.core.datadriven.dataJson;
import com.example.test.pages.KBBMOOCProject.WhatMyCarWorthPage.CategoryAndStylePage;
import com.example.test.pages.KBBMOOCProject.WhatMyCarWorthPage.MyCarValuePage;
import com.example.test.pages.KBBMOOCProject.WhatMyCarWorthPage.OptionPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CategoryAndStyleTest extends KbbBaseTest {
    @Test(testName = "Verify Option Page is displayed after choosing items from section Category and section Style", dataProviderClass = dataJson.class, dataProvider = "dataCategoryAndStyle")
    public void verifyOptionPageIsDisplayedAfterChoosingItemsFromSectionCategoryAndSectionStyle(String plate,
            String mileage, String zip, String optionPageTitleTest1, String categoryandstylenameinoption,
            String optionPageTitleTest2)
            throws InterruptedException {
        MyCarValuePage myCarValuePage = new MyCarValuePage(driver);
        myCarValuePage.clickOnMakeModelCheckBoxInMyCarValuePage();
        myCarValuePage.clickOnYearDropDownInMyCarValuePage();
        myCarValuePage.clickToChooseaYearInYearDropDownInMyCarValuePage();
        myCarValuePage.clickOnMakeDropDownInMyCarValuePage();
        myCarValuePage.clickToChooseaMakeInMakeDropDownInMyCarValuePage();
        myCarValuePage.clickOnModelDropDownInMyCarValuePage();
        myCarValuePage.clickToChooseaModelInModelDropDownInMyCarValuePage();
        myCarValuePage.sendKeysToMileageTextBoxInMyCarValuePage(mileage);
        myCarValuePage.sendKeysToZipTextBoxInMyCarValuePage(zip);
        myCarValuePage.clickOnGoButtonInMyCarValuePage();
        CategoryAndStylePage categoryAndStylePage = new CategoryAndStylePage(driver);
        categoryAndStylePage.clickOnCoupeOptionInCategorySectionInCategoryAndStylePage();
        categoryAndStylePage.clickToChooseAstyleInStyleSectionInCategoryAndStylePage();
        categoryAndStylePage.clickOnNextButtonInCategoryAndStylePage();
        OptionPage optionPage = new OptionPage(driver);
        Assert.assertTrue(optionPage.optionPageTitle.equals(optionPageTitleTest1),
                "The actual title are not match with expected");
        Assert.assertTrue(optionPage.categoryAndStyleName.equals(categoryandstylenameinoption),
                "The actual category and style are not match with expected");
    }
}
