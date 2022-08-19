package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarForSalePage extends KbbBasePage{

    public CarForSalePage(WebDriver driver) {
        super(driver);
    }
    private WebElement bodyType = keyword.findWebElementByXpath("//span[@ data-cmp='filterTitle']/span[text()='Body Style']");

    public void clickBodyTypeInCarForSalePage() throws InterruptedException
    {
        keyword.waitForPageToLoad();
        keyword.scrollAndWaitToClick(bodyType);

        WebElement truckButton = keyword.findWebElementByXpath("//label[@class=' col-xs-6 col-sm-3 col-md-6 col-lg-6 with-visual margin-0 hide-checkmark checkbox'][6]");
        keyword.scrollAndWaitToClick(truckButton);
    }
}
