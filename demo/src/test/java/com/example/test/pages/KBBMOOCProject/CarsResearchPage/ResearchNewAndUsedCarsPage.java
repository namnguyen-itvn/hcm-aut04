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
    private WebElement selectYears = keyword.findWebElementByXpath("//select[@placeholder='Year']");
    private WebElement selectMake = keyword.findWebElementByXpath("//div[@class='make']//select[@placeholder='Make']");
    private WebElement selectModel = keyword
            .findWebElementByXpath("//div[@class='model']//select[@placeholder='Model']");
    private WebElement inputZip = keyword.findWebElementByXpath("//input[@type='tel']");
    private WebElement btnGetReview = keyword.findWebElementByXpath("//form//button[@type='submit']");

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

    public void btnGetReviews() throws InterruptedException {
        keyword.scrollAndWaitToClick(btnGetReview);
    }

    // #endregion

    public void btnChangeZipCodeOnCarsResearchPage() throws InterruptedException {
        WebElement btnChangeZipCode = keyword
                .findWebElementByXpath("//div[@class='css-19tr75h ey3jrsu1']//span[@data-automation='zipcode-link']");
        keyword.scrollAndWaitToClick(btnChangeZipCode);

    }

    public boolean isgetPageTitle(String expectedMessageText) {
        if (driver.getTitle().equals(expectedMessageText)) {
            return true;
        }
        return false;
    }
    public boolean isgetPageURLHondaCivicPage(String URLHondaCivicPage) {
        if (driver.getCurrentUrl().equals(URLHondaCivicPage)) {
            return true;
        }
        return false;
    }

   

}
