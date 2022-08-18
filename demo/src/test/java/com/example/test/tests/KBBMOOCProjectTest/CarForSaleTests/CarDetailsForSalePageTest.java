package com.example.test.tests.KBBMOOCProjectTest.CarForSaleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.DataDiven.DataDriven;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.CarDetialsForSalePage;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.CarForSalePage;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.CarSearchPage;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.EmailConfirmComponent;
import com.example.test.tests.KBBMOOCProjectTest.KbbBaseTest;


public class CarDetailsForSalePageTest extends KbbBaseTest{
    @Test(testName ="Verify User Can Confirm Email Successful",dataProviderClass =DataDriven.class,dataProvider = "dataCarDetailsForSale" )
    public  void verifyUserCanConfirmEmailSuccessful(String search,String firstName,String lastName,String email,String phone,String price,String title,String url,String confirmation) throws InterruptedException{
        CarForSalePage carForSalePage = new CarForSalePage(driver);
        carForSalePage.ClickTextBoxSearch();
        carForSalePage.inputToTextBoxCarSearch(search);
        CarSearchPage carSearchPage = new CarSearchPage(driver);
        carSearchPage.clickOnFirstCar();
        CarDetialsForSalePage carDetailPage = new CarDetialsForSalePage(driver);
        Assert.assertTrue(carDetailPage.compareTitle(title));
        Assert.assertTrue(carDetailPage.compareUrl(url));
        Assert.assertTrue(carDetailPage.comparePrice(price));
        carDetailPage.fillInformation(firstName, lastName, email, phone);
        carDetailPage.clickOnSentEmailButton();
        EmailConfirmComponent emailConfirmComponent = new EmailConfirmComponent(driver);
        Assert.assertTrue(emailConfirmComponent.checkEmailConfirmation(confirmation),"The Email Has not been Sent");
        
    }
}
