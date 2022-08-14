package com.example.test.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.example.test.core.report.ReportListener;
import com.example.test.pages.ProductDetailPage;
import com.example.test.pages.ProductPage;


@Listeners(ReportListener.class)
public class AddProductPageTests extends BaseTest {
    
    @Test(testName = "Verify The Product Are Added Into Cart")
    public void verifyTheProductAreAddedIntoCart() throws Exception{
        ProductPage productPage = new ProductPage(this.driver);
        productPage.clickOnProductElement();
        ProductDetailPage productDetailPage = new ProductDetailPage(this.driver);
        productDetailPage.clickOnAddToCartButton();
        Assert.assertTrue(productDetailPage.isProductSuccessfullyAddedCorrect());
    }
}
