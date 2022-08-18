package com.example.test.tests.KBBMOOCProject.CategoryAndStylePageTest2;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.example.test.core.datadriven.dataJsonforStyleAndCategoryPage2;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2.ButtonGoComponent;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2.CategoryAndStylePage;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2.ChooseaStyleComponent;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2.MakeComponent;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2.MileageAndZipComponent;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2.ModelComponent;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2.MyCarValuePage;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2.NextButtonComponent;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2.OptionPage;
import com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2.YearComponent;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CategoryAndStyleTest extends KbbBaseTest {
    @Test(testName = "Verify Option Page is displayed after choosing items from section Category and section Style", dataProviderClass = dataJsonforStyleAndCategoryPage2.class, dataProvider = "dataCategoryAndStyle")
    public void verifyOptionPageIsDisplayedAfterChoosingItemsFromSectionCategoryAndSectionStyle(String plate,
            String mileage, String zip, String optionPageTitleTest, String categoryandstylenameinoption)
            throws InterruptedException {
        MyCarValuePage myCarValuePage = new MyCarValuePage(driver);
        myCarValuePage.clickOnMakeModelCheckBoxInMyCarValuePage();
        YearComponent yearComponent=new YearComponent(driver);
        yearComponent.clickOnYearDropDownInMyCarValuePage();
        yearComponent.clickToChooseaYearInYearDropDownInMyCarValuePage();
        MakeComponent makeComponent = new MakeComponent(driver);
        makeComponent.clickOnMakeDropDownInMyCarValuePage();
        makeComponent.clickToChooseaMakeInMakeDropDownInMyCarValuePage();
        ModelComponent modelComponent = new ModelComponent(driver);
        modelComponent.clickOnModelDropDownInMyCarValuePage();
        modelComponent.clickToChooseaModelInModelDropDownInMyCarValuePage();
        MileageAndZipComponent mileageAndZipComponent = new MileageAndZipComponent(driver);
        mileageAndZipComponent.sendKeysToMileageTextBoxInMyCarValuePage(mileage);
        mileageAndZipComponent.sendKeysToZipTextBoxInMyCarValuePage(zip);
        ButtonGoComponent buttonGoComponent = new ButtonGoComponent(driver);
        buttonGoComponent.clickOnGoButtonInMyCarValuePage();
        CategoryAndStylePage categoryAndStylePage = new CategoryAndStylePage(driver);
        categoryAndStylePage.clickOnCoupeOptionInCategorySectionInCategoryAndStylePage();
        ChooseaStyleComponent chooseaStyleComponent = new ChooseaStyleComponent(driver);
        chooseaStyleComponent.clickToChooseAstyleInStyleSectionInCategoryAndStylePage();
        NextButtonComponent nextButtonComponent = new NextButtonComponent(driver);
        nextButtonComponent.clickOnNextButtonInCategoryAndStylePage();
        OptionPage optionPage = new OptionPage(driver);
        Assert.assertTrue(optionPage.compareOptionPageTitleToTitleInFileDatas(optionPageTitleTest));
        Assert.assertTrue(optionPage.compareCarStyleAndCategoryNameIsSimilarToStyleAnCarDataInFileDatas(categoryandstylenameinoption));
    }
}
