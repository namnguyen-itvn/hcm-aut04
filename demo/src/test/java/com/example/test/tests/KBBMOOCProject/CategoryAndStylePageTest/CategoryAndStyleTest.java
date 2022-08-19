package com.example.test.tests.KBBMOOCProject.CategoryAndStylePageTest;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.example.test.core.datadriven.dataJsonforStyleAndCategoryPage;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage.CategoryAndStylePage;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage.GoButtonComponent;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage.MyCarValuePage;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage.NextButtonComponent;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage.OptionPage;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage.PlateAndStateComponentt;

public class CategoryAndStyleTest extends KbbBaseTest {
        @Test(testName = "Verify Options Page is displayed after choosing an item in Style menu", dataProviderClass = dataJsonforStyleAndCategoryPage.class, dataProvider = "dataCategoryAndStyle")
        public void verifyOptionsPageIsDisplayedAfterChoosingAnItemInStyleMenu(String plate, String mileage, String zip,
                        String optionPageTitleTest1, String categoryandstylenameinoption)
                        throws InterruptedException {
                MyCarValuePage myCarValuePage = new MyCarValuePage(driver);
                myCarValuePage.clickOnLicensePlateCheckBoxInMyCarValuePage();
                PlateAndStateComponentt plateAndStateComponentt = new PlateAndStateComponentt(driver);
                plateAndStateComponentt.sendKeysToPlateTextBoxInMyCarValuePage(plate);
                plateAndStateComponentt.clickOnStateDropDownInMyCarValuePage();
                plateAndStateComponentt.clickToChooseStateInStateDropDownInMyCarValuePage();
                GoButtonComponent goButtonComponent = new GoButtonComponent(driver);
                goButtonComponent.clickOnGoButtonInMyCarValuePage();
                CategoryAndStylePage categoryAndStylePage = new CategoryAndStylePage(driver);
                categoryAndStylePage.clickOnStyleDropdownInCategoryAndStylePage();
                categoryAndStylePage.clickToChooseaStyleinStyleDropdownInCategoryAndStylePage();
                categoryAndStylePage.sendKeysToMileageTextBoxInCategoryAndStylePage(mileage);
                categoryAndStylePage.sendKeysToZipTextBoxInCategoryAndStylePage(zip);
                NextButtonComponent nextButton = new NextButtonComponent(driver);
                nextButton.clickOnNextButtonInCategoryAndStylePage();
                OptionPage optionPage = new OptionPage(driver);
                Assert.assertTrue(optionPage.compareOptionPageTitleToTitleInFileDatas(optionPageTitleTest1));
                Assert.assertTrue(optionPage.compareCarStyleAndCategoryNameIsSimilarToStyleAnCarDataInFileDatas(
                                categoryandstylenameinoption));
        }
}