package com.example.test.tests.KBBMOOCProject.WhatsMyCarWorthPageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.datadriven.TestDataProvider;
import com.example.test.pages.KBBMOOCProject.WhatsMyCarWorthPage.WhatsMyCarWorthPage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class WhatsMyCarWorthPageTest extends KbbBaseTest{
  
    @Test(testName = "Verify error message 'We couldn't find that VIN. Please re-enter.'should be shown when user enter invalid VIN code", dataProviderClass = TestDataProvider.class, dataProvider = "dataErrorMessageVIN")
    public void verifyErrorMessageWeCouldntFindThatVINPleaseReEnterShouldBeShownWhenUserEnterInvalidVINCode(String invalidVIN, String email, String errorMessageVIN) throws InterruptedException {
        WhatsMyCarWorthPage whatsMyCarWorthPage = new WhatsMyCarWorthPage(driver);
        whatsMyCarWorthPage.sendInvalidKeysToVINTextbox(invalidVIN);
        whatsMyCarWorthPage.sendKeysToEmailTextbox(email);
        whatsMyCarWorthPage.clickOnVINGoButton();
        Assert.assertTrue(whatsMyCarWorthPage.compareErrorMessage(errorMessageVIN));
    }   


    //bichdu
    @Test(testName = "Verify error message 'Email is invalid.'should be shown when user enter invalid email", dataProviderClass = TestDataProvider.class, dataProvider = "dataErrorMessageEmail")
    public void verifyErrorMessageEmailIsInvalidShouldBeShownWhenUserEnterInvalidEmail(String plate, String invalidEmail, String errorMessageEmail) throws InterruptedException {
        WhatsMyCarWorthPage whatsMyCarWorthPage = new WhatsMyCarWorthPage(driver);
        whatsMyCarWorthPage.clickOnLicensePlateCheckbox();
        whatsMyCarWorthPage.sendKeysToTextboxes(plate, invalidEmail);
        whatsMyCarWorthPage.selectState();
        whatsMyCarWorthPage.selectHIoption();
        whatsMyCarWorthPage.clickOnLicensePlateGoButton();
        Assert.assertTrue(whatsMyCarWorthPage.compareEmailErrorMessage(errorMessageEmail));
    }
}
