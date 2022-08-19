package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsComponent extends KbbBasePage{

    public ReviewCarsComponent(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    String expectedMessageTextHondaTitle="2019 Honda Civic Values & Cars for Sale | Kelley Blue Book";
    public boolean isgetPageTitle2019HondaCivic(){
        if(driver.getTitle().equals(expectedMessageTextHondaTitle)){
            return true;
        }
        return false;
    }
   private WebElement getTitle = keyword.findWebElementByXpath("//h1[text()='Used 2019 Honda Civic']");
    String expectedMessageTitleUsed2019HondaCivic="Used 2019 Honda Civic";
    public boolean assertIsTitleUsed2019HondaCivic()  
    {
        
        if(getTitle.getAttribute("innerHTML").equals( expectedMessageTitleUsed2019HondaCivic)){
            return true;
        }
        return false;
    }

   private WebElement btnBuildAndPriceHonda2019 = keyword.findWebElementByXpath("//a[@data-analytics='buyused_overview_btn']");
    public boolean isBuildAndPriceBtnDisplayedHonda2019(){
        if(btnBuildAndPriceHonda2019.isDisplayed()){
            return true;
        }
            return false;
        }

       private WebElement btnSeeCarsForSaleHonda2019 = keyword.findWebElementByXpath("//a[@data-analytics='inv_findinv_btn']");
        public boolean isSeeCarsForSaleBtnDisplayedHonda2019(){
            
            if(btnSeeCarsForSaleHonda2019.isDisplayed()){
                return true;
            }
                return false;
            }
    
}
