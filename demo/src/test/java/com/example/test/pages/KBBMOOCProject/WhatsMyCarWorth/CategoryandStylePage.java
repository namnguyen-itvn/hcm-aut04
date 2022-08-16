package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CategoryandStylePage extends KbbBasePage{
    public CategoryandStylePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    WebElement droplistTrans = keyword.findWebElementByXpath("//div//select[@placeholder='Transmission']"); 
    public void clickOnDropListTransmission() throws InterruptedException{
        keyword.scrollAndWaitToClick(droplistTrans);
    }
    public void selectOnAutomatic() throws InterruptedException{
        WebElement optionTrans = keyword.findWebElementByXpath("//div//option[text()='Automatic']");
        keyword.scrollAndWaitToClick(optionTrans);
    }
    public void sendInforMileage(String mileage) throws InterruptedException{
        WebElement txtmileage = keyword.findWebElementByXpath("//div//input[@data-lean-auto='mileageInput']");
        keyword.sendKeys(txtmileage, mileage);
    }
    public void sendInforZIP(String zipcode) throws InterruptedException{
        WebElement txtZipcode = keyword.findWebElementByXpath("//div//input[@data-lean-auto='zipcodeInput']");
        keyword.sendKeys(txtZipcode, zipcode);
    }
    public void clickOnNextbutton() throws InterruptedException{
        WebElement btnNext = keyword.findWebElementByXpath("//button//span[text()='Next']");
        keyword.scrollAndWaitToClick(btnNext);
    }

}
