package com.example.test.pages.KBBMOOCProject.CarForSalePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarReviewDeliveryPage extends KbbBasePage{

    public CarReviewDeliveryPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    

    
    
    String actualTitleComponent = "Cars for Sale in Cleveland, OH (Test Drive at Home) - Kelley Blue Book";

  
    //*Check Button Delivery Have Checked */
    public boolean checkbuttonDelivery(){
        WebElement checkBoxDelivery = keyword.findWebElementByXpath("//input[@value='SHIP_TO_HOME']");
        if(checkBoxDelivery.isSelected()){
            return true;
        }
        return false;
    }

    
    //* Veryky Title Component */
    public boolean checkTitleConponent (){
        // WebElement titleComponent = keyword.findWebElementByXpath("//h1[text()='Cars for Sale in Cleveland, OH']");
        String getTitleComponent=driver.getTitle();
        System.out.println(getTitleComponent);
        if(getTitleComponent.equals(actualTitleComponent)){
            return true;
        }return false;
    }

    //*Get Text Delivery */
    public String getDelivery(){
        WebElement textDelivery = keyword.findWebElementByXpath("//div[@data-qaid='cntnr-listings']/div[2]//li[text()='Delivery']");
        String dataDelivery = textDelivery.getText();
        System.out.println(dataDelivery);
        return dataDelivery;
    }
    //*Check Delivery */
    public boolean checkDelivery(String delivery){
        if( getDelivery().equals(delivery)){
            return true;
        }return false;

    }
}
