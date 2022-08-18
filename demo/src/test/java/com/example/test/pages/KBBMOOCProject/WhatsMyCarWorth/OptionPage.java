package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class OptionPage extends KbbBasePage {
    public OptionPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    private WebElement selectYourOptions = keyword.findWebElementByXpath("//label[@data-testid='selectOptBtn']");
    /**
     * Select "Select Your Options" checkbox
     * @throws InterruptedException
     */
    public void actionClickOnSelectYourOptions() throws InterruptedException{
        keyword.scrollAndWaitToClick(selectYourOptions);
    }

    /**
     * Select Red checkbox
     * @throws InterruptedException
     */
    public void actionClickOnButtonRed() throws InterruptedException{
        WebElement buttonRed = keyword.findWebElementByXpath("//div[@data-lean-auto='colorPicker_Red']");
        keyword.scrollAndWaitToClick(buttonRed);
    }

    /**
     * Select 2 "Yes" checkbox
     * @throws InterruptedException
     */
    public void actionClickOnTwoSelectYes() throws InterruptedException{
        WebElement selectYes1 = keyword.findWebElementByXpath("//label[@data-testid='withKeys']");
        keyword.scrollAndWaitToClick(selectYes1);
        WebElement selectYes2 = keyword.findWebElementByXpath("//label[@data-testid='withModifications']");
        keyword.scrollAndWaitToClick(selectYes2);
    }

    /**
     * Click on Next button
     * @throws InterruptedException
     */
    public void actionClickOnButtonNext() throws InterruptedException{
        WebElement buttonNext = keyword.findWebElementByXpath("//button[@data-lean-auto='optionsNextButton']");
        keyword.scrollAndWaitToClick(buttonNext);

    }

}
