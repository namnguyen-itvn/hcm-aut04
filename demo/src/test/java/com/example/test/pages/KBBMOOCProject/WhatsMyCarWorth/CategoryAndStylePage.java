package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CategoryAndStylePage extends KbbBasePage{
    public CategoryAndStylePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    public void actionSelectOnAutomatic() throws InterruptedException{
        WebElement dropDownlistTrans = keyword.findWebElementByXpath("//div//select[@placeholder='Transmission']");
        keyword.scrollAndWaitToClick(dropDownlistTrans);
        WebElement optionTrans = keyword.findWebElementByXpath("//div//option[text()='Automatic']");
        keyword.scrollAndWaitToClick(optionTrans);
    }
    public void actionEnterValueTextboxMileage (String mileage) throws InterruptedException{
        WebElement textboxMileage = keyword.findWebElementByXpath("//div//input[@data-lean-auto='mileageInput']");
        keyword.sendKeys(textboxMileage, mileage);
    }
    public void actionEnterValueTextboxZIPCode(String zipcode) throws InterruptedException{
        WebElement textboxZIPCode = keyword.findWebElementByXpath("//div//input[@data-lean-auto='zipcodeInput']");
        keyword.sendKeys(textboxZIPCode, zipcode);
    }
    public void actionClickOnNextbutton() throws InterruptedException{
        WebElement buttonNext = keyword.findWebElementByXpath("//button//span[text()='Next']");
        keyword.scrollAndWaitToClick(buttonNext);
    }

}
