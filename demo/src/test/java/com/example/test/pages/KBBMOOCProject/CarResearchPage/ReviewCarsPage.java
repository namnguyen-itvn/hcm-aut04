package com.example.test.pages.KBBMOOCProject.CarResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KbbBasePage;

public class ReviewCarsPage extends KbbBasePage {

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    public void clickonSeeMore() throws InterruptedException {
        WebElement btnSeemoreCompactSedans = keyword.findWebElementByXpath("//span[text()='See More Compact Sedans']");
        keyword.scrollAndWaitToClick(btnSeemoreCompactSedans);
    }
}
