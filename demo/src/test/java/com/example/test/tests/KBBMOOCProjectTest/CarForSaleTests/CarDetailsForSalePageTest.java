package com.example.test.tests.KBBMOOCProjectTest.CarForSaleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.test.core.DataDiven.DataDriven;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.CarDetialsForSalePage;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.CarForSalePage;
import com.example.test.pages.KBBMOOCProject.CarForSalePage.CarReviewSearchPage;
import com.example.test.tests.KBBMOOCProjectTest.KbbBaseTest;


public class CarDetailsForSalePageTest extends KbbBaseTest{
    @Test(testName ="Verify User Can Confirm Email Successful",dataProviderClass =DataDriven.class,dataProvider = "dataCarDetailsForSale" )
    public  void verifyUserCanConfirmEmailSuccessful(String search,String firstName,String lastName,String email,String phone,String confirmation) throws InterruptedException{
        CarForSalePage carForSalePage = new CarForSalePage(driver);
        carForSalePage.inputCarSearch(search);
        carForSalePage.ClickOptionCarSearch();
        CarReviewSearchPage carReviewPage = new CarReviewSearchPage(driver);
        carReviewPage.clickFirstCar();
        CarDetialsForSalePage CarDetailPage = new CarDetialsForSalePage(driver);
        CarDetailPage.fillInformation(firstName, lastName, email, phone);
        CarDetailPage.clickSentEmail();
        Assert.assertEquals(CarDetailPage.strTitle, CarDetailPage.actualTitleDeatilsCar);
        Assert.assertTrue(CarDetailPage.checkEmailConfirmation(confirmation),"The Email Has not been Sent");
        // Assert.assertEquals(carReviewPage.getPriceFirstCar(), CarDetailPage.getDetialsPriceCar());
    }
}
