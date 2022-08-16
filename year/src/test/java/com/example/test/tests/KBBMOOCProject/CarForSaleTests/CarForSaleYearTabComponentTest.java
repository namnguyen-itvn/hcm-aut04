package com.example.test.tests.KBBMOOCProject.CarForSaleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.pages.KBBMOOCProject.CarForSaleYearTabComponent;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CarForSaleYearTabComponentTest extends KbbBaseTest{
    @Test(testName = "Verify All Element Should Be Displayed Correct")
    public void verifyThatFuelTypeFilterShouldBeDisplayedCorrect(){
        CarForSaleYearTabComponent carForSaleYearTabComponent = new CarForSaleYearTabComponent(driver);
        Assert.assertTrue(carForSaleYearTabComponent.isTheYearFilterShouldBeDisplayedCorrectWhenUserClickOnIt());
    }


    @Test(testName = "verify Yeartab Title After User select Maximun Year and Minimum Year")
    public void verifyTitlePage() throws InterruptedException{
        String expectedTitle="2018 Cars for Sale in Cleveland, OH (Test Drive at Home) - Kelley Blue Book";
        CarForSaleYearTabComponent carForSaleYearTabComponent = new CarForSaleYearTabComponent(driver);
        carForSaleYearTabComponent.clickOnYeartab();
        carForSaleYearTabComponent.clickOnMinimumDropDownList();
        carForSaleYearTabComponent.clickOnSelectMinimumYear();

        carForSaleYearTabComponent.clickOnMaximumYearDropDownListt();
        carForSaleYearTabComponent.clickOnSelectMaximumYear();
        carForSaleYearTabComponent.validateTitle(expectedTitle);
    }  
}
