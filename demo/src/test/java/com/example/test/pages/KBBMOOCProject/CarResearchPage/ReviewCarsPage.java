package com.example.test.pages.KBBMOOCProject.CarResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewCarsPage extends KbbBasePage {

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

   private WebElement btnSeeMoreCompactSedans = keyword.findWebElementByXpath("//span[text()='See More Compact Sedans']");

    public void clickOnSeeMore() throws InterruptedException {

        keyword.scrollAndWaitToClick(btnSeeMoreCompactSedans);
    }
}
