package com.example.test.pages.KBBMOOCProject.CarResearchPages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;
import com.example.test.tests.KBBMOOCProject.KbbBaseTest;

public class ReviewCarsPage extends KbbBasePage {

    public ReviewCarsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public void clickfirstOtherCompactSedans() throws InterruptedException {
        WebElement btnOtherCompactSedans = keyword.findWebElementByXpath("//a[@href='/hyundai/elantra/']");
        keyword.scrollAndWaitToClick(btnOtherCompactSedans);
    }
}
