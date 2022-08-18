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
    WebElement selectYears = keyword.findWebElementByXpath("//select[@placeholder='Year']");
    WebElement selectMake = keyword.findWebElementByXpath("//div[@class='make']//select[@placeholder='Make']");
    WebElement selectModel = keyword.findWebElementByXpath("//div[@class='model']//select[@placeholder='Model']");
    WebElement inputZip = keyword.findWebElementByXpath("//input[@type='tel']");
    WebElement btnGetReview = keyword.findWebElementByXpath("//form//button[@type='submit']");
   



    // #endregion

    // #region
    /**
     * 
     * @throws InterruptedException
     */

    public void selectYears(String year) throws InterruptedException {

        keyword.selectElement(selectYears, year);
    }

    /**
     * 
     * @throws InterruptedException
     */
    public void selectMake(String make) throws InterruptedException {
        keyword.selectElement(selectMake, make);

    }

    /**
     * 
     * @throws InterruptedException
     */
    public void selectModel(String model) throws InterruptedException {
        keyword.selectElement(selectModel, model);

    }

    /**
     * 
     * @throws InterruptedException
     */
    public void selectZipCode(String zipbefore) throws InterruptedException {
        keyword.sendKeys(inputZip, zipbefore);
    }

    /**
     * 
     * @throws InterruptedException
     */
    public void btnGetReviews() throws InterruptedException {
        keyword.scrollAndWaitToClick(btnGetReview);
    }

    // #endregion
    

}
