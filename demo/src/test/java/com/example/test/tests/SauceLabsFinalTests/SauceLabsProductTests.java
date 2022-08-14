package com.example.test.tests.SauceLabsFinalTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.pages.SauceLabsFinalPages.SauceLabLoginPage;
import com.example.test.pages.SauceLabsFinalPages.SauceLabProductPage;

public class SauceLabsProductTests extends BaseTest {
    
    @Test(testName = "Verify The Title Page Should Displayed Corect After User Have Login Success")
    public void verifyTheTitlePageShoulDisplayedCorectWhenLoginSuccess()
    {
        SauceLabLoginPage loginPage = new SauceLabLoginPage(driver);
        loginPage.actionLogin();
        Assert.assertTrue(loginPage.isTitlePageCorrect("TEST"), "Page Title is not correct");
    }

    @Test(testName = "Verify the six products are displayed on PRODUCT page as default")
    public void verifyTheNumberOfProductShouldBeSix()
    {
        SauceLabLoginPage loginPage = new SauceLabLoginPage(driver);
        loginPage.actionLogin();
        SauceLabProductPage productPage = new SauceLabProductPage(driver);
        Assert.assertTrue(productPage.isListProductHaveCountCorrect(), "Number of Products on ProductPage incorrect");
    }
}
