package com.example.test.pages.KBBMOOCProject.CarsResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ResearchNewAndUsedCarsPage extends KbbBasePage {

    public ResearchNewAndUsedCarsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    // #region

    // #endregion

    // #region
/**
 * 
 * @throws InterruptedException
 */
    public void selectYears(String year) throws InterruptedException {
        WebElement selectYears = keyword.findWebElementByXpath("//select[@placeholder='Year']");
        keyword.selectElement(selectYears, year);
    }
/**
 * 
 * @throws InterruptedException
 */
    public void selectMake(String make) throws InterruptedException {
        WebElement selectMake = keyword.findWebElementByXpath("//div[@class='make']//select[@placeholder='Make']");
        keyword.selectElement(selectMake, make);

    }
/**
 * 
 * @throws InterruptedException
 */
    public void selectModel(String model) throws InterruptedException {
        WebElement selectModel = keyword.findWebElementByXpath("//div[@class='model']//select[@placeholder='Model']");
        keyword.selectElement(selectModel, model);

    }
/**
 * 
 * @throws InterruptedException
 */
    public void selectZipCode(String zip) throws InterruptedException {
        WebElement inputZip = keyword.findWebElementByXpath("//input[@type='tel']");
        keyword.sendKeys(inputZip, zip);
    }
/**
 * 
 * @throws InterruptedException
 */
    public void btnGetReviews() throws InterruptedException {
        WebElement btnGetReview = keyword.findWebElementByXpath("//form//button[@type='submit']");
        keyword.scrollAndWaitToClick(btnGetReview);
    }

    // #endregion

    public void actionClickWriteAReviewButton() throws InterruptedException {
        WebElement btnWriteAReview = keyword.findWebElementByXpath("//a[@data-analytics='consrev_lnk']");
        keyword.scrollAndWaitToClick(btnWriteAReview);
    }

    // #region used car price quote

}