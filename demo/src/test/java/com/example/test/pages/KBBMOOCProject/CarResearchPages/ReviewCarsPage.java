package com.example.test.pages.KBBMOOCProject.CarResearchPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class ReviewCarsPage  extends KbbBasePage{

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    
       private WebElement lbYearChange = keyword.findWebElementByXpath("//select/option[text()='2019']");
        public void actionClickDropdowChangeYear() throws InterruptedException {
            keyword.scrollAndWaitToClick(lbYearChange);
            
        }

}

