package com.example.test.tests.KBBMOOCProject.CarForSaleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.pages.KBBMOOCProject.CarForSaleConditionTabComponent;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class CarForSaleConditionTabComponentTest extends KbbBaseTest {

    @Test(testName = "Verify All Element Should Be Displayed Correct When User Click On Condition Tab")
    public void verifyThatFuelTypeFilterShouldBeDisplayedCorrectWhenUserScrollToIt(){
        CarForSaleConditionTabComponent carForSaleConditionTabComponent = new CarForSaleConditionTabComponent(driver);
        Assert.assertTrue(carForSaleConditionTabComponent.isTheConditionFilterShouldBeDisplayedCorrectWhenUserClickOnIt());
    }


    @Test(testName = "Verify Title Page New Cars for Sale in Cleveland, OH (Test Drive at Home) - Kelley Blue Book Should Be Shown When User Click On New option")
    public void VerifyTitlePageNewCarIsDisplayed() throws InterruptedException
    {
        String expectedTitle = "New Cars for Sale in Cleveland, OH (Test Drive at Home) - Kelley Blue Book";
        CarForSaleConditionTabComponent carForSaleConditionTabComponent = new CarForSaleConditionTabComponent(driver);
        carForSaleConditionTabComponent.clickOnConditionTab();
        carForSaleConditionTabComponent.validateTitle(expectedTitle);
    }
}
