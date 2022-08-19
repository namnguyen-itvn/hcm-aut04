package com.example.test.pages.KBBMOOCProject.CategoryAndStylePage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonGoComponent extends KbbBasePage {

    public ButtonGoComponent(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    /**
     * Search and click Go Button
     */
    private WebElement btnGo = keyword.findWebElementByXpath("//button[@class='css-1iekb1s e1uau9z02']");

    public void clickOnGoButtonInMyCarValuePage() throws InterruptedException {
        keyword.clickThenWait(btnGo);
    }
}
