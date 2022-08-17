package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsPage  extends KbbBasePage{

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
   
    
    public void clickonbtnChangeVehicle() throws InterruptedException
    {
        WebElement btnChangeVehicle=keyword.findWebElementByXpath("//a[text()='Change Vehicle']");
        keyword.scrollAndWaitToClick(btnChangeVehicle);
    }

        String expectedMessageTextAudiTitle="2020 Audi A3 Values & Cars for Sale | Kelley Blue Book";
    public boolean isgetPageTitle2020AudiA3(){
        if(driver.getTitle().equals(expectedMessageTextAudiTitle)){
            return true;
        }
        return false;
    }

    String expectedMessageTitleUsed2020AudiA3="Used 2020 Audi A3";
    public boolean assertIsTitleUsed2020AudiA3()  
    {
        WebElement getTitle = keyword.findWebElementByXpath("//h1[text()='Used 2020 Audi A3']");
        if(getTitle.getAttribute("innerHTML").equals( expectedMessageTitleUsed2020AudiA3)){
            return true;
        }
        return false;
    }

    
    public boolean isBuildAndPriceBtnDisplayedAudi2020(){
        WebElement btnBuildAndPriceAudi2020 = keyword.findWebElementByXpath("//a[@data-analytics='buyused_overview_btn']");
       
        if(btnBuildAndPriceAudi2020.isDisplayed()){
            return true;
        }
            return false;
        }

       
        public boolean isSeeCarsForSaleBtnDisplayedAudi2020(){
            WebElement btnSeeCarsForSaleAudi2020 = keyword.findWebElementByXpath("//a[@data-analytics='inv_findinv_btn']");
            if(btnSeeCarsForSaleAudi2020.isDisplayed()){
                return true;
            }
                return false;
            }




}