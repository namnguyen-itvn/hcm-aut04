package com.example.test.pages.KBBMOOCProject.CarForSalePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarReviewSearchPage extends KbbBasePage{

    public CarReviewSearchPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    WebElement btnfirstCar = keyword.findWebElementByXpath("//div[@id='500114042']");
    
    //* Click Go to Car Details  */
    public void clickFirstCar() throws InterruptedException{
        
        keyword.scrollAndWaitToClick(btnfirstCar);
    }
    WebElement priceFirstCar = keyword.findWebElementByXpath("//div[@id='500114042']//span[@data-cmp='firstPrice']");
    public String getPriceFirstCar(){
        
        String strPriceFirstCar = priceFirstCar.getText();
        return strPriceFirstCar;
    }
}
