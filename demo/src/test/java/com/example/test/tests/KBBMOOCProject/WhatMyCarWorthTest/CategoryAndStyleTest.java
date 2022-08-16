package com.example.test.tests.KBBMOOCProject.WhatMyCarWorthTest;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.example.test.core.datadriven.dataJson;
import com.example.test.pages.KBBMOOCProject.WhatMyCarWorthPage.CategoryAndStylePage;
import com.example.test.pages.KBBMOOCProject.WhatMyCarWorthPage.MyCarValuePage;
import com.example.test.pages.KBBMOOCProject.WhatMyCarWorthPage.OptionPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CategoryAndStyleTest extends KbbBaseTest {
        @Test(testName = "Verify Options Page is displayed after choosing an item in Style menu", dataProviderClass = dataJson.class, dataProvider = "dataCategoryAndStyle")
        public void verifyOptionsPageIsDisplayedAfterChoosingAnItemInStyleMenu(String plate, String mileage, String zip,
                        String optionPageTitleTest1, String categoryandstylenameinoption,String categoryandstylenameinoption2, String optionPageTitleTest2)
                        throws InterruptedException {
                MyCarValuePage myCarValuePage = new MyCarValuePage(driver);
                myCarValuePage.clickOnLicensePlateCheckBoxInMyCarValuePage();
                myCarValuePage.sendKeysToPlateTextBoxInMyCarValuePage(plate);
                myCarValuePage.clickOnStateDropDownInMyCarValuePage();
                myCarValuePage.clickToChooseStateInStateDropDownInMyCarValuePage();
                myCarValuePage.clickOnGoButtonInMyCarValuePage();
                CategoryAndStylePage categoryAndStylePage = new CategoryAndStylePage(driver);
                categoryAndStylePage.clickOnStyleDropdownInCategoryAndStylePage();
                categoryAndStylePage.clickToChooseaStyleinStyleDropdownInCategoryAndStylePage();
                categoryAndStylePage.sendKeysToMileageTextBoxInCategoryAndStylePage(mileage);
                categoryAndStylePage.sendKeysToZipTextBoxInCategoryAndStylePage(zip);
                categoryAndStylePage.clickOnNextButtonInCategoryAndStylePage();
                OptionPage optionPage = new OptionPage(driver);
                Assert.assertTrue(optionPage.optionPageTitle.equals(optionPageTitleTest2),
                                "The actual title are not match with expected");
                Assert.assertTrue(optionPage.categoryAndStyleName.equals(categoryandstylenameinoption2),
                                "The actual title are not match with expected");
        }
}
