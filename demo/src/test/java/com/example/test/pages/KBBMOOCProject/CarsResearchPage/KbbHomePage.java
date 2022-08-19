package com.example.test.pages.KBBMOOCProject.CarsResearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.test.pages.KBBMOOCProject.KbbBasePage;

public class KbbHomePage extends KbbBasePage {

    public KbbHomePage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    private WebElement btnReseachPage = keyword.findWebElementByXpath("//a[@data-analytics='rschtools_global-rsch']");

    public void btnResearchPage() throws InterruptedException {
        keyword.scrollAndWaitToClick(btnReseachPage);
    }
}
