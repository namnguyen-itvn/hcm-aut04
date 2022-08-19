package com.example.test.pages.KBBMOOCProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonLXCoupe2D extends KbbBasePage {

    public ButtonLXCoupe2D(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    WebElement LXCoupe2D = keyword.findWebElementByXpath("//a[@class='css-1sw5zct erywcq03']");
    public void clickonLXCoupe2D() throws InterruptedException
    {
        keyword.scrollAndWaitToClick(LXCoupe2D);
    }
}
