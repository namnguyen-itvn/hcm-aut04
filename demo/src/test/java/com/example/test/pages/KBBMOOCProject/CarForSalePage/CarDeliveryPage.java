package com.example.test.pages.KBBMOOCProject.CarForSalePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarDeliveryPage extends KbbBasePage{

    public CarDeliveryPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    

    String strUrl = driver.getCurrentUrl();
    public boolean compareUrl (String url){
        if(strUrl.equals(url)){
            return true;
        }return false;
    }
  
    //*Check Button Delivery Have Checked */
    String expectedTitleComponent = "Cars for Sale in Cleveland, OH (Test Drive at Home) - Kelley Blue Book";
    public boolean checkButtonDelivery(){
        WebElement checkBoxDelivery = keyword.findWebElementByXpath("//input[@value='SHIP_TO_HOME']");
        if(checkBoxDelivery.isSelected()){
            return true;
        }
        return false;
    }

    
    //* Verify Title Component */
    public boolean checkTitleComponent (){
        String getTitleComponent=driver.getTitle();
        System.out.println(getTitleComponent);
        if(getTitleComponent.equals(expectedTitleComponent)){
            return true;
        }return false;
    }

    public boolean checkChipDelivery (){
        WebElement chipDelivery = keyword.findWebElementByXpath("//div[@data-cmp='chip']//span[text()='Local Home Delivery']");
        if(chipDelivery.isDisplayed()){
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
