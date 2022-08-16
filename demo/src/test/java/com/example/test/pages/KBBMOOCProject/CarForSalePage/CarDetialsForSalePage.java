package com.example.test.pages.KBBMOOCProject.CarForSalePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarDetialsForSalePage extends KbbBasePage{

    public CarDetialsForSalePage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    WebElement txtFirstName = keyword.findWebElementByXpath("//input[@id='firstName']");
    WebElement txtLastName = keyword.findWebElementByXpath("//input[@id='lastName']");
    WebElement txtEmailName = keyword.findWebElementByXpath("//input[@id='fromEmailAddress']");
    WebElement txtPhoneName = keyword.findWebElementByXpath("//input[@id='phoneNumber']");
    WebElement btnSentEmail = keyword.findWebElementByXpath("//button[text()='Send Email']");

    public String strTitle = driver.getTitle();
    public String actualTitleDeatilsCar = "New 2018 RAM 3500 ST for sale in NORMAN, OK 73069: Truck Details - 500114042 - Autotrader";

    //*Fill User Information */
    public void fillInformation(String firstName,String lastName,String email,String phone) throws InterruptedException{

        keyword.sendKeys(txtFirstName, firstName);
        keyword.sendKeys(txtLastName, lastName);
        keyword.sendKeys(txtEmailName, email);
        keyword.sendKeys(txtPhoneName, phone);
    }
    //* Click Sent Email Button  */
    public void clickSentEmail() throws InterruptedException{

        keyword.scrollAndWaitToClick(btnSentEmail);
    }
//* Check Message Email Confirmation  */
    public boolean checkEmailConfirmation(String confirmation){
        WebElement msConfirmation = keyword.findWebElementByXpath("//div[@class='modal-body']//div");
        String getConfirmation = msConfirmation.getText();
        if(getConfirmation.equals(confirmation)){
            return true;
        }
        return false;
    }
   
    public String getDetialsPriceCar(){
        WebElement detailsPriceCar = keyword.findWebElementByXpath("//span[@class='first-price first-price-lg text-size-700']");
        String strDetialsPriceCar = detailsPriceCar.getText();
        return strDetialsPriceCar;
    }
        
}
