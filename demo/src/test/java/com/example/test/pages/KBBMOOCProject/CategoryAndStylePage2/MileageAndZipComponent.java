package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MileageAndZipComponent extends KbbBasePage {

    public MileageAndZipComponent(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    private WebElement inputMileage = keyword
            .findWebElementByXpath("//label[@class='text-input mileageInput css-msksum e2plhlo3']//input");

    /**
     * Search and Send key to Mileage Text Box
     */
    public void sendKeysToMileageTextBoxInMyCarValuePage(String mileage) throws InterruptedException {
        keyword.sendKeys(inputMileage, mileage);
    }

    private WebElement inputZip = keyword
            .findWebElementByXpath("//label[@class='text-input zipInput css-msksum e2plhlo3']//input");

    /**
     * Search and sent key to Zip Text box
     */
    public void sendKeysToZipTextBoxInMyCarValuePage(String zip) throws InterruptedException {
        keyword.sendKeys(inputZip, zip);
    }
}
