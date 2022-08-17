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
    public void selectYears() throws InterruptedException {
        WebElement selectYears = keyword.findWebElementByXpath("//select[@placeholder='Year']");
        keyword.selectElement(selectYears, "2018");
    }
/**
 * 
 * @throws InterruptedException
 */
    public void selectMake() throws InterruptedException {
        WebElement selectMake = keyword.findWebElementByXpath("//div[@class='make']//select[@placeholder='Make']");
        keyword.selectElement(selectMake, "Honda");

    }
/**
 * 
 * @throws InterruptedException
 */
    public void selectModel() throws InterruptedException {
        WebElement selectModel = keyword.findWebElementByXpath("//div[@class='model']//select[@placeholder='Model']");
        keyword.selectElement(selectModel, "Civic");

    }
/**
 * 
 * @throws InterruptedException
 */
    public void selectZipCode() throws InterruptedException {
        WebElement inputZip = keyword.findWebElementByXpath("//input[@type='tel']");
        keyword.sendKeys(inputZip, "43446");
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