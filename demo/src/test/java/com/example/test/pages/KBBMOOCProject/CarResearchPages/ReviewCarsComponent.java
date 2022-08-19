package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsComponent extends KbbBasePage {

    public ReviewCarsComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    
    String expectedMessageTextAudiTitle="2020 Audi A3 Values & Cars for Sale | Kelley Blue Book";
    public boolean isgetPageTitle2020AudiA3(){
        if(driver.getTitle().equals(expectedMessageTextAudiTitle)){
            return true;
        }
        return false;
    }
   private WebElement getTitle = keyword.findWebElementByXpath("//h1[text()='Used 2020 Audi A3']");

    String expectedMessageTitleUsed2020AudiA3="Used 2020 Audi A3";
    public boolean assertIsTitleUsed2020AudiA3()  
    {
        if(getTitle.getAttribute("innerHTML").equals( expectedMessageTitleUsed2020AudiA3)){
            return true;
        }
        return false;
    }

   private WebElement btnBuildAndPriceAudi2020 = keyword.findWebElementByXpath("//a[@data-analytics='buyused_overview_btn']");

    public boolean isBuildAndPriceBtnDisplayedAudi2020(){
       
        if(btnBuildAndPriceAudi2020.isDisplayed()){
            return true;
        }
            return false;
        }

     private   WebElement btnSeeCarsForSaleAudi2020 = keyword.findWebElementByXpath("//a[@data-analytics='inv_findinv_btn']");

        public boolean isSeeCarsForSaleBtnDisplayedAudi2020(){
            if(btnSeeCarsForSaleAudi2020.isDisplayed()){
                return true;
            }
                return false;
            }
}
