package com.example.test.pages.KBBMOOCProject.WhatsMyCarWorth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConditionPage extends KbbBasePage {

    public ConditionPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    private  WebElement itemFair = keyword.findWebElementByXpath("//div[@data-lean-auto='fair']");
    private  WebElement btnNext = keyword.findWebElementByXpath("//button[@data-lean-auto='optionsNextButton']");
    public void clickOnItemFair() {
        keyword.scrollAndWaitToClick(itemFair);
    }
    public void clickOnNextbutton() {
        keyword.scrollAndWaitToClick(btnNext);
    }
}
