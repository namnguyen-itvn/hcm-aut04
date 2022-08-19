package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonReadmore extends KbbBasePage {

    public ButtonReadmore(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    WebElement Readmore = keyword.findWebElementByXpath("//p[text()='Read More']");
    public void clickonReadmore() throws InterruptedException
    {
        keyword.scrollAndWaitToClick(Readmore);
    }
}
