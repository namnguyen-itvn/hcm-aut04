package com.example.test.pages.KBBMOOCProject.CarFinderPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class CarFinderPage extends KbbBasePage{

    public CarFinderPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    String expectedMessageText="Car Finder | Find Your Perfect Car | Kelley Blue Book";
    public boolean isgetPageTitle(){
        if(driver.getTitle().equals(expectedMessageText)){
            return true;
        }
        return false;
    }

    WebElement getCarFinderComponentTitle = keyword.findWebElementByXpath("//h1[@id='CarFinderHeading']");
    String expectedMessageText1="Car Finder";
    public boolean isgetComponentTitle(){
        if(getCarFinderComponentTitle.getText().equals(expectedMessageText1)){
            return true;
        }
        return false;
    }

    WebElement getBreadcrumb = keyword.findWebElementByXpath("//div[@data-automation='breadcrumb-container']");
    String expectedMessageText2="Home\nCar Finder";
    public boolean isgetBreadcrumb(){
        if(getBreadcrumb.getAttribute("innerText").equals(expectedMessageText2)){
            return true;
        }
        return false;
    }

    WebElement getResult = keyword.findWebElementByXpath("//span[@class='css-ctzzv3-FilterHeading el1sgj20']");
    String expectedResultMessageText="0 matches";
    public boolean isgetResultCarFinder(){
        
        if(getResult.getText().equals(expectedResultMessageText)){
            return true;
        }
        return false;
    }
}
