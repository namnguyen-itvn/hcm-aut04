package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsPage  extends KbbBasePage{

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    //#region Declare web object
    private WebElement getReviewComponentTitle = keyword.findWebElementByXpath("//div[@class='css-1044rcd eds0yfe0']//h2[@class='css-1eagefn e148eed12']");
    private WebElement btnBuildAndPrice = keyword.findWebElementByXpath("//span[text()='Build & Price']");
    private WebElement btnSeeCarsForSale = keyword.findWebElementByXpath("//span[text()='See Cars for Sale']");
    //#endregion

    //#region page action
    String expectedMessageText="2018 Honda Civic Values & Cars for Sale | Kelley Blue Book";
    public boolean isgetPageTitle(){
        if(driver.getTitle().equals(expectedMessageText)){
            return true;
        }
        return false;
    }

    String expectedMessageText1="2018 Honda Civic Review";
    public boolean isgetComponentTitle(){
        if(getReviewComponentTitle.getText().equals(expectedMessageText1)){
            return true;
        }
        return false;
    }
    
 

    public boolean isBuildAndPriceBtnDisplayed(){
       
        if(btnBuildAndPrice.isDisplayed()){
            return true;
        }
            return false;
        }  
    public boolean isSeeCarsForSaleBtnDisplayed(){
       
        if(btnSeeCarsForSale.isDisplayed()){
            return true;
        }
            return false;
        }
    //#endregion
}