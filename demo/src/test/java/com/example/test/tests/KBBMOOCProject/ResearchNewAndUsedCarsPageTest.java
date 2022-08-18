package com.example.test.tests.KBBMOOCProject;

import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

import java.time.Year;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.dataPageTest;
import com.example.test.pages.KBBMOOCProject.CarsResearchPage.zipCodeComponent;
import com.example.test.pages.KBBMOOCProject.CarsResearchPage.ResearchNewAndUsedCarsPage;
import com.example.test.pages.KBBMOOCProject.CarsResearchPage.ReviewCarsPage;

public class ResearchNewAndUsedCarsPageTest extends KbbBaseTest {
    /**
     * 
     * @param year
     * @param make
     * @param model
     * @param zipbefore
     * @param zipafter
     * @param expectedMessageText
     * @param expectedMessageText1
     * @param URLHondaCivicPage
     * @throws InterruptedException
     */
    @Test(testName = "Verify click on highlight Zip Code link located under Car Name on Review Page and Input Zip Code To Change Vehicle Zip Code and displayed location", dataProviderClass = dataPageTest.class, dataProvider = "dataPageCheck")
    public void verifyClickOnHighlightZipCodeLinkLocatedUnderCarNameOnReviewPageAndInputZipCodeToChangeVehicleZipCodeAndDisplayedLocation(
            String year, String make, String model, String zipbefore, String zipafter, String expectedMessageText,
            String expectedMessageText1, String URLHondaCivicPage) throws InterruptedException {

        ResearchNewAndUsedCarsPage researchNewAndUsedCarsPage = new ResearchNewAndUsedCarsPage(driver);
        researchNewAndUsedCarsPage.selectYears(year);
        researchNewAndUsedCarsPage.selectMake(make);
        researchNewAndUsedCarsPage.selectModel(model);
        researchNewAndUsedCarsPage.selectZipCode(zipbefore);
        researchNewAndUsedCarsPage.btnGetReviews();
        zipCodeComponent zipCodeComponent = new zipCodeComponent(driver);
        zipCodeComponent.btnChangeZipCodeOnCarsResearchPage();
        zipCodeComponent.deleteZipCode();
        zipCodeComponent.sendKeyZipCode(zipafter);
        zipCodeComponent.btnSaveZipCodeOnCarsResearchPage();
        ReviewCarsPage reviewPage = new ReviewCarsPage(driver);
        Assert.assertTrue(reviewPage.isgetPageTitle(expectedMessageText));
        Assert.assertTrue(reviewPage.isgetComponentTitles(expectedMessageText1));
        Assert.assertTrue(reviewPage.isgetPageURLHondaCivicPage(URLHondaCivicPage));
        Assert.assertTrue(reviewPage.isBuildAndPriceBtnDisplayed());
        Assert.assertTrue(reviewPage.isSeeCarsForSaleBtnDisplayed());
        Assert.assertTrue(reviewPage.assertTrueNameZipCodeDisplayed());

    }

}