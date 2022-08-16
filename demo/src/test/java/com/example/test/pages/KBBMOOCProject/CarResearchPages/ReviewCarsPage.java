package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsPage  extends KbbBasePage{

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
   
    

        WebElement lbYearChange = keyword.findWebElementByXpath("//select/option[text()='2019']");
        public void actionClickDropdowChangeYear() throws InterruptedException {
            keyword.scrollAndWaitToClick(lbYearChange);
            
        }

        String expectedMessageTextHondaTitle="2019 Honda Civic Values & Cars for Sale | Kelley Blue Book";
    public boolean isgetPageTitle2019HondaCivic(){
        if(driver.getTitle().equals(expectedMessageTextHondaTitle)){
            return true;
        }
        return false;
    }

    String expectedMessageTitleUsed2019HondaCivic="Used 2019 Honda Civic";
    public boolean assertIsTitleUsed2019HondaCivic()  
    {
        WebElement getTitle = keyword.findWebElementByXpath("//h1[text()='Used 2019 Honda Civic']");
        if(getTitle.getAttribute("innerHTML").equals( expectedMessageTitleUsed2019HondaCivic)){
            return true;
        }
        return false;
    }

    
    public boolean isBuildAndPriceBtnDisplayedHonda2019(){
        WebElement btnBuildAndPriceHonda2019 = keyword.findWebElementByXpath("//a[@data-analytics='buyused_overview_btn']");
       
        if(btnBuildAndPriceHonda2019.isDisplayed()){
            return true;
        }
            return false;
        }

       
        public boolean isSeeCarsForSaleBtnDisplayedHonda2019(){
            WebElement btnSeeCarsForSaleHonda2019 = keyword.findWebElementByXpath("//a[@data-analytics='inv_findinv_btn']");
            if(btnSeeCarsForSaleHonda2019.isDisplayed()){
                return true;
            }
                return false;
            }




}