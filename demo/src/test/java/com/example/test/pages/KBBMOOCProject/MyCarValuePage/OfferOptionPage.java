package com.example.test.pages.KBBMOOCProject.MyCarValuePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class OfferOptionPage extends KbbBasePage {

    public OfferOptionPage(WebDriver driver) {
        super(driver);
    }
    
    public String getOfferOptionPageTitle= driver.getTitle();

    WebElement  getBreadcrumd= keyword.findWebElementByXpath("//div[@data-automation='breadcrumb-container']");

    String expectedMessages="Home\nWhat’s My Car Worth\nCategory & Style\nOptions\nOffer Option";
    /**
     * @return
     */
    public boolean isTextBreadCrumd(){
        if(getBreadcrumd.getAttribute("innerText").equals(expectedMessages)){
            return true;
        
        }
        return false;
    }
    String expectedTitle="1998 Volkswagen Jetta GLS Sedan 4D Offer Option | Kelley Blue Book";

    /**
     * @return
     */
    public boolean getOfferOptionPageTitle(){
        if(driver.getTitle().equals(expectedTitle)){
            return true;
        }
        return false;
    }

}
