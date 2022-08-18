package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CategoryAndStylePage extends KbbBasePage{
    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    private WebElement clickDropDownlist = keyword.findWebElementByXpath("//div//select[@placeholder='Transmission']");
    private WebElement selectOptionTrans = keyword.findWebElementByXpath("//div//option[text()='Automatic']");
    /**
     * Select value dropdownlist 
     * @throws InterruptedException
     */
    public void actionSelectOnAutomatic() throws InterruptedException{
        keyword.scrollAndWaitToClick(clickDropDownlist);
        keyword.scrollAndWaitToClick(selectOptionTrans);
    }

    /**
     * Enter Mileage value
     * @param mileage
     * @throws InterruptedException
     */
    public void actionEnterValueTextboxMileage (String mileage) throws InterruptedException{
        WebElement textboxMileage = keyword.findWebElementByXpath("//div//input[@data-lean-auto='mileageInput']");
        keyword.sendKeys(textboxMileage, mileage);
    }

    /**
     * Enter Zipcode value
     * @param zipcode
     * @throws InterruptedException
     */
    public void actionEnterValueTextboxZIPCode(String zipcode) throws InterruptedException{
        WebElement textboxZIPCode = keyword.findWebElementByXpath("//div//input[@data-lean-auto='zipcodeInput']");
        keyword.sendKeys(textboxZIPCode, zipcode);
    }

    /**
     * Click on Next button
     * @throws InterruptedException
     */
    public void actionClickOnNextbutton() throws InterruptedException{
        WebElement buttonNext = keyword.findWebElementByXpath("//button//span[text()='Next']");
        keyword.scrollAndWaitToClick(buttonNext);
    }

}
