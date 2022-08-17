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


    //* Compera Title */
    String strTitle = driver.getTitle();
    public boolean compareTitle(String title){
        if(strTitle.equals(title)){
            return true;
        }return false;
    }

    //* Compare Url */
    String strUrl = driver.getCurrentUrl();
    public boolean compareUrl(String url){
        if(strUrl.equals(url)){
            return true;
        }return false;
    }

    //*Fill User Information */
    public void fillInformation(String firstName,String lastName,String email,String phone) throws InterruptedException{

        keyword.sendKeys(txtFirstName, firstName);
        keyword.sendKeys(txtLastName, lastName);
        keyword.sendKeys(txtEmailName, email);
        keyword.sendKeys(txtPhoneName, phone);
    }
    //* Click Sent Email Button  */
    public void clickOnSentEmailButton() throws InterruptedException{

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
   
    //* Compare Price Car  */
       
    public boolean comparePrice(String price){
        WebElement detailsPriceCar = keyword.findWebElementByXpath("//span[@class='first-price first-price-lg text-size-700']");
        String strDetialsPriceCar = detailsPriceCar.getText();
        if(strDetialsPriceCar.equals(price)){
            return true;
        }return false;
    }

        
}
